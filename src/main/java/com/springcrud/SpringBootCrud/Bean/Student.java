package com.springcrud.SpringBootCrud.Bean;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {


    @Id
    private String cen;
    private String name;
    private String email;

    public Student(String cen, String name, String email) {
        this.cen = cen;
        this.name = name;
        this.email = email;
    }

    public Student() {
    }

    public String getCen() {
        return cen;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setCen(String CEN) {
        this.cen = CEN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "CEN=" + cen +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }




}
