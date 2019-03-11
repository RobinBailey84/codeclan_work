const furnitureGroupData = require('./data/furniture_groups_data.js');
const FurnitureGroups = require('./models/furniture_groups.js');
const SelectView = require('./views/select_view.js');
const FurnitureGroupView = require('./views/furniture_group_view.js');


document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript Loaded');

  const selectElement = document.querySelector('#furniture-groups');
  const selectView = new SelectView(selectElement);
  selectView.bindEvents();

  // const furnitureGroupView = new FurnitureGroupView();
  // furnitureGroupView.bindEvents();

  const furnitureGroups = new FurnitureGroups(furnitureGroupData);
  furnitureGroups.bindEvents();

});
