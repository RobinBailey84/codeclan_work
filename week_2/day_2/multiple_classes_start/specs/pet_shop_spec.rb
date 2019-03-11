require('minitest/autorun')
require('minitest/rg')
require_relative('../pet_shop.rb')
require_relative('../pet.rb')

class PetShopTest < MiniTest::Test

  def setup ()
    @pet1 = Pet.new("Sir Percy", "Cat", "British Shorthair", 500)
    @pet2 = Pet.new("King Bagdemagus", "Cat", "British Shorthair", 500)
    @pet3 = Pet.new("Sir Lancelot", "Dog", "Pomsky", 1000)
    @pet4 = Pet.new("Arthur", "Dog", "Husky", 900)
    @pet5 = Pet.new("Tristan", "Cat", "Basset Hound", 800)
    @pet6 = Pet.new("Merlin", "Cat", "Egyptian Mau", 1500)

    pets = [@pet1, @pet2, @pet3, @pet4, @pet5, @pet6]

    @pet_shop = PetShop.new("Camelot of pets", 1000, pets)

  end

  def test_pet_shop_name()
    name = @pet_shop.name
    assert_equal("Camelot of pets", name)
  end

  def test_pet_shop_cash()
    cash = @pet_shop.cash
    assert_equal(1000, cash)
  end

  def test_pet_shop_pets_sold()
    pets_sold = @pet_shop.pets_sold
    assert_equal(0, pets_sold)
  end

  def test_pet_shop_pet()
    pet_count = @pet_shop.pet_count()
    assert_equal(6, pet_count)
  end

  def test_can_add_pet()
    new_pet = Pet.new("Archie", "Dog", "Labrador", 600)
    @pet_shop.add_pet(new_pet)
    pet_count = @pet_shop.pet_count()
    assert_equal(7, pet_count)

  end

  def test_can_get_pet_price_totals()
    total = @pet_shop.get_total_of_pet_prices()
    assert_equal(5200, total)
  end

  def test_gets_can_go_mental()
    result = @pet_shop.pets_go_mental()
    expected = ["Meow", "Meow", "Woof", "Woof", "Meow", "Meow"]
    assert_equal(expected, result)
  end


end
