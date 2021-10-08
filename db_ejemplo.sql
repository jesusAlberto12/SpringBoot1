-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 02-10-2021 a las 21:17:36
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_ejemplo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `apellido_materno` varchar(255) DEFAULT NULL,
  `apellido_paterno` varchar(255) DEFAULT NULL,
  `cliente` float NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fecha_alta` datetime(6) DEFAULT NULL,
  `fecha_baja` datetime(6) DEFAULT NULL,
  `fecha_modificacion` datetime(6) DEFAULT NULL,
  `fecha_revocado` datetime(6) DEFAULT NULL,
  `fecha_vigencia` datetime(6) DEFAULT NULL,
  `intentos` float NOT NULL,
  `login` varchar(255) DEFAULT NULL,
  `noacceso` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `status` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `apellido_materno`, `apellido_paterno`, `cliente`, `email`, `fecha_alta`, `fecha_baja`, `fecha_modificacion`, `fecha_revocado`, `fecha_vigencia`, `intentos`, `login`, `noacceso`, `nombre`, `password`, `status`) VALUES
(9, 'Gonzalez', 'Alberto', 1, 'jesus.alberto12@outlook.es', '2021-10-02 11:55:23.732000', NULL, '2021-11-02 12:55:23.732000', NULL, NULL, 0, 'Betito', NULL, 'Jesus', '$2a$04$9G9Z4gAW6ESrb1SSZAuNZO2Z.SqwZjp5c1vEX0PnPx4PUDaoMTggC', '\0');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
