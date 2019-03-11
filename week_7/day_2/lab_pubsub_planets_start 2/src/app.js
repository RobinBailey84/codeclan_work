const planetsData = require('./data/planets.js');
const SolarSystem = require('./models/solar_system.js');
const PlanetSelect = require('./views/select_planet.js');
const PlanetInfo = require('./views/planet_details.js')

document.addEventListener('DOMContentLoaded', () => {

  const planetContainer = document.querySelector('section.planet-details');
  const planetInfo = new PlanetInfo(planetContainer);
  planetInfo.bindEvents();

  const menu = document.querySelector('nav.planets-menu')
  const selectedPlanet = new PlanetSelect(menu)
  selectedPlanet.bindEvents();

  const planetsDataModel = new SolarSystem(planetsData);
  planetsDataModel.bindEvents();
  console.log(planetsDataModel.planets);


});
