package Repositories;

import models.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> findAll();
    void save(Curso curso);
    Curso findById(Long id);
    void deleteById(Long id);
}
