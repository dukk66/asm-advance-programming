package org.example.interfaces;

import org.example.entity.Professor;

import java.util.List;

public interface ProfessorInterface {
    public Professor insert(Professor s);
    public Professor update(Professor s);
    public  boolean delete(int id);
    public List<Professor> findAll();
    public Professor findById(int id);
}
