package com.example.workout.entity;
import lombok.Data;
import javax.persistence.*;

// maybe use SSO through fb, google, others? much simpler than this... 
@Entity
@Table(name = "user_table")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;

    @Column(name = "user_name")
    private String name;
}
