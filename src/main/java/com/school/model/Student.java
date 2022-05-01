package com.school.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first name")
    private String firstname;
    @Column(name="last name")
    private String lastname;
    @Column(name="email")
    private String email;
    @Column(name="class")
    private int standard;

    public Student() {
    }

    public Student(String firstname, String lastname, String email, int standard) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.standard = standard;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
}
