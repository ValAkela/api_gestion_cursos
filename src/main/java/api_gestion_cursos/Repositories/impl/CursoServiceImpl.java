package api_gestion_cursos.Repositories.impl;

import api_gestion_cursos.Repositories.CursoRepository;
import api_gestion_cursos.Service.CursoService;
import api_gestion_cursos.models.Curso;

import java.util.List;

public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;

    public CursoServiceImpl(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    @Override
    public List<Curso> findAll() {
        return List.of();
    }

    @Override
    public void save(Curso curso) {

    }

    @Override
    public Curso findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
