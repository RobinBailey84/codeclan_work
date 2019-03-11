function sayHello(name) { //could do (name = "World as a default option")
  return `Hello ${name}`;
}

// //var nameToBeCalled = 'Debi' can then put this through below to print name
// console.log('Result of function:', sayHello('Debi'));

// var add = function(num1, num2){
//   return num1 + num2
// }
//
// console.log('Addition:', add(2,3));

var multiply = (num1, num2) => {
  return num1 * num2
}

console.log('Multiplication:', multiply(2, 3));

// numbers = [1, 2, 3]
//
// var add = function(array){
//   (total = 0);
//   for (var number of numbers);
//   (total = total + number);
//   return total
// };
// console.log('Total: ', add(numbers));

function totalNumbers(numbers){
  var total = 0
  for (var number of numbers){
    total += number;
  }
  return total;
}
console.log('total:', totalNumbers([1,2,3]));


// 1. Declare a **named** function that takes an array of numbers, and returns the sum, or total, of all of the numbers in the array.
//
// 2. Define an **anonymous** function expression that takes two arguments:
//   - an object, for example, `{ name: 'Wojtek', age: 30 }`
//   - a string, for exmaple, `'name'`
//
//   Your function should return `true` if the given string is a `key` on the given object and `false` if the object does not have a key that matches the string. Store this function in an appropriately named variable to invoke it.

var keySearch = function(givenObject, searchKey){
  for (var key in givenObject){
    if (key === searchKey){
      return true;
    }
  }
  return false;
}

var person = {
  name: 'Wojtek',
  age: 30
}

console.log('True Result: ', keySearch(person, 'name'));

console.log('False result: ', keySearch(person, 'height'));
