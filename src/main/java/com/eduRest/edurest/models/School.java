package com.eduRest.edurest.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "location")
    private String location;

    @OneToMany
    @Column(name = "teachers")
    private Set<Teacher> Teachers;
}
