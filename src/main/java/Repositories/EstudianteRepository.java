package Repositories;

import models.Estudiante;

import java.util.List;

public interface EstudianteRepository {

    List<Estudiante> findAll();
    void save(Estudiante estudiante);
    Estudiante findById(Long id);
    void deleteById(Long id);

}
