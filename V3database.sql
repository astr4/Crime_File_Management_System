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
  `userAddress` varchar(200) NOT NULL,
  `userPhone` varchar(10) NOT NULL,
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
INSERT INTO `crimefile` VALUES ('Emre','Mimar Sinan, 1122. Sk. Merkez/Erzincan','5305600221','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','10:05:25','2005-11-12','Mus'),('Ali','Akkapı, 12126. Sk. No 2 Seyhan/Adana','5353422785','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','10:05:25','2017-09-17','Erzurum'),('Harun','Çarşı, Mahmut Goloğlu Cd. 4A Susuz/Kars','5321114444','Shoplifting','Shoplifter attempts a getaway in hijacked Uber while also wearing ankle bracelet','10:05:25','2017-09-17','Erzurum'),('Veli','Doğuş, Küçük Kumköprü Cd. No 93 Karatay/Konya','5058128990','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','16:52:00','2007-01-30','Tokat'),('Zeynep','Atatürk Mah. Şirinevler Cd. No 14 Keçiören/Ankara','5449233455','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','21:14:00','2017-09-17','Istanbul'),('Zeynep','Camikebir Mah. Sığacık Cd. No 112/5 Seferihisar/İzmir','5449233455','Arson','Operator Is Killed in a Subway Fire in Manhattan; Arson Is Suspected','17:36:00','2009-07-13','Denizli'),('Ali','Turgut Özal,','5351899022','Burglary','The thief who knew the owner of the house was on vacation, robbed the house','11:22:00','2012-10-12','Istanbul'),('Haydar','Atatürk Mah. Şirinevler Cd. No 14 Keçiören/Ankara','5449233455','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','11:22:00','2004-05-17','Van'),('Serdar',' Hacı Özer Efendi Cd. No 30 Kahta/Adıyaman','5336192629','Homicide','Journalist and bodyguard shot dead while leaving restaurant','23:25:15','2009-07-13','Ardahan'),('Ezgi','Barbaros Mah. M. Emin Durul Cd. No 38 Denizli','4442622010','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','21:14:00','2001-05-04','Canakkale'),('Emre','Turgut Özal,','5058128990','Fraud','The crook who introduced himself as a prosecutor on the phone took the old mans surgery money and got lost','16:52:00','2009-07-13','Ardahan'),('Ufuk',' Hacı Özer Efendi Cd. No 30 Kahta/Adıyaman','5304215678','Vandalism','Model railway show wantonly destroyed by vandals','20:30:25','2011-03-23','Erzurum'),('Ufuk','Kayhan, Üçler Sk. No 1 Nilüfer/Bursa','5321456785','Shoplifting','Shoplifter attempts a getaway in hijacked Uber while also wearing ankle bracelet','14:12:00','2017-09-17','Canakkale'),('Ezgi','Karakavak, 4. Sk. No 17 Çamlıhemşin/Rize','5054548927','Vandalism','Model railway show wantonly destroyed by vandals','11:22:00','2014-10-02','Kutahya'),('Ezgi','Doğuş, Küçük Kumköprü Cd. No 93 Karatay/Konya','5552614578','Burglary','The thief who knew the owner of the house was on vacation, robbed the house','11:22:00','1995-10-18','Denizli'),('Veli','Barbaros Mah. M. Emin Durul Cd. No 38 Denizli','5458562471','Fraud','The crook who introduced himself as a prosecutor on the phone took the old mans surgery money and got lost','11:22:00','2004-05-17','Eskisehir'),('Ezgi','Zafer, Mehmet Buyruk Cd. No 67 Merkez/Kayseri','5304215678','Kidnapping','Arunachal Man Kidnapped By Chinese Army Yet To Be Traced: Police','13:20:00','2020-01-25','Canakkale'),('Faruk','Camikebir Mah. Sığacık Cd. No 112/5 Seferihisar/İzmir','5338726789','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','13:20:00','2020-01-25','Ardahan'),('Emre','Kavaklıbağ, İnönü Cd. No 54 Battalgazi/Malatya','5066276619','Robbery','Hatchet-wielding doughnut thief nabbed by police a block away eating stolen sweets: cops','14:12:00','2004-05-17','Gaziantep'),('Emre','Mimar Sinan, 1122. Sk. Merkez/Erzincan','5321456785','Theft','Attempted marijuana theft led to Fitchburg teens murder','14:12:00','2012-10-12','Izmir'),('Zeynep','Maslak, 53. Sk. No 5 Sarıyer/İstanbul','5381579803','Identity Theft','Refugee fled to Europe with fake passport, currently sought all over Europe','14:12:00','2012-10-12','Bolu'),('Elif','Cumhuriyet, Kır Mevki Sk. No 45 Ortahisar/Trabzon','5321114444','Shoplifting','Shoplifter attempts a getaway in hijacked Uber while also wearing ankle bracelet','20:30:25','2007-01-30','Izmir'),('Harun','Doğuş, Küçük Kumköprü Cd. No 93 Karatay/Konya','5066276619','Shoplifting','Shoplifter attempts a getaway in hijacked Uber while also wearing ankle bracelet','20:30:25','2013-08-20','Eskisehir'),('Ufuk','Atatürk Mah. Şirinevler Cd. No 14 Keçiören/Ankara','5321114444','Kidnapping','Arunachal Man Kidnapped By Chinese Army Yet To Be Traced: Police','17:36:00','1995-10-18','Gaziantep'),('Elif','Çarşı, Mahmut Goloğlu Cd. 4A Susuz/Kars','5305600221','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','17:36:00','2008-04-21','Ankara'),('Ufuk','Atatürk Mah. Şirinevler Cd. No 14 Keçiören/Ankara','5459322345','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','23:25:15','2010-05-07','Eskisehir'),('Ufuk','Kayhan, Üçler Sk. No 1 Nilüfer/Bursa','5034581245','Robbery','Hatchet-wielding doughnut thief nabbed by police a block away eating stolen sweets: cops','19:41:22','2015-11-27','Tokat'),('Ufuk','İzzetiye, Mücelli Cd. No 16 Yenimahalle/Ankara','5353422785','Arson','Operator Is Killed in a Subway Fire in Manhattan; Arson Is Suspected','18:02:05','1995-10-18','Kutahya'),('Emre','Karakavak, 4. Sk. No 17 Çamlıhemşin/Rize','5552614578','Fraud','The crook who introduced himself as a prosecutor on the phone took the old mans surgery money and got lost','20:30:25','2010-05-07','Kutahya'),('Ufuk','Hallaçlar, 3003. Sk. No 26 Demirci/Manisa','5034581245','Vandalism','Model railway show wantonly destroyed by vandals','20:30:25','2010-05-07','Van'),('Haydar','Karakavak, 4. Sk. No 17 Çamlıhemşin/Rize','5338726789','Kidnapping','Arunachal Man Kidnapped By Chinese Army Yet To Be Traced: Police','18:02:05','2009-07-13','Mus'),('Faruk','Mimar Sinan, 1122. Sk. Merkez/Erzincan','5321456785','Vandalism','Model railway show wantonly destroyed by vandals','18:02:05','2008-04-21','Izmir'),('Faruk','Kayhan, Üçler Sk. No 1 Nilüfer/Bursa','5338726789','Kidnapping','Arunachal Man Kidnapped By Chinese Army Yet To Be Traced: Police','21:14:00','2004-05-17','Diyarbakir'),('Faruk','Atatürk Mah. Şirinevler Cd. No 14 Keçiören/Ankara','5384877124','Attempt','The tenant attempted to kill the landlord','21:14:00','2001-05-04','Erzurum'),('Emel','Kayhan, Üçler Sk. No 1 Nilüfer/Bursa','5338726789','Theft','Attempted marijuana theft led to Fitchburg teens murder','16:52:00','2013-08-20','Kutahya'),('Emel','Çarşı, Mahmut Goloğlu Cd. 4A Susuz/Kars','5452894567','Homicide','Journalist and bodyguard shot dead while leaving restaurant','19:41:22','2013-08-20','Canakkale'),('Faruk',' Hacı Özer Efendi Cd. No 30 Kahta/Adıyaman','5066276619','Fraud','The crook who introduced himself as a prosecutor on the phone took the old mans surgery money and got lost','19:41:22','2005-11-12','Tokat'),('Faruk','Hallaçlar, 3003. Sk. No 26 Demirci/Manisa','5353422785','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','10:05:25','2020-01-25','Kutahya'),('Serdar','Barbaros Mah. M. Emin Durul Cd. No 38 Denizli','5449233455','Robbery','Hatchet-wielding doughnut thief nabbed by police a block away eating stolen sweets: cops','21:14:00','2011-03-23','Adana'),('Serdar','Şekeroğlu Mah. Hamdi Kutlar Cd. Uzun Çarşı No 49 Şahinbey/Gaziantep','5066276619','Fraud','The crook who introduced himself as a prosecutor on the phone took the old mans surgery money and got lost','18:02:05','2016-03-19','Ankara'),('Serdar','Çarşı, Mahmut Goloğlu Cd. 4A Susuz/Kars','5384877124','Arson','Operator Is Killed in a Subway Fire in Manhattan; Arson Is Suspected','18:02:05','2017-09-17','Mus'),('Serdar','Akkapı, 12126. Sk. No 2 Seyhan/Adana','5384877124','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','18:02:05','2018-01-23','Canakkale'),('Zeynep','Akkapı, 12126. Sk. No 2 Seyhan/Adana','5066276619','Identity Theft','Refugee fled to Europe with fake passport, currently sought all over Europe','21:14:00','2017-09-17','Ankara'),('Zeynep','Hallaçlar, 3003. Sk. No 26 Demirci/Manisa','5552614578','Robbery','Hatchet-wielding doughnut thief nabbed by police a block away eating stolen sweets: cops','13:20:00','2012-10-12','Mus'),('Zeynep','Atatürk Mah. Şirinevler Cd. No 14 Keçiören/Ankara','5452894567','Burglary','The thief who knew the owner of the house was on vacation, robbed the house','13:20:00','2008-04-21','Diyarbakir'),('Ezgi','Cumhuriyet, Kır Mevki Sk. No 45 Ortahisar/Trabzon','5321456785','Burglary','The thief who knew the owner of the house was on vacation, robbed the house','22:50:00','2017-09-17','Antalya'),('Ezgi','Mimar Sinan, 1122. Sk. Merkez/Erzincan','5459322345','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','22:50:00','2015-11-27','Mus'),('Ezgi','Zafer, Mehmet Buyruk Cd. No 67 Merkez/Kayseri','4442622010','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','22:50:00','2005-11-12','Gaziantep'),('Elif','Barbaros Mah. M. Emin Durul Cd. No 38 Denizli','5353422785','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','14:12:00','2010-05-07','Van'),('Zeynep','Fırat, 5005 Sk. No 123 Zonguldak','5333899123','Burglary','The thief who knew the owner of the house was on vacation, robbed the house','17:36:00','2013-08-20','Kutahya'),('Zeynep','Karakavak, 4. Sk. No 17 Çamlıhemşin/Rize','5351899022','Vandalism','Model railway show wantonly destroyed by vandals','19:41:22','2020-01-25','Istanbul'),('Buse','İzzetiye, Mücelli Cd. No 16 Yenimahalle/Ankara','5034581245','Robbery','Hatchet-wielding doughnut thief nabbed by police a block away eating stolen sweets: cops','19:41:22','2008-04-21','Adana'),('Zeynep','Fırat, 5005 Sk. No 123 Zonguldak','5384877124','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','20:30:25','2008-04-21','Adana'),('Zeynep','Fırat, 5005 Sk. No 123 Zonguldak','5305600221','Robbery','Hatchet-wielding doughnut thief nabbed by police a block away eating stolen sweets: cops','20:30:25','2013-08-20','Van'),('Zeynep',' Hacı Özer Efendi Cd. No 30 Kahta/Adıyaman','5381579803','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','20:30:25','2010-05-07','Gaziantep'),('Faruk','Şekeroğlu Mah. Hamdi Kutlar Cd. Uzun Çarşı No 49 Şahinbey/Gaziantep','5321114444','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','20:30:25','2020-01-25','Adana'),('Ezgi','Eskikale, Şifaiye Medresesi, Çifte Minare Sk. No 12 Merkez/Sivas','5058128990','Vandalism','Model railway show wantonly destroyed by vandals','20:30:25','2005-11-12','Diyarbakir'),('Buse','Doğuş, Küçük Kumköprü Cd. No 93 Karatay/Konya','5449233455','Vandalism','Model railway show wantonly destroyed by vandals','11:22:00','2008-04-21','Erzurum'),('Harun','Akkapı, 12126. Sk. No 2 Seyhan/Adana','5054548927','Attempt','The tenant attempted to kill the landlord','19:41:22','2012-10-12','Gaziantep'),('Veli','Eskikale, Şifaiye Medresesi, Çifte Minare Sk. No 12 Merkez/Sivas','5305600221','Burglary','The thief who knew the owner of the house was on vacation, robbed the house','18:02:05','2011-03-23','Izmir'),('Harun','Camikebir Mah. Sığacık Cd. No 112/5 Seferihisar/İzmir','5452894567','Arson','Operator Is Killed in a Subway Fire in Manhattan; Arson Is Suspected','20:30:25','2001-05-04','Bursa'),('Ufuk','Akkapı, 12126. Sk. No 2 Seyhan/Adana','5459322345','Attempt','The tenant attempted to kill the landlord','12:40:50','2012-10-12','Erzurum'),('Buse','Akkapı, 12126. Sk. No 2 Seyhan/Adana','5449233455','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','12:40:50','2020-01-25','Denizli'),('Buse','Hallaçlar, 3003. Sk. No 26 Demirci/Manisa','5034581245','Kidnapping','Arunachal Man Kidnapped By Chinese Army Yet To Be Traced: Police','20:30:25','2001-05-04','Bolu'),('Buse','Mimar Sinan, 1122. Sk. Merkez/Erzincan','5066276619','Burglary','The thief who knew the owner of the house was on vacation, robbed the house','13:20:00','1995-10-18','Canakkale'),('Ufuk','Hallaçlar, 3003. Sk. No 26 Demirci/Manisa','5034581245','Robbery','Hatchet-wielding doughnut thief nabbed by police a block away eating stolen sweets: cops','17:36:00','2005-11-12','Eskisehir'),('Zeynep','Atatürk Mah. Şirinevler Cd. No 14 Keçiören/Ankara','5072177889','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','17:36:00','2014-10-02','Canakkale'),('Zeynep',' Hacı Özer Efendi Cd. No 30 Kahta/Adıyaman','5343122894','Attempt','The tenant attempted to kill the landlord','17:36:00','1995-10-18','Izmir'),('Emel','Karakavak, 4. Sk. No 17 Çamlıhemşin/Rize','5449233455','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','16:52:00','2007-01-30','Gaziantep'),('Emel','Akkapı, 12126. Sk. No 2 Seyhan/Adana','5343122894','Kidnapping','Arunachal Man Kidnapped By Chinese Army Yet To Be Traced: Police','12:40:50','2004-05-17','Istanbul'),('Emel','Şekeroğlu Mah. Hamdi Kutlar Cd. Uzun Çarşı No 49 Şahinbey/Gaziantep','5449233455','Vandalism','Model railway show wantonly destroyed by vandals','23:25:15','2020-01-25','Tokat'),('Emel','Fırat, 5005 Sk. No 123 Zonguldak','5066276619','Arson','Operator Is Killed in a Subway Fire in Manhattan; Arson Is Suspected','23:25:15','2011-03-23','Istanbul'),('Emel','Hallaçlar, 3003. Sk. No 26 Demirci/Manisa','5459322345','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','21:14:00','2004-05-17','Izmir'),('Emel','Cumhuriyet, Kır Mevki Sk. No 45 Ortahisar/Trabzon','5381579803','Vandalism','Model railway show wantonly destroyed by vandals','22:50:00','2015-11-27','Denizli'),('Emre','Kavaklıbağ, İnönü Cd. No 54 Battalgazi/Malatya','5336192629','Burglary','The thief who knew the owner of the house was on vacation, robbed the house','22:50:00','2005-11-12','Ankara'),('Haydar','Hallaçlar, 3003. Sk. No 26 Demirci/Manisa','5321114444','Identity Theft','Refugee fled to Europe with fake passport, currently sought all over Europe','22:50:00','2014-10-02','Gaziantep'),('Harun','Barbaros Mah. M. Emin Durul Cd. No 38 Denizli','5058128990','Vandalism','Model railway show wantonly destroyed by vandals','12:40:50','2012-10-12','Antalya'),('Veli','Barbaros Mah. M. Emin Durul Cd. No 38 Denizli','5384877124','Attempt','The tenant attempted to kill the landlord','20:30:25','2005-11-12','Canakkale'),('Zeynep','Hallaçlar, 3003. Sk. No 26 Demirci/Manisa','5351899022','Homicide','Journalist and bodyguard shot dead while leaving restaurant','20:30:25','2006-08-24','Gaziantep'),('Serdar','Mimar Sinan, 1122. Sk. Merkez/Erzincan','5552614578','Shoplifting','Shoplifter attempts a getaway in hijacked Uber while also wearing ankle bracelet','20:30:25','2001-05-04','Kutahya'),('Emel','Kayhan, Üçler Sk. No 1 Nilüfer/Bursa','5333899123','Homicide','Journalist and bodyguard shot dead while leaving restaurant','12:40:50','2015-11-27','Antalya'),('Emel','Fırat, 5005 Sk. No 123 Zonguldak','5338726789','Burglary','The thief who knew the owner of the house was on vacation, robbed the house','18:02:05','2015-11-27','Ankara'),('Emel','Kavaklıbağ, İnönü Cd. No 54 Battalgazi/Malatya','5072177889','Fraud','The crook who introduced himself as a prosecutor on the phone took the old mans surgery money and got lost','22:50:00','2004-05-17','Mus'),('Emel','Gülbaharhatun, Gaziosmanpaşa Blv. No 97 Merkez/Tokat','4442622010','Kidnapping','Arunachal Man Kidnapped By Chinese Army Yet To Be Traced: Police','22:50:00','2017-09-17','Tokat'),('Elif','Çarşı, Mahmut Goloğlu Cd. 4A Susuz/Kars','5072177889','Identity Theft','Refugee fled to Europe with fake passport, currently sought all over Europe','22:50:00','2014-10-02','Van'),('Ezgi','Çarşı, Mahmut Goloğlu Cd. 4A Susuz/Kars','5058128990','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','22:50:00','2018-01-23','Canakkale'),('Ezgi','Doğuş, Küçük Kumköprü Cd. No 93 Karatay/Konya','5343122894','Kidnapping','Arunachal Man Kidnapped By Chinese Army Yet To Be Traced: Police','22:50:00','2006-08-24','Kars'),('Harun','Eskikale, Şifaiye Medresesi, Çifte Minare Sk. No 12 Merkez/Sivas','5384877124','Arson','Operator Is Killed in a Subway Fire in Manhattan; Arson Is Suspected','17:36:00','2014-10-02','Siirt'),('Harun','Kayhan, Üçler Sk. No 1 Nilüfer/Bursa','5333899123','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','18:02:05','2005-11-12','Denizli'),('Veli','Barbaros Mah. M. Emin Durul Cd. No 38 Denizli','5452894567','Homicide','Journalist and bodyguard shot dead while leaving restaurant','18:02:05','2020-01-25','Kutahya'),('Veli','Camikebir Mah. Sığacık Cd. No 112/5 Seferihisar/İzmir','5384877124','Robbery','Hatchet-wielding doughnut thief nabbed by police a block away eating stolen sweets: cops','18:02:05','2006-08-24','Mus'),('Ufuk','Kayhan, Üçler Sk. No 1 Nilüfer/Bursa','5343122894','Kidnapping','Arunachal Man Kidnapped By Chinese Army Yet To Be Traced: Police','18:02:05','2016-03-19','Ankara'),('Veli','Zafer, Mehmet Buyruk Cd. No 67 Merkez/Kayseri','5384877124','Theft','Attempted marijuana theft led to Fitchburg teens murder','10:05:25','2004-05-17','Canakkale'),('Buse','Cumhuriyet, Kır Mevki Sk. No 45 Ortahisar/Trabzon','4442622010','Arson','Operator Is Killed in a Subway Fire in Manhattan; Arson Is Suspected','10:05:25','2020-01-25','Bursa'),('Ezgi','Kavaklıbağ, İnönü Cd. No 54 Battalgazi/Malatya','5384877124','Computer Crime','Former Employee of Medical Packaging Company Charged with Sabotaging Electronic Shipping Records Leading to the Delay of PPE to Health Care Providers','14:12:00','2007-01-30','Diyarbakir'),('Zeynep','Kayhan, Üçler Sk. No 1 Nilüfer/Bursa','5058128990','Shoplifting','Shoplifter attempts a getaway in hijacked Uber while also wearing ankle bracelet','14:12:00','2008-04-21','Ankara'),('Zeynep','Turgut Özal,','5066276619','Cyberbullying','Woman Charged by Federal Complaint with Posting Threatening Communications Online','14:12:00','2020-01-25','Erzurum'),('Buse','Zafer, Mehmet Buyruk Cd. No 67 Merkez/Kayseri','5336192629','Robbery','Hatchet-wielding doughnut thief nabbed by police a block away eating stolen sweets: cops','23:25:15','2004-05-17','Bolu'),('Buse','Barbaros Mah. M. Emin Durul Cd. No 38 Denizli','5338726789','Vandalism','Model railway show wantonly destroyed by vandals','23:25:15','2012-10-12','Eskisehir'),('Buse','Zafer, Mehmet Buyruk Cd. No 67 Merkez/Kayseri','5351899022','Attempt','The tenant attempted to kill the landlord','11:22:00','2005-11-12','Gaziantep');
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
INSERT INTO `criminalreport` VALUES ('erem','kilic','male','erem1234','2000-05-02','2020-04-02','malatya','murder','5 years prison'),('ozan','zorlu','male','ozan5468','1990-01-02','2019-08-08','bursa','thief','2 years prison');
/*!40000 ALTER TABLE `criminalreport` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `feedbackid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  `feedback` varchar(150) NOT NULL,
  `feedbackdate` date NOT NULL,
  PRIMARY KEY (`feedbackid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
INSERT INTO `feedback` VALUES (9,'ozan','zorlu','Thanks','2020-05-21'),(10,'ozan','zorlu','Thank you for your time','2020-05-06'),(11,'utku','guney','Thanks','2020-04-01');
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hotnews`
--

DROP TABLE IF EXISTS `hotnews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hotnews` (
  `newsid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `text` varchar(200) NOT NULL,
  `newsdate` date NOT NULL,
  PRIMARY KEY (`newsid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotnews`
--

LOCK TABLES `hotnews` WRITE;
/*!40000 ALTER TABLE `hotnews` DISABLE KEYS */;
INSERT INTO `hotnews` VALUES (1,'Impossible  3 thief event','The police arrested 3 thief. Go to the court.','2017-01-02'),(2,'Serial killers in Florida','In summer, 5 serial killer killed many people in 1 day. It was the record of the history.','1980-05-10'),(3,'Robbery of things','Robbery was occured last night.Was it mysterious?','2020-05-14'),(6,'Incredible Murder','Last night, 1 man and 2 women murdered','1987-05-06');
/*!40000 ALTER TABLE `hotnews` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mostwanted`
--

LOCK TABLES `mostwanted` WRITE;
/*!40000 ALTER TABLE `mostwanted` DISABLE KEYS */;
INSERT INTO `mostwanted` VALUES ('ozan','zorlu','male','1998-05-30','bursa','turkey','turkish','murder someone',1),('ayberk','ortancalar','male','1998-04-21','izmir','England','english','thief a house',2),('utku','guney','male','1995-06-02','nevsehir','China','chinese','hacking ',4),('hazal','kaya','female','1980-05-07','istanbul','France','french','robbery',5);
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

--
-- Table structure for table `usercomplaint`
--

DROP TABLE IF EXISTS `usercomplaint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usercomplaint` (
  `complaintid` int(11) NOT NULL AUTO_INCREMENT,
  `comptitle` varchar(45) NOT NULL,
  `usercomplaint` varchar(85) NOT NULL,
  `compsubject` varchar(100) NOT NULL,
  `compdate` date NOT NULL,
  `adminreply` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`complaintid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usercomplaint`
--

LOCK TABLES `usercomplaint` WRITE;
/*!40000 ALTER TABLE `usercomplaint` DISABLE KEYS */;
INSERT INTO `usercomplaint` VALUES (3,'amdmadmad','kdladkladkald','euryeuryeuryeur','2020-05-06','admin reply in a different way.'),(4,'kskskskskssk','yeyyeyeyee','llllaaaa','2019-05-06','ozan reply the message'),(5,'Loud Music','I have a complaint','In our neighborhood, there are so much music in it','2016-05-06','Okey, we take care of it'),(6,'addad','rerer','dad','2018-05-06',NULL);
/*!40000 ALTER TABLE `usercomplaint` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-20 19:08:28
