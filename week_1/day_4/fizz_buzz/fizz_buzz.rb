def fizz_buzz(number)
  # if number is divisible by 3 return fizz
  # if number is divisible by 5 return fizz
  if number % 3 == 0 && number % 5 == 0
    return "FizzBuzz"
  end

  if (number % 3 == 0 )
    return "Fizz"
  end

  if (number % 5 == 0)
    return "Buzz"
  end

  return number.to_s()

end
