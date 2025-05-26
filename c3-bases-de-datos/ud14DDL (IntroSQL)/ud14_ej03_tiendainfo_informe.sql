CREATE DATABASE ud14_ej03_tiendainfo;
USE ud14_ej03_tiendainfo;

CREATE TABLE fabricantes (
    codigo INT,
    nombre NVARCHAR(100),
    PRIMARY KEY (codigo));

ALTER TABLE `fabricantes` CHANGE `codigo` `codigo` INT(11) NOT NULL AUTO_INCREMENT;

INSERT INTO `fabricantes` (`codigo`, `nombre`) VALUES (NULL, 'HP');
INSERT INTO fabricantes (nombre) VALUES ('LG');


CREATE TABLE articulos (
    codart INT  NOT NULL  AUTO_INCREMENT,
    nombre NVARCHAR(100),
    precio FLOAT,
    fabricante INT,
    PRIMARY KEY (codart),
    FOREIGN KEY (fabricante) 
    REFERENCES fabricantes (codigo) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE);

INSERT INTO `fabricantes` (`codigo`, `nombre`) VALUES
(NULL, 'HP'),
(NULL, 'LG'),
(NULL, 'Dell'),
(NULL, 'Asus'),
(NULL, 'Lenovo'),
(NULL, 'Acer'),
(NULL, 'MSI'),
(NULL, 'Apple'),
(NULL, 'Samsung'),
(NULL, 'Sony');

INSERT INTO `articulos` (`nombre`, `precio`, `fabricante`) VALUES
('Laptop HP Pavilion', 799.99, 1),
('Monitor LG UltraWide', 249.99, 2),
('Teclado mecánico Dell', 89.99, 3),
('Mouse inalámbrico Asus', 39.99, 4),
('Tablet Lenovo Tab M10', 199.99, 5),
('Portátil Acer Aspire', 599.99, 6),
('Tarjeta gráfica MSI GeForce', 499.99, 7),
('MacBook Air M2', 1299.99, 8),
('Smartphone Samsung Galaxy', 899.99, 9),
('Auriculares Sony WH-1000XM5', 349.99, 10);