-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2021 at 01:34 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bloodbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

CREATE TABLE `donor` (
  `donorId` int(10) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `fatherName` varchar(100) DEFAULT NULL,
  `motherName` varchar(100) DEFAULT NULL,
  `DOB` varchar(20) DEFAULT NULL,
  `MobileNo` varchar(10) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `bloodGroup` varchar(10) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`donorId`, `name`, `fatherName`, `motherName`, `DOB`, `MobileNo`, `gender`, `email`, `bloodGroup`, `city`, `address`) VALUES
(4, 'rohit', 'himeshbhai', 'prabhaben', '05/08/1981', '6345784251', 'Male', 'rohit@gmail.com', 'A+', 'rajkot', 'rajkot gondal main road'),
(5, 'maru bhautik', 'bhagvanjibhai', 'premilaben', '03/04/2002', '6354092795', 'Male', 'marubhautik@gmail.com', 'AB+', 'Rajkot', 'Veraval (shapar)'),
(7, 'dgfgf', 'fgfg', 'fgfgf', 'gfgf', '', 'Male', '', 'A+', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `stock_id` int(11) NOT NULL,
  `blood_group` varchar(10) DEFAULT NULL,
  `units` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`stock_id`, `blood_group`, `units`) VALUES
(1, 'A+', 15),
(2, 'A-', 0),
(3, 'B+', 20),
(4, 'B-', 0),
(5, 'AB+', 0),
(6, 'AB-', 0),
(7, 'O+', 0),
(9, 'O-', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donor`
--
ALTER TABLE `donor`
  ADD PRIMARY KEY (`donorId`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`stock_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donor`
--
ALTER TABLE `donor`
  MODIFY `donorId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `stock`
--
ALTER TABLE `stock`
  MODIFY `stock_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
