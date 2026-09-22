package api_gestion_cursos.data;

import api_gestion_cursos.models.Curso;
import api_gestion_cursos.models.Matricula;
import api_gestion_cursos.models.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private static final List<Estudiante> estudiantes = new ArrayList<>();
    private final List<Curso> cursos = new ArrayList<>();
    private final List<Matricula> matriculas = new ArrayList<>();



    public static List <Estudiante> getAllestudiantes(){
        return estudiantes;
    }
    //Crear un estudiante
    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    //Leer o consultar un estudiante
    public  Estudiante getEstudiante(Long id){
        for (Estudiante estudiante : estudiantes){
            if (estudiante.getId().equals(id)){
                return estudiante;
            }
        }
        return null;
    }
    //Eliminar o remover un estudiante
    public void removeEstudiante(Long id) {
        Estudiante estudiante = getEstudiante(id);
        if (estudiante != null) {
            estudiantes.remove(estudiante);
        }
    }

    public List<Curso> getAllcursos(){
        return cursos;
    }
    //Crear un curso
    public void addCursos(Curso curso){
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
    public void addMatricula(Matricula matricula){
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
