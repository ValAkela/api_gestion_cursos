package Service;

import models.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<Estudiante> findAll();
    void save(Estudiante estudiante);
    Estudiante findById(Long id);
    void deleteById(Long id);
}
