var movie = {
  title: 'It\'s a wonderful life',
  year: 1946,
  language: 'Spanish',
  'im:genre': 'christmas'
};

// console.log('Movie:', movie);

var movieTitle = movie.title
// console.log('Title:', movieTitle);
//
// console.log('Genre:', movie['im:genre']);

movie.cast = ['James Stewart', 'Donna Reed'];
// console.log('Movie', movie);

movie.subtitleLanguage = 'German';

movie.language = 'English';

delete movie.year;

movie.ratings = {
  critic: 94,
  audience: 95
};

// console.log('Movie', movie);
//
// console.log('Audience Rating:', movie.ratings.audience);

for (var key in movie){
  console.log(`The ${key} is ${movie[key]}`);
}
