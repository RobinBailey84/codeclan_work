const PubSub = require('../helpers/pub_sub.js');

const InstrumentFamilies = function(data) {
  this.data = data;
  console.log(this.data); //this shows if the data has been passed to constructor
};

InstrumentFamilies.prototype.bindEvents = function(){
  PubSub.publish('InstrumentFamilies:all-data-ready', this.data);

  PubSub.subscribe('SelectView:family-selected', (event) => {
    const selectedIndex = event.detail;
    const family = this.findFamily(selectedIndex)
    // console.log(family);
    PubSub.publish('InstrumentFamilies:family-selected', family);
  })
}

InstrumentFamilies.prototype.findFamily = function (index) {
  return this.data[index];
}

module.exports = InstrumentFamilies;
