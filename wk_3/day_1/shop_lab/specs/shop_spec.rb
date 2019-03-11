require('minitest/autorun')
require('minitest/rg')
require_relative('../shop.rb')
require_relative('../customer.rb')

class ShopTest < MiniTest::Test

  def setup()
    items = []
    @shop = Shop.new("HMV", 0, 0, items)
  end

  def test_shop_has_name()
    assert_equal("HMV", @shop.shop_name)
  end

  def test_shop_sales()
    assert_equal(0, @shop.sales)
  end

  def test_shop_refunds()
    assert_equal(0, @shop.refunds)
  end

  def test_shop_has_items()
    assert_equal(0, @shop.items.count)
  end

  def test_shop_makes_sale
    @shop.shop_makes_sale(10)
    assert_equal(10, @shop.sales)
  end

  def test_shop_gives_refund()
    @shop.shop_gives_refund(10)
    assert_equal(10, @shop.refunds)
  end

def test_total_income()
  @shop.shop_makes_sale(50)
  @shop.shop_gives_refund(10)
  result = @shop.report_total_income
  assert_equal(40, result)
end






end
