package api_gestion_cursos.Repositories;

import api_gestion_cursos.models.Estudiante;

import java.util.List;

public interface EstudianteRepository {

    List<Estudiante> findAll();
    void save(Estudiante estudiante);
    Estudiante findById(Long id);
    void deleteById(Long id);

}
