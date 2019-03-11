require('sinatra')
require('sinatra/contrib/all')

get '/hi' do #get is a method provided by sinatra, this is the request/controllers. must have the forward slash
 return "Hello World!"
end

get '/roll-die' do #returns a random number
    return "#{rand(1..6)}"
end

get '/hi/:name/:last' do
  return "Your name is #{params[:name]} #{params[:last]}"
end

get '/friends/:number' do
  friends = ["Joey", "Phoebe", "Ross", "Monica", "Chandler", "Rachel"]
  index = params[:number].to_i()
  return friends[index]
end

get '/pet/hello' do
  return "Hello pet!"
end

get '/pet/:name' do
  return "Who's a good boy ...#{params[:name]}"
end

get '/pet/by-id/:id' do
  return "Your pets id is #{params[:id]}"
end
