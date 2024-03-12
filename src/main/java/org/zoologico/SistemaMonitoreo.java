package org.zoologico;


public class SistemaMonitoreo {
    public void monitorearHabitat(Habitat habitat) {
        System.out.println("Monitoreando hábitat " + habitat.obtenerTipo() + ":");
        System.out.println(habitat.obtenerCondicion());
    }

    public static void main(String[] args) {
        HabitatAcuatico acuario = new HabitatAcuatico(25, 8);
        HabitatTerrestre selva = new HabitatTerrestre(28, 70);
        HabitatAviario aviario = new HabitatAviario(20, true);

        SistemaMonitoreo sistema = new SistemaMonitoreo();
        sistema.monitorearHabitat(acuario);
        sistema.monitorearHabitat(selva);
        sistema.monitorearHabitat(aviario);
    }
}
