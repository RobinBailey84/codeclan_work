require('sinatra')
require('sinatra/contrib/all')

require_relative('./models/calculator.rb')
also_reload('./models/*')

# http://localhost:4567/add/1/2
get '/add/:num1/:num2' do
  num1 = params[:num1].to_i()
  num2 = params[:num2].to_i()
  calculator = Calculator.new(num1, num2)
  @result = calculator.add()
  # return result.to_s()
  erb(:result)
end

get '/subtract/:num1/:num2' do
  num1 = params[:num1].to_i()
  num2 = params[:num2].to_i()
  calculator = Calculator.new(num1, num2)
  @result = calculator.subtract()
  # return result.to_s()
  erb( :result )
end

get '/multiply/:num1/:num2' do
  num1 = params[:num1].to_i()
  num2 = params[:num2].to_i()
  calculator = Calculator.new(num1, num2)
  @result = calculator.multiply()
  # return result.to_s()
  erb( :result )
end

get '/divide/:num1/:num2' do
  num1 = params[:num1].to_f()
  num2 = params[:num2].to_f()
  calculator = Calculator.new(num1, num2)
  @result = calculator.divide()
  # return result.to_s()
  erb( :result )
end

get '/' do
  erb(:home)
end

get '/about' do
  erb(:about)
end
