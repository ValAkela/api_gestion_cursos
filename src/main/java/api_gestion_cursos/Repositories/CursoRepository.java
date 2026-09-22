package api_gestion_cursos.Repositories;

import api_gestion_cursos.models.Curso;

import java.util.List;

public interface CursoRepository {
    List<Curso> findAll();
    void save(Curso curso);
    Curso findById(Long id);
    void deleteById(Long id);
}
