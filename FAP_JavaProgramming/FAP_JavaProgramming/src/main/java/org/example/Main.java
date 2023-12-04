package org.example;

import org.example.entity.BasicWageInterface;
import org.example.interfaces.WageInterface;
import org.example.service.ScheduleService;
import org.example.entity.Student;
import org.example.entity.Professor;
import org.example.interfaces.NotifyInterface;
import org.example.interfaces.UpdateInfoRequest;
import org.example.service.*;
import org.example.entity.Transcript;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Behavior Design Patterns
        // Iterator ================================================================
        Student student1 = new Student(1,"Linh");
        Student student2 = new Student(2, "Trung");
        Student student3 = new Student(3,"Anh");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }
        //Template================================================================
        String className = "Advance Programming 101";
        int maxStudents = 30;
        String platformUrl = "https://btecfap.com";
        ClassroomService onlineClassroom = new ClassroomService(className, maxStudents, platformUrl);
        onlineClassroom.conductClass();

        //Observer====================================================================
        Transcript transcript = new Transcript();
        TranscriptService transcriptService = new TranscriptService("John Doe");
        transcript.attach(transcriptService);
        transcript.setStudentName("Alice");
        transcript.addCourse("Math");
        transcript.addCourse("English");
        transcript.removeCourse("Math");
        //===================================================================================

        //=======Creational Patterns=======
        // Factory ==== Creational Pattern
        NotifyInterface notifyStudent = AccountFactory.createNotification("Student");
        notifyStudent.notification();

        NotifyInterface notifyTeacher = AccountFactory.createNotification("Teacher");
        notifyTeacher.notification();

        NotifyInterface notifyParent = AccountFactory.createNotification("Parent");
        notifyParent.notification();

        //=========Singleton - Creation======================================
        Professor professor = new Professor(1,"Dinh Van Dong");
        ProfessorService.getInstance().insert(professor);
        //=========================================================================
        //Build=====
        ScheduleService scheduleService = new ScheduleService.Builder()
                .addLesson(LocalDate.of(2023, 11, 25),
                        "Advance Programming", "9:00 AM", "10:30 AM")
                .addLesson(LocalDate.of(2023, 11, 26),
                        "IoT", "1:00 PM", "2:30 PM")
                .build();
        scheduleService.printSchedule();
        //===================================================================================
        //Structural Pattern========================================
        // Adapter ========Structural Pattern
        UpdateInfoRequest updateInfoRequest = new AdminService(ProfessorService.getInstance());
        updateInfoRequest.updateInfoTeacher(professor);
        //Facade == Structural Pattern
        FacadeService facadeService = new FacadeService();
        facadeService.operationDeleteTeacher(1);
        //Decorator
        WageInterface baseWageInterface = new BasicWageInterface("John Doe", 5, 30);
        // Áp dụng phụ cấp giờ làm thêm
        WageInterface overtimeWageInterface = new OvertimeWageInterface(baseWageInterface, 5, 10.0);
        // Áp dụng phụ cấp thưởng
        WageInterface bonusWageInterface = new BonusWageInterface(overtimeWageInterface, 50.0);
        // Tính toán và in lương
        double totalPay = bonusWageInterface.calculatePay();
        System.out.println("Total Pay: $" + totalPay);
    }
}