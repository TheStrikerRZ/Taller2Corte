package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        // Crear dos instancias de la clase Maestro
        Maestro maestro1 = new Maestro("Juan Perez", "Matematicas", 5);
        Maestro maestro2 = new Maestro("Maria Rodriguez", "Lengua", 10);

        // Llamar a algunos métodos
        maestro1.presentarse();
        maestro1.impartirClase("Algebra");
        maestro1.evaluarAlumno("Juanito", 8);

        maestro2.presentarse();
        maestro2.impartirClase("Literatura");
        maestro2.evaluarAlumno("Maria", 9);
    }
}
