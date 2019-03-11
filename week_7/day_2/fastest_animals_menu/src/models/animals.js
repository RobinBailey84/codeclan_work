const PubSub = require('../helpers/pub_sub.js');

const Animals = function(){
  this.animals = [
    {species: 'Peregrine Falcon', maxSpeed: 389, class: 'Flight'},
    {species: 'Golden Eagle', maxSpeed: 320, class: 'Flight'},
    {species: 'White-throated Needletail Swift', maxSpeed: 169, class: 'Flight'},
    {species: 'Eurasian Hobby', maxSpeed: 160, class: 'Flight'},
    {species: 'Frigatebird', maxSpeed: 153, class: 'Flight'},
    {species: 'Rock Dove (Pigeon)', maxSpeed: 149, class: 'Flight'},
    {species: 'Spur-winged Goose', maxSpeed: 140, class: 'Flight'},
    {species: 'Black Marlin', maxSpeed: 129, class: 'Swimming'},
    {species: 'Gyrfalcon', maxSpeed: 128, class: 'Flight'},
    {species: 'Grey-headed Albatross', maxSpeed: 129, class: 'Flight'}
  ];
};

Animals.prototype.bindEvents = function(){
  PubSub.publish('Animals:all-animals-ready', this.animals);

  PubSub.subscribe('AnimalMenuView:selected', (evt) => {
   const chosenAnimalName = evt.detail;
   const selectedAnimalObject = this.findByName(chosenAnimalName);
   PubSub.publish('Animals:selected-animal-ready', selectedAnimalObject);
 });
};

Animals.prototype.findByName = function(searchName) {
  const foundAnimal = this.animals.find((animal) => {
    return animal.species === searchName;
  });
  return foundAnimal;
};

module.exports = Animals;
