/*
Navicat MySQL Data Transfer

Source Server         : game
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : lexiang

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2016-03-16 00:00:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookId`   bigint(20)  primary key not  null  auto_increment ,
  `bookname` varchar(50) DEFAULT NULL,
  `booktype` varchar(50) DEFAULT NULL,
  `author`  varchar(50)  DEFAULT NULL,
  `urlpath` varchar(50)  DEFAULT NULL,
   `password` varchar(10)  DEFAULT NULL,
  `status`   varchar(1)   DEFAULT NULL,
  createtime timestamp NULL DEFAULT CURRENT_TIMESTAMP 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;