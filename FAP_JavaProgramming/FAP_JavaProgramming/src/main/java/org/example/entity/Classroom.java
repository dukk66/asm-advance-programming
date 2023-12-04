package org.example.entity;

public abstract class Classroom {
    protected String className;
    protected int maxStudents;
    public Classroom(String className, int maxStudents) {
        this.className = className;
        this.maxStudents = maxStudents;
    }
    // Phương thức template method
    public final void conductClass() {
        prepareClassroom();
        greetStudents();
        conductLecture();
        conductDiscussion();
        takeAttendance();
        gradeAssignments();
        endClass();
    }
    // Các phương thức abstract sẽ được triển khai bởi các lớp con
    protected abstract void prepareClassroom();
    protected abstract void greetStudents();
    protected abstract void conductLecture();
    protected abstract void conductDiscussion();
    protected abstract void takeAttendance();
    protected abstract void gradeAssignments();
    protected abstract void endClass();
}

