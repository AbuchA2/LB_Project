-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 22 Juin 2015 à 15:44
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `lb_db`
--

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
  `date_de_naissance` date NOT NULL,
  `adresse` varchar(40) NOT NULL,
  `user_mail` varchar(40) NOT NULL,
  `tel` varchar(12) NOT NULL,
  `canal` varchar(32) DEFAULT NULL,
  `produits_choisis` text,
  `lien_PI` varchar(255) DEFAULT NULL,
  `lien_JD` varchar(255) DEFAULT NULL,
  `lien_IS` varchar(255) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=16 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`ID`, `nom`, `nom_de_jeune_fille`, `prenom`, `date_de_naissance`, `adresse`, `user_mail`, `tel`, `canal`, `produits_choisis`, `lien_PI`, `lien_JD`, `lien_IS`, `user_id`) VALUES
(15, 'test', '', 'test', '2000-01-01', 'test', 'test', '0123456789', 'Mail', NULL, 'D:/Images/Images_LB/test_test/2006-04-05_agedeglace1_zoom.jpg', 'D:/Images/Images_LB/test_test/988552_777304802388966_3119581859719055900_n.jpg', 'D:/Images/Images_LB/test_test/6040635.jpg', 13);

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
(1, 'société générale', '10 rue notre dame des champs', 'HEY', 75006),
(2, 'Chez moi !', '17 rue Nélaton', 'BLABLABLABLABLABLa', 75015);

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `email`, `password`, `username`) VALUES
(13, 'test@test.com', 'test', 'test');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
