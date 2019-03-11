const PubSub = require('../helpers/pub_sub.js');

const FurnitureGroups = function (data) {
  this.data = data;
};

FurnitureGroups.prototype.bindEvents = function(){
  PubSub.publish('Furniture:all-furniture', this.data);

  // PubSub.subscibe('SelectView:furniture-selected' (event) => {
  //   const selectedIndex = event.detail;
  // })
}

module.exports = FurnitureGroups;
