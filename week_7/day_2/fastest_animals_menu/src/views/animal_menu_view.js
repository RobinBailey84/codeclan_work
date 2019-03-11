
const PubSub = require('../helpers/pub_sub.js');

const AnimalMenuView = function(menu) {
  this.menu = menu;
};

AnimalMenuView.prototype.bindEvents = function() {
  PubSub.subscribe('Animals:all-animals-ready', (event) => {
    this.populate(event.detail);
  })
  this.menu.addEventListener('click', (evt) => {
    const selectedAnimal = evt.target.id;
    PubSub.publish('AnimalMenuView:selected', selectedAnimal);
  });
};

AnimalMenuView.prototype.populate = function(animals){
  animals.forEach((animal) => {
    const animalLink = document.createElement('a');
    animalLink.id = animal.species;
    animalLink.classList.add('animal-menu-item');
    animalLink.innerText = animal.species;
    this.menu.appendChild(animalLink);
  })
}

module.exports = AnimalMenuView;
