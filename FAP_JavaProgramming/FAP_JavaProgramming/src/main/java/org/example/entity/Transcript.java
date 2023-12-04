package org.example.entity;

import org.example.interfaces.TranscriptInterface;
import java.util.ArrayList;
import java.util.List;
 public class Transcript {
    private List<TranscriptInterface> transcriptInterfaces = new ArrayList<>();
    private String studentName;
    private List<String> courses = new ArrayList<>();
    public void attach(TranscriptInterface transcriptInterface) {
        transcriptInterfaces.add
                (transcriptInterface);
    }
    public void detach(TranscriptInterface transcriptInterface) {
        transcriptInterfaces.remove
                (transcriptInterface);
    }
    public void notifyObservers() {
        for (TranscriptInterface transcriptInterface : transcriptInterfaces) {
            transcriptInterface.update(this);
        }
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
        notifyObservers();
    }
    public void addCourse(String course) {
        courses.add(course);
        notifyObservers();
    }
    public void removeCourse(String course) {
        courses.remove(course);
        notifyObservers();
    }
    public String getStudentName() {
        return studentName;
    }
    public List<String> getCourses() {
        return courses;
    }

 }