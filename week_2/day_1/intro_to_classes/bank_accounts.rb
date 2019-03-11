class BankAccount

  # attr_reader :holder_name, :balance, :type
  # attr_writer :holder_name, :balance, :type

  attr_accessor :holder_name, :balance, :type

  def initialize(holder_name, balance, type)
    @holder_name = holder_name
    @balance = balance
    @type = type
  end

# def holder_name()
#   return @holder_name
# end
#
# def balance()
#   return @balance
# end
#
# def type()
#   return @type
# end
#
# def set_holder_name(new_name)
#   @holder_name = new_name
# end
#
# def set_balance(new_balance)
#   @balance = new_balance
#
# end
#
# def set_account_type(new_account_type)
#   @type = new_account_type
# end

def pay_in(amount)
 @balance += amount
end

def pay_monthly_fee()
if (@type == "business")
  @balance -= 50
else
  @balance -= 10
end

end

end
