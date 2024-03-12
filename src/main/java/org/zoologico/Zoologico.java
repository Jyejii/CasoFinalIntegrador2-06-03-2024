package org.zoologico;
import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    class Recurso {
        private String nombre;
        private int cantidadDisponible;

        public Recurso(String nombre, int cantidadDisponible) {
            this.nombre = nombre;
            this.cantidadDisponible = cantidadDisponible;
        }

        public String getNombre() {
            return nombre;
        }

        public int getCantidadDisponible() {
            return cantidadDisponible;
        }

        public void agregarCantidad(int cantidad) {
            cantidadDisponible += cantidad;
        }

        public void reducirCantidad(int cantidad) {
            cantidadDisponible -= cantidad;
        }
    }

    class Pedido {
        private List<Recurso> recursosPedido;
        private String proveedor;

        public Pedido(String proveedor) {
            this.proveedor = proveedor;
            this.recursosPedido = new ArrayList<>();
        }

        public void agregarRecurso(Recurso recurso) {
            recursosPedido.add(recurso);
        }

        public String getProveedor() {
            return proveedor;
        }

        public List<Recurso> getRecursosPedido() {
            return recursosPedido;
        }
    }


    public class AdministracionRecursos {
        private List<Recurso> inventarioRecursos;
        private List<Pedido> pedidosPendientes;


        public class AdministracionRecursos {
            private List<Recurso> inventarioRecursos;
            private List<Pedido> pedidosPendientes;

            public AdministracionRecursos() {
                this.inventarioRecursos = new ArrayList<>();
                this.pedidosPendientes = new ArrayList<>();
            }

            public void agregarRecurso(Recurso recurso) {
                inventarioRecursos.add(recurso);
            }

            public void realizarPedido(Pedido pedido) {
                pedidosPendientes.add(pedido);
            }

            public void procesarPedidos() {
                for (Pedido pedido : pedidosPendientes) {
                    for (Recurso recursoPedido : pedido.getRecursosPedido()) {
                        for (Recurso recursoInventario : inventarioRecursos) {
                            if (recursoPedido.getNombre().equals(recursoInventario.getNombre())) {
                                recursoInventario.agregarCantidad(recursoPedido.getCantidadDisponible());
                                break;
                            }
                        }
                    }
                }
                pedidosPendientes.clear();
            }
        }


    }
}

