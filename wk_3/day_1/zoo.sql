DROP TABLE animals;

CREATE TABLE animals (
  name VARCHAR,
  age INTEGER,
  species VARCHAR,
  carnivour BOOLEAN
);

INSERT INTO animals (name, age, species, carnivour) VALUES ('Leo', 15, 'Lion', true);
INSERT INTO animals (name, age, species, carnivour) VALUES ('Gerry', 3, 'Giraffe', false);
INSERT INTO animals (name, age, species, carnivour) VALUES ('Nemo', 5, 'Fish', false);
INSERT INTO animals (name, age, species, carnivour) VALUES ('Sammy', 28, 'Snake', true);

INSERT INTO animals (name, species, carnivour) VALUES ('Jaws', 'Shark', true);

UPDATE animals SET age = 20 WHERE species = 'Shark';
