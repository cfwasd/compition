/*
 Navicat Premium Data Transfer

 Source Server         : project
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : carbon

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 10/11/2023 16:34:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for announcement
-- ----------------------------
DROP TABLE IF EXISTS `announcement`;
CREATE TABLE `announcement`  (
  `AnnouncementID` int NOT NULL AUTO_INCREMENT,
  `Title` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Content` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `Publisher` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `PublishTime` datetime NOT NULL,
  `AttachmentName` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `AttachmentURL` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`AnnouncementID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of announcement
-- ----------------------------
INSERT INTO `announcement` VALUES (1, '6', '6', '6', '2023-11-11 00:54:33', '6', '6');
INSERT INTO `announcement` VALUES (3, 'title', 'content', 'publisher', '2023-11-10 18:54:33', 'attachmentName', 'attachmentURL');
INSERT INTO `announcement` VALUES (4, 'title', 'content', 'publisher', '2023-11-10 18:54:33', 'attachmentName', 'attachmentURL');
INSERT INTO `announcement` VALUES (5, 'title', 'content', 'publisher', '2023-11-10 18:54:33', 'attachmentName', 'attachmentURL');

-- ----------------------------
-- Table structure for bomchangelog
-- ----------------------------
DROP TABLE IF EXISTS `bomchangelog`;
CREATE TABLE `bomchangelog`  (
  `LogID` int NOT NULL AUTO_INCREMENT,
  `BOMID` int NULL DEFAULT NULL,
  `ModifiedBy` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ModifiedDate` datetime NULL DEFAULT NULL,
  `Name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductModel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductSpecs` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductUnit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`LogID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of bomchangelog
-- ----------------------------

-- ----------------------------
-- Table structure for bomdetail
-- ----------------------------
DROP TABLE IF EXISTS `bomdetail`;
CREATE TABLE `bomdetail`  (
  `DetailID` int NOT NULL AUTO_INCREMENT,
  `BOMID` int NULL DEFAULT NULL,
  `MaterialID` int NULL DEFAULT NULL,
  `MaterialModel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MaterialSpecs` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MaterialUnit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Quantity` int NULL DEFAULT NULL,
  `Remarks` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`DetailID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of bomdetail
-- ----------------------------

-- ----------------------------
-- Table structure for bommanagement
-- ----------------------------
DROP TABLE IF EXISTS `bommanagement`;
CREATE TABLE `bommanagement`  (
  `BOMID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ProductName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ProductModel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductSpecs` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductUnit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`BOMID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of bommanagement
-- ----------------------------

-- ----------------------------
-- Table structure for energyconsumption
-- ----------------------------
DROP TABLE IF EXISTS `energyconsumption`;
CREATE TABLE `energyconsumption`  (
  `ConsumptionID` int NOT NULL AUTO_INCREMENT,
  `EquipmentID` int NOT NULL,
  `ProductionQuantity` int NULL DEFAULT NULL,
  `UnitPowerConsumption` decimal(10, 2) NULL DEFAULT NULL,
  `TotalPowerConsumption` decimal(10, 2) NULL DEFAULT NULL,
  `UnitCarbonEmission` decimal(10, 2) NULL DEFAULT NULL,
  `TotalCarbonEmission` decimal(10, 2) NULL DEFAULT NULL,
  `Date` date NULL DEFAULT NULL,
  PRIMARY KEY (`ConsumptionID`) USING BTREE,
  INDEX `EquipmentID`(`EquipmentID` ASC) USING BTREE,
  CONSTRAINT `energyconsumption_ibfk_1` FOREIGN KEY (`EquipmentID`) REFERENCES `equipment` (`EquipmentID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of energyconsumption
-- ----------------------------

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment`  (
  `EquipmentID` int NOT NULL,
  `EquipmentName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `EquipmentCode` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EquipmentModel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductionDate` date NULL DEFAULT NULL,
  `ProductionBatch` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Manufacturer` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EquipmentStatus` enum('Idle','In Use','Faulty') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Remarks` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`EquipmentID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of equipment
-- ----------------------------

-- ----------------------------
-- Table structure for equipmentchangelog
-- ----------------------------
DROP TABLE IF EXISTS `equipmentchangelog`;
CREATE TABLE `equipmentchangelog`  (
  `LogID` int NOT NULL AUTO_INCREMENT,
  `EquipmentID` int NULL DEFAULT NULL,
  `ModifiedBy` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ModifiedDate` datetime NULL DEFAULT NULL,
  `EquipmentName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EquipmentCode` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EquipmentModel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductionDate` date NULL DEFAULT NULL,
  `ProductionBatch` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Manufacturer` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `EquipmentStatus` enum('Idle','In Use','Faulty') CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Remarks` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`LogID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of equipmentchangelog
-- ----------------------------

-- ----------------------------
-- Table structure for material
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material`  (
  `MaterialID` int NOT NULL AUTO_INCREMENT,
  `MaterialCode` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MaterialName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `MaterialModel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MaterialSpecs` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MaterialUnit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MaterialPrice` decimal(10, 2) NULL DEFAULT NULL,
  `MaterialType` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Remarks` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`MaterialID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of material
-- ----------------------------

-- ----------------------------
-- Table structure for productmodel
-- ----------------------------
DROP TABLE IF EXISTS `productmodel`;
CREATE TABLE `productmodel`  (
  `ModelID` int NOT NULL AUTO_INCREMENT,
  `ModelName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ProductName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ProductModel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductSpecs` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductUnit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Remarks` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ModelID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of productmodel
-- ----------------------------

-- ----------------------------
-- Table structure for productmodelchangelog
-- ----------------------------
DROP TABLE IF EXISTS `productmodelchangelog`;
CREATE TABLE `productmodelchangelog`  (
  `LogID` int NOT NULL AUTO_INCREMENT,
  `ModelID` int NULL DEFAULT NULL,
  `ModifiedBy` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ModifiedDate` datetime NULL DEFAULT NULL,
  `ModelName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductModel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductSpecs` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProductUnit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Remarks` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`LogID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of productmodelchangelog
-- ----------------------------

-- ----------------------------
-- Table structure for productmodeldetail
-- ----------------------------
DROP TABLE IF EXISTS `productmodeldetail`;
CREATE TABLE `productmodeldetail`  (
  `DetailID` int NOT NULL AUTO_INCREMENT,
  `ModelID` int NULL DEFAULT NULL,
  `MaterialID` int NULL DEFAULT NULL,
  `MaterialModel` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MaterialSpecs` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MaterialUnit` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Remarks` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`DetailID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of productmodeldetail
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
