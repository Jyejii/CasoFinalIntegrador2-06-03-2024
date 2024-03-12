package org.zoologico;

public class Animales {
    protected String nombre;
    protected String tipoHabitat;

    public Animales(String nombre, String tipoHabitat) {
        this.nombre = nombre;
        this.tipoHabitat = tipoHabitat;
    }

    public void alimentar(String comida) {
        System.out.println(nombre + " ha sido alimentado con " + comida);
    }

    public void chequearSalud() {
        System.out.println("La salud de " + nombre + " es buena.");
    }

    public void registrarComportamiento(String comportamiento) {
        System.out.println("Comportamiento de " + nombre + ": " + comportamiento);
    }
}


