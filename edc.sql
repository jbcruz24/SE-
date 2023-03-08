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
-- Table structure for table `IntraOral`
--

DROP TABLE IF EXISTS `IntraOral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `IntraOral` (
  `Pxid` int NOT NULL AUTO_INCREMENT,
  `TopToothNo_55` varchar(45) DEFAULT NULL,
  `TopToothNo_54` varchar(45) DEFAULT NULL,
  `TopToothNo_53` varchar(45) DEFAULT NULL,
  `TopToothNo_52` varchar(45) DEFAULT NULL,
  `TopToothNo_51` varchar(45) DEFAULT NULL,
  `TopToothNo_61` varchar(45) DEFAULT NULL,
  `TopToothNo_62` varchar(45) DEFAULT NULL,
  `TopToothNo_63` varchar(45) DEFAULT NULL,
  `TopToothNo_64` varchar(45) DEFAULT NULL,
  `TopToothNo_65` varchar(45) DEFAULT NULL,
  `BottomToothNo_55` varchar(45) DEFAULT NULL,
  `BottomToothNo_54` varchar(45) DEFAULT NULL,
  `BottomToothNo_53` varchar(45) DEFAULT NULL,
  `BottomToothNo_52` varchar(45) DEFAULT NULL,
  `BottomToothNo_51` varchar(45) DEFAULT NULL,
  `BottomToothNo_61` varchar(45) DEFAULT NULL,
  `BottomToothNo_62` varchar(45) DEFAULT NULL,
  `BottomToothNo_63` varchar(45) DEFAULT NULL,
  `BottomToothNo_64` varchar(45) DEFAULT NULL,
  `BottomToothNo_65` varchar(45) DEFAULT NULL,
  `TopToothNo_18` varchar(45) DEFAULT NULL,
  `TopToothNo_17` varchar(45) DEFAULT NULL,
  `TopToothNo_16` varchar(45) DEFAULT NULL,
  `TopToothNo_15` varchar(45) DEFAULT NULL,
  `TopToothNo_14` varchar(45) DEFAULT NULL,
  `TopToothNo_13` varchar(45) DEFAULT NULL,
  `TopToothNo_12` varchar(45) DEFAULT NULL,
  `TopToothNo_11` varchar(45) DEFAULT NULL,
  `TopToothNo_21` varchar(45) DEFAULT NULL,
  `TopToothNo_22` varchar(45) DEFAULT NULL,
  `TopToothNo_23` varchar(45) DEFAULT NULL,
  `TopToothNo_24` varchar(45) DEFAULT NULL,
  `TopToothNo_25` varchar(45) DEFAULT NULL,
  `TopToothNo_26` varchar(45) DEFAULT NULL,
  `TopToothNo_27` varchar(45) DEFAULT NULL,
  `TopToothNo_28` varchar(45) DEFAULT NULL,
  `BottomToothNo_18` varchar(45) DEFAULT NULL,
  `BottomToothNo_17` varchar(45) DEFAULT NULL,
  `BottomToothNo_16` varchar(45) DEFAULT NULL,
  `BottomToothNo_15` varchar(45) DEFAULT NULL,
  `BottomToothNo_14` varchar(45) DEFAULT NULL,
  `BottomToothNo_13` varchar(45) DEFAULT NULL,
  `BottomToothNo_12` varchar(45) DEFAULT NULL,
  `BottomToothNo_11` varchar(45) DEFAULT NULL,
  `BottomToothNo_21` varchar(45) DEFAULT NULL,
  `BottomToothNo_22` varchar(45) DEFAULT NULL,
  `BottomToothNo_23` varchar(45) DEFAULT NULL,
  `BottomToothNo_24` varchar(45) DEFAULT NULL,
  `BottomToothNo_25` varchar(45) DEFAULT NULL,
  `BottomToothNo_26` varchar(45) DEFAULT NULL,
  `BottomToothNo_27` varchar(45) DEFAULT NULL,
  `BottomToothNo_28` varchar(45) DEFAULT NULL,
  `TopToothNo_48` varchar(45) DEFAULT NULL,
  `TopToothNo_47` varchar(45) DEFAULT NULL,
  `TopToothNo_46` varchar(45) DEFAULT NULL,
  `TopToothNo_45` varchar(45) DEFAULT NULL,
  `TopToothNo_44` varchar(45) DEFAULT NULL,
  `TopToothNo_43` varchar(45) DEFAULT NULL,
  `TopToothNo_42` varchar(45) DEFAULT NULL,
  `TopToothNo_41` varchar(45) DEFAULT NULL,
  `TopToothNo_31` varchar(45) DEFAULT NULL,
  `TopToothNo_32` varchar(45) DEFAULT NULL,
  `TopToothNo_33` varchar(45) DEFAULT NULL,
  `TopToothNo_34` varchar(45) DEFAULT NULL,
  `TopToothNo_35` varchar(45) DEFAULT NULL,
  `TopToothNo_36` varchar(45) DEFAULT NULL,
  `TopToothNo_37` varchar(45) DEFAULT NULL,
  `TopToothNo_38` varchar(45) DEFAULT NULL,
  `BottomToothNo_48` varchar(45) DEFAULT NULL,
  `BottomToothNo_47` varchar(45) DEFAULT NULL,
  `BottomToothNo_46` varchar(45) DEFAULT NULL,
  `BottomToothNo_45` varchar(45) DEFAULT NULL,
  `BottomToothNo_44` varchar(45) DEFAULT NULL,
  `BottomToothNo_43` varchar(45) DEFAULT NULL,
  `BottomToothNo_42` varchar(45) DEFAULT NULL,
  `BottomToothNo_41` varchar(45) DEFAULT NULL,
  `BottomToothNo_31` varchar(45) DEFAULT NULL,
  `BottomToothNo_32` varchar(45) DEFAULT NULL,
  `BottomToothNo_33` varchar(45) DEFAULT NULL,
  `BottomToothNo_34` varchar(45) DEFAULT NULL,
  `BottomToothNo_35` varchar(45) DEFAULT NULL,
  `BottomToothNo_36` varchar(45) DEFAULT NULL,
  `BottomToothNo_37` varchar(45) DEFAULT NULL,
  `BottomToothNo_38` varchar(45) DEFAULT NULL,
  `TopToothNo_85` varchar(45) DEFAULT NULL,
  `TopToothNo_84` varchar(45) DEFAULT NULL,
  `TopToothNo_83` varchar(45) DEFAULT NULL,
  `TopToothNo_82` varchar(45) DEFAULT NULL,
  `TopToothNo_81` varchar(45) DEFAULT NULL,
  `TopToothNo_71` varchar(45) DEFAULT NULL,
  `TopToothNo_72` varchar(45) DEFAULT NULL,
  `TopToothNo_73` varchar(45) DEFAULT NULL,
  `TopToothNo_74` varchar(45) DEFAULT NULL,
  `TopToothNo_75` varchar(45) DEFAULT NULL,
  `BottomToothNo_85` varchar(45) DEFAULT NULL,
  `BottomToothNo_84` varchar(45) DEFAULT NULL,
  `BottomToothNo_83` varchar(45) DEFAULT NULL,
  `BottomToothNo_82` varchar(45) DEFAULT NULL,
  `BottomToothNo_81` varchar(45) DEFAULT NULL,
  `BottomToothNo_71` varchar(45) DEFAULT NULL,
  `BottomToothNo_72` varchar(45) DEFAULT NULL,
  `BottomToothNo_73` varchar(45) DEFAULT NULL,
  `BottomToothNo_74` varchar(45) DEFAULT NULL,
  `BottomToothNo_75` varchar(45) DEFAULT NULL,
  `notes` tinytext,
  PRIMARY KEY (`Pxid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `IntraOral`
