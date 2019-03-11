const PubSub = require('../helpers/pub_sub.js');
const Request = require('../helpers/request.js')

const Munros = function(){
  this.munros = [];
}

Munros.prototype.bindEvents = function(){
  PubSub.subscribe('SelectView:selected-region', (event) => {
    const region = event.detail;
    const foundRegion = this.findByRegion(region);
    PubSub.publish('Munros:region-found', foundRegion);
    // console.log(foundRegion);
  })
}


Munros.prototype.getData = function(){
  const request = new Request('https://munroapi.herokuapp.com/munros');
  request.get().then((data) => {
    this.munros = data;
    // console.log(this.munros);
    PubSub.publish('Munros:munros-loaded', this.munros);
  })
}

Munros.prototype.findByRegion = function(searchRegion){
  const foundRegion = this.munros.filter((munro) => {
    return munro.region === searchRegion;
  })
  return foundRegion;
  // console.log(region);
}

module.exports = Munros;
