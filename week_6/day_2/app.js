const Pet = require('./pet.js');
const Person = require('./person.js')

const scooby = new Pet('Scooby Doo', 'Dog');
const resultOfEat = scooby.eat('scooby snack');
console.log(resultOfEat);

const shaggy = new Person('Shaggy Rogers');
const resultOfGreat = shaggy.greet();
console.log(resultOfGreat);
