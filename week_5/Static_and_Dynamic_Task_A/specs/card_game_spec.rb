require('minitest/autorun')
require('minitest/rg')
require_relative('../card_game.rb')
require_relative('../card.rb')

class CardGameTest < MiniTest::Test

  def setup()
    @card1 = Card.new("spade", 5)
    @card2 = Card.new("spade", 3)
    @card3 = Card.new("diamonds", 9)
    @card4 = Card.new("clubs", 1)
    @card5 = Card.new("hearts", 5)

  end

  def test_check_for_ace()
    result = CardGame.check_for_ace(@card4)
    assert_equal(true, result)
  end

  def test_highest_card()
     result = CardGame.highest_card(@card3, @card5)
     assert_equal(@card3, result)
  end

  def test_cards_total()
    cards = [@card1, @card2, @card3]
    result = CardGame.cards_total(cards)
    assert_equal("You have a total of 17", result)
  end

end
