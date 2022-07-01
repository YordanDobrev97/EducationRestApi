package com.eduRest.edurest.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToOne
    private School school;

    public String getName() { return this.name; }

    public void setName(String value) { this.name = value; }

    public Teacher() {}

    public Teacher(String name, School school) {
        this.name = name;
        this.school = school;
    }
}