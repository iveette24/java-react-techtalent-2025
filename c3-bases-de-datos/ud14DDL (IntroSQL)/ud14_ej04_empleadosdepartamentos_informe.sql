CREATE DATABASE ud14_ej04_empleadosdepartamentos;
USE ud14_ej04_empleadosdepartamentos;

CREATE TABLE despachos 
    (num INT,
    AUTO_INCREMENT
    capacidad INT NOT NULL,
    PRIMARY KEY (num));

CREATE TABLE directores
    (DNI VARCHAR(9),
    NomApels VARCHAR(255),
    DNIJefe VARCHAR(9),
    despacho INT NOT NULL,
    PRIMARY KEY (DNI),
    FOREIGN KEY (DNIJefe) 
    REFERENCES directores(DNI)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (despacho) 
    REFERENCES despachos (num)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

INSERT INTO `despachos` (`num`, `capacidad`) VALUES
(1, 5),
(2, 3),
(3, 4),
(4, 6),
(5, 2),
(6, 5),
(7, 4),
(8, 3),
(9, 7),
(10, 6);


INSERT INTO `directores` (`DNI`, `NomApels`, `DNIJefe`, `despacho`) VALUES
('12345678A', 'Juan Pérez', NULL, 1),
('98765432B', 'María López', '12345678A', 2),
('45678912C', 'Carlos Gómez', '12345678A', 3),
('78912345D', 'Laura Fernández', NULL, 4),
('32165498E', 'Miguel Rodríguez', '78912345D', 5),
('65498732F', 'Ana Martínez', NULL, 6),
('14725836G', 'José Sánchez', '65498732F', 7),
('36985214H', 'Lucía Díaz', NULL, 8),
('25814736I', 'Pedro Ortega', '36985214H', 9),
('74185296J', 'Elena Navarro', NULL, 10),
('95175385K', 'Daniel Torres', NULL, 1);