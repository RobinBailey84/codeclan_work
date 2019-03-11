require('minitest/autorun')
require('minitest/rg')
require_relative('../instrument.rb')

class MusicianTest < MiniTest:: Test


  def setup()
    @instrument = Instrument.new("Guitar")

  end

  def test_guitar_has_type()
    assert_equal("Guitar", @instrument.type)
  end

  def test_guitar_can_make_sound()
    actual = @instrument.make_sound("Hey Joe")
    assert_equal("Playing Hey Joe on the Guitar", actual)

  end

def test_piano_can_make_sound()
  piano = Instrument.new("Piano")
  actual = piano.make_sound("Radio Gaga")
  assert_equal("Plink Plonk goes Radio Gaga", actual)
end





end
