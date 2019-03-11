document.addEventListener('DOMContentLoaded', () => {
  const title = document.querySelector('h1');
  title.textContent = 'G10 say JavaScript is awesome!';
  console.log('Actions Completed!');

  const welcome = document.querySelector('#welcome-paragraph');//this selects an ID
  welcome.textContent = 'Has anything changed?';
  console.dir(welcome);

  const redElement = document.querySelector('li.red')//this selects a class
  redElement.textContent = 'RED';
  redElement.classList.add('bold');
  console.dir(redElement);

  const allListElements = document.querySelectorAll('li')
  console.log(allListElements);

  const newListItem = document.createElement('li')
  newListItem.textContent = 'Purple';
  newListItem.classList.add('purple');

  const list = document.querySelector('ul');
  list.appendChild(newListItem);

  const answer = 1 + 1;
  console.log("The answer is ", answer);

  const fruits = ['apple', 'bannana', 'orange'];
  console.table(fruits);

  const person = {
    name: "John",
    age: 40
  }
console.table(person);

debugger;
let number1 = 5;
number1 += 10;
const number2 = 20 + number1;
const number3 = number2 / 10;

// setTimeout(() => {
//   document.body.classList.add("purple");
// }, 3000);

});
