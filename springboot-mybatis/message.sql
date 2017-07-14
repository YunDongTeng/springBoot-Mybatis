/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : girl

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-14 11:13:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `ID` int(50) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `NICK_NAME` varchar(50) DEFAULT NULL COMMENT '昵称',
  `IP` varchar(50) DEFAULT NULL COMMENT 'IP',
  `INSERT_TIME` datetime DEFAULT NULL COMMENT '提交时间',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('1', '张三', '116.90.34.56', '2012-01-14 16:12:09');
INSERT INTO `message` VALUES ('2', '李四', '20.38.11.24', '2017-07-28 11:03:07');
