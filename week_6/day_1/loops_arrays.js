// var sports = ['Football', 'Tennis', 'Rugby'];
// console.log('Number of sports', sports.length);
//
// var firstSport = sports[0];
// console.log('First sport', firstSport);
//
// sports.push('Curling');
// sports.push('Darts');
// //can't use the << to add to array
// //pop removes from the array
// var removedSport = sports.pop();
// console.log('Removed sports:', removedSport);
//
// sports.unshift('Basketball', sports) // adds to front of array
//
// var shiftedSport = sports.shift();
// console.log('Shifted Sport:', shiftedSport);
//
// var splicedSport = sports.splice(0, 1);
// console.log('Spliced Sport:', splicedSport);
//
// console.log('Sports', sports);

var sports = ['Football', 'Tennis', 'Rugby'];

// for (var sport of sports) {
//   console.log(sport.toUpperCase());
// }

for (var i = 0; i < sports.length; i++){
  // console.log(i);
  console.log(sports[i].toUpperCase());
}
