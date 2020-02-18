package com.thoughtworks;

import java.text.ParseException;

public class App {

  public static void main(String[] args) throws ParseException {

    Teacher zhangLong = new Teacher("张龙");
    zhangLong.addNewStudent(new Student("张三", "001", "2019.02.11"));
    zhangLong.addNewStudent(new Student("李四", "002", "2019.02.10"));
    zhangLong.addNewStudent(new Student("王五", "001", "2019.02.09"));
    zhangLong.findDuplicateStudent();
  }
}
