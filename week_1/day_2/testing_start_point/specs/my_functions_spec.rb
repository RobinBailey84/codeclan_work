require('minitest/autorun')
require('minitest/rg')
require_relative('../my_functions')

class FunctionsTest < MiniTest::Test

    def test_greet
        #arrange
        #act
        result = greet('Debi', 'afternoon')
        #assert
        assert_equal('Good afternoon, Debi', result)
    end

    def test_add
      result = add(2, 2)
      assert_equal(4, result)
    end
end
