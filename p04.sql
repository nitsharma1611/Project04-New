/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.46 : Database - p04
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`p04` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `p04`;

/*Table structure for table `ai_recommendation` */

DROP TABLE IF EXISTS `ai_recommendation`;

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

/*Data for the table `ai_recommendation` */

insert  into `ai_recommendation`(`id`,`recommendationCode`,`userName`,`recommendationType`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'REC001','Amit Sharma','Product','Approved','ADMIN','nit@gmail.com','2026-08-01 09:00:00','2026-08-04 17:30:12'),
(2,'REC002','Priya Verma','Service','Approved','ADMIN','ADMIN','2026-08-01 09:15:00','2026-08-01 09:15:00'),
(3,'REC003','Rahul Singh','Career','Rejected','ADMIN','ADMIN','2026-08-01 09:30:00','2026-08-01 09:30:00'),
(4,'REC004','Sneha Patel','Education','Pending','ADMIN','ADMIN','2026-08-01 09:45:00','2026-08-01 09:45:00'),
(5,'REC005','Vikas Gupta','Health','Approved','ADMIN','ADMIN','2026-08-01 10:00:00','2026-08-01 10:00:00'),
(6,'REC006','Neha Jain','Product','Pending','ADMIN','ADMIN','2026-08-01 10:15:00','2026-08-01 10:15:00'),
(7,'REC007','Rohit Mehta','Service','Approved','ADMIN','ADMIN','2026-08-01 10:30:00','2026-08-01 10:30:00'),
(8,'REC008','Anjali Yadav','Career','Rejected','ADMIN','ADMIN','2026-08-01 10:45:00','2026-08-01 10:45:00'),
(9,'REC009','Karan Joshi','Education','Pending','ADMIN','ADMIN','2026-08-01 11:00:00','2026-08-01 11:00:00'),
(10,'REC010','Pooja Mishra','Health','Approved','ADMIN','ADMIN','2026-08-01 11:15:00','2026-08-01 11:15:00'),
(11,'REC011','Arjun Kapoor','Product','Rejected','ADMIN','ADMIN','2026-08-01 11:30:00','2026-08-01 11:30:00'),
(12,'REC012','Meera Nair','Service','Pending','ADMIN','ADMIN','2026-08-01 11:45:00','2026-08-01 11:45:00'),
(13,'REC013','Sanjay Kumar','Career','Approved','ADMIN','ADMIN','2026-08-01 12:00:00','2026-08-01 12:00:00'),
(14,'REC014','Riya Sharma','Education','Pending','ADMIN','ADMIN','2026-08-01 12:15:00','2026-08-01 12:15:00'),
(15,'REC015','Deepak Soni','Health','Rejected','ADMIN','ADMIN','2026-08-01 12:30:00','2026-08-01 12:30:00'),
(16,'REC016','Nisha Arora','Product','Approved','ADMIN','ADMIN','2026-08-01 12:45:00','2026-08-01 12:45:00'),
(17,'REC017','Manoj Tiwari','Service','Pending','ADMIN','ADMIN','2026-08-01 13:00:00','2026-08-01 13:00:00'),
(18,'REC018','Komal Shah','Career','Approved','ADMIN','ADMIN','2026-08-01 13:15:00','2026-08-01 13:15:00'),
(19,'REC019','Aditya Rao','Education','Rejected','ADMIN','ADMIN','2026-08-01 13:30:00','2026-08-01 13:30:00'),
(20,'REC020','Simran Kaur','Health','Pending','ADMIN','ADMIN','2026-08-01 13:45:00','2026-08-01 13:45:00'),
(21,'REC021','Harsh Agrawal','Product','Approved','ADMIN','ADMIN','2026-08-01 14:00:00','2026-08-01 14:00:00'),
(22,'REC022','Isha Malhotra','Service','Rejected','ADMIN','ADMIN','2026-08-01 14:15:00','2026-08-01 14:15:00'),
(23,'REC023','Yash Chauhan','Career','Pending','ADMIN','ADMIN','2026-08-01 14:30:00','2026-08-01 14:30:00'),
(24,'REC024','Kavita Singh','Education','Approved','ADMIN','ADMIN','2026-08-01 14:45:00','2026-08-01 14:45:00'),
(25,'REC026','Nitin Sharma','Education','Approved','nit@gmail.com','nit@gmail.com','2026-08-04 12:20:47','2026-08-04 12:20:47');

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

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

/*Data for the table `department` */

