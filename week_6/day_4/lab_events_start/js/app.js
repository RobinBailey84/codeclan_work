document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');

  // const textTitle = document.querySelector('#title');
  //
  // const handleTitle = function(event){
  //   const addInput = document.querySelector('#reading-list');
  //   addInput.textContent = event.target.value;
  // }
  // textTitle.addEventListener('input', handleTitle)
  //
  // const textAuthor = document.querySelector('#author');
  //
  // const handleAuthor = function(event){
  //   const addInput = document.querySelector('#reading-list');
  //   addInput.textContent = event.target.value;
  // }
  //
  // textAuthor.addEventListener('input', handleAuthor)

  const form = document.querySelector('#new-item-form');

  const handleFormInfo = function(event){
    console.log('hello', event);
    event.preventDefault();
  //   const formInfo =
  //   document.querySelector('#reading-list');
  // formInfo.textContent = `Reading List: Title: ${event.target.title.value},
  // Author: ${event.target.author.value},
  // Category: ${event.target.category.value}`
  const title = event.target.title.value;
  const author = event.target.author.value;
  const category = event.target.category.value;

  const readingList = document.querySelector('#reading-list');

  const bookDetails = document.createElement('div');
  const titlePara = document.createElement('p');
  const authorPara = document.createElement('p');
  const categoryPara = document.createElement('p');

  titlePara.textContent = title;
  authorPara.textContent = author;
  categoryPara.textContent = category;

  bookDetails.appendChild(titlePara);
  bookDetails.appendChild(authorPara);
  bookDetails.appendChild(categoryPara);

  readingList.appendChild(bookDetails);

  form.reset();
  }
  form.addEventListener('submit', handleFormInfo)






});
