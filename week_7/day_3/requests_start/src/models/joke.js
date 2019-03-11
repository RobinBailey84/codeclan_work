const PubSub = require('../helpers/pub_sub.js');

const Joke = function () {
  this.joke = null;
}


//this function is how to get data from API
Joke.prototype.getData = function () {

  const xhr = new XMLHttpRequest();

  xhr.addEventListener('load', () => {
    if (xhr.status !== 200){
      return;
    }
    // console.log(xhr.responseText);
    const jsonString = xhr.responseText;
    const data = JSON.parse(jsonString);
    // console.log(data.joke);
    this.joke = data.joke;
    PubSub.publish('Joke:joke-loaded', this.joke);
  });

  xhr.open('GET', 'https://icanhazdadjoke.com');
  xhr.setRequestHeader('Accept', 'application/json')
  xhr.send();
}

module.exports = Joke;
