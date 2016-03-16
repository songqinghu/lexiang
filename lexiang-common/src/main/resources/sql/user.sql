/*
Navicat MySQL Data Transfer

Source Server         : game
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : lexiang

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2016-03-14 21:57:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` bigint(20)   primary key not null auto_increment ,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `status` varchar(2) DEFAULT NULL,
  `createdate` datetime DEFAULT NULL,
  `updatedate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
