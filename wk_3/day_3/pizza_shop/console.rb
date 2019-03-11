require('pry')
require_relative('models/pizza_order.rb')
PizzaOrder.delete_all

order1 = PizzaOrder.new({
  'first_name' => 'Luke',
  'last_name' => 'Skywalker',
  'quantity' => '1',
  'topping' => 'Napoli'
  })



  order2 = PizzaOrder.new({
    'first_name' => 'Darth',
    'last_name' => 'Vader',
    'quantity' => '1',
    'topping' => 'Pepperoni'
    })

    order3 = PizzaOrder.new({
      'first_name' => 'Han',
      'last_name' => 'Solo',
      'quantity' => '1',
      'topping' => 'Spicy Meat Feast'
      })

    order1.save()
    order2.save()
    order3.save()

    order1.delete()

    order2.first_name = "Annakin"
    order2.last_name = "Skywalker"
    order2.update()

    all_orders = PizzaOrder.all

    binding.pry
    nil
