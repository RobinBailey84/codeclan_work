chickens = ["Arran", "Hetty", "Henrietta", "Audrey", "Mabel"]

# for chicken in chickens
#   p chicken
# end

# chickens.each {|chicken| p chicken}

# chickens.each do |chicken| ***this does the same loop as above
#   shouting_chicken = chicken.upcase()
#   p shouting_chicken
# end

# chicken_lengths = []
# for chicken in chickens
#   chicken_lengths << chicken.length
# end
#
# p chicken_lengths

chicken_length = chickens.map {|chicken| chicken}

p chicken_length

# chickens.each_with_index {|chicken, index| p "#{chicken} is at index #{index}"}

# # p chickens.find {|chicken| chicken[0] == "H"} **this does the below loop
#
# found_chicken = ""
# for chicken in chickens
#   if chicken[0] == "H"
#     found_chicken = chicken
#     break
#   end
# end
#
# p found_chicken

# p chickens.find_all {|chicken| chicken[0] == "H"}
# p chickens.select {|chicken| chicken[0] == "H"}

# p chickens.reduce {|list, chicken| list + ", " + chicken}

numbers = [1,2,3,4,5]
#
# p numbers.reduce {|total, number| total + number }
#
# count = 0
#
# for number in numbers
#   count += number
# end
# p count

p numbers.max(2)
p numbers.min(2)
