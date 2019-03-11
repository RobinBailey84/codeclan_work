const PubSub = require('../helpers/pub_sub.js');

const SelectView = function(element){
  this.element = element;
}

SelectView.prototype.bindEvents = function(){
  PubSub.subscribe('Munros:munros-loaded', (event) => {
    this.populate(event.detail);
  });
  this.element.addEventListener('change', (event) => {
    const selectedRegion = event.target.value
    PubSub.publish('SelectView:selected-region', selectedRegion);
  })
}

SelectView.prototype.populate = function(munros){
  const uniqueRegions = []
  munros.forEach((munro) => {
    if (!uniqueRegions.includes(munro.region)){
      uniqueRegions.push(munro.region)
    }
  })
    uniqueRegions.forEach((region) => {
      const option = document.createElement('option');
      option.value = region;
      option.textContent = region;
      this.element.appendChild(option);
    })

}

module.exports = SelectView;
