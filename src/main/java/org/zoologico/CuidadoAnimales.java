package org.zoologico;

public class CuidadoAnimales {
    public static void main(String[] args) {
        Ave ave = new Ave("Pájaro Azul");
        Acuatico acuatico = new Acuatico("Pez Dorado");
        Terrestre terrestre = new Terrestre("León");

        ave.alimentar("semillas");
        ave.chequearSalud();
        ave.registrarComportamiento("cantando");
        ave.volar();

        acuatico.alimentar("algas");
        acuatico.chequearSalud();
        acuatico.registrarComportamiento("nadando en círculos");
        acuatico.nadar();

        terrestre.alimentar("carne");
        terrestre.chequearSalud();
        terrestre.registrarComportamiento("rugiendo");
        terrestre.caminar();
    }
}
