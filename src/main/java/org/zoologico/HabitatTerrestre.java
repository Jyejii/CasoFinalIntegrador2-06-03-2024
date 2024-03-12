package org.zoologico;

public class HabitatTerrestre implements Habitat {
    private int temperatura;
    private int humedad;

    public HabitatTerrestre(int temperatura, int humedad) {
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    @Override
    public String obtenerTipo() {
        return "Terrestre";
    }

    @Override
    public String obtenerCondicion() {
        return "Temperatura: " + temperatura + "°C, Humedad: " + humedad + "%";
    }
}
