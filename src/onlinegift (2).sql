-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 28, 2018 at 01:10 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `onlinegift`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `category_name`) VALUES
(2, 'stationery'),
(3, 'Clothing'),
(4, 'Home and Kitchen'),
(5, 'Mugs&Sippers'),
(6, 'Electronics_accessories'),
(7, 'uuu');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(50) NOT NULL,
  `c_address` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `delivery`
--

CREATE TABLE IF NOT EXISTS `delivery` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `daddress` varchar(50) NOT NULL,
  `order_id` int(11) NOT NULL,
  `delivery_name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `delivery`
--

INSERT INTO `delivery` (`id`, `daddress`, `order_id`, `delivery_name`) VALUES
(1, 'valncherry', 1, 'banee');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE IF NOT EXISTS `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `odate` datetime NOT NULL,
  `expecteddate` datetime NOT NULL,
  `remarks` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `model_id` int(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `amount` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `odate`, `expecteddate`, `remarks`, `status`, `model_id`, `quantity`, `customer_id`, `amount`) VALUES
(1, '2017-12-27 00:00:00', '2017-12-31 00:00:00', 'urgent', 'packed', 1, 5, 2, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `productname` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `prize` double NOT NULL,
  `quantity` int(11) NOT NULL,
  `model` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `size` int(11) NOT NULL,
  `IMAGE` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `productname`, `category`, `prize`, `quantity`, `model`, `color`, `size`, `IMAGE`) VALUES
(5, 'Round Neck T Shirt', 'Clothing', 600, 10, 'RNT1', 'Orange', 30, 'Round Neck T Shirt.jpg'),
(6, 'RoundNeck Tshirt', 'Clothing', 699, 20, 'ts22', 'black', 40, 'RoundNeck Tshirt.jpg'),
(7, 'RealWhite Tshirt', 'Clothing', 699, 20, 'ts23', 'white', 42, 'RealWhite Tshirt.jpg'),
(8, 'Vneck Tshirt', 'Clothing', 699, 20, 'ts24', 'white', 40, 'Vneck Tshirt.jpg'),
(9, 'Tshirt', 'Clothing', 899, 5, 't55', 'white', 42, 'Tshirt.jpg'),
(12, 'omega curved bottle', 'Mugs&Sippers', 199, 10, 'super sippers', 'metalic', 10, 'omega curved bottle.jpg'),
(13, 'aaaa', 'Tea cup', 500, 10, 'pg', 'hjgvjhy', 2, 'aaaa.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `sub_category`
--

CREATE TABLE IF NOT EXISTS `sub_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cat_name` varchar(50) NOT NULL,
  `parent_ID` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=24 ;

--
-- Dumping data for table `sub_category`
--

INSERT INTO `sub_category` (`id`, `cat_name`, `parent_ID`) VALUES
(1, 'Pens', 2),
(2, 'Key_Chains', 2),
(3, 'Badges', 2),
(4, 'Geometry_boxs', 2),
(5, 'Notebooks', 2),
(6, 'Desk_stands', 2),
(7, 'Caps', 3),
(8, 'T-shirts', 3),
(9, 'Bed_sheets', 3),
(10, 'Cushions', 3),
(11, 'Coffee_Mugs', 5),
(12, 'Tea_Mugs', 5),
(13, 'Beer_Mugs', 5),
(14, 'Sippers', 5),
(15, 'Clocks', 4),
(16, 'Calender', 4),
(17, 'Name_Plates', 4),
(19, 'Name_Plates', 4),
(20, 'Ceramic_Plates', 4),
(21, 'Pen_Drives', 6),
(22, 'Key_Chains', 6),
(23, 'Mouse_Pads', 6);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
