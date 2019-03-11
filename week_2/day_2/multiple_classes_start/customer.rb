class Customer

attr_reader :name, :cash, :pets

def initialize(name, cash)

  @name = name
  @cash = cash
  @pets = []
end

def customer_name()
  @customer.name
end

def customer_cash()
  @customer.cash
end

def add_pet(new_pet)
  @pets << new_pet
end

def pet_count
return @pets.count()
end

def remove_cash(amount)
  @cash -= amount
end



end
