-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Apr 05, 2018 at 09:48 PM
-- Server version: 5.5.39
-- PHP Version: 5.4.32

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
-- Table structure for table `cart`
--

CREATE TABLE IF NOT EXISTS `cart` (
`id` int(11) NOT NULL,
  `item_ID` int(11) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `custom` varchar(150) DEFAULT NULL
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=43 ;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`id`, `item_ID`, `QUANTITY`, `customer_id`, `custom`) VALUES
(15, 6, 1, 5, 'img-1522055775-100.png');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
`id` int(11) NOT NULL,
  `category_name` varchar(50) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `category_name`) VALUES
(3, 'Clothing'),
(4, 'Home and Kitchen'),
(5, 'Mugs&Sippers'),
(6, 'Electronics_accessories');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
`id` int(11) NOT NULL,
  `c_name` varchar(50) NOT NULL,
  `c_address` varchar(50) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `c_name`, `c_address`) VALUES
(1, 'guest', 'guestAddress'),
(2, 'guest', 'guestAddress'),
(3, 'guest', 'guestAddress'),
(4, 'guest', 'guestAddress'),
(5, 'guest', 'guestAddress'),
(6, 'banee', 'cgfjgjj'),
(7, 'bill', 'billa'),
(8, 'bill', 'billa'),
(9, 'bb', 'bba'),
(10, 'cvb', 'cvbhu');

-- --------------------------------------------------------

--
-- Table structure for table `delivery`
--

