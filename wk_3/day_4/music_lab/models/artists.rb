require_relative('../db/sql_runner.rb')


class Artist
  attr_accessor :name
  attr_reader :id

  def initialize(options)
    @name = options['name']
    @id = options['id'].to_i() if options['id']
  end


  def save()
    sql = "INSERT INTO artists (name) VALUES ($1) RETURNING id"
    values = [@name]
    result = SqlRunner.run(sql, values)
    @id = result[0]['id'].to_i()
  end

  def Artist.all()
    sql = "SELECT * FROM artists"
    result = SqlRunner.run(sql)
    albums = result.map{|artist| Artist.new(artist)}
    return albums
  end

  def Artist.find_by_id(id)
    sql = "SELECT * FROM artists WHERE id = $1"
    values = [id]
    result = SqlRunner.run(sql, values)
    # artist_hash = result[0]
    artists = result.map{|artist| Artist.new(artist)}
    return artists
  end

  def albums()
    sql = "SELECT * FROM albums WHERE artist_id = $1"
    values = [@id]
    result = SqlRunner.run(sql, values)
    albums = result.map{|album| Album.new(album)}
    return albums
  end

  def update()
    # if only one item updating, you dont need brackets?
    sql = "UPDATE artists SET name = $1 WHERE id = $2"
    values = [@name, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = "DELETE FROM artists WHERE id = $1"
    values = [@id]
    SqlRunner.run(sql, values)
  end



end
