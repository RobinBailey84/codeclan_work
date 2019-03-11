require('minitest/autorun')
require('minitest/rg')
require_relative('../pet_class.rb')

class PetTest < MiniTest::Test

  def setup()
    @pet = Pet.new("Reg", "Cat", "Ginger", 100)
  end

  def test_pet_has_name()
    assert_equal("Reg", @pet.name())
  end
end
