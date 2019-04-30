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
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `board` (
  `board_no` int(11) NOT NULL AUTO_INCREMENT,
  `board_title` varchar(255) NOT NULL,
  `board_contents` varchar(45) DEFAULT NULL,
  `board_category_code` varchar(6) DEFAULT NULL,
  `board_registered_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `board_cafe_name` varchar(45) NOT NULL,
  `board_writer` varchar(45) NOT NULL,
  PRIMARY KEY (`board_no`),
  KEY `board_cafe_name_idx` (`board_cafe_name`),
  KEY `board_user_id_idx` (`board_writer`),
  CONSTRAINT `board_cafe_name` FOREIGN KEY (`board_cafe_name`) REFERENCES `cafe` (`cafe_name`),
  CONSTRAINT `board_writer` FOREIGN KEY (`board_writer`) REFERENCES `user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (1,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','강아지 키우기','asdf'),(2,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','명산 산약초','asdf'),(3,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','고양이 키우기','asdf'),(4,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','파산회생 무료 상담','asdf'),(5,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','강아지 키우기','abcd'),(6,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','스타워즈','abcd'),(7,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','세계대전 떡밥','abcd'),(8,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','세계대전 떡밥','daum'),(9,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','명산 산약초','daum'),(10,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','스타워즈','daum'),(11,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','파산회생 무료 상담','daum'),(12,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','강아지 키우기','naver'),(13,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','명산 산약초','naver'),(14,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','고양이 키우기','naver'),(15,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','파산회생 무료 상담','naver'),(16,'가입인사입니다.','가입인산','bse001','2019-04-30 14:41:22','스타워즈','google');
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
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
