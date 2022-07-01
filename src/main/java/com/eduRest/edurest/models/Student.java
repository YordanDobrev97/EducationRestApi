package com.eduRest.edurest.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany
    @Column(name = "courses")
    private Set<Course> courses = new HashSet<>();

    public String getName() { return this.name; }

    public void setName(String value) { this.name = value; }
}
