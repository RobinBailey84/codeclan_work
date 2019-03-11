require('minitest/autorun')
require('minitest/rg')
require_relative('../customer.rb')
require_relative('../shop.rb')

class CustomerTest < MiniTest::Test

  def setup()
    @customer = Customer.new("Mike", 20)
  end

  def test_customer_has_name()
    assert_equal("Mike", @customer.name)
  end

  def test_customer_has_cash()
    assert_equal(20, @customer.cash)
  end

  def test_customer_makes_purchase()
    @customer.customer_makes_purchase(10)
    assert_equal(10, @customer.cash)
  end

  def test_customer_gets_refund()
    @customer.customer_gets_refund(10)
    assert_equal(30, @customer.cash)
  end

  def test_customer_has_enough_cash()
    result = @customer.customer_has_enough_cash(5)
    assert_equal(true, result)
  end






end
