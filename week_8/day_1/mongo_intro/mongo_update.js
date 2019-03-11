use zoo;
db.animals.updateOne(
  { _id: ObjectId('5c3caf5dcda7b65b0ffc877f')},
  { $set: { name: "Pip"}}
);
