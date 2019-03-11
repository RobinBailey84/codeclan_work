require('minitest/autorun')
require('minitest/rg')
require_relative('../musician.rb')
require_relative('../instrument.rb')

class MusicianTest < MiniTest:: Test


  def setup()
    @guitar = Instrument.new("Guitar")
    @piano = Instrument.new("Piano")
    @musician = Musician.new("Jimmi Hendrix", @guitar)
    @musician2 = Musician.new("Freddit Mercury", @piano)
  end

def test_musician_has_name()
  assert_equal("Jimmi Hendrix", @musician.name)
end

def test_musician_play_song_on_guitar
  actual = @musician.play_song("Hey Joe")
  assert_equal("Playing Hey Joe on the Guitar", actual)
end

def test_musician_can_play_song_on_piano
  actual = @musician2.play_song("Radio Gaga")
  assert_equal("Plink Plonk goes Radio Gaga", actual)
end

def test_musician_can_swap_instrument()
  @musician.swap_instrument(@piano)
  actual = @musician.play_song("Little Wing")
  assert_equal("Plink Plonk goes Little Wing", actual)
end



end
