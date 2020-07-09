DROP DATABASE IF EXISTS `PODCAST`;
CREATE DATABASE `PODCAST`;

CREATE TABLE `PODCAST`.`podcast` (
  `id` INT NOT NULL,
  `image` VARCHAR(255) NULL,
  `name` VARCHAR(255) NULL,
  `descrip` VARCHAR(255) NULL,
  `link` VARCHAR(255) NULL,
   `genre` VARCHAR(255) NULL,
   `region` VARCHAR(255) NULL,
  PRIMARY KEY (`id`));

INSERT INTO `PODCAST`.`podcast`
(`id`,
`image`,
`name`,
`descrip`,
`link`,
`genre`,
`region`)
VALUES
(1003,
"www.link3.com",
".NET diaries",
"for microsoft geeks",
"dotnetdiaries.com",
"6",
"1");
SELECT * FROM PODCAST.podcast;

INSERT INTO `PODCAST`.`podcast`
(`id`,
`image`,
`name`,
`descrip`,
`link`,
`genre`,
`region`)
VALUES
(10005,
"link.com"
".Web devs unite",
"For web developers",
"www.wdunite.com",
"5",
"1");
SELECT * FROM PODCAST.podcast;
