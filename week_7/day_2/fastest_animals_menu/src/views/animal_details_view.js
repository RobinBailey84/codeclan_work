const PubSub = require('../helpers/pub_sub.js');

const AnimalInfoView = function(container) {
  this.container = container;
};

AnimalInfoView.prototype.bindEvents = function() {
  PubSub.subscribe('Animals:selected-animal-ready', (evt) => {
    const animalObject = evt.detail;
    this.render(animalObject);
  });
};

AnimalInfoView.prototype.render = function(animal) {
  this.container.innerHTML = '';

  const heading = this.createHeading(animal);
  const infoList = this.createInfoList(animal);

  this.container.appendChild(heading);
  this.container.appendChild(infoList);
};

AnimalInfoView.prototype.createHeading = function(animal) {
  const heading = document.createElement('h2');
  heading.textContent = animal.species;
  return heading;
};

AnimalInfoView.prototype.createInfoList = function(animal) {
  const infoList = document.createElement('ul');

  const liSpeed = this.createLi(`Max Speed: ${animal.maxSpeed} mph`, infoList);
  const liClass = this.createLi(`Class: ${animal.class}`, infoList);
  return infoList;
};

AnimalInfoView.prototype.createLi = function(textContent, ul) {
  const li = document.createElement('li');
  li.textContent = textContent;
  ul.appendChild(li);
};

module.exports = AnimalInfoView;
