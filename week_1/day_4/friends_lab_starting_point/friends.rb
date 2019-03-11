def get_name(person)
  return person[:name]
end

def favourite_tv_show(person)
  return person[:tv_show]
end

def food_likes(person, food)
  found = false

  for snack in person[:favourites][:snacks]
    if snack == food
      found = true
    end
  end

  return found
end

def add_friend(person, friend)
  person[:friends].push(friend)
end

def remove_friend(person, friend)
  person[:friends].delete(friend)
end

def total_money(people)
  total = 0
  for perosn in people
    total += person[:monies]
  end
  return total
end

def can_lend_money(lender, lendee, amount)
  lender[:monies] -= amount
  lendee[:monies] += amount
end

def all_favourite_foods(people)
favourite_foods = []
for person in people
  favourite_foods += person[:favourites][:snacks]
end
return all_favourite_foods
end

def find_no_friends(people)
no_mates = []
for personn in people
  if person[:friends].empty?
    no_mates.push(person)
  end
end
return no_mates
end
