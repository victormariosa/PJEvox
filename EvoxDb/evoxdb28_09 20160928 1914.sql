-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.7.9-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema evoxdb
--

CREATE DATABASE IF NOT EXISTS evoxdb;
USE evoxdb;

--
-- Definition of table `categoria_consultoria`
--

DROP TABLE IF EXISTS `categoria_consultoria`;
CREATE TABLE `categoria_consultoria` (
  `id_categoria_consultoria` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_categoria_consultoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `categoria_consultoria`
--

/*!40000 ALTER TABLE `categoria_consultoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria_consultoria` ENABLE KEYS */;


--
-- Definition of table `categoria_curso`
--

DROP TABLE IF EXISTS `categoria_curso`;
CREATE TABLE `categoria_curso` (
  `id_categoria_curso` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_categoria_curso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `categoria_curso`
--

/*!40000 ALTER TABLE `categoria_curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria_curso` ENABLE KEYS */;


--
-- Definition of table `categoria_material`
--

DROP TABLE IF EXISTS `categoria_material`;
CREATE TABLE `categoria_material` (
  `id_categoria_material` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_categoria_material`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `categoria_material`
--

/*!40000 ALTER TABLE `categoria_material` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria_material` ENABLE KEYS */;


--
-- Definition of table `categoria_palestra`
--

DROP TABLE IF EXISTS `categoria_palestra`;
CREATE TABLE `categoria_palestra` (
  `id_categoria_palestra` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_categoria_palestra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `categoria_palestra`
--

/*!40000 ALTER TABLE `categoria_palestra` DISABLE KEYS */;
/*!40000 ALTER TABLE `categoria_palestra` ENABLE KEYS */;


--
-- Definition of table `consultoria`
--

DROP TABLE IF EXISTS `consultoria`;
CREATE TABLE `consultoria` (
  `id_consultoria` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  `id_categoria_consultoria` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_consultoria`),
  KEY `FK_categoria_consultoria` (`id_categoria_consultoria`),
  CONSTRAINT `FK_categoria_consultoria` FOREIGN KEY (`id_categoria_consultoria`) REFERENCES `categoria_consultoria` (`id_categoria_consultoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `consultoria`
--

/*!40000 ALTER TABLE `consultoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `consultoria` ENABLE KEYS */;


--
-- Definition of table `curso`
--

DROP TABLE IF EXISTS `curso`;
CREATE TABLE `curso` (
  `id_curso` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  `id_categoria_curso` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_curso`),
  KEY `fk_categoria_curso` (`id_categoria_curso`),
  CONSTRAINT `fk_categoria_curso` FOREIGN KEY (`id_categoria_curso`) REFERENCES `categoria_curso` (`id_categoria_curso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `curso`
--

/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;


--
-- Definition of table `material`
--

DROP TABLE IF EXISTS `material`;
CREATE TABLE `material` (
  `id_material` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  `id_categoria_material` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_material`),
  KEY `FK_categoria_material` (`id_categoria_material`),
  CONSTRAINT `FK_categoria_material` FOREIGN KEY (`id_categoria_material`) REFERENCES `categoria_material` (`id_categoria_material`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `material`
--

/*!40000 ALTER TABLE `material` DISABLE KEYS */;
/*!40000 ALTER TABLE `material` ENABLE KEYS */;


--
-- Definition of table `operacao`
--

DROP TABLE IF EXISTS `operacao`;
CREATE TABLE `operacao` (
  `id_operacao` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_operacao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `operacao`
--

/*!40000 ALTER TABLE `operacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `operacao` ENABLE KEYS */;


--
-- Definition of table `palestra`
--

DROP TABLE IF EXISTS `palestra`;
CREATE TABLE `palestra` (
  `id_palestra` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  `id_categoria_palestra` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_palestra`),
  KEY `FK_categoria_palestra` (`id_categoria_palestra`),
  CONSTRAINT `FK_categoria_palestra` FOREIGN KEY (`id_categoria_palestra`) REFERENCES `categoria_palestra` (`id_categoria_palestra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `palestra`
--

/*!40000 ALTER TABLE `palestra` DISABLE KEYS */;
/*!40000 ALTER TABLE `palestra` ENABLE KEYS */;


--
-- Definition of table `perfil`
--

DROP TABLE IF EXISTS `perfil`;
CREATE TABLE `perfil` (
  `id_perfil` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_perfil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `perfil`
--

/*!40000 ALTER TABLE `perfil` DISABLE KEYS */;
/*!40000 ALTER TABLE `perfil` ENABLE KEYS */;


--
-- Definition of table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `id_usuario` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `ativo` tinyint(1) NOT NULL,
  `id_perfil` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `fk_perfil_usuario` (`id_perfil`),
  CONSTRAINT `fk_perfil_usuario` FOREIGN KEY (`id_perfil`) REFERENCES `perfil` (`id_perfil`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario`
--

/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
