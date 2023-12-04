package org.example.service;

import org.example.entity.Professor;
import org.example.interfaces.ProfessorInterface;

import java.util.List;

public class ProfessorService implements ProfessorInterface {

    // Singleton - Design Pattern
    public static ProfessorService instance = null;
    public static synchronized ProfessorService getInstance()
    {
        if(instance == null){
            instance = new ProfessorService();
        }
        return instance;
    }
    @Override
    public Professor insert(Professor s) {
        System.out.println("Insert teacher " + s.getName());
        return null;
    }
    @Override
    public Professor update(Professor s) {
        System.out.println("Update teacher");

        return null;
    }
    @Override
    public boolean delete(int id) {
        System.out.println("Delete teacher");

        return false;
    }
    @Override
    public List<Professor> findAll() {
        System.out.println("Find all teacher");

        return null;
    }
    @Override
    public Professor findById(int id) {

        System.out.println("Find by id teacher");

        return null;
    }
}
