package org.example.service;

import org.example.entity.Professor;
import org.example.interfaces.UpdateInfoRequest;

public class AdminService implements UpdateInfoRequest {
    public ProfessorService teacherService;
    public AdminService(ProfessorService teacherService){
        this.teacherService = teacherService;
    }
    @Override
    public void updateInfoTeacher(Professor professor) {
        teacherService.update(professor);
    }
}
