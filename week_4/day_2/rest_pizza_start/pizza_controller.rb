require( 'sinatra' )
require( 'sinatra/contrib/all' )
require( 'pry-byebug' )

require_relative('./models/pizza_order.rb')
also_reload('./models/*')

#NEW - show form to create a new pizza
get '/pizzas/new' do
  erb(:new)
end

get '/pizzas' do
  @orders = PizzaOrder.all()
  erb(:index)
end

get '/pizzas/:id' do
@order = PizzaOrder.find(params[:id].to_i())
erb(:show)
end

# get '/pizzas/:id/delete' do
#   erb(:delete)
# end

#CREATE - this will save to the database
post '/pizzas' do
  @order = PizzaOrder.new(params)
  @order.save()
  # redirect('/pizzas') - THIS WILL TAKE YOU BACK TO THE HOME PAGE ONCE PIZZA HAS BEEN ORDERED
  erb(:create) #this will take you to a new page ie confirmation page once order is placed
end

post '/pizzas/:id/delete' do
  @order = PizzaOrder.find(params[:id].to_i())
  @order.delete()
  redirect('/pizzas')
end

get "/pizzas/:id/edit" do
  @order = PizzaOrder.find(params[:id].to_i())
  @toppings = ["Pepperoni", "Calzone", "Italian Sausage"]
  erb(:edit)
end

post '/pizzas/:id' do
 @order = PizzaOrder.new(params)
 @order.update()
 redirect('/pizzas')
end
