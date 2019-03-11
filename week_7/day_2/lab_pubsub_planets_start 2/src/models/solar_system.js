const PubSub = require('../helpers/pub_sub.js');

const SolarSystem = function(planets) {
  this.planets = planets;
};

SolarSystem.prototype.bindEvents = function() {
  PubSub.publish('SolarSystem:all-planets-ready', this.planets)

  PubSub.subscribe('PlanetSelect:planet', (event) => {
    const index = event.detail
    const selectedPlanet = this.findPlanet(index)
    PubSub.publish('SolarSystem:planetLocated', selectedPlanet)
  })


}

SolarSystem.prototype.findPlanet = function(searchPlanet) {
  const locatedPlanet = this.planets.find((planet) => {
    return planet.name === searchPlanet
  });
  return locatedPlanet;
};

module.exports = SolarSystem;
