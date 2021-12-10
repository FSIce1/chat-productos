-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-12-2021 a las 09:09:12
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_sales_products`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `products`
--

CREATE TABLE `products` (
  `id` int(11) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `products`
--

INSERT INTO `products` (`id`, `name`, `price`, `description`, `date`) VALUES
(1, 'HP ALL IN ONE 22-DD0018 21.5\" AMD RYZEN 3 1TB 4GB', '2000.00', 'La HP All-in-One combina la potencia de una computadora con la belleza de una pantalla delgada y moderna en un dispositivo confiable', '2021-12-08 02:18:11'),
(2, 'ALL IN ONE HP 22-DD0018LA AMD RYZEN 3-3250U 4GB/1TB/W10H/21.5\'', '3000.00', 'Equilibrio perfecto entre diseño y funcionalidad\r\nSupera los días de mayor actividad gracias al rendimiento de un confiable procesador. Guarda más de lo que amas con el abundante almacenamiento destinado a todas tus fotos y todos tus videos y documentos.', '2021-12-07 02:20:25'),
(4, 'DELL LAPTOP G3 3500 15.6\" CORE I5 1TB+256GB 8GB 4GB', '3000.00', 'El modelo G3 3500 cuenta con un procesador Intel Core i5-10300H, memoria RAM de 8GB y almacenamiento en estado sólido de 256GB + un disco duro de 1TB.\r\n', '2021-12-15 02:45:22'),
(5, 'ALL-IN-ONE DELL INSPIRON 5400, I3-1115G4 4.1GHZ, DISCO 1TB HDD,', '4300.00', '1TB SATA 7.2k, LAN GbE, Intel Wi-Fi 6 2x2 (Gig+) + Bluetooth 5.1, Camara Web HD. Sistema Operativo Windows 10 Home 64 bits en Español\r\n1TB SATA 7.2k, LAN GbE, Intel Wi-Fi 6 2x2 (Gig+) + Bluetooth 5.1, Camara Web HD. Sistema Operativo Windows 10 Home 64 bi', '2021-12-08 02:48:06'),
(6, 'AIO HP 21-B0003 CELERON-J4025', '3400.00', 'La HP All-in-One es una computadora que combina el diseño ergonómico, funcionalidad y poder', '2021-12-07 02:49:40');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
