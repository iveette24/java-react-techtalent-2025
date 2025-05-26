CREATE DATABASE ud14_ej07_directoresdespachos;
USE ud14_ej07_directoresdespachos;

CREATE TABLE despachos (
    num INT AUTO_INCREMENT,
    capacidad INT NOT NULL,
    PRIMARY KEY (num)
);

CREATE TABLE directores (
    DNI VARCHAR(9) NOT NULL PRIMARY KEY,
    NomApels VARCHAR(255) NOT NULL,
    DNIJefe VARCHAR(9),
    despacho INT,
    FOREIGN KEY (DNIJefe) REFERENCES directores(DNI) ON DELETE ON UPDATE CASCADE,
     FOREIGN KEY (despacho) REFERENCES despachos (num) ON DELETE CASCADE ON UPDATE CASCADE
);
