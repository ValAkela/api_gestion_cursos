package Repositories.impl;

import Repositories.CursoRepository;
import models.Curso;

import java.util.List;

public class CursoRepositoryImpl implements CursoRepository {

    public final List<Curso> cursos;

    public CursoRepositoryImpl(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public List<Curso> findAll() {
        return cursos;
    }

    @Override
    public void save(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public Curso findById(Long id) {
        for (Curso curso : cursos){
            if (curso.getId().equals(id)){
                return curso;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Curso curso = findById(id);
        if (curso != null) {
            cursos.remove(curso);
        }
    }
}
