const express = require('express');
const app = express();
const path = require('path');
const bodyParser = require('body-parser');
const createRouter = require('./helpers/create_router.js')


const publicPath = path.join(__dirname, '../client/public');
app.use(express.static(publicPath));

app.use(bodyParser.json());

const teas = [
  { name: "Early Grey", brand: "Twinings" },
  { name: "Irish Breakfast", brand: "Barry's Tea" },
  { name: "Lemon and Ginger", brand: "Lipton" },
  { name: "Rooibos", brand: "Tick Tock" },
  { name: "Green", brand: "Clipper" }
];

const biscuits = [
  {name: "Jaffa Cake", brand: "McVities"},
  {name: "Digestive", brand: "McVities"},
  {name: "Water Biscuits", brand: "Cars"},
  {name: "Wagon Wheel", brand: "Arnott's"}
];

const teaRouter = createRouter(teas);
app.use('/api/teas', teaRouter);

const biscuitRouter = createRouter(biscuits);
app.use('/api/biscuits', biscuitRouter);





app.listen(3000, function () {
  console.log(`App running on port ${ this.address().port }`);
});
