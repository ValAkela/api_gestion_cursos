package api_gestion_cursos.Repositories.impl;

import api_gestion_cursos.Repositories.MatriculaRepository;
import api_gestion_cursos.models.Matricula;

import java.util.List;

public class MatriculaRepositoryImpl implements MatriculaRepository {

    private final List<Matricula> matriculas;

    public MatriculaRepositoryImpl(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    @Override
    public List<Matricula> findAll() {
        return matriculas;
    }

    @Override
    public void save(Matricula matricula) {
        matriculas.add(matricula);
    }

    @Override
    public Matricula findById(Long id) {
        for (Matricula matricula : matriculas){
            if (matricula.getId().equals(id)){
                return matricula;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Matricula matricula = findById(id);
        if (matricula != null) {
            matriculas.remove(matricula);
        }
    }
}
