const assert = require('assert');
const Room = require('../room.js');

let room;

describe('Room', function(){

  beforeEach(function(){
    room = new Room(100, 'not painted');
  });

  it('should have an area in square meters', function(){
    const actual = room.area;
    assert.strictEqual(actual, 100);
  });

  it('should start not painted', function(){
    const actual = room.paintStatus;
    assert.strictEqual(actual, 'not painted')
  });

  it('should change to painted', function(){
    room.paintedRoom()
    const actual = room.paintStatus;
    assert.strictEqual(actual, 'painted')
  })

});
