-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-05-2025 a las 12:15:58
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
-- Base de datos: `ud14_ej08_piezasproveedores`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piezas`
--

CREATE TABLE `piezas` (
  `idpiez` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `piezas`
--

INSERT INTO `piezas` (`idpiez`, `nombre`) VALUES
(1, 'Pieza A'),
(2, 'Pieza B'),
(3, 'Pieza C'),
(4, 'Pieza D'),
(5, 'Pieza E'),
(6, 'Pieza F'),
(7, 'Pieza G'),
(8, 'Pieza H'),
(9, 'Pieza I'),
(10, 'Pieza J');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedores`
--

CREATE TABLE `proveedores` (
  `idprov` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedores`
--

INSERT INTO `proveedores` (`idprov`, `nombre`) VALUES
(1, 'Proveedor 1'),
(2, 'Proveedor 2'),
(3, 'Proveedor 3'),
(4, 'Proveedor 4'),
(5, 'Proveedor 5'),
(6, 'Proveedor 6'),
(7, 'Proveedor 7'),
(8, 'Proveedor 8'),
(9, 'Proveedor 9'),
(10, 'Proveedor 10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `suministra`
--

CREATE TABLE `suministra` (
  `idpiez` int(11) NOT NULL,
  `idprov` int(11) NOT NULL,
  `precio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `suministra`
--

INSERT INTO `suministra` (`idpiez`, `idprov`, `precio`) VALUES
(1, 1, 10.5),
(2, 2, 20.25),
(3, 3, 15.75),
(4, 4, 30),
(5, 5, 25.5),
(6, 6, 18.75),
(7, 7, 22),
(8, 8, 35.25),
(9, 9, 28.5),
(10, 10, 40);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `piezas`
--
ALTER TABLE `piezas`
  ADD PRIMARY KEY (`idpiez`);

--
-- Indices de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  ADD PRIMARY KEY (`idprov`);

--
-- Indices de la tabla `suministra`
--
ALTER TABLE `suministra`
  ADD PRIMARY KEY (`idpiez`,`idprov`),
  ADD KEY `idprov` (`idprov`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `piezas`
--
ALTER TABLE `piezas`
  MODIFY `idpiez` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `proveedores`
--
ALTER TABLE `proveedores`
  MODIFY `idprov` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `suministra`
--
ALTER TABLE `suministra`
  ADD CONSTRAINT `suministra_ibfk_1` FOREIGN KEY (`idpiez`) REFERENCES `piezas` (`idpiez`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `suministra_ibfk_2` FOREIGN KEY (`idprov`) REFERENCES `proveedores` (`idprov`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
