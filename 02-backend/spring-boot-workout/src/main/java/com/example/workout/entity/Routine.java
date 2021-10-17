package com.example.workout.entity;
import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "routine_table")
public class Routine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_id")
    private int routine_id;

    @Column(name = "routine_name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "routine")
    private Set<Exercise> exercises;
}
