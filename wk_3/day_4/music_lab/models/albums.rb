require_relative('../db/sql_runner.rb')

class Album
  attr_accessor :name, :genre, :artist_id
  attr_reader :id

  def initialize(options)
    @id = options['id'].to_i if options['id']
    @name = options['name']
    @genre = options['genre']
    @artist_id = options['artist_id'].to_i()
  end


  def save()
    sql = "INSERT INTO albums (name, genre, artist_id) VALUES ($1,$2,$3) RETURNING id"
    values = [@name, @genre, @artist_id]
    result = SqlRunner.run(sql, values)
    @id = result[0]['id'].to_i()
  end

  def Album.all()
    sql = "SELECT * FROM albums"
    result = SqlRunner.run(sql)
    albums = result.map{|album| Album.new(album)}
    return albums
  end

  def artist()
    sql = "SELECT * FROM artists WHERE id = $1"
    values = [@artist_id]
    result = SqlRunner.run(sql, values)
    artist_hash = result[0]
    artist = Artist.new(artist_hash)
    return artist
  end

  def update()
    sql = "UPDATE albums SET (name, genre) = ($1, $2) WHERE id = $3"
    values = [@name,@genre, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = "DELETE FROM albums WHERE id = $1"
    values = [@id]
    SqlRunner.run(sql, values)
  end


end
