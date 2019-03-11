const assert = require('assert');

// assert.equal(1, '1');
//this test looks at data loosely ie ==

const arr1 = [1, 2, 3];
const arr2 = arr1;

// assert.strictEqual(1, '1');
// this test looks at data to make sure it is the same ie ===

// assert.deepEqual([1, 2, 3], [1, 2, 3]);
//this test looks into data ie === on contents of objects

assert.deepStrictEqual([1, 2, 3], ['1', '2', '3']);
//this does strict equality on the contents
