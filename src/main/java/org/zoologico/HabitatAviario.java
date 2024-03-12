package org.zoologico;

public class HabitatAviario implements Habitat {
    private int temperatura;
    private boolean limpieza;

    public HabitatAviario(int temperatura, boolean limpieza) {
        this.temperatura = temperatura;
        this.limpieza = limpieza;
    }

    @Override
    public String obtenerTipo() {
        return "Aviario";
    }

    @Override
    public String obtenerCondicion() {
        String estadoLimpieza = limpieza ? "limpio" : "sucio";
        return "Temperatura: " + temperatura + "°C, Estado de limpieza: " + estadoLimpieza;
    }
}
