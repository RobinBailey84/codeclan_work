require('minitest/autorun')
require('minitest/rg')
require_relative('../bank_accounts.rb')

class BankAccountTest < MiniTest::Test

def setup()
  @account = BankAccount.new("Ally", 500, "business")
end

def test_account_has_name()
  name = @account.holder_name()
assert_equal("Ally", name)
end

def test_account_has_balance()
  balance = @account.balance()
  assert_equal(500, balance)
end

def test_account_has_type()
  type = @account.type()
  assert_equal("business", type)
end

def test_can_set_account_name()
  @account.holder_name = "Bob"
  name = @account.holder_name()
  assert_equal("Bob", name)

end

def test_can_change_balance()
  @account.balance = 1000
  balance = @account.balance()
  assert_equal(1000, balance)
end

def test_can_change_account_type()
  @account.type = "personal"
  balance = @account.type()
  assert_equal("personal", balance)

end

def test_can_pay_into_account()
  @account.pay_in(1000)
  assert_equal(1500, @account.balance())

end

def test_monthly_fee_business()
  @account.pay_monthly_fee()
  assert_equal(450, @account.balance())
end

def test_monthly_fee_personal()
  personal_account = BankAccount.new("Robin", 1000, "personal")
  personal_account.pay_monthly_fee()
  assert_equal(990, personal_account.balance())
end

end
