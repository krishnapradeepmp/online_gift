-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 26, 2018 at 09:18 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `onlinegift`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `id` int(11) NOT NULL,
  `item_ID` int(11) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `custom` varchar(150) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`id`, `item_ID`, `QUANTITY`, `customer_id`, `custom`) VALUES
(15, 6, 1, 5, 'img-1522055775-100.png');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `category_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `c_name` varchar(50) NOT NULL,
  `c_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(9, 'bb', 'bba');

-- --------------------------------------------------------

--
-- Table structure for table `delivery`
--

CREATE TABLE `delivery` (
  `id` int(11) NOT NULL,
  `daddress` varchar(50) NOT NULL,
  `order_id` int(11) NOT NULL,
  `delivery_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `delivery`
--

INSERT INTO `delivery` (`id`, `daddress`, `order_id`, `delivery_name`) VALUES
(1, 'valncherry', 1, 'banee'),
(3, 'pff', 2, 'nbmmn'),
(5, 'sh', 3, 'sha'),
(6, 'ss', 4, 'ssa'),
(7, 'ss', 5, 'ssa');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
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

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `odate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `expecteddate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remarks` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `model_id` int(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `amount` double NOT NULL,
  `custom` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `odate`, `expecteddate`, `remarks`, `status`, `model_id`, `quantity`, `customer_id`, `amount`, `custom`) VALUES
(2, '2018-03-26 14:35:33', '2018-03-26 14:35:33', NULL, NULL, 7, 1, 6, 699, NULL),
(3, '2018-03-26 14:40:04', '2018-03-26 14:40:04', NULL, NULL, 7, 1, 7, 699, NULL),
(4, '2018-03-26 14:41:46', '2018-03-26 14:41:46', NULL, NULL, 6, 11, 9, 7689, 'img-1522055489-31.png'),
(5, '2018-03-26 14:41:46', '2018-03-26 14:41:46', NULL, NULL, 6, 1, 9, 699, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `prize` double NOT NULL,
  `quantity` int(11) NOT NULL,
  `model` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `size` int(11) NOT NULL,
  `IMAGE` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE `sub_category` (
  `id` int(11) NOT NULL,
  `cat_name` varchar(50) NOT NULL,
  `parent_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

CREATE TABLE `wishlist` (
  `id` int(11) NOT NULL,
  `item_ID` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `delivery`
--
ALTER TABLE `delivery`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `sub_category`
--
ALTER TABLE `sub_category`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `wishlist`
--
ALTER TABLE `wishlist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
