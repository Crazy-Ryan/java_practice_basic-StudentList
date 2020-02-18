package com.thoughtworks;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private String name;
    private String number;
    private Date admissionDate;

    public Student(String name, String number, String admissionDateStr) throws ParseException {
        this.name = name;
        this.number = number;
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy.mm.dd");
        this.admissionDate = simpleDateFormat.parse(admissionDateStr);
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
