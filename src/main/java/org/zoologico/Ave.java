package org.zoologico;

public class Ave extends Animales {
    public Ave(String nombre) {
        super(nombre, "Aviario");
    }

    public void volar() {
        System.out.println(nombre + " está volando.");
    }
}
