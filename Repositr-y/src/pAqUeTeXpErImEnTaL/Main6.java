package pAqUeTeXpErImEnTaL;

public class Main6 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto productoA = new Producto("Producto A", 10);
        Producto productoB = new Producto("Producto B", 20);

        inventario.agregarProducto(productoA);
        inventario.agregarProducto(productoB);

        inventario.eliminarProducto("Producto A");

        List<Producto> productos = inventario.getProductos();
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad());
        }
    }
}
