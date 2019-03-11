class Customer

  attr_reader :name, :cash

  def initialize(name, cash)
    @name = name
    @cash = cash
  end

  def customer_makes_purchase(price)
    if customer_has_enough_cash(5) == true
      @cash = @cash - price
    end
  end

  def customer_gets_refund(price)
    @cash = @cash + price
  end

  def customer_has_enough_cash(price)
    return @cash >= price
  end


end
