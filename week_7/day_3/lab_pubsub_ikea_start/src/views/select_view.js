const PubSub = require('../helpers/pub_sub.js');

const SelectView = function(element){
  this.element = element;
}

SelectView.prototype.bindEvents = function(){
  PubSub.subscribe('Furniture:all-furniture', (event) => {
    this.populate(event.detail);
  })
  // this.element.addEventListener('change', (event) => {
  //   const selectedIndex = event.target.value;
  //   PubSub.publish('SelectView:furniture-selected', selectedIndex)
  // })
}

SelectView.prototype.populate = function(furniture){
  furniture.forEach((item, index) => {
    const option = document.createElement('option');
    option.value = index;
    option.textContent = item.name;
    this.element.appendChild(option);
  })
}

module.exports = SelectView;
