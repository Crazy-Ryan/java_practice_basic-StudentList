package com.thoughtworks;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> studentList;

    public Teacher() {
        studentList = new ArrayList<>();
    }

    public Teacher(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }

    public Teacher(String name, ArrayList<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addNewStudent(Student newStudent) {
        this.studentList.add(newStudent);
    }

    @SuppressWarnings("unchecked")
    public void findDuplicateStudent() {
        ArrayList<Student> duplicateStudentList = new ArrayList<>();
        ArrayList<Student> noDuplicateStudentList = (ArrayList<Student>) studentList.clone();
        for (Student student : studentList) {
            for (Student studentDup : duplicateStudentList) {
                if (studentDup != student
                        && student.equals(studentDup)
                        && (!duplicateStudentList.contains(student))) {
                    duplicateStudentList.add(student);
                    noDuplicateStudentList.remove(student);
                    break;
                }
            }
            for (Student studentNoDup : noDuplicateStudentList) {
                if (studentNoDup != student && student.equals(studentNoDup)) {
                    if (!duplicateStudentList.contains(student)) {
                        duplicateStudentList.add(student);
                    }
                    duplicateStudentList.add(studentNoDup);
                    noDuplicateStudentList.remove(student);
                    noDuplicateStudentList.remove(studentNoDup);
                    break;
                }
            }
        }
        for (Student student : duplicateStudentList) {
            System.out.println(student);
        }
    }

}
