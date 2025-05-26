-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-05-2025 a las 13:55:34
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ud14_ej07_directoresdespachos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `despachos`
--

CREATE TABLE `despachos` (
  `num` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `despachos`
--

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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `directores`
--

CREATE TABLE `directores` (
  `DNI` varchar(9) NOT NULL,
  `NomApels` varchar(255) DEFAULT NULL,
  `DNIJefe` varchar(9) DEFAULT NULL,
  `despacho` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `directores`
--

INSERT INTO `directores` (`DNI`, `NomApels`, `DNIJefe`, `despacho`) VALUES
('12345678A', 'Juan Pérez', NULL, 1),
('14725836G', 'José Sánchez', '65498732F', 7),
('25814736I', 'Pedro Ortega', '36985214H', 9),
('32165498E', 'Miguel Rodríguez', '78912345D', 5),
('36985214H', 'Lucía Díaz', NULL, 8),
('45678912C', 'Carlos Gómez', '12345678A', 3),
('65498732F', 'Ana Martínez', NULL, 6),
('74185296J', 'Elena Navarro', NULL, 10),
('78912345D', 'Laura Fernández', NULL, 4),
('95175385K', 'Daniel Torres', NULL, 1),
('98765432B', 'María López', '12345678A', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `despachos`
--
ALTER TABLE `despachos`
  ADD PRIMARY KEY (`num`);

--
-- Indices de la tabla `directores`
--
ALTER TABLE `directores`
  ADD PRIMARY KEY (`DNI`),
  ADD KEY `DNIJefe` (`DNIJefe`),
  ADD KEY `despacho` (`despacho`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `despachos`
--
ALTER TABLE `despachos`
  MODIFY `num` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `directores`
--
ALTER TABLE `directores`
  ADD CONSTRAINT `directores_ibfk_1` FOREIGN KEY (`DNIJefe`) REFERENCES `directores` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `directores_ibfk_2` FOREIGN KEY (`despacho`) REFERENCES `despachos` (`num`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
