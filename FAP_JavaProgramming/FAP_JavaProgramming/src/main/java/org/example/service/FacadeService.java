package org.example.service;

public class FacadeService {
    private CourseService courseService;
    private ProfessorService teacherService;
    public FacadeService() {
        courseService = new CourseService();
        teacherService = new ProfessorService();
    }
    public void operationDeleteTeacher(int teacherId) {
        courseService.deleteByTeacherID(teacherId);
        teacherService.delete(teacherId);
    }

}
