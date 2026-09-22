package api_gestion_cursos.Repositories.impl;


import api_gestion_cursos.Repositories.EstudianteRepository;
import api_gestion_cursos.models.Estudiante;
import java.util.List;

public class EstudianteRepositoryImpl implements EstudianteRepository {

    private final List<Estudiante> estudiantes;

    public EstudianteRepositoryImpl(List<Estudiante> estudiantes) {

        this.estudiantes = estudiantes;
    }

    @Override
    public List<Estudiante> findAll() {

        return estudiantes;
    }

    @Override
    public void save(Estudiante estudiante) {

        estudiantes.add(estudiante);
    }

    @Override
    public Estudiante findById(Long id) {

        for (Estudiante estudiante : estudiantes){
            if (estudiante.getId().equals(id)){
                return estudiante;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Estudiante estudiante = findById(id);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
        }
    }
}
