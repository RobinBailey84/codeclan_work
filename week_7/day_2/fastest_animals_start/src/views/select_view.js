const PubSub = require('../helpers/pub_sub.js');

const SelectView = function(element){
  this.element = element
};

SelectView.prototype.bindEvents = function(){
  PubSub.subscribe('Animals:all-animals-ready', (event) => {
    this.populate(event.detail);
  });

  this.element.addEventListener('change', (event) => {
    console.log(event.target.value);
    const selectedIndex = event.target.value;
    PubSub.publish('SelectView:animal-selected', selectedIndex);
  })

}

SelectView.prototype.populate = function(animals){

  // const blankOption = document.createElement('options');
  // blankOption.textContent = "Choose an animal";
  // blankOption.disabled = true;

  animals.forEach((animal, index) => {
    const option = document.createElement('option');
    option.value = index;
    option.textContent = animal.species;
    this.element.appendChild(option);
  })
}

module.exports = SelectView;
