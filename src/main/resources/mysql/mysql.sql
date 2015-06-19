#select * from users;
#//jdbc:mysql://localhost:3306/security

########################################################33333
DROP TABLE IF EXISTS `security`.`auction`;
CREATE TABLE  `security`.`auction` (
  `id` varchar(255) NOT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `createdDate` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `minExpectedAmount` double DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `category_id` varchar(255) DEFAULT NULL,
  `maxBid_username` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK3BC5762324453131` (`maxBid_username`),
  KEY `FK3BC57623A8E40902` (`category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `security`.`authorities`;
CREATE TABLE  `security`.`authorities` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AUTHORITY` varchar(255) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKAB62A7016624DF09` (`username`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `security`.`bid`;
CREATE TABLE  `security`.`bid` (
  `username` varchar(32) NOT NULL,
  `auctionId` varchar(255) NOT NULL,
  `bidAmount` double NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `security`.`category`;
CREATE TABLE  `security`.`category` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `security`.`member`;
CREATE TABLE  `security`.`member` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AGE` int(11) DEFAULT NULL,
  `FIRSTNAME` varchar(255) DEFAULT NULL,
  `LASTNAME` varchar(255) DEFAULT NULL,
  `MEMBERNUMBER` int(11) DEFAULT NULL,
  `TITLE` varchar(255) DEFAULT NULL,
  `USERNAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK87557E9A6624DF09` (`USERNAME`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `security`.`user_roles`;
CREATE TABLE  `security`.`user_roles` (
  `username` varchar(20) DEFAULT NULL,
  `role` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `security`.`users`;
CREATE TABLE  `security`.`users` (
  `USERNAME` varchar(255) NOT NULL,
  `enabled` tinyint(1) DEFAULT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `verifyPassword` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`USERNAME`),
  UNIQUE KEY `USERNAME` (`USERNAME`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
