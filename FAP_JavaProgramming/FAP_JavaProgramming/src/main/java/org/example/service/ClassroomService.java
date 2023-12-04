package org.example.service;

import org.example.entity.Classroom;

public class ClassroomService extends Classroom {
    private String platformUrl;
    public ClassroomService(String className, int maxStudents, String platformUrl) {
        super(className, maxStudents);
        this.platformUrl = platformUrl;
    }
    @Override
    protected void prepareClassroom() {
        System.out.println("Đang chuẩn bị phòng học trực tuyến trên nền tảng " + platformUrl);
    }
    @Override
    protected void greetStudents() {
        System.out.println("Xin chào các bạn, chào mừng đến với lớp " + className);
    }
    @Override
    protected void conductLecture() {
        System.out.println("Bắt đầu bài giảng...");
    }
    @Override
    protected void conductDiscussion() {
        System.out.println("Bắt đầu phần thảo luận...");
    }
    @Override
    protected void takeAttendance() {
        System.out.println("Đang điểm danh...");
    }
    @Override
    protected void gradeAssignments() {
        System.out.println("Đang chấm bài tập...");
    }
    @Override
    protected void endClass() {
        System.out.println("Kết thúc buổi học.");
    }
}

