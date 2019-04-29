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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `course` (
  `course_num` int(11) NOT NULL AUTO_INCREMENT COMMENT '수강번호',
  `course_student_num` int(11) DEFAULT NULL COMMENT '학번',
  `course_class_num` int(11) DEFAULT NULL COMMENT '강의번호',
  `course_mid` double DEFAULT NULL COMMENT '중간성적',
  `course_end` double DEFAULT NULL COMMENT '기말성적',
  `course_attendance` int(11) DEFAULT NULL COMMENT '출석점수',
  `course_report` double DEFAULT NULL COMMENT '과제점수',
  `course_total` double DEFAULT NULL COMMENT '총점',
  PRIMARY KEY (`course_num`),
  KEY `course_student_num_idx` (`course_student_num`),
  KEY `course_class_num_idx` (`course_class_num`),
  CONSTRAINT `course_class_num` FOREIGN KEY (`course_class_num`) REFERENCES `class` (`class_num`),
  CONSTRAINT `course_student_num` FOREIGN KEY (`course_student_num`) REFERENCES `student` (`student_num`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='수강';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,2019160160,1,100,100,100,100,100),(2,2019160160,2,100,80,100,100,90),(3,2019160160,3,70,100,80,90,86.5),(4,2019135135,1,100,0,0,0,40),(5,2019135135,2,50,50,0,0,45),(6,2017160001,1,0,0,0,0,0),(7,2017160001,3,0,0,0,0,0);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-29 16:22:16
