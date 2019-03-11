require_relative("../db/sql_runner")
require_relative("./user.rb")

class Location

  attr_reader :id
  attr_accessor :name, :category

  def initialize( options )
    @id = options['id'].to_i if options['id']
    @name = options['name']
    @category = options['category']
  end

  def save()
    sql = "INSERT INTO locations
    (
      name,
      category
    )
    VALUES
    (
      $1, $2
    )
    RETURNING id"
    values = [@name, @category]
    location = SqlRunner.run( sql, values ).first
    @id = location['id'].to_i
  end

  def self.all()
    sql = "SELECT * FROM locations"
    values = []
    locations = SqlRunner.run(sql, values)
    result = locations.map { |location| Location.new( location ) }
    return result
  end

  def self.delete_all()
    sql = "DELETE FROM locations"
    values = []
    SqlRunner.run(sql, values)
  end

  def users()
    sql = "SELECT users.* FROM users INNER JOIN visits ON users.id = visits.user_id WHERE visits.location_id = $1"
    values = [@id]
    user_array = SqlRunner.run(sql, values)
    users = user_array.map{|user_hash| User.new(user_hash)}
    return users

  end

end
