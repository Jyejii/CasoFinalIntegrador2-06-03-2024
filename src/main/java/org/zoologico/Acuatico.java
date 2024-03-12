package org.zoologico;

public class Acuatico extends Animales {
    public Acuatico(String nombre) {
        super(nombre, "Acuático");
    }

    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }
}
