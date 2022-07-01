package com.eduRest.edurest.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "courses")
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "start")
    private Date start;

    @Column(name = "end")
    private Date end;

    @ManyToOne
    @JoinColumn(name = "teacherId")
    private Teacher teacher;

    public String getName() { return this.name; }

    public void setName(String value) { this.name = value; }

    public Date getStart() { return this.start; }

    public void setStart(Date value) { this.start = value; }

    public Date getEnd() { return this.end; }

    public void setEnd(Date value) { this.end = value; }

    public Teacher getTeacher() { return this.teacher; }

    public void setTeacher(Teacher value) { this.teacher = value; }
}

