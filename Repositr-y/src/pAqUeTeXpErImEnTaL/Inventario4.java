package pAqUeTeXpErImEnTaL;

public class Inventario4 {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto consultarProducto(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
