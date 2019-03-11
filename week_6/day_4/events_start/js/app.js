//plan out what event is happening as below - event, type of event, what should happen
//element = document
//type of event = 'DOMContentLoaded'
//what should happen = console.log
document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');

  const button = document.querySelector('#button');

  const handleButtonClick = function(){
    const resultParagraph = document.querySelector('#button-result');
    resultParagraph.textContent = 'The button has been clicked!!!'
  }
  button.addEventListener('click', handleButtonClick);


  const textInput = document.querySelector('#input');

  const handleInput = function(event){
    const updateInput = document.querySelector('#input-result');
    updateInput.textContent = event.target.value;
  }
  textInput.addEventListener('input', handleInput);

  const selectInput = document.querySelector('#select');

  const handleSelection = function(event){
    console.log('change');
    const updateText = document.querySelector('#select-result')
    updateText.textContent = event.target.value;
  }
  selectInput.addEventListener('change', handleSelection)

  const form = document.querySelector('#form');

  const handleFormSubmit = function(event){
    event.preventDefault();
    console.log('form submitted');
    const formResult = document.querySelector('#form-result');
    formResult.textContent = `Your name is:
    ${event.target.first_name.value} ${event.target.last_name.value}`
  }
  form.addEventListener('submit', handleFormSubmit);


});