CREATE TABLE IF NOT EXISTS `delivery` (
`id` int(11) NOT NULL,
  `daddress` varchar(50) NOT NULL,
  `order_id` int(11) NOT NULL,
  `delivery_name` varchar(50) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=35 ;

--
-- Dumping data for table `delivery`
--

INSERT INTO `delivery` (`id`, `daddress`, `order_id`, `delivery_name`) VALUES
(1, 'valncherry', 1, 'banee'),
(3, 'pff', 2, 'nbmmn'),
(5, 'sh', 3, 'sha'),
(6, 'ss', 4, 'ssa'),
(7, 'ss', 5, 'ssa'),
(8, 'cvbs', 6, 'cvgbmms'),
(9, 'cvbs', 7, 'cvgbmms'),
(10, 'cvbs', 8, 'cvgbmms'),
(11, 'cvbs', 9, 'cvgbmms'),
(12, 'cvbs', 10, 'cvgbmms'),
(13, 'cvbs', 11, 'cvgbmms'),
(14, 'cvbs', 12, 'cvgbmms'),
(15, 'cvbs', 13, 'cvgbmms'),
(16, 'cvbs', 14, 'cvgbmms'),
(17, 'cvbs', 15, 'cvgbmms'),
(18, 'cvbs', 16, 'cvgbmms'),
(19, 'cvbs', 17, 'cvgbmms'),
(20, 'cvbs', 18, 'cvgbmms'),
(21, 'cvbs', 19, 'cvgbmms'),
(22, 'cvbs', 20, 'cvgbmms'),
(23, 'cvbs', 21, 'cvgbmms'),
(24, 'cvbs', 22, 'cvgbmms'),
(25, 'cvbs', 23, 'cvgbmms'),
(26, 'cvbs', 24, 'cvgbmms'),
(27, 'cvbs', 25, 'cvgbmms'),
(28, 'cvbs', 26, 'cvgbmms'),
(29, 'cvbs', 27, 'cvgbmms'),
(30, 'cvbs', 28, 'cvgbmms'),
(31, 'cvbs', 29, 'cvgbmms'),
(32, 'cvbs', 30, 'cvgbmms'),
(33, 'cvbs', 31, 'cvgbmms'),
(34, 'cvbs', 32, 'cvgbmms');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `role` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`, `role`) VALUES
('user', 'pass', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE IF NOT EXISTS `orders` (
`id` int(11) NOT NULL,
  `odate` datetime DEFAULT NULL,
  `expecteddate` datetime DEFAULT NULL,
  `remarks` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `model_id` int(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `amount` double NOT NULL,
  `custom` varchar(150) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=33 ;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `odate`, `expecteddate`, `remarks`, `status`, `model_id`, `quantity`, `customer_id`, `amount`, `custom`) VALUES
(2, '2018-03-26 14:35:33', '2018-03-26 14:35:33', NULL, NULL, 7, 1, 6, 699, NULL),
(3, '2018-03-26 14:40:04', '2018-03-26 14:40:04', NULL, NULL, 7, 1, 7, 699, NULL),
(4, '2018-03-26 14:41:46', '2018-03-26 14:41:46', NULL, NULL, 6, 11, 9, 7689, 'img-1522055489-31.png'),
(5, '2018-03-26 14:41:46', '2018-03-26 14:41:46', NULL, NULL, 6, 1, 9, 699, NULL),
(6, '2018-03-28 17:22:17', '2018-03-28 17:22:17', NULL, NULL, 12, 1, 10, 199, 'img-1522235431-81.png'),
(7, '2018-03-28 17:22:17', '2018-03-28 17:22:17', NULL, NULL, 7, 1, 10, 699, 'img-1522234868-4.png'),
(8, '2018-03-28 17:22:17', '2018-03-28 17:22:17', NULL, NULL, 12, 1, 10, 199, 'img-1522235467-25.png'),
(9, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 12, 1, 10, 199, 'img-1522235483-93.png'),
(10, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 12, 1, 10, 199, 'img-1522235496-68.png'),
(11, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 8, 1, 10, 699, 'img-1522235532-56.png'),
(12, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 8, 1, 10, 699, 'img-1522235539-79.png'),
(13, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 12, 1, 10, 199, 'img-1522235560-80.png'),
(14, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 6, 1, 10, 699, 'img-1522235774-16.png'),
(15, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 6, 1, 10, 699, 'img-1522236143-14.png'),
(16, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 7, 1, 10, 699, 'img-1522236248-94.png'),
(17, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 7, 1, 10, 699, 'img-1522236258-64.png'),
(18, '2018-03-28 17:22:18', '2018-03-28 17:22:18', NULL, NULL, 6, 1, 10, 699, 'img-1522236298-86.png'),
(19, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 6, 1, 10, 699, 'img-1522236332-97.png'),
(20, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 6, 1, 10, 699, 'img-1522236339-57.png'),
(21, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 6, 1, 10, 699, 'img-1522236347-86.png'),
(22, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 6, 1, 10, 699, 'img-1522236376-93.png'),
(23, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 6, 1, 10, 699, 'img-1522236627-33.png'),
(24, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 6, 1, 10, 699, 'img-1522236637-75.png'),
(25, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 6, 1, 10, 699, 'img-1522236758-91.png'),
(26, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 6, 1, 10, 699, 'img-1522237218-51.png'),
(27, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 9, 1, 10, 899, 'img-1522237286-30.png'),
(28, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 6, 1, 10, 699, 'img-1522237451-0.png'),
(29, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 8, 1, 10, 699, 'img-1522237646-82.png'),
(30, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 9, 1, 10, 899, 'img-1522237742-24.png'),
(31, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 9, 1, 10, 899, 'img-1522237768-72.png'),
(32, '2018-03-28 17:22:19', '2018-03-28 17:22:19', NULL, NULL, 9, 1, 10, 899, 'img-1522237802-48.png');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
`id` int(11) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `prize` double NOT NULL,
  `quantity` int(11) NOT NULL,
  `model` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `size` int(11) NOT NULL,
  `IMAGE` varchar(50) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `productname`, `category`, `prize`, `quantity`, `model`, `color`, `size`, `IMAGE`) VALUES
(5, 'Round Neck T Shirt', 'Clothing', 600, 10, 'RNT1', 'Orange', 30, 'Round Neck T Shirt.jpg'),
(6, 'RoundNeck Tshirt', 'Clothing', 699, 20, 'ts22', 'black', 40, 'RoundNeck Tshirt.jpg'),
(7, 'RealWhite Tshirt', 'Clothing', 699, 20, 'ts23', 'white', 42, 'RealWhite Tshirt.jpg'),
(8, 'Vneck Tshirt', 'Clothing', 699, 20, 'ts24', 'white', 40, 'Vneck Tshirt.jpg'),
(9, 'Tshirt', 'Clothing', 899, 5, 't55', 'white', 42, 'Tshirt.jpg'),
(12, 'omega curved bottle', 'Mugs&Sippers', 199, 10, 'super sippers', 'metalic', 10, 'omega curved bottle.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `sub_category`
--

CREATE TABLE IF NOT EXISTS `sub_category` (
`id` int(11) NOT NULL,
  `cat_name` varchar(50) NOT NULL,
  `parent_ID` int(11) NOT NULL
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
(20, 'Ceramic_Plates', 4),
(21, 'Pen_Drives', 6),
(23, 'Mouse_Pads', 6);

-- --------------------------------------------------------

--
-- Table structure for table `wishlist`
--

CREATE TABLE IF NOT EXISTS `wishlist` (
`id` int(11) NOT NULL,
  `item_ID` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `delivery`
--
ALTER TABLE `delivery`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sub_category`
--
ALTER TABLE `sub_category`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `wishlist`
--
ALTER TABLE `wishlist`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=43;
--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `delivery`
--
ALTER TABLE `delivery`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=35;
--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `sub_category`
--
ALTER TABLE `sub_category`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `wishlist`
--
ALTER TABLE `wishlist`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
