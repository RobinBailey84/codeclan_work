DROP TABLE lightsabers; -- many table first when dropping

DROP TABLE characters; --this deletes original table when updated, good practise

CREATE TABLE characters (
id SERIAL PRIMARY KEY,
name VARCHAR(255),
age INTEGER, -- can add NOT NULL if value has to been completed
darkside BOOLEAN
);

CREATE TABLE lightsabers (
  id SERIAL PRIMARY KEY,
  colour VARCHAR(255),
  hilt_metal VARCHAR(255),
  character_id INT REFERENCES characters(id)
);

INSERT INTO characters (name, darkside, age) VALUES ('Obi_Wan Kenobi', false, 27);
INSERT INTO characters (name, darkside, age) VALUES ('Anakin Skywalker', false, 19);
INSERT INTO characters (name, darkside, age) VALUES ('Darth Maul', true, 32);

INSERT INTO characters (name, darkside) VALUES ('Yoda', false);

INSERT INTO characters (name, darkside, age) VALUES ('Luke Skywalker', false, 17);

UPDATE characters SET darkside = true, name = 'Darth Vader' WHERE name = 'Anakin Skywalker'; -- SET updates data, can update more than one field

UPDATE characters SET  age = 65 WHERE name = 'Obi_Wan Kenobi';

DELETE FROM characters WHERE name = 'Darth Maul';


--INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
--INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);
--INSERT INTO characters (name, darkside, age) VALUES ('Stormtrooper', true, 25);

--UPDATE characters SET age = 26 WHERE id = 7;

INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES('green', 'gold', 1);
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES('red', 'palledium', 2);
INSERT INTO lightsabers (colour, hilt_metal, character_id) VALUES ('blue', 'Aluminium', 1)
