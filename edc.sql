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
-- Table structure for table `Admin`
--

DROP TABLE IF EXISTS `Admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Admin` (
  `adminID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`adminID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Admin`
--

LOCK TABLES `Admin` WRITE;
/*!40000 ALTER TABLE `Admin` DISABLE KEYS */;
INSERT INTO `Admin` VALUES (1,'sample','jto646952@gmail.com','Dentist','sample123','123');
/*!40000 ALTER TABLE `Admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Archive`
--

DROP TABLE IF EXISTS `Archive`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Archive` (
  `ArchID` int NOT NULL AUTO_INCREMENT,
  `AdminID` int DEFAULT NULL,
  `PxID` int DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `firstName` varchar(50) DEFAULT NULL,
  `middleName` varchar(50) DEFAULT NULL,
  `birthDate` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `cellphone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `occupation` varchar(50) DEFAULT NULL,
  `guardian` varchar(50) DEFAULT NULL,
  `timeCreated` timestamp(6) NULL DEFAULT NULL,
  PRIMARY KEY (`ArchID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Archive`
--

LOCK TABLES `Archive` WRITE;
/*!40000 ALTER TABLE `Archive` DISABLE KEYS */;
/*!40000 ALTER TABLE `Archive` ENABLE KEYS */;
UNLOCK TABLES;

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

--
-- Table structure for table `PxRecord`
--

DROP TABLE IF EXISTS `PxRecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PxRecord` (
  `Pxid` int NOT NULL AUTO_INCREMENT,
  `lastName` varchar(50) DEFAULT NULL,
  `firstName` varchar(50) DEFAULT NULL,
  `middleName` varchar(50) DEFAULT NULL,
  `birthdate` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `cellphone` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `occupation` varchar(50) DEFAULT NULL,
  `guardian` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Pxid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PxRecord`
--

LOCK TABLES `PxRecord` WRITE;
/*!40000 ALTER TABLE `PxRecord` DISABLE KEYS */;
INSERT INTO `PxRecord` VALUES (1,'Cruz','Joshua','Maynards','mnxu7/0q6SNK5rueF3BrOQ==','fzvxM5xWancCnFsm464EIg==','r3bXV2pBeB/XNzqkQjxboQ==','Dtyh158uo6NkxPGYcOl51Q==','HD1rTwCibkxL4RH1/7ETyA==','T35w7U9GHnycl9UQnWpagg==','D1fHKWUuoh9xjpfKxkSCfg=='),(2,'Cabral','Jed','','R8D8ZPEu00q4XpzyjS2c3g==','fzvxM5xWancCnFsm464EIg==','EzsiZOgOJo3ZKYEyV9cY6g==','fEmtV+ckLkVPKok8JG/BNg==','a3a35pFEJ0zabMus5Dy2Tw==','T35w7U9GHnycl9UQnWpagg==','D1fHKWUuoh9xjpfKxkSCfg==');
/*!40000 ALTER TABLE `PxRecord` ENABLE KEYS */;
UNLOCK TABLES;

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
INSERT INTO `PxTreatmentRecord` VALUES (1,1,'2023-03-06','1','Cleaning','Cruz','200','200',0),(3,1,'2023-03-08','24','Extraction','Cruz','500','400',100),(4,2,'2023-03-07','35','Cleaning',NULL,NULL,NULL,NULL),(5,2,'2023-03-14','25','Extraction',NULL,NULL,NULL,NULL),(6,1,'2023-03-09','11','Cleaning','Cruz','250','100',150);
/*!40000 ALTER TABLE `PxTreatmentRecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SystemLogs`
--

DROP TABLE IF EXISTS `SystemLogs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SystemLogs` (
  `logsID` int NOT NULL AUTO_INCREMENT,
  `AdminID` int DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `login` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`logsID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SystemLogs`
--

LOCK TABLES `SystemLogs` WRITE;
/*!40000 ALTER TABLE `SystemLogs` DISABLE KEYS */;
INSERT INTO `SystemLogs` VALUES (1,1,'Dentist','2023-03-03 19:27:49.463'),(2,1,'Dentist','2023-03-03 21:06:02.455'),(3,1,'Dentist','2023-03-04 19:13:19.183');
/*!40000 ALTER TABLE `SystemLogs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-06 12:12:49
