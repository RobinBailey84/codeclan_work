const express = require('express');


const createRouter = function(data){
  const router = express.Router();
  
  router.get('/', (req, res) => {
    res.json(data);
  });

  router.get('/:id', (req, res) => {
    const index = req.params.id;
    const item = data[index];
    res.json(item);
  });

  router.post('/', (req, res) => {
    // console.log('req body', req.body);
    data.push(req.body)
    res.json(data)
  })

  router.delete('/:id', (req, res) => {
    data.splice(req.params.id, 1);
    res.json(data);
  });

  router.put('/:id', (req, res) => {
    data[req.params.id] = req.body;
    res.json(data);
  });

return router;

};

module.exports = createRouter;
