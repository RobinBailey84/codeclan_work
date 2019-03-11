class Shop

  attr_reader :shop_name, :sales, :refunds, :items

  def initialize(shop_name, sales, refunds, items)
    @shop_name = shop_name
    @sales = sales
    @refunds = refunds
    @items = items
  end

  def shop_makes_sale(sale_price)
    @sales += sale_price
  end

  def shop_gives_refund(refund_amount)
    @refunds += refund_amount
  end

  def report_total_income
    @sales - @refunds
  end


end
