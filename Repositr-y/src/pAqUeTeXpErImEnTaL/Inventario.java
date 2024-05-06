package pAqUeTeXpErImEnTaL;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<NombreClaseProject> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(NombreClaseProject producto) {
        productos.add(producto);
    }

    public void actualizarCantidadProducto(String nombre, int nuevaCantidad) {
        for (NombreClaseProject p : productos) {
            if (p.getNombre().equals(nombre)) {
                p.setCantidad(nuevaCantidad);
                return;
            }
        }
        System.out.println("Producto no encontrado en el inventario.");
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (NombreClaseProject p : productos) {
            System.out.println(p.getNombre() + ": " + p.getCantidad());
        }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        inventario.agregarProducto(new NombreClaseProject("Producto1", 10));
        inventario.agregarProducto(new NombreClaseProject("Producto2", 20));
        inventario.mostrarInventario();

        inventario.actualizarCantidadProducto("Producto1", 15);
        inventario.mostrarInventario();
    }
}

