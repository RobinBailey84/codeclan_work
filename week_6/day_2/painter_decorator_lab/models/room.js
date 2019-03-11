const Room = function(area, paintStatus){
  this.area = area;
  this.paintStatus = paintStatus;
}

Room.prototype.paintedRoom = function() {
  this.paintStatus = 'painted';
}

module.exports = Room;
