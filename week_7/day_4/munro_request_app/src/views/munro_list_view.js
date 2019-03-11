const PubSub = require('../helpers/pub_sub.js');
const MunroDetailView = require('./munro_detail_view.js')

const MunroListView = function(container){
  this.container = container;
}

MunroListView.prototype.bindEvents = function(){
  PubSub.subscribe('Munros:munros-loaded', (event) => {
    this.render(event.detail)

    PubSub.subscribe('Munros:region-found', (event) => {
      this.render(event.detail)
    })

  })
}

MunroListView.prototype.render = function(munros){
  this.container.innerHTML = '';
  munros.forEach((munro) => {
    const munroDetail = new MunroDetailView();
    const munroDiv = munroDetail.createMunroDetail(munro);
    this.container.appendChild(munroDiv);
  });
}

module.exports = MunroListView;
