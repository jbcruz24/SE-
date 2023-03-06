-- MySQL dump 10.13  Distrib 8.0.28, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: edc
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `PxTreatmentRecord`
--

DROP TABLE IF EXISTS `PxTreatmentRecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PxTreatmentRecord` (
  `TreatmentID` int NOT NULL AUTO_INCREMENT,
  `Pxid` int NOT NULL,
  `treatmentDate` varchar(50) DEFAULT NULL,
  `toothNum` varchar(50) DEFAULT NULL,
  `proc` varchar(50) DEFAULT NULL,
  `dentist` varchar(50) DEFAULT NULL,
  `amntCharged` varchar(50) DEFAULT NULL,
  `amntPaid` varchar(50) DEFAULT NULL,
  `balance` int DEFAULT '0',
  PRIMARY KEY (`TreatmentID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PxTreatmentRecord`
--

LOCK TABLES `PxTreatmentRecord` WRITE;
/*!40000 ALTER TABLE `PxTreatmentRecord` DISABLE KEYS */;
INSERT INTO `PxTreatmentRecord` VALUES (1,1,'2023-03-06','1','Cleaning','Cruz','200','200',0),(3,1,'2023-03-08','24','Extraction','Cruz','500','500',0),(4,2,'2023-03-07','35','Cleaning',NULL,NULL,NULL,NULL),(5,2,'2023-03-14','25','Extraction',NULL,NULL,NULL,NULL),(6,1,'2023-03-09','11','Cleaning','Cruz','250','250',0);
/*!40000 ALTER TABLE `PxTreatmentRecord` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-06 11:09:43
