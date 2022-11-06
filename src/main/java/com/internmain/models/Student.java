package com.internmain.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "entity_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identitiy koyarsam kendisi yüklenir ancak auto  koyarsam elle girmem gerekir
    @Column(name = "student_id")
    private Long id;
    @Column(name = "student_name")

    private String name;
    @Column(name = "student_email")

    private String email;
    @Column(name = "student_localDate")

    private LocalDate dob;
    @Column(name = "student_age")

    private int age;

    public Student() {

    }

    public Student(Long id, String name, String email, LocalDate dob, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dob, int age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
