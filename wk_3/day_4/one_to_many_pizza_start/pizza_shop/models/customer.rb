require_relative('../db/sql_runner.rb')

class Customer

  attr_reader :id
  attr_accessor :first_name, :last_name

  def initialize(options)
    @id = options['id'].to_i() if options['id']
    @first_name = options['first_name']
    @last_name = options['last_name']
  end

  def save()
    sql = "INSERT INTO customers (first_name, last_name) VALUES ($1, $2) RETURNING id"
    values = [@first_name, @last_name]
    result = SqlRunner.run(sql, values)
    @id = result[0]["id"].to_i()
  end

  def Customer.delete_all()

    sql = "DELETE FROM customers;"
    SqlRunner.run(sql)
  end

  def orders()
    sql = "SELECT * FROM pizza_orders WHERE customer_id = $1"
    values = [@id]
    results = SqlRunner.run(sql, values)
    orders = results.map {|order_hash| PizzaOrder.new(order_hash)}

    return orders
    end

end
