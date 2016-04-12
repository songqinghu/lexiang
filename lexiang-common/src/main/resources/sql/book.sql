/*
Navicat MySQL Data Transfer

Source Server         : game
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : lexiang

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2016-04-12 22:13:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bookId` bigint(20) NOT NULL AUTO_INCREMENT,
  `bookname` varchar(50) DEFAULT NULL,
  `booktype` varchar(50) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `urlpath` varchar(50) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `status` varchar(1) DEFAULT NULL,
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`bookId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'rrr', 'txt', '222', 'e', 'tt', '2', '2016-03-24 23:12:17');
INSERT INTO `book` VALUES ('2', '亵渎', '异界传奇', '烟雨江南', 'http://www.baidu.com', 'e2d3', '1', '2016-04-01 00:16:32');
INSERT INTO `book` VALUES ('3', '亵渎', '异界传奇', '烟雨江南', 'http://www.baidu.com', 'e2d3', '1', '2016-04-01 00:19:36');
INSERT INTO `book` VALUES ('4', '暗夜君王', '血族传说', '烟雨江南', 'hlterw;welk;jrl', 'asjkdf', '1', '2016-04-01 00:19:36');
INSERT INTO `book` VALUES ('5', '亵渎', '异界传奇', '烟雨江南', 'http://www.baidu.com', 'e2d3', '1', '2016-04-01 00:23:24');
INSERT INTO `book` VALUES ('6', '暗夜君王', '血族传说', '烟雨江南', 'hlterw;welk;jrl', 'asjkdf', '1', '2016-04-01 00:23:24');
INSERT INTO `book` VALUES ('7', '亵渎', '异界传奇', '烟雨江南', 'http://www.baidu.com', 'e2d3', '1', '2016-04-01 00:24:23');
INSERT INTO `book` VALUES ('8', '暗夜君王', '血族传说', '烟雨江南', 'hlterw;welk;jrl', 'asjkdf', '1', '2016-04-01 00:24:23');
INSERT INTO `book` VALUES ('9', '风月大陆', '计算机编程', 'jetty', 'alk;sdjflkjads;lkfj', '555asklf', '1', '2016-04-01 00:24:23');
