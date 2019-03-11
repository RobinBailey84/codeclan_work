const myNumbers = [1, 2, 3, 4, 5];

// for (let number of myNumbers){
//   console.log(`This is number ${number}`);
// }

// myNumbers.forEach(function(number){
//   console.log(`This is number ${number}`);
// });

myNumbers.forEach((number, index) => {
  console.log(`Another way to display ${number} with index ${index}`);
});

const multiplyByTwo = function(numbers){
  // const results = []
  //
  // numbers.forEach((number) => {
  //   const multilplied = number * 2;
  //   results.push(multilplied);
  // })
  // return results;
  return numbers.map((number) => {
    return number * 2
  })
}
console.log(multiplyByTwo(myNumbers));

// 1. Write a function called getEvens that takes an array of numbers as an argument and returns a new array that only contains the even numbers from the original array.
// 2. Write a function called sumElements that takes an array of numbers as an argument and returns the sum total of all the elements in the array.

const getEvens = function(numbers){
//   const results = []
//
//   numbers.forEach((number) => {
//   if (number % 2 === 0){
//     results.push(number)
//   }
// });
//   return results;
return numbers.filter((number) => {
  return number % 2 === 0;
  })
}

console.log(getEvens(myNumbers));

const sumElements = function(numbers){
  // let total = 0;
  // numbers.forEach((number) => {
  //   total += number
  // });
  // return total;
return numbers.reduce((total, number) => {
  return total + number;
}, 10)// putting a number here starts the total in the argument passed
}

console.log(sumElements(myNumbers));
