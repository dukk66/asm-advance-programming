package org.example.service;
import org.example.interfaces.TranscriptInterface;
import org.example.entity.Transcript;

public class TranscriptService implements TranscriptInterface {
    private String professorName;
    public TranscriptService(String professorName) {
        this.professorName = professorName;
    }
    @Override
    public void update(Transcript transcript) {
        System.out.println("Giáo sư " + professorName + " đã được thông báo về sự cập nhật trong bảng điểm của sinh viên.");
        System.out.println("Tên sinh viên: " + transcript.getStudentName());
        System.out.println("Các khóa học: " + transcript.getCourses());
    }
}
