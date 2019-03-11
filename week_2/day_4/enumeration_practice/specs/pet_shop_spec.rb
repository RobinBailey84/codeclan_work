require('minitest/autorun')
require('minitest/rg')
require_relative('../pet_shop.rb')
require_relative('../pet.rb')

class PetShopTest < MiniTest::Test

  def setup()
    @pet1 = Pet.new("Sir Percy", "Cat", "British Shorthair", 500)
    @pet2 = Pet.new("King Bagdemagus", "Cat", "British Shorthair", 500)
    @pet3 = Pet.new("Sir Lancelot", "Dog", "Pomsky", 1000)
    @pet4 = Pet.new("Arthur", "Dog", "Husky", 900)
    @pet5 = Pet.new("Tristan", "Cat", "Basset Hound", 800)
    @pet6 = Pet.new("Merlin", "Cat", "Egyptian Mau", 1500)

    pets = [@pet1, @pet2, @pet3, @pet4, @pet5, @pet6]

    @pet_shop = PetShop.new("Camelot of pets", 1000, pets)

  end

  def test_get_all_names()
    actual = @pet_shop.get_pet_names()
    expected = ["Sir Percy", "King Bagdemagus", "Sir Lancelot", "Arthur", "Tristan", "Merlin"]
    assert_equal(expected, actual)
  end

  def test_find_husky()
    actual = @pet_shop.find_by_breed("Husky")
    assert_equal([@pet4], actual)
  end

  def test_cannot_find_dalmation
    actual = @pet_shop.find_by_breed("Dalmation")
    assert_equal([], actual)
  end


  def test_find_arthur()
    actual = @pet_shop.find_by_name("Arthur")
    assert_equal(@pet4, actual)
  end

  def test_can_find_most_expensive()
      actual = @pet_shop.find_most_expensive_pet()
      assert_equal(@pet6, actual)
    end
  
  def test_find_total_prices()
    actual = @pet_shop.get_total_pet_prices()
    assert_equal(5200, actual)
  end

  def test_change_price()
    @pet_shop.half_price_of_pets()
    actual = @pet_shop.get_total_pet_prices()
    assert_equal(2600, actual)
  end



end
