const PubSub = require('../helpers/pub_sub.js');

const InstrumentFamilyView = function(){

}

InstrumentFamilyView.prototype.bindEvents = function(){
  PubSub.subscribe('InstrumentFamilies:family-selected', (event) => {
    const instrumentFamily = event.detail;
    this.render(instrumentFamily)
  });
}

InstrumentFamilyView.prototype.render = function (instrumentFamily){
  const container = document.querySelector('#instrument-family');
  container.innerHTML = '';
  const header = document.createElement('h2');
  header.textContent = instrumentFamily.name;

  const description = document.createElement('p');
  description.textContent = instrumentFamily.description;

  const listTitle = document.createElement('h3')
  listTitle.textContent = 'Instruments include;';

  const list = document.createElement('ul');
  instrumentFamily.instruments.forEach((instrument) => {
    const listItem = document.createElement('li')
    listItem.textContent = instrument;
    list.appendChild(listItem);
  })

  container.appendChild(header);
  container.appendChild(description);
  container.appendChild(listTitle);
  container.appendChild(list);
};

// InstrumentFamilyView.prototype.addElement = function(type, text){
//   const element = document.createElement(type);
//   element.textContent = text;
//   return element;
// }

module.exports = InstrumentFamilyView;
