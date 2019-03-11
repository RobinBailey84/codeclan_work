const Animals = require('./models/animals.js');
const AnimalMenuView = require('./views/animal_menu_view.js');
const AnimalInfoView = require('./views/animal_details_view.js');

document.addEventListener('DOMContentLoaded', function(){

  const detailsContainer = document.querySelector('section.animal-details');
  const animalDetailsView = new AnimalInfoView(detailsContainer);
  animalDetailsView.bindEvents();

  const menu = document.querySelector('nav.animals-menu');
  const menuView = new AnimalMenuView(menu);
  menuView.bindEvents();




  const animalDataModel = new Animals();
  animalDataModel.bindEvents();



});
