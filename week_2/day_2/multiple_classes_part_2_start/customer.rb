class Customer

  attr_reader :name, :cash

  def initialize(name, cash)
    @name = name
    @cash = cash
    @pets = []
  end

  def pet_count()
    return @pets.count()
  end

  def add_pet(pet)
    @pets << pet
  end

  def remove_cash(amount)
    @cash -= amount
  end

  def buy_pet(shop, pet_name)
    found_pet = shop.find_pet_by_name(pet_name)
    if (@cash >= found_pet.price)
    pet = shop.sell_pet(pet_name)
    @pets << pet
    @cash -= pet.price
  end
end


end
