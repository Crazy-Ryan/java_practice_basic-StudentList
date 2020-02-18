package com.thoughtworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Student {

    private String name;
    private String number;
    private Date admissionDate;

    public Student(String name, String number, String admissionDateStr) throws ParseException {
        this.name = name;
        this.number = number;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.mm.dd");
        this.admissionDate = simpleDateFormat.parse(admissionDateStr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.number.equals(((Student) o).number);
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
