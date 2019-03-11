require ('pg')

class PizzaOrder

  attr_accessor :first_name, :last_name, :quantity, :topping
  attr_reader :id

  def initialize(options)
    @first_name = options['first_name']
    @last_name = options['last_name']
    @quantity = options['quantity'].to_i()
    @topping = options['topping']
    @id = options['id'].to_i() if options['id']
  end

  def save()
    db = PG.connect({dbname: 'pizza_shop', host: 'localhost'})
    sql = "INSERT INTO pizza_orders (first_name, last_name, quantity, topping) VALUES ($1, $2, $3, $4) RETURNING *"
    values = [@first_name, @last_name, @quantity, @topping]
    # prepare the statement
    db.prepare("save", sql)
    # execute the prepared statement
    @id = db.exec_prepared("save", values)[0]["id"].to_i
    db.close()
  end

  def PizzaOrder.delete_all
    # connect to database
    db = PG.connect({dbname: 'pizza_shop', host:'localhost'})
    # create an SQL string
    sql = "DELETE FROM pizza_orders"
    # prepare a statement
    db.prepare("delete_all", sql)
    # execute the prepared statement
    db.exec_prepared("delete_all")
    # close the DB connection
    db.close()
  end

  def PizzaOrder.all
    # connect to the database
    db = PG.connect({dbname: 'pizza_shop', host:'localhost'})
    # create an SQL string
    sql = "SELECT * FROM pizza_orders"
    # prepare a statement
    db.prepare("all", sql)
    # execute the prepared statement
    orders = db.exec_prepared("all")
    # close the DB connection
    db.close()
    # return all the PizzaOrder
    return orders.map { |order| PizzaOrder.new(order)}
  end

  def delete
    # connect to database
    db = PG.connect({dbname: 'pizza_shop', host:'localhost'})
    # create SQL string
    sql = "DELETE FROM pizza_orders WHERE id = $1"
    # set up values array
    values = [@id]
    # prepare the statement
    db.prepare("delete", sql)
    # execute prepared statement
    db.exec_prepared("delete", values)
    # close db connection
    db.close()
  end

  def update
    db = PG.connect({dbname: 'pizza_shop', host:'localhost'})
    sql = "UPDATE pizza_orders SET (first_name, last_name, quantity, topping) = ($1, $2, $3, $4) WHERE id = $5"
    values = [@first_name, @last_name, @quantity, @topping, @id]
    db.prepare("update", sql)
    db.exec_prepared("update", values)
    db.close()

  end

end
