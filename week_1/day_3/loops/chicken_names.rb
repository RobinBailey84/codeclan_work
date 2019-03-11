# chicken_names = [ "Margaret", "Hetty", "Henrietta", "Audrey", "Mabel"]
#
# for chicken_name in chicken_names
#   p chicken_names
# end
chickens = [
  { name: "Margaret", age: 2, eggs: 0},
  { name: "Hetty", age:1, eggs: 3},
  { name: "Henrietta", age: 5, eggs: 9},
  { name: "Audrey", age: 9, eggs: 7},
  { name: "Mabel", age: 12, eggs: 23}
]

total_eggs = 0

for chicken in chickens
# p "#{chicken [:name]} is #{chicken [:age]}"
  total_eggs = total_eggs + chicken[:eggs]
  chicken[:eggs] = 0
end

p total_eggs.to_s + " eggs collected"
