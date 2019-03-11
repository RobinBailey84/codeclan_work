const Paint = function(litres){
  this.litres = litres;
}

Paint.prototype.checkEmpty = function() {
  if(this.litres === 0)
  {return 'paint is empty';
}
return 'paint is not empty'
}

module.exports = Paint;
