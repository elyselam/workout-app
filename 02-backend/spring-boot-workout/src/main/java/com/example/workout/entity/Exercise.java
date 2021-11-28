package com.example.workout.entity;
import lombok.Data;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "exercise_table")
@Data
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_id")
    private Integer exerciseID;

    @ManyToOne
    @JoinColumn(name = "routine_id", nullable=false)
    private Routine routine;

    @Column(name = "exercise_name")
    private String exerciseName;

    @Column(name = "starting_weight")
    private Integer startingWeight;

    @Column(name = "set")
    // [10, 10, 10, 10], an array of 4 sets, 10 reps each.
    // however, can't store an array of integers in a sql db
    // a) can store an association using a Set class to represent number of reps per set.
    // the table for Set would be quite simple ...
    // there'd be a foreign_key connection to an Exercise. with columns (exercise_id, countReps)
    // But does something this simple  truly justify its own table?
    // b) this could justify using a NoSQL database so that we can just store [10,10,9,8] format data,
    // list of ints.
    // c) a final option is just to store the totalCountOfReps, and then a number representing how many
    // sets to do.
    // e.g. int totalReps, int totalSets;
    // then the code will assume that you're aiming to do totalReps/totalSets reps per set, rounding up to the
    // nearest integer. e.g. 40 total reps over 4 sets = 10 reps per set. The app will ask how many sets and
    // how man reps per set as two separate questions, and then store the totalReps and totalSets.
    private ArrayList<Set> sets;

    @Column(name = "reps_accomplished")
    private Integer repsAccomplished; // count of reps completed
    
    @Column(name = "percentage_completed")
    private Double percentageCompleted; // number of reps completed over the total number of reps. 
}

