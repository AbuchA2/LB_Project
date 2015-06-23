-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le: Mar 23 Juin 2015 à 12:18
-- Version du serveur: 5.6.12-log
-- Version de PHP: 5.4.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `lb_db`
--
CREATE DATABASE IF NOT EXISTS `lb_db` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `lb_db`;

-- --------------------------------------------------------

--
-- Structure de la table `achats`
--

CREATE TABLE IF NOT EXISTS `achats` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `client_id` int(20) NOT NULL,
  `produits_id` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `ID` int(15) NOT NULL AUTO_INCREMENT,
  `nom` varchar(40) NOT NULL,
  `nom_de_jeune_fille` varchar(40) DEFAULT NULL,
  `prenom` varchar(40) NOT NULL,
  `date_de_naissance` varchar(40) NOT NULL,
  `adresse` varchar(40) NOT NULL,
  `user_mail` varchar(40) NOT NULL,
  `tel` varchar(12) NOT NULL,
  `canal` varchar(40) DEFAULT NULL,
  `produits_choisis` int(5) DEFAULT NULL,
  `lien_PI` varchar(255) DEFAULT NULL,
  `lien_JD` varchar(255) DEFAULT NULL,
  `lien_IS` varchar(255) DEFAULT NULL,
  `user_id` int(40) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`ID`, `nom`, `nom_de_jeune_fille`, `prenom`, `date_de_naissance`, `adresse`, `user_mail`, `tel`, `canal`, `produits_choisis`, `lien_PI`, `lien_JD`, `lien_IS`, `user_id`) VALUES
(1, 'sadzsefg', 'fdsgh', 'qdfsgh', '2000-02-08', 'zdsfgb', 'zfedgrth', '567890', '0', 0, NULL, NULL, NULL, 0),
(2, 'A', 'C', 'B', '1999-11-01', 'aqwxsz', 'aqwxsz', '0123456789', NULL, NULL, NULL, NULL, NULL, 1),
(3, 'aqwx', 'egRHE', 'fEfdf', '1999-11-11', 'QIBUYQ', 'SCHNQqinufyb', '0633850989', NULL, NULL, NULL, NULL, NULL, 1),
(4, 'vtr', 'rftgyuijk', 'hryeuihco', '1999-11-11', 'drgyhuij', 'rtyhuijk', '0123456789', NULL, NULL, NULL, NULL, NULL, 1),
(5, 'Too', '', 'Toto', '1998-03-01', '1 rue des balais 89002', 'toto@gmail.com', '', NULL, NULL, NULL, NULL, NULL, 1),
(6, 'P', 'B', 'Sonia', '1990-03-02', 'Abfuezib', 'sonia@gmail.com', '', NULL, NULL, NULL, NULL, NULL, 5),
(7, 'Toto', '', 'toto', '1990-03-02', 'fzenzufn', 'bfzbkjfzeb@bfzeljbgf.com', '', NULL, NULL, NULL, NULL, NULL, 1),
(8, 'azers', 'dhfrdt', 'tydjdh', '1992-12-12', 'thyghsjdtr', 'kugkfkugy', '0987654321', NULL, NULL, NULL, NULL, NULL, 1),
(9, 'azers', 'dhfrdt', 'tydjdh', '1992-12-12', 'thyghsjdtr', 'kugkfkugy', '0987654321', NULL, NULL, NULL, NULL, NULL, 1),
(10, 'azers', 'dhfrdt', 'tydjdh', '1992-12-12', 'thyghsjdtr', 'kugkfkugy', '0987654321', NULL, NULL, NULL, NULL, NULL, 1),
(11, 'M', '', '/', '1980-03-02', 'brzukbg', 'mp@gmail.com', '', NULL, NULL, NULL, NULL, NULL, 6),
(12, 'BB', 'bcoz', 'b', '1990-01-01 00:00:00', 'nfezlnf', 'bb@gt.com', '', NULL, NULL, NULL, NULL, NULL, 7),
(13, 'fnrl', 'kfmds', 'klvndfl', '1990-04-01 00:00:00', 'nrejln', 'cc2@cc.com', '0123455666', 'Mail', NULL, 'C:/Images/Images_LB/fnrl_klvndfl/téléchargement.jpg', 'C:/Images/Images_LB/fnrl_klvndfl/domicile.jpg', 'C:/Images/Images_LB/fnrl_klvndfl/signature.png', 8);

-- --------------------------------------------------------

--
-- Structure de la table `localisation_agence`
--

CREATE TABLE IF NOT EXISTS `localisation_agence` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL,
  `adress` varchar(200) NOT NULL,
  `desc` varchar(150) DEFAULT NULL,
  `code_postal` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `localisation_agence`
--

INSERT INTO `localisation_agence` (`id`, `name`, `adress`, `desc`, `code_postal`) VALUES
(1, 'soci?t? g?n?rale', '10 rue notre dame des champs', 'HEY', 75006),
(2, 'Chez moi !', '17 rue N?laton', 'BLABLABLABLABLABLa', 75015);

-- --------------------------------------------------------

--
-- Structure de la table `produits`
--

CREATE TABLE IF NOT EXISTS `produits` (
  `id` int(5) NOT NULL,
  `libelle` varchar(50) NOT NULL,
  `descriptif` varchar(255) NOT NULL,
  `prix` int(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `email`, `password`, `username`) VALUES
(1, 'aa.aa@aa.com', 'a', 'test'),
(3, 'paul.heitz@hotmail.fr', 'goret1000', 'javgoret'),
(4, 'gerard@aaa.com', 'aaa', 'g?rard'),
(5, 'sonia@gmail.com', 'P', 'Sonia'),
(6, 'mp@gmail.com', 'mp', 'M'),
(7, 'bb@gt.com', 'bb', 'B'),
(8, 'cc2@cc.com', 'ccc', 'c');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
