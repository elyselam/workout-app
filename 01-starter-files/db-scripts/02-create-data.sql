-- -----------------------------------------------------
-- Schema workout
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `workoutapp`;

CREATE SCHEMA `workoutapp`;
USE `workoutapp` ;


-- -----------------------------------------------------
-- Table `workout`.`user_table`
-- 1 user, 6 routines
-- user_id is the contraint on routines, can't delete user
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `workoutapp`.`user_table` (
  `user_id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;


-- -----------------------------------------------------
-- Table `workout`.`routine_table`
-- 1 routine, 6 exercises (i'm gonna start with just 1 for now)
-- routine_name: [push1, pull1, hybrid1, push2, pull2, hybrid2]
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `workoutapp`.`routine_table` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `routine_name` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

-- -----------------------------------------------------
-- Table `workout`.`exercise_name_table`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `workoutapp`.`exercise_table` (
  `exercise_id` INT(11) NOT NULL AUTO_INCREMENT,
  `routine_id` INT(11) NOT NULL,
  `exercise_name` VARCHAR(255) DEFAULT NULL,
  `starting_weight` INT(11) NOT NULL,
  `set_1` INT(11) DEFAULT NULL,
  `set_2` INT(11) DEFAULT NULL,
  `set_3` INT(11) DEFAULT NULL,
  `set_4` INT(11) DEFAULT NULL,
   `reps_accomplished` BOOLEAN,
    PRIMARY KEY (`exercise_id`),
  KEY `fk_routine` (`routine_id`),
  CONSTRAINT `fk_routine` FOREIGN KEY (`routine_id`) REFERENCES `routine_table`(`id`)
) 
ENGINE=InnoDB
AUTO_INCREMENT = 1;


-- SHOW FULL COLUMNS FROM routine_table;

-- -----------------------------------------------------
--insert
-- -----------------------------------------------------

INSERT INTO user_table(user_name) VALUES ('elyse');



INSERT INTO routine_table (routine_name) VALUES ('push1');

INSERT INTO routine_table (routine_name) VALUES ('pull1');





INSERT INTO exercise_table (routine_id, exercise_name, starting_weight, set_1, set_2, set_3, set_4, reps_accomplished) VALUES (1,'benchpress', 0, 0, 0, 0, 0, False);

INSERT INTO exercise_table (routine_id, exercise_name, starting_weight, set_1, set_2, set_3, set_4, reps_accomplished) VALUES (1,'squats', 0, 0, 0, 0, 0, False);

INSERT INTO exercise_table (routine_id, exercise_name, starting_weight, set_1, set_2, set_3, set_4, reps_accomplished) VALUES (2,'pullups', 0, 0, 0, 0, 0, False);

INSERT INTO exercise_table (routine_id, exercise_name, starting_weight, set_1, set_2, set_3, set_4, reps_accomplished) VALUES (2,'deadlift', 0, 0, 0, 0, 0, False);




