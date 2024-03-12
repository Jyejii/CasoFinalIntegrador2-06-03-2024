package org.zoologico;

import java.util.ArrayList;
import java.util.List;

class TareaMantenimiento {
    private String descripcion;
    private boolean esUrgente;

    public TareaMantenimiento(String descripcion, boolean esUrgente) {
        this.descripcion = descripcion;
        this.esUrgente = esUrgente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean esUrgente() {
        return esUrgente;
    }
}

public class SistemaMantenimiento {
    private List<TareaMantenimiento> tareasPendientes;

    public SistemaMantenimiento() {
        this.tareasPendientes = new ArrayList<>();
    }

    public void programarTareaMantenimiento(TareaMantenimiento tarea) {
        tareasPendientes.add(tarea);
    }

    public void mostrarTareasPendientes() {
        System.out.println("Tareas de mantenimiento pendientes:");
        for (TareaMantenimiento tarea : tareasPendientes) {
            System.out.println("- " + tarea.getDescripcion() + (tarea.esUrgente() ? " (URGENTE)" : ""));
        }
    }
}
