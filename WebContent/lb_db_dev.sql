-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 23 Juin 2015 à 10:00
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `lb_db_dev`
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
  `date_de_naissance` varchar(40) NOT NULL,
  `adresse` varchar(40) NOT NULL,
  `user_mail` varchar(40) NOT NULL,
  `tel` varchar(12) NOT NULL,
  `canal` int(3) DEFAULT NULL,
  `produits_choisis` int(5) DEFAULT NULL,
  `lien_PI` varchar(40) DEFAULT NULL,
  `lien_JD` varchar(40) DEFAULT NULL,
  `lien_IS` varchar(40) DEFAULT NULL,
  `user_id` int(40) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`ID`, `nom`, `nom_de_jeune_fille`, `prenom`, `date_de_naissance`, `adresse`, `user_mail`, `tel`, `canal`, `produits_choisis`, `lien_PI`, `lien_JD`, `lien_IS`, `user_id`) VALUES
(1, 'sadzsefg', 'fdsgh', 'qdfsgh', '2000-02-08', 'zdsfgb', 'zfedgrth', '567890', 0, 0, NULL, NULL, NULL, 0),
(2, 'A', 'C', 'B', '1999-11-01', 'aqwxsz', 'aqwxsz', '0123456789', NULL, NULL, NULL, NULL, NULL, 1),
(3, 'aqwx', 'egRHE', 'fEfdf', '1999-11-11', 'QIBUYQ', 'SCHNQqinufyb', '0633850989', NULL, NULL, NULL, NULL, NULL, 1),
(4, 'vtr', 'rftgyuijk', 'hryeuihco', '1999-11-11', 'drgyhuij', 'rtyhuijk', '0123456789', NULL, NULL, NULL, NULL, NULL, 1);

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
  `password` varchar(255) NOT NULL,
  `username` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `email`, `password`, `username`) VALUES
(1, 'aa.aa@aa.com', 'a', 'test'),
(3, 'paul.heitz@hotmail.fr', 'goret1000', 'javgoret'),
(4, 'gerard@aaa.com', 'aaa', 'g?rard'),
(5, 'asc@asc.com', 'aqwxsz', 'asc'),
(6, 'z@z.r', 'z', 'z'),
(7, 'z@z.r', 'z', 'z'),
(8, 'ee@ee.ee', 'ee', 'e'),
(9, 'd@d.d', 'd', 'd'),
(10, 'd@d.d', 'df', 'd'),
(11, 'd@d.d', 'df', 'd'),
(12, 'd@d.d', 'qsd', 'd'),
(13, 'd@d.d', '1000:28ea1f8fd5ad069a5f9548ab4b85ebb3ecc1e912f031814b:32db5346e597198ed58d266d14b2d7678ecd20232a58c42f', 'd'),
(14, 'd@d.d', 'fae90c36ef83c11b31f4340224095b6dc08e783598cd382f7d3ac810a77a447f87813d2f866323fda5b0bce973f3dfcd', 'd'),
(15, 'asc@asc.com', 'a', 'a'),
(16, 'asc@asc.com', 's', 's'),
(17, 'asc@asc.com', 'a', 'a'),
(18, 'asc@asc.com', 'd', 'd'),
(19, 'asc@asc.com', 'f', 'd');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
