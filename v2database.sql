-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: crimefilemanagementdb
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `adminID` varchar(7) NOT NULL,
  `adminPass` varchar(45) NOT NULL,
  PRIMARY KEY (`adminID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('12345','admin');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crimefile`
--

DROP TABLE IF EXISTS `crimefile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `crimefile` (
  `userName` varchar(55) NOT NULL,
  `userAddress` varchar(45) NOT NULL,
  `userPhone` varchar(11) NOT NULL,
  `complaintType` varchar(200) NOT NULL,
  `complaintDescription` varchar(300) NOT NULL,
  `crimeTime` time NOT NULL,
  `crimeDate` date NOT NULL,
  `crimeLocation` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crimefile`
--

LOCK TABLES `crimefile` WRITE;
/*!40000 ALTER TABLE `crimefile` DISABLE KEYS */;
INSERT INTO `crimefile` VALUES ('ozan','bursa','4545454','murder','killed','00:00:20','2020-04-26',''),('ozan','bursa','5455454','murder','killed','00:00:20','2020-04-26','izmir'),('ozan','bursa','78877','thief','ffef','00:00:14','2020-05-22','izmir'),('erem','malatya','66666','adada','dadadaddd','00:20:40','2020-04-28','bursa'),('sıla','izmir','787878','murder','killed me','20:20:20','2020-05-05','ukrayna'),('NULL','bursa','5556655142','murder','killed','15:20:25','2020-04-25','izmir'),('ozan','312 ozan','12345678900','','muder','00:20:15','2020-10-12','izmir');
/*!40000 ALTER TABLE `crimefile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `criminalreport`
--

DROP TABLE IF EXISTS `criminalreport`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `criminalreport` (
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `regnumber` varchar(45) NOT NULL,
  `dateofbirth` date NOT NULL,
  `crimedate` date NOT NULL,
  `crimelocation` varchar(45) NOT NULL,
  `charge` varchar(45) NOT NULL,
  `punishment` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criminalreport`
--

LOCK TABLES `criminalreport` WRITE;
/*!40000 ALTER TABLE `criminalreport` DISABLE KEYS */;
INSERT INTO `criminalreport` VALUES ('erem','kilic','male','erem1234','2000-05-02','2020-04-02','malatya','murder','5 years prison');
/*!40000 ALTER TABLE `criminalreport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `missingperson`
--

DROP TABLE IF EXISTS `missingperson`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `missingperson` (
  `name` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `surname` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `gender` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `placeOfbirth` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `dateOfbirth` date NOT NULL,
  `weight` double NOT NULL,
  `height` double NOT NULL,
  `dateMissing` date NOT NULL,
  `skinColor` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `hairColor` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `eyeColor` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `missingperson`
--

LOCK TABLES `missingperson` WRITE;
/*!40000 ALTER TABLE `missingperson` DISABLE KEYS */;
INSERT INTO `missingperson` VALUES ('ozan','zorlu','male','bursa','1998-04-25',66.6,183,'2020-03-15','white','black','brown',1);
/*!40000 ALTER TABLE `missingperson` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mostwanted`
--

DROP TABLE IF EXISTS `mostwanted`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mostwanted` (
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `dateOfbirth` date NOT NULL,
  `placeofbirth` varchar(45) NOT NULL,
  `nationality` varchar(45) NOT NULL,
  `language` varchar(45) NOT NULL,
  `charges` varchar(45) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mostwanted`
--

LOCK TABLES `mostwanted` WRITE;
/*!40000 ALTER TABLE `mostwanted` DISABLE KEYS */;
INSERT INTO `mostwanted` VALUES ('ozan','zorlu','male','1998-05-30','bursa','turkey','turkish','murder someone',1),('ayberk','ortancalar','male','1998-04-21','izmir','England','english','thief a house',2);
/*!40000 ALTER TABLE `mostwanted` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userID` bigint(11) NOT NULL,
  `userPass` varchar(16) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (12345678910,'1234'),(12345678987,'123321'),(12345678999,'54321'),(112233445566,'admin1234');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-05 22:44:20
