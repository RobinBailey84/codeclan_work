DROP TABLE musicians_bands;
DROP TABLE musicians;
DROP TABLE bands;

CREATE TABLE bands (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE musicians (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE musicians_bands (
  band_id INT REFERENCES bands(id),
  musician_id INT REFERENCES musicians(id)
);

INSERT INTO bands (name) VALUES ('Nirvana');
INSERT INTO bands (name) VALUES ('Foo Fighters');

INSERT INTO musicians (name) VALUES ('Kurth Cobain');
INSERT INTO musicians (name) VALUES ('Dave Grohl');
INSERT INTO musicians (name) VALUES ('Krist Novoselic');

INSERT INTO musicians_bands (band_id, musician_id) VALUES (1, 1);
INSERT INTO musicians_bands (band_id, musician_id) VALUES (1, 2);
INSERT INTO musicians_bands (band_id, musician_id) VALUES (1, 3);
INSERT INTO musicians_bands (band_id, musician_id) VALUES (2, 2);
