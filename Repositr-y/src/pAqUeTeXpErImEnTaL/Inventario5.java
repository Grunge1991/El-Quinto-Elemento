package pAqUeTeXpErImEnTaL;

public class Inventario5 {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombreProducto) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getNombre().equals(nombreProducto)) {
                iterator.remove();
                break;
            }
        }
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
