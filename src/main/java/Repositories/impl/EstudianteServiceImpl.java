package Repositories.impl;

import Repositories.EstudianteRepository;
import Service.EstudianteService;
import models.Estudiante;

import java.util.List;

public class EstudianteServiceImpl implements EstudianteService {

    private final EstudianteRepository estudianteRepository;


    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<Estudiante> findAll() {
        return estudianteRepository.findAll();
    }

    @Override
    public void save(Estudiante estudiante) {
        estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante findById(Long id) {
        return  estudianteRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        estudianteRepository.deleteById(id);
    }
}
