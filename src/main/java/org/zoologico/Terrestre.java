package org.zoologico;

public class Terrestre extends Animales {
    public Terrestre(String nombre) {
        super(nombre, "Terrestre");
    }

    public void caminar() {
        System.out.println(nombre + " está caminando.");
    }
}
