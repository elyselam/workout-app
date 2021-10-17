package com.example.workout.entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter

@Entity
@Table(name = "exercise_table")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercise_id")

    @ManyToOne
    @JoinColumn(name = "routine_id", nullable=false)
    private Routine routine;

    @Column(name = "exercise_name")
    private String exercise_name;

    @Column(name = "set_1")
    private int set1;

    @Column(name = "set_2")
    private int set2;

    @Column(name = "set_3")
    private int set3;

    @Column(name = "set_4")
    private int set4;

    @Column(name = "reps_accomplished")
    private boolean reps_accomplished;
}
