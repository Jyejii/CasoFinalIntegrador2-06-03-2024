package org.zoologico;

public class HabitatAcuatico implements Habitat {
    private int temperatura;
    private int nivelOxigeno;

    public HabitatAcuatico(int temperatura, int nivelOxigeno) {
        this.temperatura = temperatura;
        this.nivelOxigeno = nivelOxigeno;
    }

    @Override
    public String obtenerTipo() {
        return "Acuático";
    }

    @Override
    public String obtenerCondicion() {
        return "Temperatura: " + temperatura + "°C, Nivel de oxígeno: " + nivelOxigeno + "ppm";
    }
}
