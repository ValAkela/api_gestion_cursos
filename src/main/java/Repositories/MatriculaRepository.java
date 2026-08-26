package Repositories;

import models.Matricula;

import java.util.List;

public interface MatriculaRepository {
    List<Matricula> findAll();
    void save(Matricula matricula);
    Matricula findById(Long id);
    void deleteById(Long id);
}
