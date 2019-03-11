# counter = 0
# my_number = 5
#
# while (counter < my_number)
#   p "Counter is #{counter}"
#   counter += 1
# end

my_number = 5
p "what number am I thinking of?"
value = gets.to_i()

while (value != my_number)
  if (value > my_number)
    p "Too high!"
  else
    p "Too low!"
  end

  p "Nope! Try again.."
  value = gets.to_i()
end

p "Yes! The number I was thinkig was #{my_number}"
