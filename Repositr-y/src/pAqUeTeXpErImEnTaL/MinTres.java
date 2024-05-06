package pAqUeTeXpErImEnTaL;

public class MinTres {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Crear un nuevo producto
        Producto producto = new Producto("Producto B", 15);

        // Agregar el producto al inventario
        inventario.agregarProducto(producto);

        // Mostrar la lista de productos en el inventario
        List<Producto> productos = inventario.getProductos();
        for (Producto p : productos) {
            System.out.println("Producto: " + p.getNombre() + ", Cantidad: " + p.getCantidad());
        }
    }
}
