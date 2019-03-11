const Person = function (name) {
  this.name = name
}

Person.prototype.greet = function () {
  return `Hi, my name is ${this.name}`;
}

// const shaggy = new Person('Shaggy Rogers');
// // shaggy.greet();
// // console.log('Name:', shaggy.name);
// //
// // const dave = new Person('Big Dave');
// // console.log('Name:', dave.name);
//
// const velma = new Person('Velma Dinkley')
// // velma.greet();
//
// console.log('shaggy', shaggy);
// console.log('velma', velma);
//
// console.log('velma\'s greet', velma.greet());
//
// console.log(`velma's prototypes`, Object.getPrototypeOf(velma));

module.exports = Person
