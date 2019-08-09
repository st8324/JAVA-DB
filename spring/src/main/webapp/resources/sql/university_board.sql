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
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `board` (
  `num` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `contents` longtext NOT NULL,
  `writer` varchar(15) NOT NULL,
  `registered` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `file` varchar(255) DEFAULT NULL,
  `views` int(11) NOT NULL DEFAULT '0',
  `valid` varchar(1) NOT NULL DEFAULT 'I',
  PRIMARY KEY (`num`),
  KEY `writer_idx` (`writer`),
  CONSTRAINT `writer` FOREIGN KEY (`writer`) REFERENCES `member` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (3,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-15 10:22:13',NULL,0,'I'),(4,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-15 11:31:26',NULL,0,'I'),(5,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(6,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(7,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(8,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(9,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(10,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(11,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(12,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(13,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(14,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(15,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(16,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(17,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(18,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(19,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(20,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(21,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(22,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(23,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(24,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(25,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(26,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(27,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-16 12:29:48',NULL,0,'I'),(28,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-29 09:44:07',NULL,0,'I'),(29,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-29 10:11:25',NULL,0,'I'),(30,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-29 10:31:48',NULL,0,'I'),(31,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-29 10:34:29',NULL,0,'I'),(32,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-29 10:35:03',NULL,0,'I'),(33,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-29 10:43:24',NULL,2,'I'),(34,'써머노트 게시글 등록123','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-07-29 12:10:37',NULL,0,'D'),(35,'써머노트 게시글 등록','<p><span style=\"background-color: rgb(255, 255, 0);\">써머노트 </span>게시글 등록</p><ol><li>테스트1</li><li>테스트2</li><li>테스트3</li></ol>','12345678','2019-08-06 11:37:11',NULL,0,'D'),(36,'jsp 첨부','<p>footer.jsp 첨부</p>','12345678','2019-08-06 16:08:02','/2019/08/06/c1d6ee56-be90-4efe-819c-50d3351a0b74_footer.jsp',1,'I'),(37,'게시글','<p>ㅇㅇ</p>','12345678','2019-08-06 16:09:15','/2019/08/06/1c992ed8-903d-4eb2-9af1-d0ee536870ff_home.jsp',4,'I'),(38,'123','<p>123</p>','12345678','2019-08-06 16:51:04',NULL,1,'I'),(39,'첨부','H<b>ello Wor<span style=\"background-color: rgb(255, 255, 0);\">ld</span></b>','12345678','2019-08-07 09:13:21','/2019/08/07/cd9da1d6-ce11-4148-888e-ca6f8c3627d7_home.jsp',13,'I'),(40,'123','123','12345678','2019-08-09 09:51:10',NULL,1,'I'),(41,'789','789','12345678','2019-08-09 10:17:35',NULL,6,'I');
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

-- Dump completed on 2019-08-09 10:32:33
