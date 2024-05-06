package pAqUeTeXpErImEnTaL;

import java.util.ArrayList;
import java.util.List;

public class InventarioDos {
    private List<Producto> productos;

    public InventarioDos() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
