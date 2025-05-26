CREATE DATABASE ud14_ej03_tiendainfo;
USE ud14_ej03_tiendainfo;

CREATE TABLE fabricantes (
    codigo INT NOT NULL AUTO_INCREMENT,
    nombre NVARCHAR(100),
    PRIMARY KEY (codigo));

    
CREATE TABLE articulos (
    codart INT NOT NULL AUTO_INCREMENT,
    nombre NVARCHAR(100),
    precio FLOAT,
    fabricante INT,
    PRIMARY KEY (codart),
    FOREIGN KEY (fabricante) 
    REFERENCES fabricantes (codigo) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE);