class PetShop

  attr_reader :name, :cash, :pets_sold

  def initialize(name, cash, pets)
    @name = name
    @cash = cash
    @pets_sold = 0
    @pets = pets
  end

  def pet_count()
    return @pets.size()
  end

  def add_pet(pet)
    @pets << pet
  end

  def get_pet_names
    return @pets.map{|pet| pet.name}
  end

  def find_by_breed(breed)
    return @pets.find_all{|pet| pet.breed == breed}
  end

  def find_by_name(name)
    return @pets.find{|pet| pet.name == name}
  end

  def find_most_expensive_pet()
    @pets.max{|pet| pet.price}
  end

  def get_total_pet_prices()
    return @pets.reduce(0){|total, pet| total + pet.price}
  end

  def half_price_of_pets()
    @pets.each{|pet| pet.price /= 2}
  end

end
