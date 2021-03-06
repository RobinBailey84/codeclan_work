const express = require('express');
const ObjectID = require('mongodb').ObjectID;

const createRouter = function (collection) {

  const router = express.Router();

  router.get('/', (req, res) => {
    collection.find()
    .toArray()
    .then((docs) => res.json(docs))
  });

  router.get('/:id', (req, res) => {
    const id = ObjectID(req.params.id);
    collection.findOne({_id: id})
    .then((docs) => res.json(docs));
  });

  router.post('/', (req, res) => {
    console.log(req.body);
    const newBird = req.body
    collection.insertOne(newBird)
    .then(() => collection.find().toArray())
    .then((docs) => res.json(docs) )
  });

  router.delete('/:id', (req, res) => {
    const id = ObjectID(req.params.id);
    collection.deleteOne({_id: id})
    .then(() => collection.find().toArray())
    .then((docs) => res.json(docs))
  });

  router.put('/:id', (req, res) => {
    const id = ObjectID(req.params.id)
    const updateSightings = req.body;
    collection.updateOne(
      {_id: id},
      {$set: updateSightings}
    )
    .then(() => collection.find().toArray())
    .then((docs) => res.json(docs))
  });

  return router;

};

module.exports = createRouter;
