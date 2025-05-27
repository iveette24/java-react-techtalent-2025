-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2025 a las 12:16:03
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
-- Base de datos: `ud14_ej09_cientificosproyectos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignado`
--

CREATE TABLE `asignado` (
  `dni` varchar(9) NOT NULL,
  `id` char(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asignado`
--

INSERT INTO `asignado` (`dni`, `id`) VALUES
('01234567J', 'P010'),
('12345678A', 'P001'),
('23456789B', 'P002'),
('34567890C', 'P003'),
('45678901D', 'P004'),
('56789012E', 'P005'),
('67890123F', 'P006'),
('78901234G', 'P007'),
('89012345H', 'P008'),
('90123456I', 'P009');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cientificos`
--

CREATE TABLE `cientificos` (
  `dni` varchar(9) NOT NULL,
  `nomapels` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cientificos`
--

INSERT INTO `cientificos` (`dni`, `nomapels`) VALUES
('01234567J', 'Elena Martínez García'),
('12345678A', 'Juan Pérez Sánchez'),
('23456789B', 'María Gómez Martínez'),
('34567890C', 'Pedro Rodríguez López'),
('45678901D', 'Ana García Fernández'),
('56789012E', 'Luis Martínez Pérez'),
('67890123F', 'Laura Sánchez Gómez'),
('78901234G', 'Carlos Fernández Rodríguez'),
('89012345H', 'Sofía López Martínez'),
('90123456I', 'Pablo Pérez Rodríguez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyectos`
--

CREATE TABLE `proyectos` (
  `id` char(4) NOT NULL,
  `nombre` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `horas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proyectos`
--

INSERT INTO `proyectos` (`id`, `nombre`, `horas`) VALUES
('P001', 'Desarrollo de Software', 100),
('P002', 'Investigación Médica', 200),
('P003', 'Ingeniería Ambiental', 150),
('P004', 'Robótica Avanzada', 180),
('P005', 'Inteligencia Artificial', 220),
('P006', 'Nanotecnología', 120),
('P007', 'Bioinformática', 190),
('P008', 'Realidad Virtual', 160),
('P009', 'Exploración Espacial', 240),
('P010', 'Biotecnología', 170);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `asignado`
--
ALTER TABLE `asignado`
  ADD PRIMARY KEY (`dni`,`id`),
  ADD KEY `id` (`id`);

--
-- Indices de la tabla `cientificos`
--
ALTER TABLE `cientificos`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `proyectos`
--
ALTER TABLE `proyectos`
  ADD PRIMARY KEY (`id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `asignado`
--
ALTER TABLE `asignado`
  ADD CONSTRAINT `asignado_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `cientificos` (`dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `asignado_ibfk_2` FOREIGN KEY (`id`) REFERENCES `proyectos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
