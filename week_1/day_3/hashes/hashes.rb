# meals = {
#   :breakfast => "Cereal",
#   :lunch => "Roll",
#   :dinner => "Steak",
# }
#
# p meals [:dinner]
#
#  meals ["brunch"] = "pancakes" #adds new key
#  meals["dinner"] = "pasta" #changes variable
# meals.delete("breakfast")
#
# p meals.keys()
#
# p meals.values()
#
# p meals
# silly_things = {
#   1 => "2",
#   2 => 3,
#   3 => false
# }
#
# p silly_things[3]

# fruits = Hash.new(0)
# p fruits ["apple"]

# person = {
#   :robin => 2,
#   :arran => 100,
#   :tom => 20
# }
#
# person [:jen] = 10
#
# person.delete (:robin)
#
# p person

countries = {
  uk: {
    capital: "London",
    population: 66000000,
    regions: ["Scotland", "England", "Wales"]
  },
  germany: {
    capital: "Berlin",
    population: 83000000
  }
}

# p countries [:uk]
# p countries [:germany][:population]

# p countries [:uk][:regions][1]

avengers = {
  iron_man: {
    name: "Tony Stark",
    moves: {
    punch: 10,
    kick: 100
    }
  },
  hulk: {
    name: "Bruce Banner",
    moves: {
    smash: 1000,
    roll: 500
  }
}
}

p avengers [:hulk][:moves][:smash]
