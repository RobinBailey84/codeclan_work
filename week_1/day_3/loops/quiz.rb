my_number = 5
p "what number am I thinking of?"
value = gets.to_i()

while (value != my_number)
  p "Nope! Try again.."
  value = gets.to_i()
end

p "Yes! The number I was thinkig was #{my_number}"
