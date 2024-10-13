package Ejercicio_2;

public class Maestro {
    private String nombre;
    private String asignatura;
    private int experiencia;

    public Maestro(String nombre, String asignatura, int experiencia) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.experiencia = experiencia;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + ", maestro de " + asignatura + " con " + experiencia + " anos de experiencia.");
    }

    public void impartirClase(String tema) {
        System.out.println("Estoy dando una clase sobre " + tema + ".");
    }

    public void evaluarAlumno(String alumno, int nota) {
        System.out.println("He calificado a " + alumno + " con una nota de " + nota + ".");
    }
}
