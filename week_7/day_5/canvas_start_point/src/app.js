document.addEventListener('DOMContentLoaded', () => {

  const canvas = document.querySelector('#main-canvas')
  console.log('canvas', canvas);
  const context = canvas.getContext('2d');
  console.log('context', context);

  context.fillStyle = 'pink';
  context.fillRect(10, 10, 50, 50);

  context.beginPath();
  context.moveTo(100, 100);
  context.lineTo(100, 200);
  context.stroke();

  context.beginPath();
  context.moveTo(200, 200);
  context.lineTo(200, 300);
  context.lineTo(100, 300);
  context.closePath();
  context.stroke();

  const drawCircle = function(x, y){
    context.beginPath();
    context.arc(x, y, 50, 0, Math.PI*2, true);
    context.stroke();
  }


  canvas.addEventListener('mousemove', (event) => {
    console.log('clicked', event);
    drawCircle(event.x, event.y);
  });

  const img = document.createElement('img');
  img.src = "http://emojis.slackmojis.com/emojis/images/1457563042/312/doge.png"

  const drawDoge = function(){
    context.drawImage(img, 200, 200, 90, 90);
  }

  img.addEventListener('load', drawDoge);

  const changeColour = function(){
    console.log('this', this);
    context.strokeStyle = this.value;
  }

  const colourPicker = document.querySelector('#input-color');
  colourPicker.addEventListener('change', changeColour);
})
