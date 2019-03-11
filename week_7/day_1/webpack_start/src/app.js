//1 get form
//2 add events listener
//3 get values
//3.1 create a person
//3.2 format properties
//4 get the paragraphs
//4.2 get a random adjective
//5 change text of paragraphs

const Person = require('./models/person.js');
const RandomAdjective = require('./models/random_adjective')

document.addEventListener('DOMContentLoaded', () => {
  const form = document.querySelector('#person-details-form');

  form.addEventListener('submit', (event) => {
    event.preventDefault();
    const name = event.target['name-input'].value;
    const favouriteColour = event.target['favourite-colour-input'].value;

    const person = new Person(name, favouriteColour)
    person.formatName();
    person.formatColour();

    const welcomeParagraph = document.querySelector('p.welcome');
    const messageParagraph = document.querySelector('p.message');

    const randomAdjective = new RandomAdjective();
    const adjective = randomAdjective.get();

    welcomeParagraph.textContent = `Hey there, ${person.name}`
    messageParagraph.textContent = `${person.favouriteColour} is a ${adjective} colour`
  })
})
