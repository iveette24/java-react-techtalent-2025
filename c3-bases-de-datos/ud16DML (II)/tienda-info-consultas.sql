-- Ejercicio 01

SELECT nombre FROM `articulos`;

-- Ejercicio 02

SELECT nombre, precio FROM `articulos`;

-- Ejercicio 03

SELECT nombre, precio FROM `articulos` WHERE precio <= 200;

-- Ejercicio 04

SELECT * FROM `articulos` WHERE precio BETWEEN 60 AND 120;

-- Ejercicio 05

SELECT nombre, precio * 166.386 FROM `articulos`;