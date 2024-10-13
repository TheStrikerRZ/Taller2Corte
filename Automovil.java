package Taller2;


public class Automovil {
    private String marca;
    private String modelo;
    private int kilometraje;

    public Automovil(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public void arrancar() {
        System.out.println("El automovil ha arrancado.");
    }

    public void acelerar(int velocidad) {
        this.kilometraje += velocidad;
        System.out.println("El automovil ha acelerado a " + velocidad + " km/h.");
    }

    public String detalles() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Kilometraje: " + kilometraje + " km";
    }
}
