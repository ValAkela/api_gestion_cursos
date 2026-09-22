package api_gestion_cursos;

import api_gestion_cursos.Service.EstudianteService;
import api_gestion_cursos.models.Estudiante;

import java.util.List;
import java.util.Scanner;

public class EstudianteConsole {

    private final EstudianteService estudianteService;
    private final Scanner scanner;

    public EstudianteConsole(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
        this.scanner = new Scanner(System.in);
    }

    public void createEstudiante(){
        System.out.println("\n CREAR ESTUDIANTE");
        System.out.println("\nIngrese su ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("\nIngrese su nombre: ");
        String firstName = scanner.nextLine();
        System.out.println("\nIngrese su apellido: ");
        String lastName = scanner.nextLine();
        System.out.println("\nIngrese su e-mail: ");
        String email = scanner.nextLine();
        System.out.println("\nIngrese su teléfono: ");
        String phone = scanner.nextLine();

        Estudiante estudiante = new Estudiante(id, firstName,lastName,email,phone);
        estudianteService.save(estudiante);
        System.out.println("\n¡Estudiante creado con éxito!\n");
    }

    public void listEstudiante(){
        System.out.println("---TUS DATOS---");
        List<Estudiante> estudiantes = estudianteService.findAll();
        estudiantes.forEach(System.out::println);
    }
}
