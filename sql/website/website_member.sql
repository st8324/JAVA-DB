CREATE DATABASE  IF NOT EXISTS `website` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `website`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: website
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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `member` (
  `member_no` int(11) NOT NULL AUTO_INCREMENT,
  `member_cafe_name` varchar(45) DEFAULT NULL,
  `member_user_id` varchar(45) DEFAULT NULL,
  `member_grade` varchar(10) DEFAULT NULL,
  `member_board_count` int(11) NOT NULL DEFAULT '0',
  `member_visit_count` int(11) NOT NULL DEFAULT '0',
  `member_last_vist` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`member_no`),
  KEY `member_cafe_name_idx` (`member_cafe_name`),
  KEY `member_user_id_idx` (`member_user_id`),
  CONSTRAINT `member_cafe_name` FOREIGN KEY (`member_cafe_name`) REFERENCES `cafe` (`cafe_name`),
  CONSTRAINT `member_user_id` FOREIGN KEY (`member_user_id`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (6,'강아지 키우기','asdf','씨앗',1,0,'2019-04-30 14:33:31'),(7,'강아지 키우기','abcd','가지',1,0,'2019-04-30 14:33:31'),(8,'고양이 키우기','asdf','씨앗',0,0,'2019-04-30 14:33:31'),(9,'명산 산약초','asdf','씨앗',0,0,'2019-04-30 14:33:31'),(10,'파산회생 무료 상담','asdf','씨앗',0,0,'2019-04-30 14:33:31'),(11,'스타워즈','abcd','나무',0,0,'2019-04-30 14:34:22'),(12,'세계대전 떡밥','abcd','열매',0,0,'2019-04-30 14:34:22'),(13,'강아지 키우기','naver','나무',0,0,'2019-04-30 14:35:36'),(14,'고양이 키우기','naver','나무',0,0,'2019-04-30 14:35:36'),(15,'명산 산약초','naver','나무',0,0,'2019-04-30 14:35:36'),(16,'파산회생 무료 상담','naver','나무',0,0,'2019-04-30 14:35:36'),(17,'강아지 키우기','daum',NULL,0,0,'2019-04-30 14:37:27'),(18,'고양이 키우기','daum',NULL,0,0,'2019-04-30 14:37:27'),(19,'명산 산약초','daum',NULL,0,0,'2019-04-30 14:37:27'),(20,'세계대전 떡밥','daum',NULL,0,0,'2019-04-30 14:37:27'),(21,'스타워즈','daum',NULL,0,0,'2019-04-30 14:37:27'),(22,'파산회생 무료 상담','daum',NULL,0,0,'2019-04-30 14:37:27'),(23,'스타워즈','google',NULL,0,0,'2019-04-30 14:37:48');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-30 16:37:15
