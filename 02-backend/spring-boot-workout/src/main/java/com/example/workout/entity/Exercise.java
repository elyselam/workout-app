package com.example.workout.entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


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

    @Column(name = "set_1")
    private Integer set1;

    @Column(name = "set_2")
    private Integer set2;

    @Column(name = "set_3")
    private Integer set3;

    @Column(name = "set_4")
    private Integer set4;

    @Column(name = "reps_accomplished")
    private boolean repsAccomplished;
}
