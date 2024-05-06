package pAqUeTeXpErImEnTaL;

public class Main4 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto productoA = new Producto("Producto A", 10);
        Producto productoB = new Producto("Producto B", 20);

        inventario.agregarProducto(productoA);
        inventario.agregarProducto(productoB);

        inventario.actualizarProducto("Producto A", 15);

        List<Producto> productos = inventario.getProductos();
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad());
        }
    }
}

