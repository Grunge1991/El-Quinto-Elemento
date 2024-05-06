package pAqUeTeXpErImEnTaL;

import java.util.ArrayList;
import java.util.List;

public class Almacenamiento {
    private int capacidadTotal;
    private int capacidadDisponible;
    private List<Articulo> articulos;

    public Almacenamiento(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.capacidadDisponible = capacidadTotal;
        this.articulos = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo, int cantidad) {
        if (capacidadDisponible >= cantidad) {
            for (int i = 0; i < cantidad; i++) {
                articulos.add(articulo);
                capacidadDisponible--;
            }
            System.out.println("Se agregaron " + cantidad + " unidades del artículo " + articulo.getNombre());
        } else {
            System.out.println("No hay suficiente espacio disponible para agregar " + cantidad + " unidades del artículo " + articulo.getNombre());
        }
    }

    public void organizarEspacio() {
        // Implementar lógica para organizar el espacio de almacenamiento
        System.out.println("Se organizó el espacio de almacenamiento");
    }

    // Otros métodos para gestionar el espacio de almacenamiento

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getCapacidadDisponible() {
        return capacidadDisponible;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }
}
