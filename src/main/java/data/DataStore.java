package data;

import models.Curso;
import models.Matricula;
import models.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private final List<Estudiante> estudiantes;
    private final List<Curso> cursos;
    private final List<Matricula> matriculas;

    public DataStore(){
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
        matriculas = new ArrayList<>();
    }

    public List<Estudiante> getAllestudianteS(){
        return estudiantes;
    }
    //Crear un estudiante
    public void createEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    //Leer o consultar un estudiante
    public Estudiante getestudiante (Long id){
        for (Estudiante estudiante : estudiantes){
            if (estudiante.getId().equals(id)){
                return estudiante;
            }
        }
        return null;
    }
    //Eliminar o remover un estudiante
    public void removeEstudiante(Long id) {
        Estudiante estudiante = getestudiante(id);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
        }
    }

    public List<Curso> getAllcursos(){
        return cursos;
    }
    //Crear un curso
    public void createCursos(Curso curso){
        cursos.add(curso);
    }
    //Leer o consultar un curso
    public Curso getCurso (Long id){
        for (Curso curso : cursos){
            if (curso.getId().equals(id)){
                return curso;
            }
        }
        return null;
    }
    //Eliminar o remover un curso
    public void removeCursos(Long id) {
        Curso curso = getCurso(id);
        if (curso != null) {
            cursos.remove(curso);
        }
    }
    public List<Matricula> getAllMatriculas(){
        return matriculas;
    }
    //Crear una matricula
    public void createMatricula(Matricula matricula){
        matriculas.add(matricula);
    }
    //Leer o consultar una matricula
    public Matricula getMatricula (Long id){
        for (Matricula matricula : matriculas){
            if (matricula.getId().equals(id)){
                return matricula;
            }
        }
        return null;
    }
    //Eliminar o remover una matricula
    public void removeMatricula(Long id) {
        Matricula matricula = getMatricula(id);
        if (matricula != null) {
            matriculas.remove(matricula);
        }
    }
}
