class Instrument

  attr_reader :type

  def initialize(type)
    @type = type
  end

  def make_sound(song)
    return "Playing #{song} on the #{@type}" if @type == "Guitar"
    return "Plink Plonk goes #{song}" if @type == "Piano"
  end



end
