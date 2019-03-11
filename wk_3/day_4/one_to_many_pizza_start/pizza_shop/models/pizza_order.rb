require_relative('../db/sql_runner.rb')
require_relative('customer.rb')

class PizzaOrder

  attr_accessor :customer_id, :topping, :quantity
  attr_reader :id

  def initialize(options)
    @customer_id = options['customer_id'].to_i()
    @topping = options['topping']
    @quantity = options['quantity'].to_i
    @id = options['id'].to_i if options['id']
  end

  def save()
    sql = "INSERT INTO pizza_orders
    (
      customer_id,
      topping,
      quantity
      ) VALUES
      (
        $1, $2, $3
      )
      RETURNING id"
      values = [@customer_id, @topping, @quantity]
      @id = SqlRunner.run(sql, values)[0]["id"].to_i
    end

    def update()
      sql = "
      UPDATE pizza_orders SET (
        customer_id,
        topping,
        quantity
        ) =
        (
          $1,$2, $3
        )
        WHERE id = $4"
        values = [@customer_id, @topping, @quantity, @id]
        SqlRunner.run(sql, values)
      end

      def delete()
        sql = "DELETE FROM pizza_orders where id = $1"
        values = [@id]
        SqlRunner.run(sql, values)
      end

      def self.find(id)
        db = PG.connect({ dbname: 'pizza_shop', host: 'localhost' })
        sql = "SELECT * FROM pizza_orders WHERE id = $1"
        values = [id]
        db.prepare("find", sql)
        results = db.exec_prepared("find", values)
        db.close()
        order_hash = results.first
        order = PizzaOrder.new(order_hash)
        return order
      end

      def self.delete_all()
        db = PG.connect({ dbname: 'pizza_shop', host: 'localhost' })
        sql = "DELETE FROM pizza_orders"
        db.prepare("delete_all", sql)
        db.exec_prepared("delete_all")
        db.close()
      end

      def self.all()
        sql = "SELECT * FROM pizza_orders"
        orders = db.exec_prepared("all")
        db.close()
        return orders.map { |order| PizzaOrder.new(order) }
      end

      def customer()
        db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
        sql = " SELECT * FROM customers WHERE id = $1"
        values = [@customer_id]
        db.prepare('find_customer', sql)
        result = db.exec_prepared('find_customer',values)
        db.close()
        cust_hash = result[0]
        customer = Customer.new(cust_hash)
        return customer
      end


    end
