const PubSub = require('../helpers/pub_sub.js');

const PlanetInfo = function(container) {
  this.container = container
};

PlanetInfo.prototype.bindEvents = function() {
  PubSub.subscribe('SolarSystem:planetLocated', (event) => {
    const planetObject = event.detail
    this.render(planetObject)
  })
}

PlanetInfo.prototype.render = function(planet) {
  this.container.innerHTML = '';

  const heading = this.createHeading(planet)
  const planetList = this.createPlanetList(planet)

  this.container.appendChild(heading)
  this.container.appendChild(planetList)
};

PlanetInfo.prototype.createHeading = function(planet){
  const heading = document.createElement('h2');
  heading.textContent = planet.name;
  return heading;
}

PlanetInfo.prototype.createPlanetList = function(planet) {
  const planetList = document.createElement('ul');

  const liDay = this.createli(`Day: ${planet.day}`, planetList)
  const liOrbit = this.createli(`Orbit: ${planet.orbit}`, planetList)
  const liSurfaceArea = this.createli(`Surface Area: ${planet.surfaceArea}`, planetList)
  const liVolume = this.createli(`Volume: ${planet.volume}`, planetList)
  const liGravity = this.createli(`Gravity: ${planet.gravity}`, planetList)
  const liMoons = this.createli(`Moons: ${planet.moons}`, planetList)
  const liImage = this.createli(`${planet.image}`, planetList)
  return planetList;
}

PlanetInfo.prototype.createli = function(textContent, ul) {
  const li = document.createElement('li');
  li.textContent = textContent;
  ul.appendChild(li);
}


module.exports = PlanetInfo;
