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
-- Table structure for table `MedicalHistory`
--

DROP TABLE IF EXISTS `MedicalHistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `MedicalHistory` (
  `Pxid` int NOT NULL AUTO_INCREMENT,
  `namePhysician` varchar(50) DEFAULT NULL,
  `speciality` varchar(50) DEFAULT NULL,
  `officeAddr` varchar(50) DEFAULT NULL,
  `officeNum` varchar(50) DEFAULT NULL,
  `ques1` varchar(50) DEFAULT NULL,
  `ques2` varchar(50) DEFAULT NULL,
  `ques3` varchar(50) DEFAULT NULL,
  `ques4` varchar(50) DEFAULT NULL,
  `ques5` varchar(50) DEFAULT NULL,
  `ques6` varchar(50) DEFAULT NULL,
  `ques7` varchar(50) DEFAULT NULL,
  `ques8` varchar(50) DEFAULT NULL,
  `ques9` varchar(50) DEFAULT NULL,
  `ques10` varchar(50) DEFAULT NULL,
  `ques101` varchar(50) DEFAULT NULL,
  `ques102` varchar(50) DEFAULT NULL,
  `ques11` varchar(50) DEFAULT NULL,
  `ques12` varchar(50) DEFAULT NULL,
  `ques13` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Pxid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MedicalHistory`
--

LOCK TABLES `MedicalHistory` WRITE;
/*!40000 ALTER TABLE `MedicalHistory` DISABLE KEYS */;
INSERT INTO `MedicalHistory` VALUES (1,'IKAW','WALA','SA TABI','243','yes','no','no','no','no','no','no','local-anesthetic','N/A','no','no','no','A','YES','Asthma'),(2,'Cruz','SECRET','DOON','3','yes','no','no','no','no','no','no','','',NULL,NULL,NULL,'','',NULL);
/*!40000 ALTER TABLE `MedicalHistory` ENABLE KEYS */;
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
