require_relative("../db/sql_runner")
require_relative("./location.rb")
require_relative("./user.rb")

class Visit

  attr_reader :id
  attr_accessor :user_id, :location_id, :review

  def initialize( options )
    @id = options['id'].to_i if options['id']
    @user_id = options['user_id'].to_i
    @location_id = options['location_id'].to_i
    @review = options['review']
  end

  def save()
    sql = "INSERT INTO visits
    (
      user_id,
      location_id,
      review
    )
    VALUES
    (
      $1, $2, $3
    )
    RETURNING id"
    values = [@user_id, @location_id, @review]
    visit = SqlRunner.run( sql,values ).first
    @id = visit['id'].to_i
  end

  def self.all()
    sql = "SELECT * FROM visits"
    visits = SqlRunner.run(sql)
    result = visits.map { |visit| Visit.new( visit ) }
    return result
  end

  def self.delete_all()
    sql = "DELETE FROM visits"
    SqlRunner.run(sql)
  end

  def location()
    sql = "SELECT * FROM locations WHERE id = $1"
    values = [@location_id]
    location_hash = SqlRunner.run(sql, values)[0]
    location = Location.new(location_hash)
    return location
  end

  def user()
    sql = "SELECT * FROM users WHERE id = $1"
    values = [@user_id]
    user_hash = SqlRunner.run(sql, values)[0]
    user = User.new(user_hash)
    return user
  end

end
