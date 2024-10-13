package Taller2;


public class Main {
    public static void main(String[] args) {
        // Crear dos instancias de la clase Automóvil
        Automovil auto1 = new Automovil("Toyota", "Corolla", 0);
        Automovil auto2 = new Automovil("Ford", "Mustang", 5000);

        // Llamar a algunos métodos
        auto1.arrancar();
        auto1.acelerar(50);
        System.out.println(auto1.detalles());

        auto2.arrancar();
        auto2.acelerar(100);
        System.out.println(auto2.detalles());
    }
}
