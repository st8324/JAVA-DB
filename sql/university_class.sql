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
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `class` (
  `class_num` int(11) NOT NULL COMMENT '강의번호',
  `class_subject_code` varchar(6) NOT NULL COMMENT '과목코드',
  `class_professor_num` int(11) NOT NULL COMMENT '교수번호',
  `class_room` varchar(45) DEFAULT NULL COMMENT '강의실',
  `class_schedule` varchar(45) DEFAULT NULL COMMENT '일정',
  `class_year` int(11) DEFAULT NULL COMMENT '연도',
  `class_semester` varchar(45) DEFAULT NULL COMMENT '학기',
  PRIMARY KEY (`class_num`),
  KEY `class_subject_code_idx` (`class_subject_code`),
  KEY `class_professor_num_idx` (`class_professor_num`),
  CONSTRAINT `class_professor_num` FOREIGN KEY (`class_professor_num`) REFERENCES `professor` (`professor_num`),
  CONSTRAINT `class_subject_code` FOREIGN KEY (`class_subject_code`) REFERENCES `subject` (`subject_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='강의';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `class`
--

LOCK TABLES `class` WRITE;
/*!40000 ALTER TABLE `class` DISABLE KEYS */;
INSERT INTO `class` VALUES (1,'MSC001',2000160001,'A410호','월1,2,3',2019,'1'),(2,'MSC002',2000160001,'A411호','화1,2,3',2019,'1'),(3,'COM001',2001135001,'C201호','월5,6 수5,6',2019,'1');
/*!40000 ALTER TABLE `class` ENABLE KEYS */;
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
