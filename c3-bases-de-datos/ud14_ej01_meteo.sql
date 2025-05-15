-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2025 a las 10:57:26
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
-- Base de datos: `ud14_ej01_meteo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estación`
--

CREATE TABLE `estación` (
  `id_estación` mediumint(8) UNSIGNED NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `latitud` varchar(15) NOT NULL,
  `longitud` varchar(15) NOT NULL,
  `altitud` mediumint(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estación`
--

INSERT INTO `estación` (`id_estación`, `nombre`, `latitud`, `longitud`, `altitud`) VALUES
(1, 'Barcelona', '41.3851N', '2.1734E', 12),
(2, 'Madrid', '40.4168N', '3.7038W', 667),
(3, 'Valencia', '39.4699N', '0.3763W', 15),
(4, 'Bilbao', '43.2630N', '2.9350W', 19);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `muestra`
--

CREATE TABLE `muestra` (
  `id_muestra` int(11) NOT NULL,
  `id_estación` mediumint(8) UNSIGNED NOT NULL,
  `fecha` date NOT NULL,
  `tempmín` tinyint(4) DEFAULT NULL,
  `tempmáx` tinyint(4) DEFAULT NULL,
  `precipitaciones` smallint(6) DEFAULT NULL,
  `humedmín` tinyint(3) UNSIGNED DEFAULT NULL,
  `humedmáx` tinyint(3) UNSIGNED DEFAULT NULL,
  `velvientomín` smallint(5) UNSIGNED DEFAULT NULL,
  `velvientomáx` smallint(5) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `muestra`
--

INSERT INTO `muestra` (`id_muestra`, `id_estación`, `fecha`, `tempmín`, `tempmáx`, `precipitaciones`, `humedmín`, `humedmáx`, `velvientomín`, `velvientomáx`) VALUES
(1, 1, '2024-04-15', 12, 22, 5, 55, 75, 5, 25),
(2, 1, '2024-04-16', 11, 21, 0, 50, 70, 4, 20),
(3, 2, '2024-04-15', 8, 19, 12, 40, 65, 3, 18),
(4, 3, '2024-04-15', 14, 25, 0, 45, 60, 6, 22),
(5, 4, '2024-04-15', 10, 17, 30, 60, 85, 2, 15);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estación`
--
ALTER TABLE `estación`
  ADD PRIMARY KEY (`id_estación`);

--
-- Indices de la tabla `muestra`
--
ALTER TABLE `muestra`
  ADD PRIMARY KEY (`id_muestra`),
  ADD KEY `id_estación` (`id_estación`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estación`
--
ALTER TABLE `estación`
  MODIFY `id_estación` mediumint(8) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `muestra`
--
ALTER TABLE `muestra`
  MODIFY `id_muestra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `muestra`
--
ALTER TABLE `muestra`
  ADD CONSTRAINT `muestra_ibfk_1` FOREIGN KEY (`id_estación`) REFERENCES `estación` (`id_estación`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
