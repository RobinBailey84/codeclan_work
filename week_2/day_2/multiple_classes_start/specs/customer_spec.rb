require('minitest/autorun')
require('minitest/rg')
require_relative('../customer.rb')
require_relative('../pet_shop.rb')
require_relative('../pet.rb')

class CustomerTest < MiniTest::Test

  def setup()

    @customer = Customer.new("Arran", 500)
  end

  def test_does_customer_have_name()
    assert_equal("Arran", @customer.name)
  end

def test_customer_has_cash()
  assert_equal(500, @customer.cash)
end

def test_pets_start_empty()
pet_count = @customer.pet_count()
assert_equal(0, pet_count)
end

def test_add_pet()
  new_pet = Pet.new("Reg", "cat", "ginger", 50)
  @customer.add_pet(new_pet)
  assert_equal(1, @customer.pet_count())
end

def test_can_remove_cash()
  @customer.remove_cash(100)
  assert_equal(400, @customer.cash)
end



end
