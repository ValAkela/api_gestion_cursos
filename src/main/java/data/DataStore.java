package data;

import models.Cursos;
import models.Matriculas;
import models.Students;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private final List<Students> Students;
    private final List<Cursos> Cursos;
    private final List<Matriculas> Matriculas;

    public DataStore(){
        Students = new ArrayList<>();
        Cursos = new ArrayList<>();
        Matriculas = new ArrayList<>();
    }

    public List<Students> getAllStudents(){
        return Students;
    }
    //Crear un estudiante
    public void createStudent(Students student){
        Students.add(student);
    }
    //Leer o consultar un estudiante
    public Students getStudents (Long id){
        for (Students students : Students){
            if (students.getId().equals(id)){
                return students;
            }
        }
        return null;
    }
    //Eliminar o remover un estudiante
    public void removeStudents(Long id){
        Students students = getStudents(id);
        if (students!= null){
            Students.remove(students);
        }
    }
}
