require('minitest/autorun')
require('minitest/rg')
require_relative('../fizz_buzz.rb')

class FizzBuzzTest < MiniTest::Test

  def test_fizz_buzz_3_returns_fizz
    actual = fizz_buzz(3)
    assert_equal("Fizz", actual)
  end

def test_fizz_buzz_5_returns_buzz
  actual = fizz_buzz(5)
  assert_equal("Buzz", actual)
end

def test_fizz_buzz_6_return_fizz
  actual = fizz_buzz(6)
  assert_equal("Fizz", actual)
end

def test_fizz_buzz_10_returns_buzz
  actual = fizz_buzz(10)
  assert_equal("Buzz", actual)
end

def test_fizz_buzz_15_returns_fizzbuzz
  actual = fizz_buzz(15)
  assert_equal("FizzBuzz", actual)
end

def test_fizz_buzz_1_returns_1
  actual = fizz_buzz(1)
  assert_equal("1", actual)
end



end
