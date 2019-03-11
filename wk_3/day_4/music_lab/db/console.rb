require('pry')
require_relative('../models/albums.rb')
require_relative('../models/artists.rb')


artist1 = Artist.new({
  'name' => 'Meatloaf'
  })

  artist1.save()

  album1 = Album.new({
    'name' => 'Bat out of Hell',
    'genre' => 'Rock',
    'artist_id' => "#{artist1.id}"
    })
    album1.save()

    album3 = Album.new({
      'name' => 'Bat out of Hell 2',
      'genre' => 'Rock',
      'artist_id' => "#{artist1.id}"
      })
      album3.save()

    artist2 = Artist.new({
      'name' => 'Oasis'
      })
      artist2.save()
      album2 = Album.new({
        'name' => 'Definitely maybe',
        'genre' => 'Indie',
        'artist_id' => "#{artist2.id}"
        })
        album2.save()



  # artist1.name = 'Jon Bon Jovi'
  # artist1.update()
  # album1.name = 'Hello'
  # album1.update()
  # album1.delete()
  # album3.delete()
  # artist1.delete()
artists = Artist.find_by_id('2')






    Album.all()
    Artist.all()


  binding.pry
  nil
