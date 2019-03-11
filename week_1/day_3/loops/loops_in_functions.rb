chickens = [
  { name: "Margaret", age: 2, eggs: 0},
  { name: "Hetty", age:1, eggs: 3},
  { name: "Henrietta", age: 5, eggs: 9},
  { name: "Audrey", age: 9, eggs: 7},
  { name: "Mabel", age: 12, eggs: 23}
]

def find_chicken_by_name(array, name)
  for chicken in array
    if chicken[:name] == name
      return chicken
    end
  end
end

result1 = find_chicken_by_name(chickens, "Hetty")
p result1

def find_chicken_eggs(array, eggs)
  for egg in array
    if chicken[:eggs] == egg
      return egg
    end
  end
end

result2 = find_chicken_eggs(chickens, 23)
