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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        this.admissionDate = simpleDateFormat.parse(admissionDateStr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.number.equals(student.number);
    }

    @Override
    public String toString() {
        Date now = new Date();
        long yearOfStudy = Math.floorDiv((now.getTime() - admissionDate.getTime()), 31536000000L);
        SimpleDateFormat newSDF = new SimpleDateFormat("yyyy年MM月dd日");
        String admissionDay = newSDF.format(admissionDate);
        return "我叫" + name
                + ", 我的学号是" + number
                + ", " + admissionDay + "入学"
                + ", 学龄" + yearOfStudy + "年";

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
