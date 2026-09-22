package api_gestion_cursos.Repositories;

import api_gestion_cursos.models.Matricula;

import java.util.List;

public interface MatriculaRepository {
    List<Matricula> findAll();
    void save(Matricula matricula);
    Matricula findById(Long id);
    void deleteById(Long id);
}
