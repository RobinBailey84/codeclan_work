const PubSub = require('../helpers/pub_sub.js')

const PlanetSelect = function(menu) {
  this.menu = menu
};

PlanetSelect.prototype.bindEvents = function() {
  PubSub.subscribe('SolarSystem:all-planets-ready', (event) => {
    this.populate(event.detail)
  });
  this.menu.addEventListener('click',(event) => {
    const selectedPlanet = event.target.id;
    PubSub.publish('PlanetSelect:planet', selectedPlanet)
  });
};

PlanetSelect.prototype.populate = function(planets) {
  planets.forEach((planet) => {
    const planetLink = document.createElement('a');
    planetLink.id = planet.name;
    planetLink.classList.add('planets-menu-item')
    planetLink.innerText = planet.name
    this.menu.appendChild(planetLink)
  })
}

module.exports = PlanetSelect;
