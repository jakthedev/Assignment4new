package com.coderscampus.Assignment4new;

public class Student implements Comparable<Student> {
    private String studentname;
    private String coursename;
    private Integer grade;
    private Integer studentId;

    public String getStudentname() {
        return studentname;
    }

    public void setStudentName(String studentname) {
        this.studentname = studentname;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return "Student name is " + studentname + "their course name is" + coursename
                + "with grade " + grade + "and their student ID" + studentId;
    }

    @Override
    public int compareTo(Student grade) {
//        if(this.grade.compareTo(grade.grade) == 0){
//            return 0;
//        }else {
//            return this.grade.compareTo(grade.grade);
//        }
        if (this.grade > grade.grade) {
            return -1;
        } else if (this.grade.equals(grade.grade)) {
            return 0;
        } else {
            return 1;
        }
    }
}

