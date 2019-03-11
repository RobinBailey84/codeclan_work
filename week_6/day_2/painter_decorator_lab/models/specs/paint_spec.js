const assert = require('assert');
const Paint = require('../paint.js');

let paint;

describe('Paint', function(){
  beforeEach(function(){
    paint = new Paint(15)
  })

  it('should have a number of litres of paint', function(){
    const actual = paint.litres;
    assert.strictEqual(actual, 15);
  });

  it('should check if paint is empty', function(){
    paint.checkEmpty()
    const expected = 'paint is not empty'
    assert.strictEqual(paint.checkEmpty(), expected)
  })
})
