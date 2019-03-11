class Musician

  attr_reader :name

  def initialize(name, instrument)
    @name = name
    @instrument = instrument
  end

  def play_song(song)
    return @instrument.make_sound(song)
  end

def swap_instrument(instrument)
  @instrument = instrument
end

end
