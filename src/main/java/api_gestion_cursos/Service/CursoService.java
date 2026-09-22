package api_gestion_cursos.Service;

import api_gestion_cursos.models.Curso;

import java.util.List;

public interface CursoService {
    List<Curso> findAll();
    void save(Curso curso);
    Curso findById(Long id);
    void deleteById(Long id);
}
