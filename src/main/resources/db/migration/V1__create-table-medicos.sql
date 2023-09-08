CREATE TABLE IF NOT EXISTS `medicos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL UNIQUE,
  `telefono` varchar(20) DEFAULT NULL,
  `documento` varchar(255) DEFAULT NULL UNIQUE,
  `especialidad` enum('CARDIOLOGIA','GINECOLOGIA','ORTOPEDIA','PEDIATRIA') DEFAULT NULL,
  `calle` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `distrito` varchar(255) DEFAULT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
   PRIMARY KEY (`id`)
);
