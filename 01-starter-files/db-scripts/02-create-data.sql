-- -----------------------------------------------------
-- Schema workout
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `workoutapp`;

CREATE SCHEMA `workoutapp`;
USE `workoutapp` ;


-- -----------------------------------------------------

-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `workoutapp`.`user` (
  `user_id` INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `user_name` VARCHAR(255) NULL DEFAULT NULL)
 -- PRIMARY KEY (`user_id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;


-- -----------------------------------------------------

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS; 
SET FOREIGN_KEY_CHECKS=0; 
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;


CREATE TABLE IF NOT EXISTS `workoutapp`.`routine` (
  `routine_id` INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `routine_name` VARCHAR(255) NULL DEFAULT NULL,
  `exercise_day_id` INT(11) NULL DEFAULT NULL)
  -- KEY `fk_exercise_day` (`exercise_day_id`),
  -- CONSTRAINT `fk_routine` FOREIGN KEY (`exercise_day_id`) REFERENCES `exercise_day`(`exercise_day_id`),
  -- PRIMARY KEY(`routine_id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;

SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS; 
SET FOREIGN_KEY_CHECKS=0; 


CREATE TABLE IF NOT EXISTS `workoutapp`.`exercise_day` (
  `exercise_day_id` INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `exercise_day_name` VARCHAR(255) NULL DEFAULT NULL,
  `routine_id` INT(11) NOT NULL,
  --    KEY `fk_routine2` (`routine_id`),
  CONSTRAINT `fk_routine2` FOREIGN KEY (`routine_id`) REFERENCES `routine`(`routine_id`))
  -- PRIMARY KEY(`exercise_day_id`))
ENGINE=InnoDB
AUTO_INCREMENT = 1;


SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;


-------------------------

-- CREATE TABLE IF NOT EXISTS `workoutapp`.`exercise_day` (
--   `exercise_day_id` INT(11) NOT NULL AUTO_INCREMENT,
--   `exercise_day_name` VARCHAR(255) NULL DEFAULT NULL,
--   `exercise_id` INT(11) NOT NULL,
-- `routine_id` INT(11) NOT NULL,
--       KEY `fk_routine2` (`routine_id`),
--   CONSTRAINT `fk_routine2` FOREIGN KEY (`routine_id`) REFERENCES `routine`(`routine_id`),
--     KEY `fk_exercise2` (`exercise_id`),
--   CONSTRAINT `fk_exercise2` FOREIGN KEY (`exercise_id`) REFERENCES `exercise`(`exercise_id`),
--   PRIMARY KEY(`exercise_day_id`))
-- ENGINE=InnoDB
-- AUTO_INCREMENT = 1;






-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `workoutapp`.`exercise` (
  `exercise_id` INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `exercise_name` VARCHAR(255) DEFAULT NULL,
  `starting_weight` INT(11) NOT NULL,
  `inc_weight_by` INT(11) NOT NULL,
  `set_1` INT(11) DEFAULT NULL,
  `set_2` INT(11) DEFAULT NULL,
  `set_3` INT(11) DEFAULT NULL,
  `set_4` INT(11) DEFAULT NULL,
   `reps_accomplished` BOOLEAN,
   `exercise_day_id` INT(11) NOT NULL,
    -- PRIMARY KEY(`exercise_id`),
  -- KEY `fk_exercise_day` (`exercise_day_id`),
  CONSTRAINT `fk_exercise_day` FOREIGN KEY (`exercise_day_id`) REFERENCES `exercise_day`(`exercise_day_id`)
) 
ENGINE=InnoDB
AUTO_INCREMENT = 1;

SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;


-- SHOW FULL COLUMNS FROM routine;

-- -----------------------------------------------------
--insert
-- -----------------------------------------------------

INSERT INTO user_table(user_name) VALUES ('elyse');



INSERT INTO routine(routine_name) VALUES ('whenNOTLAZY');






INSERT INTO exercise(exercise_name, starting_weight, inc_weight_by, set_1, set_2, set_3, set_4, reps_accomplished, exercise_day_id) VALUES ('benchpress', 90, 10, 0, 0, 0, 0, False, 1);

INSERT INTO exercise_day (exercise_day_name, exercise_id, routine_id) VALUES ('pull1', 1, 2);






INSERT INTO exercise_table (routine_id, exercise_name, starting_weight, set_1, set_2, set_3, set_4, reps_accomplished) VALUES (1,'squats', 0, 0, 0, 0, 0, False);




INSERT INTO exercise_table (routine_id, exercise_name, starting_weight, set_1, set_2, set_3, set_4, reps_accomplished) VALUES (2,'pullups', 0, 0, 0, 0, 0, False);

INSERT INTO exercise_table (routine_id, exercise_name, starting_weight, set_1, set_2, set_3, set_4, reps_accomplished) VALUES (2,'deadlift', 0, 0, 0, 0, 0, False);




