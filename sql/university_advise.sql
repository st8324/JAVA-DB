CREATE DATABASE  IF NOT EXISTS `university` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `university`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: university
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `advise`
--

DROP TABLE IF EXISTS `advise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `advise` (
  `advise_num` int(11) NOT NULL AUTO_INCREMENT COMMENT '지도 번호',
  `advise_professor_num` int(11) DEFAULT NULL COMMENT '교수번호',
  `advise_student_num` int(11) DEFAULT NULL COMMENT '학번',
  PRIMARY KEY (`advise_num`),
  KEY `advise_student_num_idx` (`advise_student_num`),
  KEY `advise_professor_num_idx` (`advise_professor_num`),
  CONSTRAINT `advise_professor_num` FOREIGN KEY (`advise_professor_num`) REFERENCES `professor` (`professor_num`),
  CONSTRAINT `advise_student_num` FOREIGN KEY (`advise_student_num`) REFERENCES `student` (`student_num`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='지도';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advise`
--

LOCK TABLES `advise` WRITE;
/*!40000 ALTER TABLE `advise` DISABLE KEYS */;
INSERT INTO `advise` VALUES (1,2000160001,2019160160),(2,2001135001,2019135135);
/*!40000 ALTER TABLE `advise` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-26 17:06:25
