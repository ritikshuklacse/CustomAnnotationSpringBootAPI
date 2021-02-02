package com.example.demoAnnotation.dto;

import com.example.demoAnnotation.customAnnotation.CheckOdd;

public class NumberDTO {

    @CheckOdd
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