insert  into `department`(`id`,`departmentName`,`hodName`,`totalFaculty`,`location`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'Computer Science','Dr. Amit Sharma',25,'Block A','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(2,'Information Technology','Dr. Neha Verma',20,'Block B','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(3,'Mechanical Engineering','Dr. Rajesh Singh',18,'Block C','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(4,'Civil Engineering','Dr. Pooja Mishra',22,'Block D','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(5,'Electrical Engineering','Dr. Suresh Patel',19,'Block E','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(6,'Electronics Engineering','Dr. Anjali Gupta',17,'Block F','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(7,'Artificial Intelligence','Dr. Rohit Jain',15,'Block G','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(8,'Data Science','Dr. Kiran Yadav',14,'Block H','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(9,'Cyber Security','Dr. Vivek Sharma',12,'Block I','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(10,'MBA','Dr. Ritu Saxena',16,'Management Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(11,'Commerce','Dr. Alok Gupta',21,'Commerce Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(12,'Mathematics','Dr. Deepak Tiwari',13,'Science Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(13,'Physics','Dr. Shalini Joshi',11,'Science Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(14,'Chemistry','Dr. Gaurav Mehta',10,'Science Block','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(15,'Biotechnology','Dr. Nidhi Kapoor',9,'Bio Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(16,'Pharmacy','Dr. Prakash Dubey',18,'Medical Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(17,'Law','Dr. Meenakshi Rao',14,'Law Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(18,'English','Dr. Sunita Sharma',12,'Arts Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(19,'Hindi','Dr. Mahesh Chaturvedi',10,'Arts Block','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(20,'Economics','Dr. Rekha Jain',15,'Commerce Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(21,'History','Dr. Manoj Verma',9,'Arts Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(22,'Political Science','Dr. Kavita Mishra',11,'Arts Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(23,'Geography','Dr. Ashok Yadav',8,'Arts Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(24,'Environmental Science','Dr. Priya Singh',13,'Science Block','Inactive','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16'),
(25,'Education','Dr. Rakesh Soni',16,'Education Block','Active','ADMIN','ADMIN','2026-08-05 10:10:16','2026-08-05 10:10:16');

/*Table structure for table `drone_delivery` */

DROP TABLE IF EXISTS `drone_delivery`;

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

/*Data for the table `drone_delivery` */

insert  into `drone_delivery`(`Id`,`drone_code`,`operator_name`,`delivery_zone`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'DRN001','Rahul Sharma','Zone A','In Transit','Admin','Admin','2026-07-22 12:32:19','2026-07-22 12:32:19'),
(2,'DRN002','Rohit Verma','Zone B','In Transit',NULL,NULL,NULL,NULL),
(3,'DRN003','Neha Singh','Zone C','Charging',NULL,NULL,NULL,NULL),
(4,'DRN004','Priya Patel','Zone D','Maintenance',NULL,NULL,NULL,NULL),
(5,'DRN005','Vikas Mehta','Zone E','Available',NULL,NULL,NULL,NULL),
(6,'DRN006','Anjali Gupta','Zone A','In Transit',NULL,NULL,NULL,NULL),
(7,'DRN007','Rahul Joshi','Zone B','Charging',NULL,NULL,NULL,NULL),
(8,'DRN008','Sneha Yadav','Zone C','Available',NULL,NULL,NULL,NULL),
(9,'DRN009','Karan Malhotra','Zone D','Maintenance',NULL,NULL,NULL,NULL),
(10,'DRN010','Pooja Soni','Zone E','In Transit',NULL,NULL,NULL,NULL),
(11,'DRN011','Suresh Kumar','Zone A','Available',NULL,NULL,NULL,NULL),
(12,'DRN012','Deepak Jain','Zone B','Charging',NULL,NULL,NULL,NULL),
(13,'DRN013','Komal Arora','Zone C','Available',NULL,NULL,NULL,NULL),
(14,'DRN014','Arjun Saxena','Zone D','In Transit',NULL,NULL,NULL,NULL),
(15,'DRN015','Nisha Kapoor','Zone E','Maintenance',NULL,NULL,NULL,NULL),
(16,'DRN016','Manish Tiwari','Zone A','Available',NULL,NULL,NULL,NULL),
(17,'DRN017','Ritika Sharma','Zone B','Charging',NULL,NULL,NULL,NULL),
(18,'DRN018','Yash Agarwal','Zone C','In Transit',NULL,NULL,NULL,NULL),
(19,'DRN019','Meera Nair','Zone D','Available',NULL,NULL,NULL,NULL),
(20,'DRN020','Abhishek Singh','Zone E','Maintenance',NULL,NULL,NULL,NULL),
(21,'DRN021','Shivam Mishra','Zone A','Available',NULL,NULL,NULL,NULL),
(22,'DRN022','Kavita Chauhan','Zone B','Charging',NULL,NULL,NULL,NULL),
(23,'DRN023','Harsh Vardhan','Zone C','In Transit',NULL,NULL,NULL,NULL),
(25,'DRN025','Rakesh Pandey','Zone E','Maintenance',NULL,NULL,NULL,NULL),
(26,'DRN024','NITIN','F','Maintenance','Nit@gmail.com','Nit@gmail.com','2026-07-22 15:13:23','2026-07-22 15:13:34');

/*Table structure for table `energy_consumption` */

DROP TABLE IF EXISTS `energy_consumption`;

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

/*Data for the table `energy_consumption` */

insert  into `energy_consumption`(`id`,`energyCode`,`deviceName`,`unitsConsumed`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'EC001','Air Conditioner',125.5,'High','admin','admin','2026-08-01 09:00:00','2026-08-01 09:00:00'),
(2,'EC002','Refrigerator',42.3,'Low','admin','admin','2026-08-01 09:15:00','2026-08-01 09:15:00'),
(3,'EC003','Washing Machine',68.75,'Medium','admin','admin','2026-08-01 09:30:00','2026-08-01 09:30:00'),
(4,'EC004','Water Heater',98.4,'High','admin','admin','2026-08-01 09:45:00','2026-08-01 09:45:00'),
(5,'EC005','Ceiling Fan',15.2,'Low','admin','admin','2026-08-01 10:00:00','2026-08-01 10:00:00'),
(6,'EC006','LED TV',28.6,'Medium','admin','admin','2026-08-01 10:15:00','2026-08-01 10:15:00'),
(7,'EC007','Microwave Oven',35.1,'Medium','admin','admin','2026-08-01 10:30:00','2026-08-01 10:30:00'),
(8,'EC008','Laptop',12.9,'Low','admin','admin','2026-08-01 10:45:00','2026-08-01 10:45:00'),
(9,'EC009','Desktop Computer',45.8,'Medium','admin','admin','2026-08-01 11:00:00','2026-08-01 11:00:00'),
(10,'EC010','Dishwasher',54.25,'Medium','admin','admin','2026-08-01 11:15:00','2026-08-01 11:15:00'),
(11,'EC011','Induction Cooker',76.8,'High','admin','admin','2026-08-01 11:30:00','2026-08-01 11:30:00'),
(12,'EC012','Electric Kettle',18.4,'Low','admin','admin','2026-08-01 11:45:00','2026-08-01 11:45:00'),
(13,'EC013','Room Heater',132.6,'High','admin','admin','2026-08-01 12:00:00','2026-08-01 12:00:00'),
(14,'EC014','Vacuum Cleaner',39.75,'Medium','admin','admin','2026-08-01 12:15:00','2026-08-01 12:15:00'),
(15,'EC015','Coffee Maker',16.95,'Low','admin','admin','2026-08-01 12:30:00','2026-08-01 12:30:00'),
(16,'EC016','Smart Speaker',8.5,'Low','admin','admin','2026-08-01 12:45:00','2026-08-01 12:45:00'),
(17,'EC017','Air Purifier',26.7,'Medium','admin','admin','2026-08-01 13:00:00','2026-08-01 13:00:00'),
(18,'EC018','Water Pump',88.9,'High','admin','admin','2026-08-01 13:15:00','2026-08-01 13:15:00'),
(19,'EC019','Toaster',10.25,'Low','admin','admin','2026-08-01 13:30:00','2026-08-01 13:30:00'),
(20,'EC020','Mixer Grinder',24.8,'Medium','admin','admin','2026-08-01 13:45:00','2026-08-01 13:45:00'),
(21,'EC021','Solar Inverter',5.6,'High','admin','nit@gmail.com','2026-08-01 14:00:00','2026-08-03 13:32:48'),
(22,'EC022','EV Charger',156.4,'High','admin','admin','2026-08-01 14:15:00','2026-08-01 14:15:00'),
(23,'EC023','Printer',14.3,'Low','admin','admin','2026-08-01 14:30:00','2026-08-01 14:30:00'),
(24,'EC024','Projector',47.5,'Medium','admin','admin','2026-08-01 14:45:00','2026-08-01 14:45:00'),
(25,'EC025','Smart Lighting',21.85,'Low','admin','admin','2026-08-01 15:00:00','2026-08-01 15:00:00');

/*Table structure for table `face_recognition` */

DROP TABLE IF EXISTS `face_recognition`;

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

/*Data for the table `face_recognition` */

insert  into `face_recognition`(`Id`,`faceCode`,`userName`,`imagePath`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'FC001','Aarav Sharma','images/faces/face1.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(2,'FC002','Priya Verma','images/faces/face2.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(3,'FC003','Rahul Singh','images/faces/face3.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(4,'FC004','Neha Patel','images/faces/face4.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(5,'FC005','Amit Kumar','images/faces/face5.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(6,'FC006','Sneha Joshi','images/faces/face6.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(7,'FC007','Rohan Gupta','images/faces/face7.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(8,'FC008','Pooja Mishra','images/faces/face8.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(9,'FC009','Vikas Yadav','images/faces/face9.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(10,'FC010','Anjali Sharma','images/faces/face10.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(11,'FC011','Deepak Jain','images/faces/face11.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(12,'FC012','Kavita Soni','images/faces/face12.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(13,'FC013','Manish Tiwari','images/faces/face13.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(14,'FC014','Ritu Saxena','images/faces/face14.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(15,'FC015','Sanjay Dubey','images/faces/face15.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(16,'FC016','Meena Sharma','images/faces/face16.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(17,'FC017','Arjun Mehta','images/faces/face17.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(18,'FC018','Nisha Kapoor','images/faces/face18.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(19,'FC019','Rakesh Chauhan','images/faces/face19.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(20,'FC020','Simran Kaur','images/faces/face20.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(21,'FC021','Mohit Agrawal','images/faces/face21.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(22,'FC022','Divya Sharma','images/faces/face22.jpg','Inactive','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(23,'FC023','Harsh Patel','images/faces/face23.jpg','Active','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10'),
(24,'FC024','Isha Verma','images/faces/face24.jpg','Pending','Admin','Admin','2026-07-27 12:04:10','2026-07-27 12:04:10');

/*Table structure for table `qr_scanner` */

DROP TABLE IF EXISTS `qr_scanner`;

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

/*Data for the table `qr_scanner` */

insert  into `qr_scanner`(`id`,`qrCode`,`scannedBy`,`scanTime`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'QR1001','Nitin','2026-07-01','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(2,'QR1002','Rahul','2026-07-02','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(3,'QR1003','Amit','2026-07-03','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(4,'QR1004','Vikas','2026-07-04','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(5,'QR1005','Rohit','2026-07-05','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(6,'QR1006','Priya','2026-07-06','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(7,'QR1007','Pooja','2026-07-07','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(8,'QR1008','Ankit','2026-07-08','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(9,'QR1009','Deepak','2026-07-09','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(10,'QR1010','Sanjay','2026-07-10','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(11,'QR1011','Neha','2026-07-11','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(12,'QR1012','Karan','2026-07-12','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(13,'QR1013','Rakesh','2026-07-13','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(14,'QR1014','Komal','2026-07-14','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(15,'QR1015','Suresh','2026-07-15','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(16,'QR1016','Anjali','2026-07-16','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(17,'QR1017','Mohit','2026-07-17','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(18,'QR1018','Kavita','2026-07-18','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(19,'QR1019','Ajay','2026-07-19','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(20,'QR1020','Meena','2026-07-20','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(21,'QR1021','Arjun','2026-07-21','Active','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36'),
(22,'QR1022','Nisha','2026-07-22','Inactive','Admin','Admin','2026-07-28 12:04:36','2026-07-28 12:04:36');

/*Table structure for table `smart_light` */

DROP TABLE IF EXISTS `smart_light`;

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

/*Data for the table `smart_light` */

insert  into `smart_light`(`id`,`lightCode`,`roomName`,`brightnessLevel`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'SL001','Living Room',80,'On','Admin','Admin','2026-07-01 09:00:00','2026-07-01 09:00:00'),
(2,'SL002','Bedroom',40,'Off','Admin','Admin','2026-07-02 09:15:00','2026-07-02 09:15:00'),
(3,'SL003','Kitchen',90,'On','Admin','Admin','2026-07-03 10:00:00','2026-07-03 10:00:00'),
(4,'SL004','Dining Room',70,'On','Admin','Admin','2026-07-04 10:20:00','2026-07-04 10:20:00'),
(5,'SL005','Bathroom',60,'Off','Admin','Admin','2026-07-05 08:30:00','2026-07-05 08:30:00'),
(6,'SL006','Guest Room',50,'On','Admin','Admin','2026-07-06 11:00:00','2026-07-06 11:00:00'),
(7,'SL007','Study Room',100,'On','Admin','Admin','2026-07-07 11:15:00','2026-07-07 11:15:00'),
(8,'SL008','Office',75,'Off','Admin','Admin','2026-07-08 12:00:00','2026-07-08 12:00:00'),
(9,'SL009','Garage',35,'Off','Admin','Admin','2026-07-09 12:20:00','2026-07-09 12:20:00'),
(10,'SL010','Balcony',65,'On','Admin','Admin','2026-07-10 13:00:00','2026-07-10 13:00:00'),
(11,'SL011','Hall',85,'On','Admin','Admin','2026-07-11 13:15:00','2026-07-11 13:15:00'),
(12,'SL012','Kids Room',45,'Off','Admin','Admin','2026-07-12 14:00:00','2026-07-12 14:00:00'),
(13,'SL013','Library',95,'On','Admin','Admin','2026-07-13 14:30:00','2026-07-13 14:30:00'),
(14,'SL014','Terrace',55,'Off','Admin','Admin','2026-07-14 15:00:00','2026-07-14 15:00:00'),
(15,'SL015','Lobby',68,'On','Admin','Admin','2026-07-15 15:20:00','2026-07-15 15:20:00'),
(16,'SL016','Store Room',25,'Off','Admin','Admin','2026-07-16 16:00:00','2026-07-16 16:00:00'),
(17,'SL017','Conference Room',88,'On','Admin','Admin','2026-07-17 16:15:00','2026-07-17 16:15:00'),
(18,'SL018','Reception',72,'On','Admin','Admin','2026-07-18 17:00:00','2026-07-18 17:00:00'),
(19,'SL019','Pantry',58,'Off','Admin','Admin','2026-07-19 17:20:00','2026-07-19 17:20:00'),
(20,'SL020','Security Room',92,'On','Admin','Admin','2026-07-20 18:00:00','2026-07-20 18:00:00'),
(21,'SL021','Server Room',100,'On','Admin','Admin','2026-07-21 18:15:00','2026-07-21 18:15:00'),
(22,'SL022','Wash Area',30,'Off','Admin','Admin','2026-07-22 19:00:00','2026-07-22 19:00:00'),
(23,'SL023','Garden',78,'On','Admin','Admin','2026-07-23 19:20:00','2026-07-23 19:20:00'),
(24,'SL024','Parking',50,'On','Admin','nit@gmail.com','2026-07-24 20:00:00','2026-07-31 12:52:23'),
(25,'SL025','Entrance',50,'On','nit@gmail.com','nit@gmail.com','2026-07-31 12:53:16','2026-07-31 12:53:16');

/*Table structure for table `st_college` */

DROP TABLE IF EXISTS `st_college`;

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

/*Data for the table `st_college` */

insert  into `st_college`(`id`,`name`,`address`,`state`,`city`,`phone_no`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'JIT Institute','Bypass Road','Madhya Pradesh','Khargone','9999999999','Admin','Admin','2026-07-21 14:47:31','2026-07-21 14:47:31'),
(2,'IET DAVV','Khandwa Road','Madhya Pradesh','Indore','9876500002','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(3,'Acropolis Institute','Manglia','Madhya Pradesh','Indore','9876500003','Admin','Nit@gmail.com','2026-07-06 14:35:43','2026-07-23 16:40:58'),
(4,'Medicaps University','AB Road','Madhya Pradesh','Indore','9876500004','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(5,'SAGE University','Rau','Madhya Pradesh','Indore','9876500005','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(6,'LNCT University','Kolar Road','Madhya Pradesh','Bhopal','9876500006','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(7,'Oriental College','Ayodhya Bypass','Madhya Pradesh','Bhopal','9876500007','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(8,'RKDF University','Hoshangabad Road','Madhya Pradesh','Bhopal','9876500008','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(9,'Technocrats Institute','Anand Nagar','Madhya Pradesh','Bhopal','9876500009','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(10,'SD Bansal','rau road','mp ','indore','4984844654','root','root','2026-07-10 14:15:37','2026-07-10 14:15:37'),
(11,'JEC','Gokalpur','Madhya Pradesh','Jabalpur','9876500011','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(12,'GGITS','Bargi Hills','Madhya Pradesh','Jabalpur','9876500012','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(13,'Hitkarini College','Dumna Road','Madhya Pradesh','Jabalpur','9876500013','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(14,'MITS','Race Course Road','Madhya Pradesh','Gwalior','9876500014','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(15,'ITM University','Jhansi Road','Madhya Pradesh','Gwalior','9876500015','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(16,'Amity University','Maharajpura','Madhya Pradesh','Gwalior','9876500016','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(17,'Prestige Institute','Scheme No 74','Madhya Pradesh','Indore','9876500017','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(18,'Renaissance University','Gram Revti','Madhya Pradesh','Indore','9876500018','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(19,'Chameli Devi Group','Umrikheda','Madhya Pradesh','Indore','9876500019','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(20,'Shri Vaishnav Institute','Sanwer Road','Madhya Pradesh','Indore','9876500020','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(21,'Corporate Institute','Patel Nagar','Madhya Pradesh','Bhopal','9876500021','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(22,'Millennium College','Nehru Nagar','Madhya Pradesh','Bhopal','9876500022','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(23,'Lakshmi Narain College','Kalchuri Nagar','Madhya Pradesh','Jabalpur','9876500023','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(24,'Global Engineering College','AB Road','Madhya Pradesh','Indore','9876500024','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43'),
(25,'SIRT','Ayodhya Bypass','Madhya Pradesh','Bhopal','9876500025','Admin','Admin','2026-07-06 14:35:43','2026-07-06 14:35:43');

/*Table structure for table `st_course` */

DROP TABLE IF EXISTS `st_course`;

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

/*Data for the table `st_course` */

insert  into `st_course`(`id`,`name`,`description`,`duration`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'Java','OOP, Collection','5 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(2,'Advanced Java','JDBC, Servlet, JSP','4 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(3,'Spring Boot','Spring Boot Framework','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(4,'Hibernate','ORM Framework','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(5,'Python','Python Programming','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(6,'Data Science','Python with Data Science','6 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(7,'Machine Learning','ML Algorithms','5 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(8,'Artificial Intelligence','AI Fundamentals','6 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(9,'Web Development','HTML CSS JavaScript','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(10,'React JS','Frontend Development','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(11,'Angular','Angular Framework','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(12,'Node JS','Backend Development','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(13,'PHP','PHP with MySQL','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(14,'Laravel','PHP Laravel Framework','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(15,'Android','Android App Development','4 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(16,'Flutter','Cross Platform Development','4 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(17,'C Programming','Programming Fundamentals','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(18,'C++','Object Oriented Programming','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(19,'Data Structures','DSA using Java','3 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(20,'SQL','Database Management','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(21,'MySQL','Relational Database','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(22,'MongoDB','NoSQL Database','2 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(23,'DevOps','CI/CD and Docker','5 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20'),
(24,'AWS Cloud','Cloud Computing','4 Months','Admin','Admin','2026-07-06 14:44:20','2026-07-06 14:44:20');

/*Table structure for table `st_customer` */

DROP TABLE IF EXISTS `st_customer`;

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

/*Data for the table `st_customer` */

insert  into `st_customer`(`id`,`customerName`,`email`,`phoneNumber`,`address`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'Rahul Sharma','rahul@gmail.com','9876543236','Bhopal, Madhya Pradesh','ADMIN','nit@gmail.com','2026-08-07 10:59:16','2026-08-07 13:24:31'),
(2,'Amit Verma','amit@gmail.com','9876543211','Indore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(3,'Priya Singh','priya@gmail.com','9876543212','Jabalpur, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(4,'Neha Gupta','neha@gmail.com','9876543213','Gwalior, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(5,'Rohit Jain','rohit@gmail.com','9876543214','Ujjain, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(6,'Ankit Patel','ankit@gmail.com','9876543215','Sagar, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(7,'Pooja Mishra','pooja@gmail.com','9876543216','Rewa, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(8,'Vikas Yadav','vikas@gmail.com','9876543217','Satna, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(9,'Sneha Mehta','sneha@gmail.com','9876543218','Dewas, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(10,'Karan Malhotra','karan@gmail.com','9876543219','Ratlam, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(11,'Nitin Sharma','nitin@gmail.com','9876543220','Bhopal, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(12,'Sakshi Tiwari','sakshi@gmail.com','9876543221','Indore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(13,'Manish Dubey','manish@gmail.com','9876543222','Vidisha, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(14,'Kavita Joshi','kavita@gmail.com','9876543223','Sehore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(15,'Deepak Soni','deepak@gmail.com','9876543224','Hoshangabad, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(16,'Riya Agrawal','riya@gmail.com','9876543225','Bhopal, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(17,'Suresh Choudhary','suresh@gmail.com','9876543226','Indore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(18,'Anjali Rathore','anjali@gmail.com','9876543227','Mandsaur, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(19,'Arjun Thakur','arjun@gmail.com','9876543228','Neemuch, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(20,'Meena Kapoor','meena@gmail.com','9876543229','Shivpuri, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(21,'Rakesh Sen','rakesh@gmail.com','9876543230','Berasia, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(22,'Swati Saxena','swati@gmail.com','9876543231','Bhopal, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(23,'Mohit Rajput','mohit@gmail.com','9876543232','Indore, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(24,'Komal Sharma','komal@gmail.com','9876543233','Jabalpur, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16'),
(25,'Ajay Singh','ajay@gmail.com','9876543234','Gwalior, Madhya Pradesh','ADMIN','ADMIN','2026-08-07 10:59:16','2026-08-07 10:59:16');

/*Table structure for table `st_exam` */

DROP TABLE IF EXISTS `st_exam`;

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

/*Data for the table `st_exam` */

insert  into `st_exam`(`id`,`examName`,`examDate`,`totalMarks`,`passingMarks`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'Java Basics','2026-01-10',100,40,'ADMIN','ADMIN','2026-01-10 09:00:00','2026-01-10 09:00:00'),
(2,'Advanced Java','2026-01-15',100,40,'ADMIN','ADMIN','2026-01-15 09:00:00','2026-01-15 09:00:00'),
(3,'Servlet & JSP','2026-01-20',100,40,'ADMIN','ADMIN','2026-01-20 09:00:00','2026-01-20 09:00:00'),
(4,'Spring Framework','2026-01-25',100,40,'ADMIN','ADMIN','2026-01-25 09:00:00','2026-01-25 09:00:00'),
(5,'Hibernate','2026-02-01',100,40,'ADMIN','ADMIN','2026-02-01 09:00:00','2026-02-01 09:00:00'),
(6,'MySQL','2026-02-05',100,40,'ADMIN','ADMIN','2026-02-05 09:00:00','2026-02-05 09:00:00'),
(7,'Oracle DB','2026-02-10',100,40,'ADMIN','ADMIN','2026-02-10 09:00:00','2026-02-10 09:00:00'),
(8,'Python Basics','2026-02-15',100,40,'ADMIN','ADMIN','2026-02-15 09:00:00','2026-02-15 09:00:00'),
(9,'Data Structures','2026-02-20',100,40,'ADMIN','ADMIN','2026-02-20 09:00:00','2026-02-20 09:00:00'),
(10,'Algorithms','2026-02-25',100,40,'ADMIN','ADMIN','2026-02-25 09:00:00','2026-02-25 09:00:00'),
(11,'Operating System','2026-03-01',100,40,'ADMIN','ADMIN','2026-03-01 09:00:00','2026-03-01 09:00:00'),
(12,'Computer Network','2026-03-05',100,40,'ADMIN','ADMIN','2026-03-05 09:00:00','2026-03-05 09:00:00'),
(13,'Software Engineering','2026-03-10',100,40,'ADMIN','ADMIN','2026-03-10 09:00:00','2026-03-10 09:00:00'),
(14,'Cloud Computing','2026-03-15',100,40,'ADMIN','ADMIN','2026-03-15 09:00:00','2026-03-15 09:00:00'),
(15,'Artificial Intelligence','2026-03-20',100,40,'ADMIN','ADMIN','2026-03-20 09:00:00','2026-03-20 09:00:00'),
(16,'Machine Learning','2026-03-25',100,40,'ADMIN','ADMIN','2026-03-25 09:00:00','2026-03-25 09:00:00'),
(17,'Cyber Security','2026-04-01',100,40,'ADMIN','ADMIN','2026-04-01 09:00:00','2026-04-01 09:00:00'),
(18,'Web Development','2026-04-05',100,40,'ADMIN','ADMIN','2026-04-05 09:00:00','2026-04-05 09:00:00'),
(19,'React JS','2026-04-10',100,40,'ADMIN','ADMIN','2026-04-10 09:00:00','2026-04-10 09:00:00'),
(20,'Angular','2026-04-15',100,40,'ADMIN','ADMIN','2026-04-15 09:00:00','2026-04-15 09:00:00'),
(21,'Node JS','2026-04-20',100,40,'ADMIN','nit@gmail.com','2026-04-20 09:00:00','2026-08-06 11:15:22'),
(22,'DevOps','2026-04-25',100,40,'ADMIN','ADMIN','2026-04-25 09:00:00','2026-04-25 09:00:00'),
(23,'Docker','2026-05-01',100,40,'ADMIN','ADMIN','2026-05-01 09:00:00','2026-05-01 09:00:00'),
(24,'Kubernetes','2026-05-05',100,40,'ADMIN','ADMIN','2026-05-05 09:00:00','2026-05-05 09:00:00'),
(25,'Project Viva','2026-05-10',100,40,'ADMIN','ADMIN','2026-05-10 09:00:00','2026-05-10 09:00:00');

/*Table structure for table `st_faculty` */

DROP TABLE IF EXISTS `st_faculty`;

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

/*Data for the table `st_faculty` */

insert  into `st_faculty`(`id`,`college_id`,`college_name`,`first_name`,`last_name`,`email`,`mobile_no`,`address`,`gender`,`date_of_birth`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(2,2,'IET DAVV','Neha','Verma','neha2@gmail.com','9876501002','Indore','Female','1991-02-20 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(3,3,'Acropolis Institute','Rahul','Patel','rahul3@gmail.com','9876501003','Indore','Male','1989-03-18 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(4,4,'Medicaps University','Pooja','Joshi','pooja4@gmail.com','9876501004','Indore','Female','1992-04-12 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(5,5,'SAGE University','Rohit','Yadav','rohit5@gmail.com','9876501005','Indore','Male','1990-05-10 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(6,6,'LNCT University','Anjali','Soni','anjali6@gmail.com','9876501006','Bhopal','Female','1991-06-22 00:00:00','Admin','root@sunilos.com','2026-07-06 14:49:29','2026-07-23 17:16:55'),
(7,7,'Oriental College','Vikas','Gupta','vikas7@gmail.com','9876501007','Bhopal','Male','1988-07-14 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(8,8,'RKDF University','Sneha','Mishra','sneha8@gmail.com','9876501008','Bhopal','Female','1993-08-09 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(9,9,'Technocrats Institute','Deepak','Tiwari','deepak9@gmail.com','9876501009','Bhopal','Male','1989-09-17 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(10,10,'Bansal Institute','Priya','Jain','priya10@gmail.com','9876501010','Bhopal','Female','1992-10-08 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(11,11,'JEC','Sandeep','Singh','sandeep11@gmail.com','9876501011','Jabalpur','Male','1987-11-11 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(12,12,'GGITS','Kavita','Dubey','kavita12@gmail.com','9876501012','Jabalpur','Female','1991-12-05 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(13,13,'Hitkarini College','Nitin','Chauhan','nitin13@gmail.com','9876501013','Jabalpur','Male','1990-01-30 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(14,14,'MITS','Ritu','Thakur','ritu14@gmail.com','9876501014','Gwalior','Female','1989-02-15 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(15,15,'ITM University','Mohit','Saxena','mohit15@gmail.com','9876501015','Gwalior','Male','1992-03-19 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(16,16,'Amity University','Swati','Pandey','swati16@gmail.com','9876501016','Gwalior','Female','1993-04-24 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(17,17,'Prestige Institute','Ajay','Rajput','ajay17@gmail.com','9876501017','Indore','Male','1988-05-27 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(18,18,'Renaissance University','Monika','Shukla','monika18@gmail.com','9876501018','Indore','Female','1991-06-06 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(19,19,'Chameli Devi Group','Arun','Mehta','arun19@gmail.com','9876501019','Indore','Male','1990-07-21 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(20,20,'Shri Vaishnav Institute','Reena','Kulkarni','reena20@gmail.com','9876501020','Indore','Female','1992-08-18 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(21,21,'Corporate Institute','Sachin','Tomar','sachin21@gmail.com','9876501021','Bhopal','Male','1989-09-13 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(22,22,'Millennium College','Meena','Choudhary','meena22@gmail.com','9876501022','Bhopal','Female','1991-10-25 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(23,23,'Lakshmi Narain College','Abhishek','Rathore','abhishek23@gmail.com','9876501023','Jabalpur','Male','1988-11-07 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(24,24,'Global Engineering College','Anita','Parmar','anita24@gmail.com','9876501024','Indore','Female','1990-12-16 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(25,25,'SIRT','Manish','Solanki','manish25@gmail.com','9876501025','Bhopal','Male','1993-01-09 00:00:00','Admin','Admin','2026-07-06 14:49:29','2026-07-06 14:49:29'),
(26,1,'JIT Institute','Nitin','Sharma','nitin@gmail.com','9876543210','Indore','Male','1998-10-15 00:00:00','Admin','Admin','2026-07-06 16:22:16','2026-07-06 16:22:16');

/*Table structure for table `st_marksheet` */

DROP TABLE IF EXISTS `st_marksheet`;

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

/*Data for the table `st_marksheet` */

insert  into `st_marksheet`(`id`,`roll_no`,`student_id`,`name`,`physics`,`chemistry`,`maths`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'R101',1,'Aarav Sharma',78,82,91,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(2,'R102',2,'Vivaan Verma',65,74,81,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(3,'R103',3,'Aditya Patel',89,92,90,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(4,'R104',4,'Krishna Yadav',56,68,72,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(5,'R105',5,'Rohan Gupta',81,79,84,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(6,'R106',6,'Ananya Singh',95,93,97,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(7,'R107',7,'Priya Jain',72,75,70,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(8,'R108',8,'Sneha Mishra',88,91,89,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(9,'R109',9,'Rahul Tiwari',61,66,73,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(10,'R110',10,'Pooja Joshi',83,86,90,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(11,'R111',11,'Nitin Chauhan',69,72,68,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(12,'R112',12,'Kavita Dubey',92,94,96,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(13,'R113',13,'Deepak Soni',77,81,79,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(14,'R114',14,'Ritu Thakur',58,64,60,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(15,'R115',15,'Mohit Saxena',86,88,91,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(16,'R116',16,'Swati Pandey',90,89,94,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(17,'R117',17,'Ajay Rajput',73,76,78,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(18,'R118',18,'Monika Shukla',84,87,85,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(19,'R119',19,'Arun Mehta',66,71,69,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(20,'R120',20,'Reena Kulkarni',93,95,98,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(21,'R121',21,'Sachin Tomar',74,77,80,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(22,'R122',22,'Meena Choudhary',80,82,84,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(23,'R123',23,'Abhishek Rathore',67,70,72,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(24,'R124',24,'Anita Parmar',91,90,93,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18'),
(25,'R125',25,'Manish Solanki',76,79,81,'Admin','Admin','2026-07-06 14:51:18','2026-07-06 14:51:18');

/*Table structure for table `st_role` */

DROP TABLE IF EXISTS `st_role`;

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

/*Data for the table `st_role` */

insert  into `st_role`(`id`,`name`,`description`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'Admin','Administrator Role','Admin','Admin','2014-07-19 17:13:36','2014-07-19 17:13:36'),
(2,'Student','Student Role','Rahulst_role Sahu','Rahul Sahu','2014-07-19 17:19:09','2014-07-19 17:19:09'),
(3,'College','College Role','Rahul Sahu','Rahul Sahu','2014-07-19 17:19:30','2014-07-19 17:19:30'),
(4,'KIOSK','KIOSK Role','Rahul Sahu','Rahul Sahu','2014-07-19 17:19:48','2014-07-19 17:19:48');

/*Table structure for table `st_smartparking` */

DROP TABLE IF EXISTS `st_smartparking`;

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

/*Data for the table `st_smartparking` */

insert  into `st_smartparking`(`id`,`parkingCode`,`vehicleNumber`,`slotNumber`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'PK001','MP09AB1234','S01','Available','Admin','nit@gmail.com','2026-07-21 14:58:44','2026-07-27 13:13:12'),
(2,'PK002','MP09CD2345','S02','Reserved','Admin','nit@gmail.com','2026-07-21 14:58:44','2026-07-23 17:27:56'),
(3,'PK003','MP09EF3456','S03','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(4,'PK004','MP09GH4567','S04','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(5,'PK005','MP09IJ5678','S05','Available','Admin','Nit@gmail.com','2026-07-21 14:58:44','2026-07-23 17:17:07'),
(6,'PK006','MP09KL6789','S06','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(7,'PK007','MP09MN7890','S07','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(8,'PK008','MP09OP8901','S08','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(9,'PK009','MP09QR9012','S09','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(10,'PK010','MP09ST0123','S10','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(11,'PK011','MP09UV1235','S11','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(12,'PK012','MP09WX2346','S12','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(13,'PK013','MP09YZ3457','S13','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(14,'PK014','MP10AB4568','S14','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(15,'PK015','MP10CD5679','S15','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(16,'PK016','MP10EF6780','S16','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(17,'PK017','MP10GH7891','S17','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(18,'PK018','MP10IJ8902','S18','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(19,'PK019','MP10KL9013','S19','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(20,'PK020','MP10MN0124','S20','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(21,'PK021','MP10OP1236','S21','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(22,'PK022','MP10QR2347','S22','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(23,'PK023','MP10ST3458','S23','Reserved','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(24,'PK024','MP10UV4569','S24','Available','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(25,'PK025','MP10WX5670','S25','Occupied','Admin','Admin','2026-07-21 14:58:44','2026-07-21 14:58:44'),
(26,'PK026','mp13zb8745','S026','Available','nit@gmail.com','nit@gmail.com','2026-07-27 13:12:48','2026-07-27 13:12:48');

/*Table structure for table `st_student` */

DROP TABLE IF EXISTS `st_student`;

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

/*Data for the table `st_student` */

insert  into `st_student`(`id`,`college_id`,`college_name`,`first_name`,`last_name`,`date_of_birth`,`mobile_no`,`email`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(2,2,'IET DAVV','Vivaan','Verma','2002-02-18 00:00:00','9876501002','vivaan2@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(3,3,'Acropolis Institute','Aditya','Patel','2002-03-20 00:00:00','9876501003','aditya3@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(4,4,'Medicaps University','Krishna','Yadav','2002-04-12 00:00:00','9876501004','krishna4@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(5,5,'SAGE University','Rohan','Gupta','2002-05-25 00:00:00','9876501005','rohan5@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(6,6,'LNCT University','Ananya','Singh','2002-06-10 00:00:00','9876501006','ananya6@gmail.com','Admin','root@sunilos.com','2026-07-07 12:00:00','2026-07-23 17:16:37'),
(7,7,'Oriental College','Priya','Jain','2002-07-16 00:00:00','9876501007','priya7@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(8,8,'RKDF University','Sneha','Mishra','2002-08-22 00:00:00','9876501008','sneha8@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(9,9,'Technocrats Institute','Rahul','Tiwari','2002-09-09 00:00:00','9876501009','rahul9@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(10,10,'Bansal Institute','Pooja','Joshi','2002-10-14 00:00:00','9876501010','pooja10@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(11,11,'JEC','Nitin','Chauhan','2002-11-11 00:00:00','9876501011','nitin11@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(12,12,'GGITS','Kavita','Dubey','2002-12-01 00:00:00','9876501012','kavita12@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(13,13,'Hitkarini College','Deepak','Soni','2002-01-19 00:00:00','9876501013','deepak13@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(14,14,'MITS','Ritu','Thakur','2002-02-27 00:00:00','9876501014','ritu14@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(15,15,'ITM University','Mohit','Saxena','2002-03-08 00:00:00','9876501015','mohit15@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(16,16,'Amity University','Swati','Pandey','2002-04-17 00:00:00','9876501016','swati16@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(17,17,'Prestige Institute','Ajay','Rajput','2002-05-13 00:00:00','9876501017','ajay17@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(18,18,'Renaissance University','Monika','Shukla','2002-06-18 00:00:00','9876501018','monika18@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(19,19,'Chameli Devi Group','Arun','Mehta','2002-07-26 00:00:00','9876501019','arun19@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(20,20,'Shri Vaishnav Institute','Reena','Kulkarni','2002-08-05 00:00:00','9876501020','reena20@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(21,21,'Corporate Institute','Sachin','Tomar','2002-09-12 00:00:00','9876501021','sachin21@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(22,22,'Millennium College','Meena','Choudhary','2002-10-20 00:00:00','9876501022','meena22@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(23,23,'Lakshmi Narain College','Abhishek','Rathore','2002-11-15 00:00:00','9876501023','abhishek23@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(24,24,'Global Engineering College','Anita','Parmar','2002-12-09 00:00:00','9876501024','anita24@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(25,25,'SIRT','Manish','Solanki','2002-01-30 00:00:00','9876501025','manish25@gmail.com','Admin','Admin','2026-07-07 12:00:00','2026-07-07 12:00:00'),
(26,1,'JIT Institute','Nitin','Sharma','2002-05-15 00:00:00','9876543210','nitin@gmail.com','root@sunilos.com','root@sunilos.com','2026-07-07 12:18:59','2026-07-07 12:18:59');

/*Table structure for table `st_subject` */

DROP TABLE IF EXISTS `st_subject`;

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

/*Data for the table `st_subject` */

insert  into `st_subject`(`id`,`name`,`description`,`course_id`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'Java Basics','Introduction to Java Programming',1,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(2,'OOP Concepts','Object Oriented Programming',2,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(3,'Spring Core','Spring Framework Basics',3,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(4,'Hibernate ORM','Hibernate Mapping',4,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(5,'Python Basics','Introduction to Python',5,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(6,'Data Analysis','Data Analysis using Python',6,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(7,'ML Algorithms','Machine Learning Fundamentals',7,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(8,'AI Concepts','Artificial Intelligence Basics',8,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(9,'HTML & CSS','Web Page Designing',9,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(10,'React Components','React JS Fundamentals',10,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(11,'Angular Modules','Angular Development',11,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(12,'Node Express','Backend with Express JS',12,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(13,'PHP Basics','PHP Programming',13,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(14,'Laravel MVC','Laravel Framework',14,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(15,'Android UI','Android Application Development',15,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(16,'Flutter Widgets','Flutter Mobile Apps',16,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(17,'C Language','Programming with C',17,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(18,'C++ STL','Standard Template Library',18,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(19,'Data Structures','DSA Concepts',19,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(20,'SQL Queries','Database Query Language',20,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(21,'MySQL Administration','MySQL Database Management',21,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(22,'MongoDB CRUD','MongoDB Operations',22,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(23,'Docker Basics','Docker Containers',23,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(24,'AWS EC2','Amazon EC2 Services',24,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(25,'Network Security','Cyber Security Fundamentals',25,'Admin','Admin','2026-07-06 14:59:23','2026-07-06 14:59:23'),
(26,'Advanced Java','JDBC, Servlet, JSP',1,'root@sunilos.com','root@sunilos.com','2026-07-07 11:55:04','2026-07-07 11:55:04'),
(27,'Java','Java Programming Language',1,'root@sunilos.com','root@sunilos.com','2026-07-07 11:56:23','2026-07-07 11:56:23');

/*Table structure for table `st_user` */

DROP TABLE IF EXISTS `st_user`;

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

/*Data for the table `st_user` */

insert  into `st_user`(`id`,`first_name`,`last_name`,`login`,`password`,`dob`,`mobile_no`,`role_id`,`unsuccessful_login`,`gender`,`last_login`,`user_lock`,`registered_ip`,`last_login_ip`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`,`PHOTO`) values 
(1,'Nitin','Sharma','nit@gmail.com','nit123','1987-09-10 00:00:00','9225152822',1,0,'M',NULL,'Inactive',NULL,NULL,'root','Nit@gmail.com','2026-07-17 17:12:20','2026-07-23 17:15:48',NULL),
(2,'Rahul','Verma','rahul02@gmail.com','pass123','1997-03-10 00:00:00','9876543211',2,1,'Male','2026-07-01 09:30:00','N','192.168.1.2','192.168.1.11','Admin','Admin','2026-01-02 09:00:00','2026-07-01 09:30:00',NULL),
(3,'Priya','Patel','priya03@gmail.com','pass123','1999-05-18 00:00:00','9876543212',2,0,'Female','2026-07-01 11:00:00','N','192.168.1.3','192.168.1.12','Admin','Admin','2026-01-03 09:00:00','2026-07-01 11:00:00',NULL),
(4,'Amit','Singh','amit04@gmail.com','pass123','1995-07-21 00:00:00','9876543213',3,2,'Male','2026-07-01 12:20:00','Y','192.168.1.4','192.168.1.13','Admin','System','2026-01-04 09:00:00','2026-07-01 12:20:00',NULL),
(5,'Neha','Joshi','neha05@gmail.com','pass123','1998-11-11 00:00:00',NULL,2,0,'F',NULL,'Inactive',NULL,NULL,'Admin','Nit@gmail.com','2026-01-05 09:00:00','2026-07-23 17:16:15',NULL),
(6,'Rohit','Gupta','rohit06@gmail.com','pass123','1996-09-12 00:00:00','9876543215',3,1,'Male','2026-07-01 07:45:00','N','192.168.1.6','192.168.1.15','Admin','Admin','2026-01-06 09:00:00','2026-07-01 07:45:00',NULL),
(7,'Pooja','Yadav','pooja07@gmail.com','pass123','1997-06-09 00:00:00','9876543216',2,0,'Female','2026-07-01 10:45:00','N','192.168.1.7','192.168.1.16','Admin','Admin','2026-01-07 09:00:00','2026-07-01 10:45:00',NULL),
(8,'Suresh','Jain','suresh08@gmail.com','pass123','1994-08-19 00:00:00','9876543217',2,0,'Male','2026-07-01 09:50:00','N','192.168.1.8','192.168.1.17','Admin','Admin','2026-01-08 09:00:00','2026-07-01 09:50:00',NULL),
(9,'ram','Joshi','ram25@gmail.com','pass123','1996-08-03 00:00:00','9876543234',2,2,'Male','2026-07-01 07:35:00','Y','192.168.1.25','192.168.1.34','root','root','2026-07-03 12:46:38','2026-07-03 12:46:38',NULL),
(10,'Vikas','Chauhan','vikas10@gmail.com','pass123','1998-04-30 00:00:00','9876543219',2,0,'Male','2026-07-01 09:15:00','N','192.168.1.10','192.168.1.19','Admin','Admin','2026-01-10 09:00:00','2026-07-01 09:15:00',NULL),
(11,'Anjali','Sharma','anjali11@gmail.com','pass123','1999-02-20 00:00:00','9876543220',2,0,'Female','2026-07-01 10:30:00','N','192.168.1.11','192.168.1.20','Admin','Admin','2026-01-11 09:00:00','2026-07-01 10:30:00',NULL),
(12,'Deepak','Soni','deepak12@gmail.com','pass123','1996-05-05 00:00:00','9876543221',3,1,'Male','2026-07-01 11:15:00','N','192.168.1.12','192.168.1.21','Admin','Admin','2026-01-12 09:00:00','2026-07-01 11:15:00',NULL),
(13,'Sneha','Tiwari','sneha13@gmail.com','pass123','1997-07-17 00:00:00','9876543222',2,0,'Female','2026-07-01 12:10:00','N','192.168.1.13','192.168.1.22','Admin','Admin','2026-01-13 09:00:00','2026-07-01 12:10:00',NULL),
(14,'Manish','Patidar','manish14@gmail.com','pass123','1993-10-28 00:00:00','9876543223',2,0,'Male','2026-07-01 09:40:00','N','192.168.1.14','192.168.1.23','Admin','Admin','2026-01-14 09:00:00','2026-07-01 09:40:00',NULL),
(15,'Komal','Dubey','komal15@gmail.com','pass123','1998-09-08 00:00:00','9876543224',2,0,'Female','2026-07-01 08:55:00','N','192.168.1.15','192.168.1.24','Admin','Admin','2026-01-15 09:00:00','2026-07-01 08:55:00',NULL),
(16,'Arun','Prajapati','arun16@gmail.com','pass123','1994-03-11 00:00:00','9876543225',3,2,'Male','2026-07-01 07:25:00','Y','192.168.1.16','192.168.1.25','Admin','System','2026-01-16 09:00:00','2026-07-01 07:25:00',NULL),
(17,'Meena','Saxena','meena17@gmail.com','pass123','1996-06-14 00:00:00','9876543226',2,0,'Female','2026-07-01 10:05:00','N','192.168.1.17','192.168.1.26','Admin','Admin','2026-01-17 09:00:00','2026-07-01 10:05:00',NULL),
(18,'Ajay','Rathore','ajay18@gmail.com','pass123','1995-11-23 00:00:00','9876543227',3,1,'Male','2026-07-01 11:45:00','N','192.168.1.18','192.168.1.27','Admin','Admin','2026-01-18 09:00:00','2026-07-01 11:45:00',NULL),
(19,'Ritu','Mourya','ritu19@gmail.com','pass123','1999-08-16 00:00:00','9876543228',2,0,'Female','2026-07-01 09:05:00','N','192.168.1.19','192.168.1.28','Admin','Admin','2026-01-19 09:00:00','2026-07-01 09:05:00',NULL),
(20,'Mohit','Agrawal','mohit20@gmail.com','pass123','1997-01-27 00:00:00','9876543229',2,0,'Male','2026-07-01 08:35:00','N','192.168.1.20','192.168.1.29','Admin','Admin','2026-01-20 09:00:00','2026-07-01 08:35:00',NULL),
(21,'Rakesh','Thakur','rakesh21@gmail.com','pass123','1993-02-18 00:00:00','9876543230',2,0,'Male','2026-07-01 10:00:00','N','192.168.1.21','192.168.1.30','Admin','Admin','2026-01-21 09:00:00','2026-07-01 10:00:00',NULL),
(22,'Shweta','Jha','shweta22@gmail.com','pass123','1998-12-14 00:00:00','9876543231',2,1,'Female','2026-07-01 10:20:00','N','192.168.1.22','192.168.1.31','Admin','Admin','2026-01-22 09:00:00','2026-07-01 10:20:00',NULL),
(23,'Vivek','Mishra','vivek23@gmail.com','pass123','1994-04-24 00:00:00','9876543232',3,0,'Male','2026-07-01 09:55:00','N','192.168.1.23','192.168.1.32','Admin','Admin','2026-01-23 09:00:00','2026-07-01 09:55:00',NULL),
(24,'Payal','Gupta','payal24@gmail.com','pass123','1997-05-29 00:00:00','9876543233',2,0,'Female','2026-07-01 08:50:00','N','192.168.1.24','192.168.1.33','Admin','Admin','2026-01-24 09:00:00','2026-07-01 08:50:00',NULL),
(25,'Gaurav','Joshi','gaurav25@gmail.com','pass123','1996-08-03 00:00:00','9876543234',2,2,'Male','2026-07-01 07:35:00','Y','192.168.1.25','192.168.1.34','Admin','System','2026-01-25 09:00:00','2026-07-01 07:35:00',NULL);

/*Table structure for table `voice_command` */

DROP TABLE IF EXISTS `voice_command`;

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

/*Data for the table `voice_command` */

insert  into `voice_command`(`id`,`commandCode`,`userName`,`commandText`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'VC001','Nitin Sharma','Turn Off Light','Inactive','Admin','Admin','2026-07-24 13:55:06','2026-07-24 13:55:06'),
(2,'VC002','Priya','Turn off fan','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(3,'VC003','Rahul','Play music','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(4,'VC004','Sneha','Open garage','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(5,'VC005','Rohan','Close garage','Failed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(6,'VC006','Anjali','Increase volume','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(7,'VC007','Vikram','Decrease volume','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(8,'VC008','Neha','Set alarm 7 AM','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(9,'VC009','Karan','Lock doors','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(10,'VC010','Meera','Unlock doors','Failed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(11,'VC011','Arjun','Turn on AC','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(12,'VC012','Pooja','Turn off AC','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(13,'VC013','Amit','Start vacuum cleaner','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(14,'VC014','Kavita','Stop vacuum cleaner','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(15,'VC015','Sanjay','Open curtains','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(16,'VC016','Divya','Close curtains','Failed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(17,'VC017','Manish','Read notifications','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(18,'VC018','Ritika','Check weather','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(19,'VC019','Nikhil','Call emergency contact','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(20,'VC020','Simran','Send message','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(21,'VC021','Deepak','Enable WiFi','Failed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(22,'VC022','Shreya','Disable WiFi','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(23,'VC023','Yash','Open browser','Pending','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59'),
(24,'VC024','Isha','Shutdown system','Executed','Admin','Admin','2026-07-24 12:24:59','2026-07-24 12:24:59');

/*Table structure for table `water_monitoring` */

DROP TABLE IF EXISTS `water_monitoring`;

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

/*Data for the table `water_monitoring` */

insert  into `water_monitoring`(`id`,`waterCode`,`location`,`waterLevel`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'WM001','Bhopal Lake',78.5,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(3,'WM003','Ujjain River',65.8,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(4,'WM004','Gwalior Reservoir',45.2,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(5,'WM005','Jabalpur Canal',81.6,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(6,'WM006','Sagar Dam',95.4,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(7,'WM007','Rewa Lake',52.9,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(8,'WM008','Satna River',74.3,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(9,'WM009','Dewas Tank',88.7,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(10,'WM010','Ratlam Canal',61.5,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(11,'WM011','Sehore Dam',47.8,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(12,'WM012','Vidisha Lake',82.1,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(13,'WM013','Hoshangabad River',97.2,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(14,'WM014','Betul Reservoir',58.4,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(15,'WM015','Shivpuri Dam',76.9,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(16,'WM016','Neemuch Canal',91.8,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(17,'WM017','Mandsaur Lake',49.6,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(18,'WM018','Khargone River',69.5,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(19,'WM019','Chhindwara Dam',86.4,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(20,'WM020','Khandwa Lake',55.3,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(21,'WM021','Burhanpur Canal',79.8,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(22,'WM022','Panna Reservoir',93.7,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(23,'WM023','Damoh River',43.9,'Low','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(24,'WM024','Katni Lake',73.2,'Normal','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(25,'WM025','Tikamgarh Dam',84.5,'High','Admin','Admin','2026-07-30 14:20:23','2026-07-30 14:20:23'),
(26,'WM026','indore',74.2,'Normal','nit@gmail.com','nit@gmail.com','2026-07-30 16:05:30','2026-07-30 16:07:09');

/*Table structure for table `weather_alert` */

DROP TABLE IF EXISTS `weather_alert`;

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

/*Data for the table `weather_alert` */

insert  into `weather_alert`(`id`,`alertCode`,`cityName`,`temperature`,`status`,`created_by`,`modified_by`,`created_datetime`,`modified_datetime`) values 
(1,'WA001','Delhi',38.5,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(2,'WA002','Mumbai',31.2,'Humid','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(3,'WA003','Bhopal',34.7,'Warm','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(4,'WA004','Indore',36.1,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(5,'WA005','Jaipur',40.3,'Extreme Heat','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(6,'WA006','Lucknow',35.4,'Warm','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(7,'WA007','Kanpur',37.6,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(8,'WA008','Patna',33.8,'Cloudy','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(9,'WA009','Chennai',32.5,'Humid','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(10,'WA010','Hyderabad',30.9,'Pleasant','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(11,'WA011','Pune',27.8,'Rain Alert','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(12,'WA012','Nagpur',39.2,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(13,'WA013','Surat',31.7,'Humid','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(14,'WA014','Ahmedabad',41,'Extreme Heat','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(15,'WA015','Kolkata',32.8,'Rain Alert','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(16,'WA016','Ranchi',28.6,'Cloudy','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(17,'WA017','Raipur',35.9,'Warm','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(18,'WA018','Shimla',19.4,'Cold','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(19,'WA019','Srinagar',16.8,'Cold','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(20,'WA020','Dehradun',24.9,'Pleasant','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(21,'WA021','Goa',29.7,'Rain Alert','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(22,'WA022','Amritsar',33.1,'Warm','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(23,'WA023','Varanasi',36.8,'Hot','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(24,'WA024','Guwahati',27.4,'Rain Alert','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(25,'WA025','Jodhpur',42.2,'Extreme Heat','admin','admin','2026-07-23 11:48:55','2026-07-23 11:48:55'),
(26,'WA026','INDORE',38.4,'Warm','Nit@gmail.com','Nit@gmail.com','2026-07-23 14:36:03','2026-07-23 14:36:03');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
