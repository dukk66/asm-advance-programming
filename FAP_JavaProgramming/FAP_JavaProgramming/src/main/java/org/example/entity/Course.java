package org.example.entity;

import java.util.Date;
import java.util.List;
public class Course {
    private int id;
    private String code;
    private String subjectCode;
    private String name;
    private Date startDate;
    private Date endDate;
    private Professor professor;
    private List<Student> studentList;
    public Course()
    {

    }
    public Course(int id, String code, String subjectCode, String name, Date startDate,
                  Date endDate, Professor professor, List<Student> studentList) {
        this.id = id;
        this.code = code;
        this.subjectCode = subjectCode;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.professor = professor;
        this.studentList = studentList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Professor getTeacher() {
        return professor;
    }

    public void setTeacher(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
