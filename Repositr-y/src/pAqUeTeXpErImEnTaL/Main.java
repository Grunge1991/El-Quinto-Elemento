package pAqUeTeXpErImEnTaL;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar algunos productos al inventario
        inventario.agregarProducto(new Producto("Producto A", 10));
        inventario.agregarProducto(new Producto("Producto B", 20));

        // Mostrar el inventario
        inventario.mostrarInventario();

        // Actualizar la cantidad de un producto
        inventario.actualizarCantidadProducto("Producto A", 15);

        // Mostrar el inventario actualizado
        inventario.mostrarInventario();
    }
}
