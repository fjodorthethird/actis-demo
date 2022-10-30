package com.actis.actisproject.model;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "birth_date")
    private java.sql.Date birthDate;

    @Column(name = "is_employed")
    private boolean isEmployed;

    public Student(String firstName, String secondName, Date birthDate, boolean isEmployed) {
        super();
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.isEmployed = isEmployed;
    }

    public Student() {
        super();
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isEmployed() {
        return isEmployed;
    }
}
