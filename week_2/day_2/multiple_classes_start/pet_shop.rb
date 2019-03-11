class PetShop

  attr_reader :name, :cash, :pets_sold

def initialize(name, cash, pets)
  @name = name
  @cash = cash
  @pets_sold = 0 #default value, doesn't pass through initialize()
  @pets = pets #this is the array
end

def pet_count()
return @pets.count()
end

def add_pet(new_pet)
@pets << new_pet
end

def get_total_of_pet_prices()
  total = 0
  for pet in @pets
    total += pet.price
  end
  return total
end

def pets_go_mental()
  noises = []
  for pet in @pets
    noises << pet.speak()
  end
  return noises
end


end
