package com.CAT90360;

public class Student {
    private Long studentId;
    private String studentName;
    private Integer studentNumber;

    public Student(String studentName, int studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    private Student() {}

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + studentId +
                ", studentname='" + studentName + '\'' +
                ", studentnumber='" + studentNumber + '\'' +
                '}';
    }
}
