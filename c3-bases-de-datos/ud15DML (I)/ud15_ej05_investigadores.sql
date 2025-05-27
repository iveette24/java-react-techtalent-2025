-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2025 a las 12:16:13
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
-- Base de datos: `ud14_ej11_investigadores`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE `equipos` (
  `numserie` char(4) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `codfac` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`numserie`, `nombre`, `codfac`) VALUES
('E01', 'Equipo de Investigación en Ciencias de la Salud', 1),
('E02', 'Equipo de Investigación en Ciencias de la Tierra', 2),
('E03', 'Equipo de Investigación en Ciencias de la Vida', 3),
('E04', 'Equipo de Investigación en Ingeniería', 4),
('E05', 'Equipo de Investigación en Economía', 5),
('E06', 'Equipo de Investigación en Derecho', 6),
('E07', 'Equipo de Investigación en Ciencias Sociales', 7),
('E08', 'Equipo de Investigación en Ciencias de la Salud', 8),
('E09', 'Equipo de Investigación en Ciencias de la Tierra', 9),
('E10', 'Equipo de Investigación en Ciencias de la Vida', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facultades`
--

CREATE TABLE `facultades` (
  `cod` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `facultades`
--

INSERT INTO `facultades` (`cod`, `nombre`) VALUES
(1, 'Facultad de Ciencias'),
(2, 'Facultad de Humanidades'),
(3, 'Facultad de Ciencias Sociales'),
(4, 'Facultad de Medicina'),
(5, 'Facultad de Ingeniería'),
(6, 'Facultad de Economía'),
(7, 'Facultad de Derecho'),
(8, 'Facultad de Ciencias de la Salud'),
(9, 'Facultad de Ciencias de la Tierra'),
(10, 'Facultad de Ciencias de la Vida');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `investigadores`
--

CREATE TABLE `investigadores` (
  `dni` varchar(9) NOT NULL,
  `nomapels` varchar(255) NOT NULL,
  `codfac` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `investigadores`
--

INSERT INTO `investigadores` (`dni`, `nomapels`, `codfac`) VALUES
('01234567', 'Francisco Moreno', 10),
('12345678', 'Juan Pérez', 1),
('23456789', 'María González', 2),
('34567890', 'Pedro Sánchez', 3),
('45678901', 'Ana López', 4),
('56789012', 'José Martínez', 5),
('67890123', 'Luis Hernández', 6),
('78901234', 'Eva García', 7),
('89012345', 'Carlos Díaz', 8),
('90123456', 'Sofía Rodríguez', 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `dni` varchar(8) NOT NULL,
  `numserie` char(4) NOT NULL,
  `comienzo` date DEFAULT NULL,
  `fin` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`dni`, `numserie`, `comienzo`, `fin`) VALUES
('01234567', 'E10', '2022-10-01', '2022-10-31'),
('12345678', 'E01', '2022-01-01', '2022-01-31'),
('23456789', 'E02', '2022-02-01', '2022-02-28'),
('34567890', 'E03', '2022-03-01', '2022-03-31'),
('45678901', 'E04', '2022-04-01', '2022-04-30'),
('56789012', 'E05', '2022-05-01', '2022-05-31'),
('67890123', 'E06', '2022-06-01', '2022-06-30'),
('78901234', 'E07', '2022-07-01', '2022-07-31'),
('89012345', 'E08', '2022-08-01', '2022-08-31'),
('90123456', 'E09', '2022-09-01', '2022-09-30');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD PRIMARY KEY (`numserie`),
  ADD KEY `codfac` (`codfac`);

--
-- Indices de la tabla `facultades`
--
ALTER TABLE `facultades`
  ADD PRIMARY KEY (`cod`);

--
-- Indices de la tabla `investigadores`
--
ALTER TABLE `investigadores`
  ADD PRIMARY KEY (`dni`),
  ADD KEY `codfac` (`codfac`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`dni`,`numserie`),
  ADD KEY `numserie` (`numserie`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `facultades`
--
ALTER TABLE `facultades`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `equipos`
--
ALTER TABLE `equipos`
  ADD CONSTRAINT `equipos_ibfk_1` FOREIGN KEY (`codfac`) REFERENCES `facultades` (`cod`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `investigadores`
--
ALTER TABLE `investigadores`
  ADD CONSTRAINT `investigadores_ibfk_1` FOREIGN KEY (`codfac`) REFERENCES `facultades` (`cod`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `investigadores` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`numserie`) REFERENCES `equipos` (`numserie`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
