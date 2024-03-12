package org.zoologico;

// Clase para representar una cámara de seguridad
class Camara {
    private String ubicacion;

    public Camara(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void monitorear() {
        System.out.println("Monitoreando desde la cámara en " + ubicacion);
    }
}

// Clase para representar un sensor de movimiento
class SensorMovimiento {
    private String ubicacion;

    public SensorMovimiento(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void detectarMovimiento() {
        System.out.println("Movimiento detectado por el sensor en " + ubicacion);
    }
}

// Clase Jaula que integra cámaras y sensores
public class Jaula {
    private Camara camara;
    private SensorMovimiento sensor;

    public Jaula(String ubicacion) {
        this.camara = new Camara(ubicacion);
        this.sensor = new SensorMovimiento(ubicacion);
    }

    public void monitorearJaula() {
        camara.monitorear();
        sensor.detectarMovimiento();
    }
}
