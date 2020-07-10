DROP DATABASE IF EXISTS `PODCAST`;
CREATE DATABASE `PODCAST`;

CREATE TABLE `PODCAST`.`bestpodcast` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NULL,
  `parentid` INT NULL,
  `url` VARCHAR(255) NULL,
  PRIMARY KEY (`id`));

ALTER TABLE `PODCAST`.`bestpodcast` 
ADD COLUMN `genre` VARCHAR(255) NULL AFTER `url`;


CREATE TABLE `PODCAST`.`podcasttobestpodcast` (
  `id` INT NOT NULL,
  `bestpodcastid` INT NOT NULL,
  `podcastid` INT NOT NULL,
  PRIMARY KEY (`id`));


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
"link.com",
"Web devs unite",
"For web developers",
"www.wdunite.com",
"5",
"1");
SELECT * FROM PODCAST.podcast;


INSERT INTO `PODCAST`.`bestpodcast`
(`id`,
`name`,
`parentid`,
`url`,
`genre`)
VALUES
(11,
"Web Design",
127,
"www.bestpodcastapi/11", "Web design");


INSERT INTO `PODCAST`.`podcasttobestpodcast`
(`id`,
`bestpodcastid`,
`podcastid`)
VALUES
(1,
10,
10005);

