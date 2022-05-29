DROP DATABASE IF EXISTS catsharks;
CREATE DATABASE catsharks;
USE catsharks;
CREATE TABLE prosharks(
  especie VARCHAR(25),
  habitat VARCHAR(20),
  profundidad INT(4),
  tiempo_navegacion INT(3),
  nubosidad VARCHAR(60),
  direccion_viento VARCHAR(25),
  fuerza_viento VARCHAR(60),
  hora TIME,
  num_embarcaciones INT(2),
  temperatura INT(2),
  tipo_cebo VARCHAR(20),
  sexo CHAR(6),
  parasitos CHAR(2),
  anzuelos CHAR(2),
  num_anzuelos INT(2),
  abundancia INT(2);
);
