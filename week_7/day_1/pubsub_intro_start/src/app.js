const FormView = require('./views/form_view.js');
const WordCounter = require('./models/word_counter.js')
const ResultView = require('./views/result_view.js')

document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');

  const resultView = new ResultView();
  resultView.bindEvents();

  const wordCounter = new WordCounter();
  wordCounter.bindEvents();

  const formView = new FormView();
  formView.bindEvents();
});
