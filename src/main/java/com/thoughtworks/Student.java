package com.thoughtworks;

import java.util.Date;

public class Student {

    private String name;
    private String number;
    private Date admissionDate;

    public Student(String name, String number, Date admissionDate) {
        this.name = name;
        this.number = number;
        this.admissionDate = admissionDate;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }
}
