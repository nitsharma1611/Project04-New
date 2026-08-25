-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: localhost    Database: p04
-- ------------------------------------------------------
-- Server version	8.0.46

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
-- Table structure for table `ai_recommendation`
--

DROP TABLE IF EXISTS `ai_recommendation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ai_recommendation` (
  `id` bigint NOT NULL,
  `recommendationCode` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `recommendationType` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ai_recommendation`
--

LOCK TABLES `ai_recommendation` WRITE;
/*!40000 ALTER TABLE `ai_recommendation` DISABLE KEYS */;
INSERT INTO `ai_recommendation` VALUES (1,'REC001','Amit Sharma','Product','Approved','ADMIN','nit@gmail.com','2026-08-01 09:00:00','2026-08-04 17:30:12'),(2,'REC002','Priya Verma','Service','Approved','ADMIN','ADMIN','2026-08-01 09:15:00','2026-08-01 09:15:00'),(3,'REC003','Rahul Singh','Career','Rejected','ADMIN','ADMIN','2026-08-01 09:30:00','2026-08-01 09:30:00'),(4,'REC004','Sneha Patel','Education','Pending','ADMIN','ADMIN','2026-08-01 09:45:00','2026-08-01 09:45:00'),(5,'REC005','Vikas Gupta','Health','Approved','ADMIN','ADMIN','2026-08-01 10:00:00','2026-08-01 10:00:00'),(6,'REC006','Neha Jain','Product','Pending','ADMIN','ADMIN','2026-08-01 10:15:00','2026-08-01 10:15:00'),(7,'REC007','Rohit Mehta','Service','Approved','ADMIN','ADMIN','2026-08-01 10:30:00','2026-08-01 10:30:00'),(8,'REC008','Anjali Yadav','Career','Rejected','ADMIN','ADMIN','2026-08-01 10:45:00','2026-08-01 10:45:00'),(9,'REC009','Karan Joshi','Education','Pending','ADMIN','ADMIN','2026-08-01 11:00:00','2026-08-01 11:00:00'),(10,'REC010','Pooja Mishra','Health','Approved','ADMIN','ADMIN','2026-08-01 11:15:00','2026-08-01 11:15:00'),(11,'REC011','Arjun Kapoor','Product','Rejected','ADMIN','ADMIN','2026-08-01 11:30:00','2026-08-01 11:30:00'),(12,'REC012','Meera Nair','Service','Pending','ADMIN','ADMIN','2026-08-01 11:45:00','2026-08-01 11:45:00'),(13,'REC013','Sanjay Kumar','Career','Approved','ADMIN','ADMIN','2026-08-01 12:00:00','2026-08-01 12:00:00'),(14,'REC014','Riya Sharma','Education','Pending','ADMIN','ADMIN','2026-08-01 12:15:00','2026-08-01 12:15:00'),(15,'REC015','Deepak Soni','Health','Rejected','ADMIN','ADMIN','2026-08-01 12:30:00','2026-08-01 12:30:00'),(16,'REC016','Nisha Arora','Product','Approved','ADMIN','ADMIN','2026-08-01 12:45:00','2026-08-01 12:45:00'),(17,'REC017','Manoj Tiwari','Service','Pending','ADMIN','ADMIN','2026-08-01 13:00:00','2026-08-01 13:00:00'),(18,'REC018','Komal Shah','Career','Approved','ADMIN','ADMIN','2026-08-01 13:15:00','2026-08-01 13:15:00'),(19,'REC019','Aditya Rao','Education','Rejected','ADMIN','ADMIN','2026-08-01 13:30:00','2026-08-01 13:30:00'),(20,'REC020','Simran Kaur','Health','Pending','ADMIN','ADMIN','2026-08-01 13:45:00','2026-08-01 13:45:00'),(21,'REC021','Harsh Agrawal','Product','Approved','ADMIN','ADMIN','2026-08-01 14:00:00','2026-08-01 14:00:00'),(22,'REC022','Isha Malhotra','Service','Rejected','ADMIN','ADMIN','2026-08-01 14:15:00','2026-08-01 14:15:00'),(23,'REC023','Yash Chauhan','Career','Pending','ADMIN','ADMIN','2026-08-01 14:30:00','2026-08-01 14:30:00'),(24,'REC024','Kavita Singh','Education','Approved','ADMIN','ADMIN','2026-08-01 14:45:00','2026-08-01 14:45:00'),(25,'REC026','Nitin Sharma','Education','Approved','nit@gmail.com','nit@gmail.com','2026-08-04 12:20:47','2026-08-04 12:20:47');
/*!40000 ALTER TABLE `ai_recommendation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `id` bigint NOT NULL,
  `departmentName` varchar(255) DEFAULT NULL,
  `hodName` varchar(255) DEFAULT NULL,
  `totalFaculty` int DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'Computer Science','Dr. Amit Sharma',25,'Block A','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(2,'Information Technology','Dr. Neha Verma',20,'Block B','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(3,'Mechanical Engineering','Dr. Rajesh Singh',18,'Block C','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(4,'Civil Engineering','Dr. Pooja Mishra',22,'Block D','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(5,'Electrical Engineering','Dr. Suresh Patel',19,'Block E','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(6,'Electronics Engineering','Dr. Anjali Gupta',17,'Block F','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(7,'Artificial Intelligence','Dr. Rohit Jain',15,'Block G','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(8,'Data Science','Dr. Kiran Yadav',14,'Block H','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(9,'Cyber Security','Dr. Vivek Sharma',12,'Block I','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(10,'MBA','Dr. Ritu Saxena',16,'Management Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(11,'Commerce','Dr. Alok Gupta',21,'Commerce Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(12,'Mathematics','Dr. Deepak Tiwari',13,'Science Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(13,'Physics','Dr. Shalini Joshi',11,'Science Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(14,'Chemistry','Dr. Gaurav Mehta',10,'Science Block','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(15,'Biotechnology','Dr. Nidhi Kapoor',9,'Bio Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(16,'Pharmacy','Dr. Prakash Dubey',18,'Medical Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(17,'Law','Dr. Meenakshi Rao',14,'Law Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(18,'English','Dr. Sunita Sharma',12,'Arts Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(19,'Hindi','Dr. Mahesh Chaturvedi',10,'Arts Block','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(20,'Economics','Dr. Rekha Jain',15,'Commerce Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(21,'History','Dr. Manoj Verma',9,'Arts Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(22,'Political Science','Dr. Kavita Mishra',11,'Arts Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(23,'Geography','Dr. Ashok Yadav',8,'Arts Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(24,'Environmental Science','Dr. Priya Singh',13,'Science Block','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),(25,'Education','Dr. Rakesh Soni',16,'Education Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drone_delivery`
--

DROP TABLE IF EXISTS `drone_delivery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drone_delivery` (
  `Id` bigint NOT NULL,
  `drone_code` varchar(255) DEFAULT NULL,
  `operator_name` varchar(255) DEFAULT NULL,
  `delivery_zone` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drone_delivery`
--

LOCK TABLES `drone_delivery` WRITE;
/*!40000 ALTER TABLE `drone_delivery` DISABLE KEYS */;
INSERT INTO `drone_delivery` VALUES (1,'DRN001','Rahul Sharma','Zone A','In Transit','Admin','Admin','2026-07-22 12:32:19','2026-07-22 12:32:19'),(2,'DRN002','Rohit Verma','Zone B','In Transit',NULL,NULL,NULL,NULL),(3,'DRN003','Neha Singh','Zone C','Charging',NULL,NULL,NULL,NULL),(4,'DRN004','Priya Patel','Zone D','Maintenance',NULL,NULL,NULL,NULL),(5,'DRN005','Vikas Mehta','Zone E','Available',NULL,NULL,NULL,NULL),(6,'DRN006','Anjali Gupta','Zone A','In Transit',NULL,NULL,NULL,NULL),(7,'DRN007','Rahul Joshi','Zone B','Charging',NULL,NULL,NULL,NULL),(8,'DRN008','Sneha Yadav','Zone C','Available',NULL,NULL,NULL,NULL),(9,'DRN009','Karan Malhotra','Zone D','Maintenance',NULL,NULL,NULL,NULL),(10,'DRN010','Pooja Soni','Zone E','In Transit',NULL,NULL,NULL,NULL),(11,'DRN011','Suresh Kumar','Zone A','Available',NULL,NULL,NULL,NULL),(12,'DRN012','Deepak Jain','Zone B','Charging',NULL,NULL,NULL,NULL),(13,'DRN013','Komal Arora','Zone C','Available',NULL,NULL,NULL,NULL),(14,'DRN014','Arjun Saxena','Zone D','In Transit',NULL,NULL,NULL,NULL),(15,'DRN015','Nisha Kapoor','Zone E','Maintenance',NULL,NULL,NULL,NULL),(16,'DRN016','Manish Tiwari','Zone A','Available',NULL,NULL,NULL,NULL),(17,'DRN017','Ritika Sharma','Zone B','Charging',NULL,NULL,NULL,NULL),(18,'DRN018','Yash Agarwal','Zone C','In Transit',NULL,NULL,NULL,NULL),(19,'DRN019','Meera Nair','Zone D','Available',NULL,NULL,NULL,NULL),(20,'DRN020','Abhishek Singh','Zone E','Maintenance',NULL,NULL,NULL,NULL),(21,'DRN021','Shivam Mishra','Zone A','Available',NULL,NULL,NULL,NULL),(22,'DRN022','Kavita Chauhan','Zone B','Charging',NULL,NULL,NULL,NULL),(23,'DRN023','Harsh Vardhan','Zone C','In Transit',NULL,NULL,NULL,NULL),(25,'DRN025','Rakesh Pandey','Zone E','Maintenance',NULL,NULL,NULL,NULL),(26,'DRN024','NITIN','F','Maintenance','Nit@gmail.com','Nit@gmail.com','2026-07-22 15:13:23','2026-07-22 15:13:34');
/*!40000 ALTER TABLE `drone_delivery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `energy_consumption`
--

DROP TABLE IF EXISTS `energy_consumption`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `energy_consumption` (
  `id` bigint NOT NULL,
  `energyCode` varchar(255) DEFAULT NULL,
  `deviceName` varchar(255) DEFAULT NULL,
  `unitsConsumed` double DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `energy_consumption`
--

LOCK TABLES `energy_consumption` WRITE;
/*!40000 ALTER TABLE `energy_consumption` DISABLE KEYS */;
INSERT INTO `energy_consumption` VALUES (1,'EC001','Air Conditioner',125.5,'High','admin','admin','2026-08-01 09:00:00','2026-08-01 09:00:00'),(2,'EC002','Refrigerator',42.3,'Low','admin','admin','2026-08-01 09:15:00','2026-08-01 09:15:00'),(3,'EC003','Washing Machine',68.75,'Medium','admin','admin','2026-08-01 09:30:00','2026-08-01 09:30:00'),(4,'EC004','Water Heater',98.4,'High','admin','admin','2026-08-01 09:45:00','2026-08-01 09:45:00'),(5,'EC005','Ceiling Fan',15.2,'Low','admin','admin','2026-08-01 10:00:00','2026-08-01 10:00:00'),(6,'EC006','LED TV',28.6,'Medium','admin','admin','2026-08-01 10:15:00','2026-08-01 10:15:00'),(7,'EC007','Microwave Oven',35.1,'Medium','admin','admin','2026-08-01 10:30:00','2026-08-01 10:30:00'),(8,'EC008','Laptop',12.9,'Low','admin','admin','2026-08-01 10:45:00','2026-08-01 10:45:00'),(9,'EC009','Desktop Computer',45.8,'Medium','admin','admin','2026-08-01 11:00:00','2026-08-01 11:00:00'),(10,'EC010','Dishwasher',54.25,'Medium','admin','admin','2026-08-01 11:15:00','2026-08-01 11:15:00'),(11,'EC011','Induction Cooker',76.8,'High','admin','admin','2026-08-01 11:30:00','2026-08-01 11:30:00'),(12,'EC012','Electric Kettle',18.4,'Low','admin','admin','2026-08-01 11:45:00','2026-08-01 11:45:00'),(13,'EC013','Room Heater',132.6,'High','admin','admin','2026-08-01 12:00:00','2026-08-01 12:00:00'),(14,'EC014','Vacuum Cleaner',39.75,'Medium','admin','admin','2026-08-01 12:15:00','2026-08-01 12:15:00'),(15,'EC015','Coffee Maker',16.95,'Low','admin','admin','2026-08-01 12:30:00','2026-08-01 12:30:00'),(16,'EC016','Smart Speaker',8.5,'Low','admin','admin','2026-08-01 12:45:00','2026-08-01 12:45:00'),(17,'EC017','Air Purifier',26.7,'Medium','admin','admin','2026-08-01 13:00:00','2026-08-01 13:00:00'),(18,'EC018','Water Pump',88.9,'High','admin','admin','2026-08-01 13:15:00','2026-08-01 13:15:00'),(19,'EC019','Toaster',10.25,'Low','admin','admin','2026-08-01 13:30:00','2026-08-01 13:30:00'),(20,'EC020','Mixer Grinder',24.8,'Medium','admin','admin','2026-08-01 13:45:00','2026-08-01 13:45:00'),(21,'EC021','Solar Inverter',5.6,'High','admin','nit@gmail.com','2026-08-01 14:00:00','2026-08-03 13:32:48'),(22,'EC022','EV Charger',156.4,'High','admin','admin','2026-08-01 14:15:00','2026-08-01 14:15:00'),(23,'EC023','Printer',14.3,'Low','admin','admin','2026-08-01 14:30:00','2026-08-01 14:30:00'),(24,'EC024','Projector',47.5,'Medium','admin','admin','2026-08-01 14:45:00','2026-08-01 14:45:00'),(25,'EC025','Smart Lighting',21.85,'Low','admin','admin','2026-08-01 15:00:00','2026-08-01 15:00:00');
/*!40000 ALTER TABLE `energy_consumption` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `face_recognition`
--

DROP TABLE IF EXISTS `face_recognition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `face_recognition` (
  `Id` bigint NOT NULL,
  `faceCode` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `imagePath` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `face_recognition`
--

LOCK TABLES `face_recognition` WRITE;
/*!40000 ALTER TABLE `face_recognition` DISABLE KEYS */;
INSERT INTO `face_recognition` VALUES (1,'FC001','Aarav Sharma','images/faces/face1.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(2,'FC002','Priya Verma','images/faces/face2.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(3,'FC003','Rahul Singh','images/faces/face3.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(4,'FC004','Neha Patel','images/faces/face4.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(5,'FC005','Amit Kumar','images/faces/face5.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(6,'FC006','Sneha Joshi','images/faces/face6.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(7,'FC007','Rohan Gupta','images/faces/face7.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(8,'FC008','Pooja Mishra','images/faces/face8.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(9,'FC009','Vikas Yadav','images/faces/face9.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(10,'FC010','Anjali Sharma','images/faces/face10.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(11,'FC011','Deepak Jain','images/faces/face11.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(12,'FC012','Kavita Soni','images/faces/face12.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(13,'FC013','Manish Tiwari','images/faces/face13.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(14,'FC014','Ritu Saxena','images/faces/face14.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(15,'FC015','Sanjay Dubey','images/faces/face15.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(16,'FC016','Meena Sharma','images/faces/face16.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(17,'FC017','Arjun Mehta','images/faces/face17.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(18,'FC018','Nisha Kapoor','images/faces/face18.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(19,'FC019','Rakesh Chauhan','images/faces/face19.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(20,'FC020','Simran Kaur','images/faces/face20.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(21,'FC021','Mohit Agrawal','images/faces/face21.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(22,'FC022','Divya Sharma','images/faces/face22.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(23,'FC023','Harsh Patel','images/faces/face23.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),(24,'FC024','Isha Verma','images/faces/face24.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10');
/*!40000 ALTER TABLE `face_recognition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qr_scanner`
--

DROP TABLE IF EXISTS `qr_scanner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `qr_scanner` (
  `id` bigint NOT NULL,
  `qrCode` varchar(255) DEFAULT NULL,
  `scannedBy` varchar(255) DEFAULT NULL,
  `scanTime` date DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qr_scanner`
--

LOCK TABLES `qr_scanner` WRITE;
/*!40000 ALTER TABLE `qr_scanner` DISABLE KEYS */;
INSERT INTO `qr_scanner` VALUES (1,'QR1001','Nitin','2026-07-01','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(2,'QR1002','Rahul','2026-07-02','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(3,'QR1003','Amit','2026-07-03','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(4,'QR1004','Vikas','2026-07-04','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(5,'QR1005','Rohit','2026-07-05','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(6,'QR1006','Priya','2026-07-06','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(7,'QR1007','Pooja','2026-07-07','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(8,'QR1008','Ankit','2026-07-08','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(9,'QR1009','Deepak','2026-07-09','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(10,'QR1010','Sanjay','2026-07-10','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(11,'QR1011','Neha','2026-07-11','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(12,'QR1012','Karan','2026-07-12','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(13,'QR1013','Rakesh','2026-07-13','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(14,'QR1014','Komal','2026-07-14','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(15,'QR1015','Suresh','2026-07-15','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(16,'QR1016','Anjali','2026-07-16','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(17,'QR1017','Mohit','2026-07-17','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(18,'QR1018','Kavita','2026-07-18','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(19,'QR1019','Ajay','2026-07-19','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(20,'QR1020','Meena','2026-07-20','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(21,'QR1021','Arjun','2026-07-21','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),(22,'QR1022','Nisha','2026-07-22','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36');
/*!40000 ALTER TABLE `qr_scanner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `smart_light`
--

DROP TABLE IF EXISTS `smart_light`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `smart_light` (
  `id` bigint NOT NULL,
  `lightCode` varchar(255) DEFAULT NULL,
  `roomName` varchar(255) DEFAULT NULL,
  `brightnessLevel` int DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smart_light`
--

LOCK TABLES `smart_light` WRITE;
/*!40000 ALTER TABLE `smart_light` DISABLE KEYS */;
INSERT INTO `smart_light` VALUES (1,'SL001','Living Room',80,'On','Admin','Admin','2026-07-01 09:00:00','2026-07-01 09:00:00'),(2,'SL002','Bedroom',40,'Off','Admin','Admin','2026-07-02 09:15:00','2026-07-02 09:15:00'),(3,'SL003','Kitchen',90,'On','Admin','Admin','2026-07-03 10:00:00','2026-07-03 10:00:00'),(4,'SL004','Dining Room',70,'On','Admin','Admin','2026-07-04 10:20:00','2026-07-04 10:20:00'),(5,'SL005','Bathroom',60,'Off','Admin','Admin','2026-07-05 08:30:00','2026-07-05 08:30:00'),(6,'SL006','Guest Room',50,'On','Admin','Admin','2026-07-06 11:00:00','2026-07-06 11:00:00'),(7,'SL007','Study Room',100,'On','Admin','Admin','2026-07-07 11:15:00','2026-07-07 11:15:00'),(8,'SL008','Office',75,'Off','Admin','Admin','2026-07-08 12:00:00','2026-07-08 12:00:00'),(9,'SL009','Garage',35,'Off','Admin','Admin','2026-07-09 12:20:00','2026-07-09 12:20:00'),(10,'SL010','Balcony',65,'On','Admin','Admin','2026-07-10 13:00:00','2026-07-10 13:00:00'),(11,'SL011','Hall',85,'On','Admin','Admin','2026-07-11 13:15:00','2026-07-11 13:15:00'),(12,'SL012','Kids Room',45,'Off','Admin','Admin','2026-07-12 14:00:00','2026-07-12 14:00:00'),(13,'SL013','Library',95,'On','Admin','Admin','2026-07-13 14:30:00','2026-07-13 14:30:00'),(14,'SL014','Terrace',55,'Off','Admin','Admin','2026-07-14 15:00:00','2026-07-14 15:00:00'),(15,'SL015','Lobby',68,'On','Admin','Admin','2026-07-15 15:20:00','2026-07-15 15:20:00'),(16,'SL016','Store Room',25,'Off','Admin','Admin','2026-07-16 16:00:00','2026-07-16 16:00:00'),(17,'SL017','Conference Room',88,'On','Admin','Admin','2026-07-17 16:15:00','2026-07-17 16:15:00'),(18,'SL018','Reception',72,'On','Admin','Admin','2026-07-18 17:00:00','2026-07-18 17:00:00'),(19,'SL019','Pantry',58,'Off','Admin','Admin','2026-07-19 17:20:00','2026-07-19 17:20:00'),(20,'SL020','Security Room',92,'On','Admin','Admin','2026-07-20 18:00:00','2026-07-20 18:00:00'),(21,'SL021','Server Room',100,'On','Admin','Admin','2026-07-21 18:15:00','2026-07-21 18:15:00'),(22,'SL022','Wash Area',30,'Off','Admin','Admin','2026-07-22 19:00:00','2026-07-22 19:00:00'),(23,'SL023','Garden',78,'On','Admin','Admin','2026-07-23 19:20:00','2026-07-23 19:20:00'),(24,'SL024','Parking',50,'On','Admin','nit@gmail.com','2026-07-24 20:00:00','2026-07-31 12:52:23'),(25,'SL025','Entrance',50,'On','nit@gmail.com','nit@gmail.com','2026-07-31 12:53:16','2026-07-31 12:53:16');
/*!40000 ALTER TABLE `smart_light` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_bank_account`
--

DROP TABLE IF EXISTS `st_bank_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_bank_account` (
  `id` bigint NOT NULL,
  `accountNumber` varchar(255) DEFAULT NULL,
  `accountHolderName` varchar(255) DEFAULT NULL,
  `accountType` varchar(255) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `branchName` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_bank_account`
--

LOCK TABLES `st_bank_account` WRITE;
/*!40000 ALTER TABLE `st_bank_account` DISABLE KEYS */;
INSERT INTO `st_bank_account` VALUES (1,'ACC10001','Rahul Sharma','Savings',45000.5,'Bhopal Main','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(2,'ACC10002','Amit Verma','Current',125000,'Indore Main','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(3,'ACC10003','Priya Singh','Savings',78500.75,'Jabalpur Main','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(4,'ACC10004','Neha Gupta','Salary',56000,'Bhopal City','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(5,'ACC10005','Rohit Patel','Savings',32500.25,'Ujjain Main','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(6,'ACC10006','Pooja Sharma','Current',210000,'Indore Vijay Nagar','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(7,'ACC10007','Suresh Yadav','Savings',67500.5,'Gwalior Main','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(8,'ACC10008','Anjali Mehta','Salary',89000,'Bhopal Arera','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(9,'ACC10009','Vikas Jain','Savings',42000.75,'Ratlam Main','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(10,'ACC10010','Kavita Joshi','Current',175000,'Indore Palasia','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(11,'ACC10011','Manish Tiwari','Savings',55000,'Bhopal MP Nagar','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(12,'ACC10012','Sneha Mishra','Salary',72000.25,'Jabalpur Civil Lines','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(13,'ACC10013','Deepak Kumar','Savings',38500.5,'Sagar Main','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(14,'ACC10014','Riya Agarwal','Current',245000,'Indore Rau','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(15,'ACC10015','Arun Dubey','Savings',61500.75,'Bhopal Kolar','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(16,'ACC10016','Nisha Patel','Salary',95000,'Ujjain Freeganj','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(17,'ACC10017','Karan Malhotra','Savings',47000.25,'Gwalior City','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(18,'ACC10018','Swati Sharma','Current',185000.5,'Bhopal New Market','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(19,'ACC10019','Rakesh Singh','Savings',52000,'Indore Bhawarkuan','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(20,'ACC10020','Meena Verma','Salary',81000.75,'Jabalpur Wright Town','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(21,'ACC10021','Ajay Thakur','Savings',36000,'Sagar Civil Lines','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(22,'ACC10022','Komal Jain','Current',225000.25,'Bhopal Habibganj','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(23,'ACC10023','Nitin Sharma','Savings',68500.5,'Indore Geeta Bhawan','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(24,'ACC10024','Pankaj Soni','Salary',93000,'Ujjain Nanakheda','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19'),(25,'ACC10025','Shivani Gupta','Savings',74500.75,'Bhopal Kotra','admin','admin','2026-08-18 09:23:19','2026-08-18 09:23:19');
/*!40000 ALTER TABLE `st_bank_account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_book`
--

DROP TABLE IF EXISTS `st_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_book` (
  `id` bigint NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `publicationYear` int DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_book`
--

LOCK TABLES `st_book` WRITE;
/*!40000 ALTER TABLE `st_book` DISABLE KEYS */;
INSERT INTO `st_book` VALUES (1,'Java Programming','James Gosling',550,2020,'admin','admin','2026-08-01 10:00:00','2026-08-01 10:00:00'),(2,'Effective Java','Joshua Bloch',650,2018,'admin','admin','2026-08-01 10:05:00','2026-08-01 10:05:00'),(3,'Clean Code','Robert Martin',720,2008,'admin','admin','2026-08-01 10:10:00','2026-08-01 10:10:00'),(4,'Head First Java','Kathy Sierra',580,2019,'admin','admin','2026-08-01 10:15:00','2026-08-01 10:15:00'),(5,'Spring in Action','Craig Walls',780,2022,'admin','nit@gmail.com','2026-08-01 10:20:00','2026-08-11 12:45:50'),(6,'Hibernate Basics','Christian Bauer',690,2021,'admin','admin','2026-08-01 10:25:00','2026-08-01 10:25:00'),(7,'Mastering SQL','John Smith',450,2020,'admin','admin','2026-08-01 10:30:00','2026-08-01 10:30:00'),(8,'MySQL Essentials','Paul Dubois',520,2019,'admin','admin','2026-08-01 10:35:00','2026-08-01 10:35:00'),(9,'Java Web Development','Herbert Schildt',620,2021,'admin','admin','2026-08-01 10:40:00','2026-08-01 10:40:00'),(10,'Servlet and JSP','Budi Kurniawan',590,2020,'admin','admin','2026-08-01 10:45:00','2026-08-01 10:45:00'),(11,'Maven Guide','Tim OBrien',410,2018,'admin','admin','2026-08-01 10:50:00','2026-08-01 10:50:00'),(12,'Git Essentials','Richard E. Silverman',480,2022,'admin','admin','2026-08-01 10:55:00','2026-08-01 10:55:00'),(13,'Docker Deep Dive','Nigel Poulton',750,2023,'admin','admin','2026-08-01 11:00:00','2026-08-01 11:00:00'),(14,'Jenkins Beginner Guide','John Ferguson',530,2021,'admin','admin','2026-08-01 11:05:00','2026-08-01 11:05:00'),(15,'REST API Design','Mark Masse',610,2020,'admin','admin','2026-08-01 11:10:00','2026-08-01 11:10:00'),(16,'Java Collections','Joshua Bloch',560,2019,'admin','admin','2026-08-01 11:15:00','2026-08-01 11:15:00'),(17,'Data Structures','Narasimha Karumanchi',680,2022,'admin','admin','2026-08-01 11:20:00','2026-08-01 11:20:00'),(18,'Algorithms Made Easy','Narasimha Karumanchi',640,2021,'admin','admin','2026-08-01 11:25:00','2026-08-01 11:25:00'),(19,'Database Management','Raghu Ramakrishnan',710,2020,'admin','admin','2026-08-01 11:30:00','2026-08-01 11:30:00'),(20,'SQL Cookbook','Anthony Molinaro',590,2019,'admin','admin','2026-08-01 11:35:00','2026-08-01 11:35:00'),(21,'Learning Bootstrap','Matt Lambert',430,2022,'admin','admin','2026-08-01 11:40:00','2026-08-01 11:40:00'),(22,'HTML and CSS Basics','Jon Duckett',520,2020,'admin','admin','2026-08-01 11:45:00','2026-08-01 11:45:00'),(23,'JavaScript Guide','David Flanagan',670,2021,'admin','admin','2026-08-01 11:50:00','2026-08-01 11:50:00'),(24,'Software Engineering','Ian Sommerville',820,2020,'admin','admin','2026-08-01 11:55:00','2026-08-01 11:55:00'),(25,'Java Programming+','James Gosling',550,2020,'ADMIN','ADMIN','2026-08-11 14:28:41','2026-08-11 14:28:41');
/*!40000 ALTER TABLE `st_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_college`
--

DROP TABLE IF EXISTS `st_college`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_college` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_college`
--

LOCK TABLES `st_college` WRITE;
/*!40000 ALTER TABLE `st_college` DISABLE KEYS */;
INSERT INTO `st_college` VALUES (1,'JIT Institute','Bypass Road','Madhya Pradesh','Khargone','9999999999','Admin','Admin','2026-07-21 14:47:31','2026-07-21 14:47:31'),(2,'IET DAVV','Khandwa Road','Madhya Pradesh','Indore','9876500002','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(3,'Acropolis Institute','Manglia','Madhya Pradesh','Indore','9876500003','Admin','Nit@gmail.com','2026-07-06 14:35:43','2026-07-23 16:40:58'),(4,'Medicaps University','AB Road','Madhya Pradesh','Indore','9876500004','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(5,'SAGE University','Rau','Madhya Pradesh','Indore','9876500005','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(6,'LNCT University','Kolar Road','Madhya Pradesh','Bhopal','9876500006','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(7,'Oriental College','Ayodhya Bypass','Madhya Pradesh','Bhopal','9876500007','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(8,'RKDF University','Hoshangabad Road','Madhya Pradesh','Bhopal','9876500008','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(9,'Technocrats Institute','Anand Nagar','Madhya Pradesh','Bhopal','9876500009','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(10,'SD Bansal','rau road','mp ','indore','4984844654','root','root','2026-07-10 14:15:37','2026-07-10 14:15:37'),(11,'JEC','Gokalpur','Madhya Pradesh','Jabalpur','9876500011','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(12,'GGITS','Bargi Hills','Madhya Pradesh','Jabalpur','9876500012','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(13,'Hitkarini College','Dumna Road','Madhya Pradesh','Jabalpur','9876500013','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(14,'MITS','Race Course Road','Madhya Pradesh','Gwalior','9876500014','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(15,'ITM University','Jhansi Road','Madhya Pradesh','Gwalior','9876500015','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(16,'Amity University','Maharajpura','Madhya Pradesh','Gwalior','9876500016','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(17,'Prestige Institute','Scheme No 74','Madhya Pradesh','Indore','9876500017','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(18,'Renaissance University','Gram Revti','Madhya Pradesh','Indore','9876500018','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(19,'Chameli Devi Group','Umrikheda','Madhya Pradesh','Indore','9876500019','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(20,'Shri Vaishnav Institute','Sanwer Road','Madhya Pradesh','Indore','9876500020','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(21,'Corporate Institute','Patel Nagar','Madhya Pradesh','Bhopal','9876500021','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(22,'Millennium College','Nehru Nagar','Madhya Pradesh','Bhopal','9876500022','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(23,'Lakshmi Narain College','Kalchuri Nagar','Madhya Pradesh','Jabalpur','9876500023','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),(24,'Global Engineering College','AB Road','Madhya Pradesh','Indore','9876500024','Admin','nit@gmail.com','2026-07-06 14:35:43','2026-08-11 16:04:29');
/*!40000 ALTER TABLE `st_college` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_course`
--

DROP TABLE IF EXISTS `st_course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_course` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `duration` varchar(100) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_course`
--

LOCK TABLES `st_course` WRITE;
/*!40000 ALTER TABLE `st_course` DISABLE KEYS */;
INSERT INTO `st_course` VALUES (1,'Java','OOP, Collection','5 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(2,'Advanced Java','JDBC, Servlet, JSP','4 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(3,'Spring Boot','Spring Boot Framework','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(4,'Hibernate','ORM Framework','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(5,'Python','Python Programming','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(6,'Data Science','Python with Data Science','6 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(7,'Machine Learning','ML Algorithms','5 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(8,'Artificial Intelligence','AI Fundamentals','6 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(9,'Web Development','HTML CSS JavaScript','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(10,'React JS','Frontend Development','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(11,'Angular','Angular Framework','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(12,'Node JS','Backend Development','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(13,'PHP','PHP with MySQL','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(14,'Laravel','PHP Laravel Framework','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(15,'Android','Android App Development','4 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(16,'Flutter','Cross Platform Development','4 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(17,'C Programming','Programming Fundamentals','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(18,'C++','Object Oriented Programming','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(19,'Data Structures','DSA using Java','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(20,'SQL','Database Management','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(21,'MySQL','Relational Database','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(22,'MongoDB','NoSQL Database','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),(23,'DevOps','CI/CD and Docker','5 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20');
/*!40000 ALTER TABLE `st_course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_customer`
--

DROP TABLE IF EXISTS `st_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_customer` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `customerName` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phoneNumber` varchar(20) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_customer`
--

LOCK TABLES `st_customer` WRITE;
/*!40000 ALTER TABLE `st_customer` DISABLE KEYS */;
INSERT INTO `st_customer` VALUES (1,'Rahul Sharma','rahul@gmail.com','9876543236','Bhopal, Madhya Pradesh','ADMIN','nit@gmail.com','2026-08-07 10:59:16','2026-08-07 13:24:31'),(2,'Amit Verma','amit@gmail.com','9876543211','Indore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(3,'Priya Singh','priya@gmail.com','9876543212','Jabalpur, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(4,'Neha Gupta','neha@gmail.com','9876543213','Gwalior, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(5,'Rohit Jain','rohit@gmail.com','9876543214','Ujjain, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(6,'Ankit Patel','ankit@gmail.com','9876543215','Sagar, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(7,'Pooja Mishra','pooja@gmail.com','9876543216','Rewa, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(8,'Vikas Yadav','vikas@gmail.com','9876543217','Satna, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(9,'Sneha Mehta','sneha@gmail.com','9876543218','Dewas, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(10,'Karan Malhotra','karan@gmail.com','9876543219','Ratlam, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(11,'Nitin Sharma','nitin@gmail.com','9876543220','Bhopal, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(12,'Sakshi Tiwari','sakshi@gmail.com','9876543221','Indore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(13,'Manish Dubey','manish@gmail.com','9876543222','Vidisha, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(14,'Kavita Joshi','kavita@gmail.com','9876543223','Sehore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(15,'Deepak Soni','deepak@gmail.com','9876543224','Hoshangabad, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(16,'Riya Agrawal','riya@gmail.com','9876543225','Bhopal, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(17,'Suresh Choudhary','suresh@gmail.com','9876543226','Indore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(18,'Anjali Rathore','anjali@gmail.com','9876543227','Mandsaur, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(19,'Arjun Thakur','arjun@gmail.com','9876543228','Neemuch, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(20,'Meena Kapoor','meena@gmail.com','9876543229','Shivpuri, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(21,'Rakesh Sen','rakesh@gmail.com','9876543230','Berasia, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(22,'Swati Saxena','swati@gmail.com','9876543231','Bhopal, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(23,'Mohit Rajput','mohit@gmail.com','9876543232','Indore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(24,'Komal Sharma','komal@gmail.com','9876543233','Jabalpur, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),(25,'Ajay Singh','ajay@gmail.com','9876543234','Gwalior, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16');
/*!40000 ALTER TABLE `st_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_doctor`
--

DROP TABLE IF EXISTS `st_doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_doctor` (
  `id` bigint NOT NULL,
  `doctorName` varchar(255) DEFAULT NULL,
  `specialization` varchar(255) DEFAULT NULL,
  `experience` int DEFAULT NULL,
  `contactNo` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_doctor`
--

LOCK TABLES `st_doctor` WRITE;
/*!40000 ALTER TABLE `st_doctor` DISABLE KEYS */;
INSERT INTO `st_doctor` VALUES (1,'Dr. Rajesh Sharma','Cardiology',12,'9876543201','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(2,'Dr. Priya Verma','Neurology',10,'9876543202','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(3,'Dr. Amit Singh','Orthopedics',8,'9876543203','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(4,'Dr. Neha Gupta','Dermatology',7,'9876543204','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(5,'Dr. Rohit Mehta','Pediatrics',15,'9876543205','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(6,'Dr. Anjali Kapoor','Gynecology',11,'9876543206','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(7,'Dr. Suresh Yadav','General Medicine',14,'9876543207','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(8,'Dr. Pooja Mishra','ENT',6,'9876543208','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(9,'Dr. Vivek Joshi','Ophthalmology',9,'9876543209','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(10,'Dr. Kavita Rao','Psychiatry',13,'9876543210','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(11,'Dr. Manish Patel','Urology',16,'9876543211','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(12,'Dr. Sneha Jain','Radiology',8,'9876543212','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(13,'Dr. Arjun Malhotra','Gastroenterology',12,'9876543213','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(14,'Dr. Ritu Saxena','Endocrinology',10,'9876543214','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(15,'Dr. Karan Bansal','Pulmonology',9,'9876543215','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(16,'Dr. Meena Choudhary','Oncology',17,'9876543216','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(17,'Dr. Deepak Tiwari','Nephrology',11,'9876543217','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(18,'Dr. Simran Kaur','Rheumatology',7,'9876543218','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(19,'Dr. Nikhil Agarwal','Hematology',14,'9876543219','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(20,'Dr. Swati Kulkarni','Pathology',6,'9876543220','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(21,'Dr. Mohit Srivastava','Plastic Surgery',13,'9876543221','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(22,'Dr. Asha Nair','Dental Surgery',8,'9876543222','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(23,'Dr. Varun Thakur','Neurosurgery',18,'9876543223','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(24,'Dr. Isha Sharma','Emergency Medicine',5,'9876543224','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41'),(25,'Dr. Sameer Khan','General Surgery',15,'9876543225','admin','admin','2026-08-12 11:36:41','2026-08-12 11:36:41');
/*!40000 ALTER TABLE `st_doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_employee`
--

DROP TABLE IF EXISTS `st_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_employee` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `joiningDate` date DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_employee`
--

LOCK TABLES `st_employee` WRITE;
/*!40000 ALTER TABLE `st_employee` DISABLE KEYS */;
INSERT INTO `st_employee` VALUES (1,'Rahul Sharma',95000,'Developer','2022-01-10','ADMIN','abc@gmail.com','2026-08-22 11:47:42','2026-08-22 13:25:42'),(2,'Priya Verma',52000,'Tester','2022-02-15','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(3,'Amit Singh',70000,'Manager','2021-08-20','ADMIN','abc@gmail.com','2026-08-22 11:47:42','2026-08-22 13:20:54'),(4,'Neha Gupta',48000,'HR','2023-01-12','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(5,'Rohit Kumar',55000,'Developer','2022-06-18','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(6,'Anjali Mehta',47000,'Accountant','2023-03-25','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(7,'Vikas Yadav',65000,'Team Lead','2020-11-05','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(8,'Sneha Patel',43000,'Tester','2023-05-14','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(9,'Arjun Sharma',58000,'Developer','2021-09-22','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(10,'Pooja Jain',51000,'HR','2022-12-01','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(11,'Karan Malhotra',70000,'Manager','2020-07-16','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(12,'Riya Kapoor',46000,'Accountant','2023-07-10','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(13,'Suresh Patel',62000,'Developer','2021-04-12','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(14,'Kavita Joshi',49000,'Tester','2022-10-19','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(15,'Manish Gupta',75000,'Team Lead','2019-09-30','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(16,'Simran Kaur',44000,'HR','2023-08-21','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(17,'Deepak Verma',57000,'Developer','2022-04-05','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(18,'Nisha Sharma',53000,'Tester','2021-12-15','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(19,'Mohit Agarwal',68000,'Manager','2020-05-11','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(20,'Swati Singh',45000,'Accountant','2023-09-18','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(21,'Rakesh Mishra',59000,'Developer','2021-06-23','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(22,'Komal Jain',50000,'Tester','2022-08-08','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(23,'Ajay Tiwari',72000,'Team Lead','2019-03-17','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(24,'Meena Gupta',48000,'HR','2023-02-28','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(25,'Varun Saxena',61000,'Developer','2021-10-07','ADMIN','ADMIN','2026-08-22 11:47:42','2026-08-22 11:47:42'),(26,'Nitin Sharma',45000,'Developer','2026-08-22','ADMIN','ADMIN','2026-08-22 13:18:05','2026-08-22 13:18:05');
/*!40000 ALTER TABLE `st_employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_exam`
--

DROP TABLE IF EXISTS `st_exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_exam` (
  `id` bigint NOT NULL,
  `examName` varchar(255) NOT NULL,
  `examDate` date NOT NULL,
  `totalMarks` int NOT NULL,
  `passingMarks` int NOT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_exam`
--

LOCK TABLES `st_exam` WRITE;
/*!40000 ALTER TABLE `st_exam` DISABLE KEYS */;
INSERT INTO `st_exam` VALUES (1,'Java Basics','2026-01-10',100,40,'ADMIN','ADMIN','2026-01-10 09:00:00','2026-01-10 09:00:00'),(2,'Advanced Java','2026-01-15',100,40,'ADMIN','ADMIN','2026-01-15 09:00:00','2026-01-15 09:00:00'),(3,'Servlet & JSP','2026-01-20',100,40,'ADMIN','ADMIN','2026-01-20 09:00:00','2026-01-20 09:00:00'),(4,'Spring Framework','2026-01-25',100,40,'ADMIN','ADMIN','2026-01-25 09:00:00','2026-01-25 09:00:00'),(5,'Hibernate','2026-02-01',100,40,'ADMIN','ADMIN','2026-02-01 09:00:00','2026-02-01 09:00:00'),(6,'MySQL','2026-02-05',100,40,'ADMIN','ADMIN','2026-02-05 09:00:00','2026-02-05 09:00:00'),(7,'Oracle DB','2026-02-10',100,40,'ADMIN','ADMIN','2026-02-10 09:00:00','2026-02-10 09:00:00'),(8,'Python Basics','2026-02-15',100,40,'ADMIN','ADMIN','2026-02-15 09:00:00','2026-02-15 09:00:00'),(9,'Data Structures','2026-02-20',100,40,'ADMIN','ADMIN','2026-02-20 09:00:00','2026-02-20 09:00:00'),(10,'Algorithms','2026-02-25',100,40,'ADMIN','ADMIN','2026-02-25 09:00:00','2026-02-25 09:00:00'),(11,'Operating System','2026-03-01',100,40,'ADMIN','ADMIN','2026-03-01 09:00:00','2026-03-01 09:00:00'),(12,'Computer Network','2026-03-05',100,40,'ADMIN','ADMIN','2026-03-05 09:00:00','2026-03-05 09:00:00'),(13,'Software Engineering','2026-03-10',100,40,'ADMIN','ADMIN','2026-03-10 09:00:00','2026-03-10 09:00:00'),(14,'Cloud Computing','2026-03-15',100,40,'ADMIN','ADMIN','2026-03-15 09:00:00','2026-03-15 09:00:00'),(15,'Artificial Intelligence','2026-03-20',100,40,'ADMIN','ADMIN','2026-03-20 09:00:00','2026-03-20 09:00:00'),(16,'Machine Learning','2026-03-25',100,40,'ADMIN','ADMIN','2026-03-25 09:00:00','2026-03-25 09:00:00'),(17,'Cyber Security','2026-04-01',100,40,'ADMIN','ADMIN','2026-04-01 09:00:00','2026-04-01 09:00:00'),(18,'Web Development','2026-04-05',100,40,'ADMIN','ADMIN','2026-04-05 09:00:00','2026-04-05 09:00:00'),(19,'React JS','2026-04-10',100,40,'ADMIN','ADMIN','2026-04-10 09:00:00','2026-04-10 09:00:00'),(20,'Angular','2026-04-15',100,40,'ADMIN','ADMIN','2026-04-15 09:00:00','2026-04-15 09:00:00'),(21,'Node JS','2026-04-20',100,40,'ADMIN','nit@gmail.com','2026-04-20 09:00:00','2026-08-06 11:15:22'),(22,'DevOps','2026-04-25',100,40,'ADMIN','ADMIN','2026-04-25 09:00:00','2026-04-25 09:00:00'),(23,'Docker','2026-05-01',100,40,'ADMIN','ADMIN','2026-05-01 09:00:00','2026-05-01 09:00:00'),(24,'Kubernetes','2026-05-05',100,40,'ADMIN','ADMIN','2026-05-05 09:00:00','2026-05-05 09:00:00'),(25,'Project Viva','2026-05-10',100,40,'ADMIN','ADMIN','2026-05-10 09:00:00','2026-05-10 09:00:00');
/*!40000 ALTER TABLE `st_exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_faculty`
--

DROP TABLE IF EXISTS `st_faculty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_faculty` (
  `id` bigint NOT NULL,
  `college_id` bigint DEFAULT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `date_of_birth` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_faculty`
--

LOCK TABLES `st_faculty` WRITE;
/*!40000 ALTER TABLE `st_faculty` DISABLE KEYS */;
INSERT INTO `st_faculty` VALUES (2,2,'IET DAVV','Neha','Verma','neha2@gmail.com','9876501002','Indore','Female','1991-02-20 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(3,3,'Acropolis Institute','Rahul','Patel','rahul3@gmail.com','9876501003','Indore','Male','1989-03-18 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(4,4,'Medicaps University','Pooja','Joshi','pooja4@gmail.com','9876501004','Indore','Female','1992-04-12 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(5,5,'SAGE University','Rohit','Yadav','rohit5@gmail.com','9876501005','Indore','Male','1990-05-10 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(6,6,'LNCT University','Anjali','Soni','anjali6@gmail.com','9876501006','Bhopal','Female','1991-06-22 00:00:00','Admin','root@sunilos.com','2026-07-06 14:49:29','2026-07-23 17:16:55'),(7,7,'Oriental College','Vikas','Gupta','vikas7@gmail.com','9876501007','Bhopal','Male','1988-07-14 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(8,8,'RKDF University','Sneha','Mishra','sneha8@gmail.com','9876501008','Bhopal','Female','1993-08-09 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(9,9,'Technocrats Institute','Deepak','Tiwari','deepak9@gmail.com','9876501009','Bhopal','Male','1989-09-17 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(10,10,'Bansal Institute','Priya','Jain','priya10@gmail.com','9876501010','Bhopal','Female','1992-10-08 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(11,11,'JEC','Sandeep','Singh','sandeep11@gmail.com','9876501011','Jabalpur','Male','1987-11-11 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(12,12,'GGITS','Kavita','Dubey','kavita12@gmail.com','9876501012','Jabalpur','Female','1991-12-05 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(13,13,'Hitkarini College','Nitin','Chauhan','nitin13@gmail.com','9876501013','Jabalpur','Male','1990-01-30 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(14,14,'MITS','Ritu','Thakur','ritu14@gmail.com','9876501014','Gwalior','Female','1989-02-15 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(15,15,'ITM University','Mohit','Saxena','mohit15@gmail.com','9876501015','Gwalior','Male','1992-03-19 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(16,16,'Amity University','Swati','Pandey','swati16@gmail.com','9876501016','Gwalior','Female','1993-04-24 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(17,17,'Prestige Institute','Ajay','Rajput','ajay17@gmail.com','9876501017','Indore','Male','1988-05-27 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(18,18,'Renaissance University','Monika','Shukla','monika18@gmail.com','9876501018','Indore','Female','1991-06-06 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(19,19,'Chameli Devi Group','Arun','Mehta','arun19@gmail.com','9876501019','Indore','Male','1990-07-21 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(20,20,'Shri Vaishnav Institute','Reena','Kulkarni','reena20@gmail.com','9876501020','Indore','Female','1992-08-18 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(21,21,'Corporate Institute','Sachin','Tomar','sachin21@gmail.com','9876501021','Bhopal','Male','1989-09-13 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(22,22,'Millennium College','Meena','Choudhary','meena22@gmail.com','9876501022','Bhopal','Female','1991-10-25 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(23,23,'Lakshmi Narain College','Abhishek','Rathore','abhishek23@gmail.com','9876501023','Jabalpur','Male','1988-11-07 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(24,24,'Global Engineering College','Anita','Parmar','anita24@gmail.com','9876501024','Indore','Female','1990-12-16 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(25,25,'SIRT','Manish','Solanki','manish25@gmail.com','9876501025','Bhopal','Male','1993-01-09 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),(26,1,'JIT Institute','Nitin','Sharma','nitin@gmail.com','9876543210','Indore','Male','1998-10-15 00:00:00','Admin','Admin','2026-07-06 16:22:16','2026-07-06 16:22:16');
/*!40000 ALTER TABLE `st_faculty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_library`
--

DROP TABLE IF EXISTS `st_library`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_library` (
  `id` bigint NOT NULL,
  `libraryName` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `totalBooks` int DEFAULT NULL,
  `contactNo` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_library`
--

LOCK TABLES `st_library` WRITE;
/*!40000 ALTER TABLE `st_library` DISABLE KEYS */;
INSERT INTO `st_library` VALUES (1,'Central Library Updated','Indore Updated',6000,'9876543211','ADMIN','ADMIN','2026-08-17 13:02:25','2026-08-17 13:02:25'),(2,'Knowledge Library','Vijay Nagar, Indore',8500,'9876543202','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(3,'Dr APJ Abdul Kalam Library','Bhopal Road, Indore',10200,'9876543203','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(4,'Mahatma Gandhi Library','Palasia, Indore',7600,'9876543204','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(5,'Saraswati Library','Rau, Indore',5400,'9876543205','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(6,'Vivekanand Library','Scheme No 54, Indore',9200,'9876543206','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(7,'Tagore Public Library','Bhawarkua, Indore',6800,'9876543207','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(8,'Digital Knowledge Library','AB Road, Indore',15000,'9876543208','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(9,'Navbharat Library','Rau Main Road, Indore',4300,'9876543209','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(10,'Readers Point Library','Geeta Bhawan, Indore',6100,'9876543210','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(11,'Student Study Library','Bengali Square, Indore',7800,'9876543211','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(12,'Nehru Library','Sapna Sangeeta, Indore',8900,'9876543212','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(13,'Modern Public Library','MR 10 Road, Indore',7200,'9876543213','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(14,'Education Hub Library','Sudama Nagar, Indore',5600,'9876543214','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(15,'Sahitya Library','Ranjeet Hanuman, Indore',4700,'9876543215','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(16,'Future Minds Library','LIG Colony, Indore',8300,'9876543216','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(17,'Gyan Sagar Library','Annapurna Road, Indore',6400,'9876543217','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(18,'Oxford Reading Library','Rau Square, Indore',9500,'9876543218','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(19,'Bharat Knowledge Library','Rajendra Nagar, Indore',5200,'9876543219','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(20,'Youth Library','Khajrana, Indore',6900,'9876543220','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(21,'Sharda Library','Tilak Nagar, Indore',5800,'9876543221','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(22,'Wisdom Library','Kanadia Road, Indore',7400,'9876543222','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(23,'Career Point Library','Bapat Square, Indore',8800,'9876543223','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(24,'Success Library','Rau Bypass, Indore',6300,'9876543224','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(25,'Achievers Library','Silicon City, Indore',11000,'9876543225','admin','admin','2026-08-17 12:45:40','2026-08-17 12:45:40'),(26,'Vatsalya','indore',500,'9746498523','abc@gmail.com','abc@gmail.com','2026-08-17 12:55:34','2026-08-17 12:55:34');
/*!40000 ALTER TABLE `st_library` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_marksheet`
--

DROP TABLE IF EXISTS `st_marksheet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_marksheet` (
  `id` bigint NOT NULL,
  `roll_no` varchar(255) DEFAULT NULL,
  `student_id` bigint DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `physics` int DEFAULT NULL,
  `chemistry` int DEFAULT NULL,
  `maths` int DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_marksheet`
--

LOCK TABLES `st_marksheet` WRITE;
/*!40000 ALTER TABLE `st_marksheet` DISABLE KEYS */;
INSERT INTO `st_marksheet` VALUES (1,'R101',1,'Aarav Sharma',78,82,91,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(2,'R102',2,'Vivaan Verma',65,74,81,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(3,'R103',3,'Aditya Patel',89,92,90,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(4,'R104',4,'Krishna Yadav',56,68,72,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(5,'R105',5,'Rohan Gupta',81,79,84,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(6,'R106',6,'Ananya Singh',95,93,97,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(7,'R107',7,'Priya Jain',72,75,70,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(8,'R108',8,'Sneha Mishra',88,91,89,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(9,'R109',9,'Rahul Tiwari',61,66,73,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(10,'R110',10,'Pooja Joshi',83,86,90,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(11,'R111',11,'Nitin Chauhan',69,72,68,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(12,'R112',12,'Kavita Dubey',92,94,96,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(13,'R113',13,'Deepak Soni',77,81,79,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(14,'R114',14,'Ritu Thakur',58,64,60,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(15,'R115',15,'Mohit Saxena',86,88,91,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(16,'R116',16,'Swati Pandey',90,89,94,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(17,'R117',17,'Ajay Rajput',73,76,78,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(18,'R118',18,'Monika Shukla',84,87,85,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(19,'R119',19,'Arun Mehta',66,71,69,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(20,'R120',20,'Reena Kulkarni',93,95,98,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(21,'R121',21,'Sachin Tomar',74,77,80,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(22,'R122',22,'Meena Choudhary',80,82,84,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(23,'R123',23,'Abhishek Rathore',67,70,72,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(24,'R124',24,'Anita Parmar',91,90,93,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),(25,'R125',25,'Manish Solanki',76,79,81,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18');
/*!40000 ALTER TABLE `st_marksheet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_patient`
--

DROP TABLE IF EXISTS `st_patient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_patient` (
  `id` bigint NOT NULL,
  `patientName` varchar(255) DEFAULT NULL,
  `disease` varchar(255) DEFAULT NULL,
  `doctorName` varchar(255) DEFAULT NULL,
  `admissionDate` date DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_patient`
--

LOCK TABLES `st_patient` WRITE;
/*!40000 ALTER TABLE `st_patient` DISABLE KEYS */;
INSERT INTO `st_patient` VALUES (1,'Rahul Sharma','Fever','Dr. Rajesh Sharma','2026-01-05','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(2,'Amit Verma','Cold','Dr. Priya Singh','2026-01-07','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(3,'Neha Gupta','Diabetes','Dr. Anil Gupta','2026-01-10','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(4,'Pooja Yadav','Migraine','Dr. Sunita Verma','2026-01-12','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(5,'Rohit Sharma','Asthma','Dr. Rajesh Sharma','2026-01-15','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(6,'Sneha Patel','Blood Pressure','Dr. Anil Gupta','2026-01-18','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(7,'Vikas Singh','Fever','Dr. Priya Singh','2026-01-20','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(8,'Anjali Mehta','Thyroid','Dr. Sunita Verma','2026-01-22','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(9,'Manish Kumar','Back Pain','Dr. Rajesh Sharma','2026-01-25','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(10,'Kavita Sharma','Joint Pain','Dr. Anil Gupta','2026-01-28','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(11,'Suresh Patel','Fever','Dr. Priya Singh','2026-02-02','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(12,'Riya Singh','Skin Allergy','Dr. Sunita Verma','2026-02-05','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(13,'Deepak Verma','Gastric Problem','Dr. Rajesh Sharma','2026-02-08','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(14,'Nisha Gupta','Anemia','Dr. Anil Gupta','2026-02-10','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(15,'Arjun Yadav','Cough','Dr. Priya Singh','2026-02-12','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(16,'Simran Kaur','Viral Infection','Dr. Sunita Verma','2026-02-15','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(17,'Karan Malhotra','Stomach Pain','Dr. Rajesh Sharma','2026-02-18','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(18,'Priya Sharma','Migraine','Dr. Anil Gupta','2026-02-20','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(19,'Mohit Jain','Diabetes','Dr. Priya Singh','2026-02-22','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(20,'Aarti Verma','Thyroid','Dr. Sunita Verma','2026-02-25','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(21,'Nitin Sharma','Blood Pressure','Dr. Rajesh Sharma','2026-03-01','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(22,'Komal Singh','Cold','Dr. Anil Gupta','2026-03-04','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(23,'Rakesh Gupta','Asthma','Dr. Priya Singh','2026-03-07','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(24,'Meena Patel','Fever','Dr. Sunita Verma','2026-03-10','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22'),(25,'Vivek Kumar','Back Pain','Dr. Rajesh Sharma','2026-03-12','ADMIN','ADMIN','2026-08-14 10:55:22','2026-08-14 10:55:22');
/*!40000 ALTER TABLE `st_patient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_role`
--

DROP TABLE IF EXISTS `st_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_role` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` timestamp NULL DEFAULT NULL,
  `modified_datetime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_role`
--

LOCK TABLES `st_role` WRITE;
/*!40000 ALTER TABLE `st_role` DISABLE KEYS */;
INSERT INTO `st_role` VALUES (1,'Admin','Administrator Role','Admin','Admin','2014-07-19 11:43:36','2014-07-19 11:43:36'),(2,'Student','Student Role','Rahulst_role Sahu','Rahul Sahu','2014-07-19 11:49:09','2014-07-19 11:49:09'),(3,'College','College Role','Rahul Sahu','Rahul Sahu','2014-07-19 11:49:30','2014-07-19 11:49:30'),(4,'KIOSK','KIOSK Role','Rahul Sahu','Rahul Sahu','2014-07-19 11:49:48','2014-07-19 11:49:48');
/*!40000 ALTER TABLE `st_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_service`
--

DROP TABLE IF EXISTS `st_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_service` (
  `id` bigint NOT NULL,
  `serviceName` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `serviceCategory` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_service`
--

LOCK TABLES `st_service` WRITE;
/*!40000 ALTER TABLE `st_service` DISABLE KEYS */;
INSERT INTO `st_service` VALUES (1,'AC Repair',500,'AC repair and maintenance service','Home Service','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(2,'AC Installation',1200,'AC installation service','Home Service','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(3,'Plumbing',350,'General plumbing service','Home Service','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(4,'Electrician',400,'Electrical repair service','Home Service','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(5,'Car Washing',500,'Complete car washing service','Automobile','ADMIN','abc@gmail.com','2026-08-21 12:35:47','2026-08-21 12:50:05'),(6,'Bike Servicing',600,'Bike servicing and maintenance','Automobile','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(7,'Car Servicing',1500,'Complete car servicing','Automobile','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(8,'Laptop Repair',800,'Laptop hardware repair service','Electronics','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(9,'Mobile Repair',500,'Mobile phone repair service','Electronics','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(10,'TV Repair',700,'LED and LCD TV repair','Electronics','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(11,'Washing Machine Repair',650,'Washing machine repair service','Appliance','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(12,'Refrigerator Repair',750,'Refrigerator repair service','Appliance','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(13,'Microwave Repair',450,'Microwave oven repair service','Appliance','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(14,'House Cleaning',900,'Complete house cleaning service','Cleaning','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(15,'Bathroom Cleaning',500,'Bathroom deep cleaning service','Cleaning','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(16,'Kitchen Cleaning',600,'Kitchen deep cleaning service','Cleaning','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(17,'Pest Control',1000,'Home pest control service','Cleaning','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(18,'Painting',2500,'Interior and exterior painting','Home Improvement','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(19,'Carpenter',700,'Furniture and woodwork service','Home Improvement','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(20,'RO Service',450,'RO water purifier servicing','Appliance','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(21,'Computer Repair',900,'Desktop computer repair service','Electronics','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(22,'Printer Repair',550,'Printer repair and maintenance','Electronics','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(23,'CCTV Installation',1800,'CCTV camera installation service','Security','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(24,'Internet Setup',400,'WiFi and internet setup service','Networking','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47'),(25,'Solar Panel Service',2000,'Solar panel maintenance service','Energy','ADMIN','ADMIN','2026-08-21 12:35:47','2026-08-21 12:35:47');
/*!40000 ALTER TABLE `st_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_smartparking`
--

DROP TABLE IF EXISTS `st_smartparking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_smartparking` (
  `id` bigint NOT NULL,
  `parkingCode` varchar(255) DEFAULT NULL,
  `vehicleNumber` varchar(255) DEFAULT NULL,
  `slotNumber` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_smartparking`
--

LOCK TABLES `st_smartparking` WRITE;
/*!40000 ALTER TABLE `st_smartparking` DISABLE KEYS */;
INSERT INTO `st_smartparking` VALUES (1,'PK001','MP09AB1234','S01','Available','Admin','nit@gmail.com','2026-07-21 14:58:44','2026-07-27 13:13:12'),(2,'PK002','MP09CD2345','S02','Reserved','Admin','nit@gmail.com','2026-07-21 14:58:44','2026-07-23 17:27:56'),(3,'PK003','MP09EF3456','S03','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(4,'PK004','MP09GH4567','S04','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(5,'PK005','MP09IJ5678','S05','Available','Admin','Nit@gmail.com','2026-07-21 14:58:44','2026-07-23 17:17:07'),(6,'PK006','MP09KL6789','S06','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(7,'PK007','MP09MN7890','S07','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(8,'PK008','MP09OP8901','S08','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(9,'PK009','MP09QR9012','S09','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(10,'PK010','MP09ST0123','S10','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(11,'PK011','MP09UV1235','S11','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(12,'PK012','MP09WX2346','S12','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(13,'PK013','MP09YZ3457','S13','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(14,'PK014','MP10AB4568','S14','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(15,'PK015','MP10CD5679','S15','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(16,'PK016','MP10EF6780','S16','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(17,'PK017','MP10GH7891','S17','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(18,'PK018','MP10IJ8902','S18','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(19,'PK019','MP10KL9013','S19','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(20,'PK020','MP10MN0124','S20','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(21,'PK021','MP10OP1236','S21','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(22,'PK022','MP10QR2347','S22','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(23,'PK023','MP10ST3458','S23','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(24,'PK024','MP10UV4569','S24','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(25,'PK025','MP10WX5670','S25','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),(26,'PK026','mp13zb8745','S026','Available','nit@gmail.com','nit@gmail.com','2026-07-27 13:12:48','2026-07-27 13:12:48');
/*!40000 ALTER TABLE `st_smartparking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_student`
--

DROP TABLE IF EXISTS `st_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_student` (
  `id` bigint NOT NULL,
  `college_id` bigint DEFAULT NULL,
  `college_name` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `date_of_birth` datetime DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_student`
--

LOCK TABLES `st_student` WRITE;
/*!40000 ALTER TABLE `st_student` DISABLE KEYS */;
INSERT INTO `st_student` VALUES (2,2,'IET DAVV','Vivaan','Verma','2002-02-18 00:00:00','9876501002','vivaan2@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(3,3,'Acropolis Institute','Aditya','Patel','2002-03-20 00:00:00','9876501003','aditya3@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(4,4,'Medicaps University','Krishna','Yadav','2002-04-12 00:00:00','9876501004','krishna4@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(5,5,'SAGE University','Rohan','Gupta','2002-05-25 00:00:00','9876501005','rohan5@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(6,6,'LNCT University','Ananya','Singh','2002-06-10 00:00:00','9876501006','ananya6@gmail.com','Admin','root@sunilos.com','2026-07-07 12:00:00','2026-07-23 17:16:37'),(7,7,'Oriental College','Priya','Jain','2002-07-16 00:00:00','9876501007','priya7@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(8,8,'RKDF University','Sneha','Mishra','2002-08-22 00:00:00','9876501008','sneha8@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(9,9,'Technocrats Institute','Rahul','Tiwari','2002-09-09 00:00:00','9876501009','rahul9@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(10,10,'Bansal Institute','Pooja','Joshi','2002-10-14 00:00:00','9876501010','pooja10@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(11,11,'JEC','Nitin','Chauhan','2002-11-11 00:00:00','9876501011','nitin11@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(12,12,'GGITS','Kavita','Dubey','2002-12-01 00:00:00','9876501012','kavita12@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(13,13,'Hitkarini College','Deepak','Soni','2002-01-19 00:00:00','9876501013','deepak13@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(14,14,'MITS','Ritu','Thakur','2002-02-27 00:00:00','9876501014','ritu14@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(15,15,'ITM University','Mohit','Saxena','2002-03-08 00:00:00','9876501015','mohit15@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(16,16,'Amity University','Swati','Pandey','2002-04-17 00:00:00','9876501016','swati16@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(17,17,'Prestige Institute','Ajay','Rajput','2002-05-13 00:00:00','9876501017','ajay17@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(18,18,'Renaissance University','Monika','Shukla','2002-06-18 00:00:00','9876501018','monika18@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(19,19,'Chameli Devi Group','Arun','Mehta','2002-07-26 00:00:00','9876501019','arun19@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(20,20,'Shri Vaishnav Institute','Reena','Kulkarni','2002-08-05 00:00:00','9876501020','reena20@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(21,21,'Corporate Institute','Sachin','Tomar','2002-09-12 00:00:00','9876501021','sachin21@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(22,22,'Millennium College','Meena','Choudhary','2002-10-20 00:00:00','9876501022','meena22@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(23,23,'Lakshmi Narain College','Abhishek','Rathore','2002-11-15 00:00:00','9876501023','abhishek23@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(24,24,'Global Engineering College','Anita','Parmar','2002-12-09 00:00:00','9876501024','anita24@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(25,25,'SIRT','Manish','Solanki','2002-01-30 00:00:00','9876501025','manish25@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),(26,1,'JIT Institute','Nitin','Sharma','2002-05-15 00:00:00','9876543210','nitin@gmail.com','root@sunilos.com','root@sunilos.com','2026-07-07 12:18:59','2026-07-07 12:18:59');
/*!40000 ALTER TABLE `st_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_subject`
--

DROP TABLE IF EXISTS `st_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_subject` (
  `id` bigint NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `course_id` bigint DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_subject`
--

LOCK TABLES `st_subject` WRITE;
/*!40000 ALTER TABLE `st_subject` DISABLE KEYS */;
INSERT INTO `st_subject` VALUES (1,'Java Basics','Introduction to Java Programming',1,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(2,'OOP Concepts','Object Oriented Programming',2,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(3,'Spring Core','Spring Framework Basics',3,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(4,'Hibernate ORM','Hibernate Mapping',4,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(5,'Python Basics','Introduction to Python',5,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(6,'Data Analysis','Data Analysis using Python',6,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(7,'ML Algorithms','Machine Learning Fundamentals',7,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(8,'AI Concepts','Artificial Intelligence Basics',8,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(9,'HTML & CSS','Web Page Designing',9,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(10,'React Components','React JS Fundamentals',10,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(11,'Angular Modules','Angular Development',11,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(12,'Node Express','Backend with Express JS',12,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(13,'PHP Basics','PHP Programming',13,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(14,'Laravel MVC','Laravel Framework',14,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(15,'Android UI','Android Application Development',15,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(16,'Flutter Widgets','Flutter Mobile Apps',16,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(17,'C Language','Programming with C',17,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(18,'C++ STL','Standard Template Library',18,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(19,'Data Structures','DSA Concepts',19,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(20,'SQL Queries','Database Query Language',20,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(21,'MySQL Administration','MySQL Database Management',21,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(22,'MongoDB CRUD','MongoDB Operations',22,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(23,'Docker Basics','Docker Containers',23,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(24,'AWS EC2','Amazon EC2 Services',24,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(25,'Network Security','Cyber Security Fundamentals',25,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),(26,'Advanced Java','JDBC, Servlet, JSP',1,'root@sunilos.com','root@sunilos.com','2026-07-07 11:55:04','2026-07-07 11:55:04'),(27,'Java','Java Programming Language',1,'root@sunilos.com','root@sunilos.com','2026-07-07 11:56:23','2026-07-07 11:56:23');
/*!40000 ALTER TABLE `st_subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_user`
--

DROP TABLE IF EXISTS `st_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_user` (
  `id` bigint NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `dob` datetime DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `role_id` bigint DEFAULT NULL,
  `unsuccessful_login` int DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `last_login` datetime DEFAULT NULL,
  `user_lock` varchar(255) DEFAULT NULL,
  `registered_ip` varchar(255) DEFAULT NULL,
  `last_login_ip` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  `PHOTO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_user`
--

LOCK TABLES `st_user` WRITE;
/*!40000 ALTER TABLE `st_user` DISABLE KEYS */;
INSERT INTO `st_user` VALUES (1,'Nitin','Sharma','abc@gmail.com','abc123','1987-09-10 00:00:00',NULL,1,0,'M',NULL,'Inactive',NULL,NULL,'root','abc@gmail.com','2026-07-17 17:12:20','2026-08-12 16:53:19','Screenshot (2).png'),(2,'Rahul','Verma','rahul02@gmail.com','pass123','1997-03-10 00:00:00','9876543211',2,1,'Male','2026-07-01 09:30:00','N','192.168.1.2','192.168.1.11','Admin','Admin','2026-01-02 09:00:00','2026-07-01 09:30:00',''),(3,'Priya','Patel','priya03@gmail.com','pass123','1999-05-18 00:00:00','9876543212',2,0,'Female','2026-07-01 11:00:00','N','192.168.1.3','192.168.1.12','Admin','Admin','2026-01-03 09:00:00','2026-07-01 11:00:00',NULL),(4,'Amit','Singh','amit04@gmail.com','pass123','1995-07-21 00:00:00','9876543213',3,2,'Male','2026-07-01 12:20:00','Y','192.168.1.4','192.168.1.13','Admin','System','2026-01-04 09:00:00','2026-07-01 12:20:00','Screenshot (2).png'),(5,'Neha','Joshi','neha05@gmail.com','pass123','1998-11-11 00:00:00',NULL,3,0,'F',NULL,'Inactive',NULL,NULL,'Admin','abc@gmail.com','2026-01-05 09:00:00','2026-08-18 11:38:54','UserImage.png'),(6,'Rohit','Gupta','rohit06@gmail.com','pass123','1996-09-12 00:00:00','9876543215',3,1,'Male','2026-07-01 07:45:00','N','192.168.1.6','192.168.1.15','Admin','Admin','2026-01-06 09:00:00','2026-07-01 07:45:00',NULL),(7,'Pooja','Yadav','pooja07@gmail.com','pass123','1997-06-09 00:00:00','9876543216',2,0,'Female','2026-07-01 10:45:00','N','192.168.1.7','192.168.1.16','Admin','Admin','2026-01-07 09:00:00','2026-07-01 10:45:00',NULL),(8,'Suresh','Jain','suresh08@gmail.com','pass123','1994-08-19 00:00:00','9876543217',2,0,'Male','2026-07-01 09:50:00','N','192.168.1.8','192.168.1.17','Admin','Admin','2026-01-08 09:00:00','2026-07-01 09:50:00',NULL),(9,'ram','Joshi','ram25@gmail.com','pass123','1996-08-03 00:00:00','9876543234',2,2,'Male','2026-07-01 07:35:00','Y','192.168.1.25','192.168.1.34','root','root','2026-07-03 12:46:38','2026-07-03 12:46:38',NULL),(10,'Vikas','Chauhan','vikas10@gmail.com','pass123','1998-04-30 00:00:00','9876543219',2,0,'Male','2026-07-01 09:15:00','N','192.168.1.10','192.168.1.19','Admin','Admin','2026-01-10 09:00:00','2026-07-01 09:15:00',NULL),(11,'krishna','dongre','krishna@gmail.com','123','2008-12-11 00:00:00',NULL,2,0,'M',NULL,'Inactive',NULL,NULL,'root','root','2026-08-14 22:40:30','2026-08-14 22:40:30',NULL),(12,'Harshit','Panchal','harshitpanchal.ind@gmail.com','123','2008-12-09 00:00:00',NULL,3,0,'M',NULL,'Inactive',NULL,NULL,'abc@gmail.com','abc@gmail.com','2026-08-17 17:57:51','2026-08-17 17:57:51',NULL);
/*!40000 ALTER TABLE `st_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_vehicle`
--

DROP TABLE IF EXISTS `st_vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_vehicle` (
  `id` bigint NOT NULL,
  `vehicleName` varchar(255) DEFAULT NULL,
  `modelName` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_vehicle`
--

LOCK TABLES `st_vehicle` WRITE;
/*!40000 ALTER TABLE `st_vehicle` DISABLE KEYS */;
INSERT INTO `st_vehicle` VALUES (1,'Toyota Camry','2024','White',2850000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(2,'Honda City','2024','Black',1650000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(3,'Hyundai Creta','2024','Red',1850000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(4,'Maruti Swift','2024','Blue',950000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(5,'Tata Nexon',NULL,'Grey',1250000,'admin','nit@gmail.com','2026-08-10 12:24:57','2026-08-10 14:45:21'),(6,'Mahindra Thar','2024','Black',1750000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(7,'Kia Seltos','2024','White',1780000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(8,'Hyundai Verna','2024','Silver',1550000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(9,'Tata Harrier','2024','Green',2200000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(10,'Mahindra Scorpio','2024','White',2350000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(11,'Honda Amaze','2024','Grey',1150000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(12,'Maruti Baleno','2024','Blue',980000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(13,'Kia Sonet','2024','Red',1350000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(14,'Toyota Fortuner','2024','Black',4250000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(15,'Hyundai Venue','2024','White',1250000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(16,'Tata Punch','2024','Orange',900000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(17,'Renault Kiger','2024','Silver',1050000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(18,'Nissan Magnite','2024','Blue',1000000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(19,'Volkswagen Virtus','2024','Black',1850000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(20,'Skoda Slavia','2024','White',1900000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(21,'MG Hector','2024','Red',2250000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(22,'Jeep Compass','2024','Grey',2800000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(23,'Citroen C3','2024','Yellow',850000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(24,'Maruti Brezza','2024','Brown',1350000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57'),(25,'Hyundai i20','2024','Blue',1100000,'admin','admin','2026-08-10 12:24:57','2026-08-10 12:24:57');
/*!40000 ALTER TABLE `st_vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `st_vendor`
--

DROP TABLE IF EXISTS `st_vendor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `st_vendor` (
  `id` bigint NOT NULL,
  `vendorName` varchar(255) DEFAULT NULL,
  `mobileNo` varchar(20) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `serviceType` varchar(255) DEFAULT NULL,
  `CREATED_BY` varchar(255) DEFAULT NULL,
  `MODIFIED_BY` varchar(255) DEFAULT NULL,
  `CREATED_DATETIME` datetime DEFAULT NULL,
  `MODIFIED_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `st_vendor`
--

LOCK TABLES `st_vendor` WRITE;
/*!40000 ALTER TABLE `st_vendor` DISABLE KEYS */;
INSERT INTO `st_vendor` VALUES (1,'Sharma Electricals','9876543210','Bhopal, Madhya Pradesh','Electrical','admin','admin','2026-01-05 10:15:00','2026-01-05 10:15:00'),(2,'Gupta Hardware','9876543211','Indore, Madhya Pradesh','Hardware','admin','admin','2026-01-06 11:20:00','2026-01-06 11:20:00'),(3,'Verma Plumbing','9876543212','Indore, Madhya Pradesh','Plumbing','admin','abc@gmail.com','2026-01-07 09:30:00','2026-08-21 11:33:37'),(4,'Patel Furniture','9876543213','Gwalior, Madhya Pradesh','Furniture','admin','admin','2026-01-08 12:10:00','2026-01-08 12:10:00'),(5,'Singh Electronics','9876543214','Ujjain, Madhya Pradesh','Electronics','admin','admin','2026-01-09 14:25:00','2026-01-09 14:25:00'),(6,'Raj Traders','9876543215','Sagar, Madhya Pradesh','General Supply','admin','admin','2026-01-10 10:45:00','2026-01-10 10:45:00'),(7,'Shree Security Services','9876543216','Bhopal, Madhya Pradesh','Security','admin','admin','2026-01-11 11:15:00','2026-01-11 11:15:00'),(8,'Agarwal Stationery','9876543217','Indore, Madhya Pradesh','Stationery','admin','admin','2026-01-12 09:50:00','2026-01-12 09:50:00'),(9,'Mehta Cleaning Services','9876543218','Ratlam, Madhya Pradesh','Cleaning','admin','admin','2026-01-13 13:35:00','2026-01-13 13:35:00'),(10,'Khan Transport','9876543219','Bhopal, Madhya Pradesh','Transport','admin','admin','2026-01-14 15:10:00','2026-01-14 15:10:00'),(11,'Mishra IT Solutions','9876543220','Indore, Madhya Pradesh','IT Services','admin','admin','2026-01-15 10:20:00','2026-01-15 10:20:00'),(12,'Rana Catering','9876543221','Jabalpur, Madhya Pradesh','Catering','admin','admin','2026-01-16 12:40:00','2026-01-16 12:40:00'),(13,'Joshi Printers','9876543222','Gwalior, Madhya Pradesh','Printing','admin','admin','2026-01-17 11:30:00','2026-01-17 11:30:00'),(14,'Yadav Construction','9876543223','Sagar, Madhya Pradesh','Construction','admin','admin','2026-01-18 09:15:00','2026-01-18 09:15:00'),(15,'Malhotra Chemicals','9876543224','Bhopal, Madhya Pradesh','Chemicals','admin','admin','2026-01-19 14:00:00','2026-01-19 14:00:00'),(16,'Chauhan Auto Parts','9876543225','Ujjain, Madhya Pradesh','Auto Parts','admin','admin','2026-01-20 10:35:00','2026-01-20 10:35:00'),(17,'Soni Medical Supplies','9876543226','Indore, Madhya Pradesh','Medical Supplies','admin','admin','2026-01-21 13:20:00','2026-01-21 13:20:00'),(18,'Tiwari Garden Services','9876543227','Bhopal, Madhya Pradesh','Gardening','admin','admin','2026-01-22 11:45:00','2026-01-22 11:45:00'),(19,'Deshmukh Water Supply','9876543228','Dewas, Madhya Pradesh','Water Supply','admin','admin','2026-01-23 09:40:00','2026-01-23 09:40:00'),(20,'Kapoor Logistics','9876543229','Indore, Madhya Pradesh','Logistics','admin','admin','2026-01-24 15:25:00','2026-01-24 15:25:00'),(21,'Thakur Air Conditioning','9876543230','Bhopal, Madhya Pradesh','AC Maintenance','admin','admin','2026-01-25 10:10:00','2026-01-25 10:10:00'),(22,'Bansal Office Solutions','9876543231','Jabalpur, Madhya Pradesh','Office Equipment','admin','admin','2026-01-26 12:15:00','2026-01-26 12:15:00'),(23,'Pawar Fabrication','9876543232','Sagar, Madhya Pradesh','Fabrication','admin','admin','2026-01-27 14:30:00','2026-01-27 14:30:00'),(24,'Rathore Pest Control','9876543233','Ujjain, Madhya Pradesh','Pest Control','admin','admin','2026-01-28 11:00:00','2026-01-28 11:00:00'),(25,'Shukla Internet Services','9876543234','Gwalior, Madhya Pradesh','Internet Services','admin','admin','2026-01-29 09:25:00','2026-01-29 09:25:00'),(26,'Ramji','9876543234','indore','Pest Control','abc@gmail.com','abc@gmail.com','2026-08-19 18:22:16','2026-08-19 18:22:16');
/*!40000 ALTER TABLE `st_vendor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voice_command`
--

DROP TABLE IF EXISTS `voice_command`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `voice_command` (
  `id` bigint NOT NULL,
  `commandCode` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `commandText` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voice_command`
--

LOCK TABLES `voice_command` WRITE;
/*!40000 ALTER TABLE `voice_command` DISABLE KEYS */;
INSERT INTO `voice_command` VALUES (1,'VC001','Nitin Sharma','Turn Off Light','Inactive','Admin','Admin','2026-07-24 13:55:06','2026-07-24 13:55:06'),(2,'VC002','Priya','Turn off fan','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(3,'VC003','Rahul','Play music','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(4,'VC004','Sneha','Open garage','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(5,'VC005','Rohan','Close garage','Failed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(6,'VC006','Anjali','Increase volume','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(7,'VC007','Vikram','Decrease volume','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(8,'VC008','Neha','Set alarm 7 AM','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(9,'VC009','Karan','Lock doors','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(10,'VC010','Meera','Unlock doors','Failed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(11,'VC011','Arjun','Turn on AC','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(12,'VC012','Pooja','Turn off AC','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(13,'VC013','Amit','Start vacuum cleaner','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(14,'VC014','Kavita','Stop vacuum cleaner','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(15,'VC015','Sanjay','Open curtains','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(16,'VC016','Divya','Close curtains','Failed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(17,'VC017','Manish','Read notifications','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(18,'VC018','Ritika','Check weather','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(19,'VC019','Nikhil','Call emergency contact','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(20,'VC020','Simran','Send message','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(21,'VC021','Deepak','Enable WiFi','Failed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(22,'VC022','Shreya','Disable WiFi','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(23,'VC023','Yash','Open browser','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),(24,'VC024','Isha','Shutdown system','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59');
/*!40000 ALTER TABLE `voice_command` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `water_monitoring`
--

DROP TABLE IF EXISTS `water_monitoring`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `water_monitoring` (
  `id` bigint NOT NULL,
  `waterCode` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `waterLevel` double DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `water_monitoring`
--

LOCK TABLES `water_monitoring` WRITE;
/*!40000 ALTER TABLE `water_monitoring` DISABLE KEYS */;
INSERT INTO `water_monitoring` VALUES (1,'WM001','Bhopal Lake',78.5,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(3,'WM003','Ujjain River',65.8,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(4,'WM004','Gwalior Reservoir',45.2,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(5,'WM005','Jabalpur Canal',81.6,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(6,'WM006','Sagar Dam',95.4,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(7,'WM007','Rewa Lake',52.9,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(8,'WM008','Satna River',74.3,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(9,'WM009','Dewas Tank',88.7,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(10,'WM010','Ratlam Canal',61.5,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(11,'WM011','Sehore Dam',47.8,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(12,'WM012','Vidisha Lake',82.1,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(13,'WM013','Hoshangabad River',97.2,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(14,'WM014','Betul Reservoir',58.4,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(15,'WM015','Shivpuri Dam',76.9,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(16,'WM016','Neemuch Canal',91.8,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(17,'WM017','Mandsaur Lake',49.6,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(18,'WM018','Khargone River',69.5,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(19,'WM019','Chhindwara Dam',86.4,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(20,'WM020','Khandwa Lake',55.3,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(21,'WM021','Burhanpur Canal',79.8,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(22,'WM022','Panna Reservoir',93.7,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(23,'WM023','Damoh River',43.9,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(24,'WM024','Katni Lake',73.2,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(25,'WM025','Tikamgarh Dam',84.5,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),(26,'WM026','indore',74.2,'Normal','nit@gmail.com','nit@gmail.com','2026-07-30 16:05:30','2026-07-30 16:07:09');
/*!40000 ALTER TABLE `water_monitoring` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weather_alert`
--

DROP TABLE IF EXISTS `weather_alert`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `weather_alert` (
  `id` bigint NOT NULL,
  `alertCode` varchar(255) DEFAULT NULL,
  `cityName` varchar(255) DEFAULT NULL,
  `temperature` double DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `modified_by` varchar(255) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weather_alert`
--

LOCK TABLES `weather_alert` WRITE;
/*!40000 ALTER TABLE `weather_alert` DISABLE KEYS */;
INSERT INTO `weather_alert` VALUES (1,'WA001','Delhi',38.5,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(2,'WA002','Mumbai',31.2,'Humid','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(3,'WA003','Bhopal',34.7,'Warm','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(4,'WA004','Indore',36.1,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(5,'WA005','Jaipur',40.3,'Extreme Heat','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(6,'WA006','Lucknow',35.4,'Warm','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(7,'WA007','Kanpur',37.6,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(8,'WA008','Patna',33.8,'Cloudy','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(9,'WA009','Chennai',32.5,'Humid','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(10,'WA010','Hyderabad',30.9,'Pleasant','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(11,'WA011','Pune',27.8,'Rain Alert','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(12,'WA012','Nagpur',39.2,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(13,'WA013','Surat',31.7,'Humid','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(14,'WA014','Ahmedabad',41,'Extreme Heat','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(15,'WA015','Kolkata',32.8,'Rain Alert','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(16,'WA016','Ranchi',28.6,'Cloudy','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(17,'WA017','Raipur',35.9,'Warm','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(18,'WA018','Shimla',19.4,'Cold','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(19,'WA019','Srinagar',16.8,'Cold','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(20,'WA020','Dehradun',24.9,'Pleasant','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(21,'WA021','Goa',29.7,'Rain Alert','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(22,'WA022','Amritsar',33.1,'Warm','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(23,'WA023','Varanasi',36.8,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(24,'WA024','Guwahati',27.4,'Rain Alert','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(25,'WA025','Jodhpur',42.2,'Extreme Heat','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),(26,'WA026','INDORE',38.4,'Warm','Nit@gmail.com','Nit@gmail.com','2026-07-23 14:36:03','2026-07-23 14:36:03');
/*!40000 ALTER TABLE `weather_alert` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-08-25 13:34:25
