package api_gestion_cursos.Service;

import api_gestion_cursos.models.Matricula;

import java.util.List;

public interface MatriculaService {
    List<Matricula> findAll();
    void save(Matricula matricula);
    Matricula findById(Long id);
    void deleteById(Long id);
}
