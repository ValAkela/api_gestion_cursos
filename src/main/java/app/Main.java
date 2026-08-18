package app;

import models.Estudiante;
import models.Curso;
import models.Matricula;

public class Main {
    public static void main(String[] args) {
        //Lista Students



        students.add(new Estudiante(1L, "Jhon", "Alvarez", "jhon@email.com", "3000000000"));
        students.add(new Estudiante(2L, "Mateo", "Marin", "mateo@email.com", "3010000000"));
        students.add(new Estudiante(3L, "Juana", "Marin", "juana@email.com", "3020000000"));
        students.add(new Estudiante(4L, "Melissa", "Alvarez", "melissa@email.com", "3030000000"));
        students.add(new Estudiante(5L, "Valeria", "Alvarez", "valeria@email.com", "3040000000"));

        System.out.println("\nList of students:");
        for (Estudiante student : students) {
            System.out.println("ID:" + student.getId() + " " + "Name: " + student.getFirstName() + " " + student.getLastName() + " " + "Email: " + student.getEmail() + " " + "Phone: " + student.getPhone());
        }
        //Lista cursos


        cursos.add(new Curso(1L, "REACT01", "React Desde Cero", "Curso Basico De React",30));
        cursos.add(new Curso(2L, "SPRING01", "Spring Boot", "Curso Backend con spring boot",26));
        cursos.add(new Curso(3L, "REACT02", "React uno", "Curso de segundo nivel React", 20));
        cursos.add(new Curso(4L,"SPRING02", "Spring boot 02", "Curso backend con spring 02", 30));
        cursos.add(new Curso(5L, "REACT03", "React dos", "Curso tercer nivel de react", 25));

        System.out.println("\nCursos asignados:");
        for (Curso curso : cursos){
            System.out.println("ID:" + curso.getId() + " " + "Code: " + curso.getCode() + " " + "Name: " + curso.getName() + " " + "Description: " + curso.getDescription() + " " + "Max Capacity: " + curso.getMaxCapacity() + " " + "Created At: " + curso.getCreatedAt());
        }
        //Lista matriculas


        matriculas.add(new Matricula("3fa85f64-5717-4562-b3fc-2c963f66afa6", "3fa85f64-5717-4562-b3fc-2c963f66afa6", "3fa85f64-5717-4562-b3fc-2c963f66afa6","string","2026-08-06"));
        matriculas.add(new Matricula("4gs96g75-6828-5673-b4gv-3v074g777sgs7", "4gs96g75-6828-5673-b4gv-3v074g777sgs7", "4gs96g75-6828-5673-b4gv-3v074g777sgs7","String", "2026-10-08"));

        System.out.println("\nMatriculas realizadas:");
        for (Matricula matricula : matriculas){
            System.out.println("ID:" + matricula.getId() + " " + "studenId: " + matricula.getStudentId() + " " + "courseId: " + matricula.getCourseId()+ " " + "Status: " + matricula.getStatus() + " " + "enrollmentDate: " + matricula.getEnrollmentDate() + " " + "createdAt: " + matricula.getCreatedAt());
        }
        /*
        Students student = new Students();
        Students student1 = new Students();
        Students student2 = new Students();
        Students student3 = new Students();
        Students student4 = new Students();

        student.setId(1L);
        student.setFirstName("Jhon");
        student.setLastName("Alvarez");
        student.setEmail("jhon@email.com");
        student.setPhone("3000000000");
        System.out.println(student.getFirstName() + " " + student.getLastName()+ " " + student.getEmail() + " " + student.getPhone());

        student1.setId(2L);
        student1.setFirstName("Mateo");
        student1.setLastName("Marin");
        student1.setEmail("mateo@email.com");
        student1.setPhone("3010000000");
        System.out.println(student1.getFirstName()+ " " + student1.getLastName() + " " + student1.getEmail() + " " + student1.getPhone());

        student2.setId(3L);
        student2.setFirstName("Juana");
        student2.setLastName("Marin");
        student2.setEmail("juana@email.com");
        student2.setPhone("3020000000");
        System.out.println(student2.getFirstName() + " " + student2.getLastName() + " " + student2.getEmail() + " " + student2.getPhone());

        student3.setId(4L);
        student3.setFirstName("Melissa");
        student3.setLastName("Alvarez");
        student3.setEmail("melissa@email.com");
        student3.setPhone("3030000000");
        System.out.println(student3.getFirstName() + " " + student3.getLastName() + " " + student3.getEmail() + " " + student3.getPhone());

        student4.setId(5L);
        student4.setFirstName("Valeria");
        student4.setLastName("Alvarez");
        student4.setEmail("valeria@email.com");
        student4.setPhone("3040000000");
        System.out.println(student4.getFirstName() + " " + student4.getLastName() + " " + student4.getEmail() + " " + student4.getPhone());
        */
    }
}
