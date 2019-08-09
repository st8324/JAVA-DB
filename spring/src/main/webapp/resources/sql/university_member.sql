-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: university
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
  `id` varchar(15) NOT NULL,
  `pw` varchar(255) NOT NULL,
  `gender` varchar(1) NOT NULL DEFAULT 'M',
  `email` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL DEFAULT ' ',
  `authority` varchar(45) NOT NULL DEFAULT 'USER',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES ('123','$2a$10$9J9pcm7g/IH60nTg74Imk.fMIXWAnlLZK4olXh8SNdyhD9kohNNeO','F','stajun@naver.com','유관순','USER'),('123123123','$2a$10$Z.LEm1Pgwjxtd9eUEHEbLObJ.VStCqf45FsjIPPbVtdU1Lsy8UIJ2','M','stajun@naver.com','홍길동','USER'),('12345678','$2a$10$IDdNDxXlZsQihuVQ7lhiGOvSK4EEj1QsXu8frDPmC0HPQZbiTpowa','M','stajun@naver.com','임꺽정1','ADMIN'),('123456780','$2a$10$NTLbTXAF/InAgn0XUWJmJe5RIsa4horLsjpeXirae73AV.VyQiuoC','M','stajun@naver.com','','USER'),('123456789','$2a$10$EMMtxJkFmJ1gvyKwosAKhOyIc3wdDtJ4ON6wun/aBnQaTCbMgkAcm','M','stajun@naver.com','','USER'),('12345678912','$2a$10$WXtjme7IbaYJ7zf7bE6pJOx04eyr8rkbNbdCEiquZQCghfgUsWbMq','M','stajun@naver.com','','ADMIN'),('987654321','$2a$10$VRUH14SMA15ftTYYMOKo/.l.vxftgOKusWnHNyd34ch36zAtBI9o.','F','stajun@naver.com','홍길동','USER'),('abcd1234','$2a$10$Art98LAgeKySeRY/H.hbueI937ofFu/0NzDJcqfg4z9cGmvNZbDKK','M','stajun@naver.com','홍길동','USER');
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

-- Dump completed on 2019-08-09 10:32:33
