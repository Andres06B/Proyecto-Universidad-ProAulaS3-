-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: proyectodeaulads3
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agendarcita`
--

DROP TABLE IF EXISTS `agendarcita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agendarcita` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dueno` varchar(45) DEFAULT NULL,
  `identificacion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `mascota` varchar(45) DEFAULT NULL,
  `tipomascota` varchar(45) DEFAULT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `peso` varchar(45) DEFAULT NULL,
  `edad` varchar(45) DEFAULT NULL,
  `motivoconsulta` varchar(45) DEFAULT NULL,
  `tipoconsulta` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendarcita`
--

LOCK TABLES `agendarcita` WRITE;
/*!40000 ALTER TABLE `agendarcita` DISABLE KEYS */;
INSERT INTO `agendarcita` VALUES (1,'Camila','108653245','3215667842','Oty','Gato','Macho','4kg','2 años','Malestar','Consulta medica'),(2,'Andres Felipe','98654345','31413431431','Odie','Perro','Macho','3kg','4 años','No consume ningun alimento','Consulta medica'),(3,'Fernanda','7624326','3212243143','Toto','Hamster','Macho','9kg','5 años','Control','Consulta medica'),(4,'Luisa','108674256','3012245734','Pepe','Loro','Macho','12lb','4 meses ','Fractura en Pata derecha','Hospitalizacion'),(5,'Robert','1084076356','349832567','Bugs','Conejo','Macho','4lb','2 años','Cancer ','Urgencias'),(6,'Esteban','7529642','3212314314','Minina','Gata','Hembra','4kg','1 año','Malestar','Consulta medica'),(7,'Helena','45583283','30953423','Kiara','Perra','Hembra','6lb','2 meses','Ojos llorosos','Consulta medica'),(8,'Wendy','10859045675','1243545436','Kyra','Gata','Hembra','6kg','3 años','Malestar','Consulta medica'),(9,'Mateo','2376588','303452765','Sofi','Perra','Hembra ','4kg','6 años','Malestar','Consulta medica'),(10,'Gabriela','104378664','3215443265','Estrellita','Perra','Hembra','16kg','5 años','Envenenamiento','Urgencias'),(11,'Wendy Paola','1085938706','3105037669','Princesa','Perro','Hembra','12Kg','6 años','Hongo en la parte de la Piel','Urgencias');
/*!40000 ALTER TABLE `agendarcita` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-11 10:09:52
