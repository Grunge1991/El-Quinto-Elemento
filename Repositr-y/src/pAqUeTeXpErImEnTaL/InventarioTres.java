package pAqUeTeXpErImEnTaL;

public class InventarioTres {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarProducto(String nombreProducto, int nuevaCantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                producto.setCantidad(nuevaCantidad);
                break;
            }
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