--

LOCK TABLES `IntraOral` WRITE;
/*!40000 ALTER TABLE `IntraOral` DISABLE KEYS */;
INSERT INTO `IntraOral` VALUES (1,'1','X','','','X','','','8','','','','','13','','15','','17','','19','','','22','','24','','26','X','28','29','','31','','','34','','36','','38','','','','X','','','','','47','','49','','51','','','54','','56','','','59','','','62','','64','','','67','','69','','','72','','X','','76','','78','','','81','','83','','85','','','','','90','','92','','','','','X','98','X','100','X','X','103','104','tanggaling na lahat hehe'),(2,'1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40','41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60','61','62','63','64','65','66','67','68','69','70','71','72','73','74','75','76','77','78','79','80','81','82','83','84','85','86','87','88','89','90','91','92','93','94','95','96','97','98','99','100','101','102','103','104',NULL),(3,'1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40','41','42','43','44','45','46','47','48','49','50','51','52','53','54','55','56','57','58','59','60','61','62','63','64','65','66','67','68','69','70','71','72','73','74','75','76','77','78','79','80','81','82','83','84','85','86','87','88','89','90','91','92','93','94','95','96','97','98','99','100','101','103','103','104','May nakalagay dito');
/*!40000 ALTER TABLE `IntraOral` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `MedicalHistory`
--

LOCK TABLES `MedicalHistory` WRITE;
/*!40000 ALTER TABLE `MedicalHistory` DISABLE KEYS */;
INSERT INTO `MedicalHistory` VALUES (1,'IKAW','WALA','SA TABI','243','yes','no','no','no','no','no','no','local-anesthetic','N/A','no','no','no','A','YES','Asthma'),(2,'Cruz','SECRET','DOON','3','yes','no','no','no','no','no','no','','',NULL,NULL,NULL,'','',NULL),(3,'Cruz','Wala','Manila','044','yes','no','no','yes','no','yes','yes','local-anesthetic','',NULL,NULL,NULL,'A','','heart-surgery');
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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PxRecord`
--

LOCK TABLES `PxRecord` WRITE;
/*!40000 ALTER TABLE `PxRecord` DISABLE KEYS */;
INSERT INTO `PxRecord` VALUES (1,'Cruz','Joshua','Maynards','mnxu7/0q6SNK5rueF3BrOQ==','fzvxM5xWancCnFsm464EIg==','r3bXV2pBeB/XNzqkQjxboQ==','Dtyh158uo6NkxPGYcOl51Q==','HD1rTwCibkxL4RH1/7ETyA==','T35w7U9GHnycl9UQnWpagg==','D1fHKWUuoh9xjpfKxkSCfg=='),(2,'Cabral','Jed','','R8D8ZPEu00q4XpzyjS2c3g==','fzvxM5xWancCnFsm464EIg==','EzsiZOgOJo3ZKYEyV9cY6g==','fEmtV+ckLkVPKok8JG/BNg==','a3a35pFEJ0zabMus5Dy2Tw==','T35w7U9GHnycl9UQnWpagg==','D1fHKWUuoh9xjpfKxkSCfg=='),(3,'Dela Cruz','Juan','','R8D8ZPEu00q4XpzyjS2c3g==','fzvxM5xWancCnFsm464EIg==','LScpkLLhleOD2j5CpBiolA==','VJ1ScvNYCD08gr7gsAX6OA==','5N8c0P6Vk28OKnLFa3gQcA==','yQS74oEyzawRfQwyH1nMkw==','1djTmEw6Cd0BXtawThDd6A==');
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SystemLogs`
--

LOCK TABLES `SystemLogs` WRITE;
/*!40000 ALTER TABLE `SystemLogs` DISABLE KEYS */;
INSERT INTO `SystemLogs` VALUES (1,1,'Dentist','2023-03-03 19:27:49.463'),(2,1,'Dentist','2023-03-03 21:06:02.455'),(3,1,'Dentist','2023-03-04 19:13:19.183'),(4,1,'Dentist','2023-03-07 18:51:26.084');
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

-- Dump completed on 2023-03-08 12:52:11
