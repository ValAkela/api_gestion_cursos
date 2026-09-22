package api_gestion_cursos.models;

import java.time.LocalDateTime;

public class Matricula {

    private String id;
    private String studentId;
    private String courseId;
    private String status;
    private String enrollmentDate;
    private String createdAt;

    public Matricula(){

    }

    public Matricula(String id, String studentId, String courseId, String status, String enrollmentDate) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.status = status;
        this.enrollmentDate = enrollmentDate;
        this.createdAt = LocalDateTime.now().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "ID = '" + id + '\'' + "\n" +
                "ID Estudiante ='" + studentId + '\'' + "\n" +
                "ID Curso ='" + courseId + '\'' + "\n" +
                "Estatus ='" + status + '\'' + "\n" +
                "Dato Matricula = '" + enrollmentDate + '\'' + "\n" +
                "Fecha = '" + createdAt + '\'' +
                "\n";
    }
}
