package com.example.demoAnnotation.entity;


import com.example.demoAnnotation.customAnnotation.CheckOdd;

import javax.persistence.*;

//@Value
//@Builder

@Entity
@Table(name = "number")
public class Number {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @CheckOdd
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}