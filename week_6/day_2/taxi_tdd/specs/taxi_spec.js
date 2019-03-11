const assert = require('assert');
const Taxi = require('../taxi.js');

let taxi;
describe('Taxi', function(){
  describe('passengers', function(){
    it('should start with no passengers');
  })
  beforeEach(function(){
    taxi = new Taxi('Toyota', 'Prius', 'Lewis Hamilton');
  });


  it('should have a manufacturer', function(){
    //arrange
    // const taxi = new Taxi('Toyota', 'Prius') beforeEach above is like setup in ruby
    // act
    const actual = taxi.manufacturer;
    //assert
    assert.strictEqual(actual, 'Toyota')
  });

  it('it should have a model', function(){
    //arrange
    // const taxi = new Taxi('Toyoto', 'Prius');
    //act
    const actual = taxi.model;
    //assert
    assert.strictEqual(actual, 'Prius');
  });

  it('it should have a driver', function(){
    const actual = taxi.driver
    assert.strictEqual(actual, 'Lewis Hamilton')
  });
});
