package pAqUeTeXpErImEnTaL;

public class Main5 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto productoA = new Producto("Producto A", 10);
        Producto productoB = new Producto("Producto B", 20);

        inventario.agregarProducto(productoA);
        inventario.agregarProducto(productoB);

        Producto productoConsultado = inventario.consultarProducto("Producto A");
        if (productoConsultado != null) {
            System.out.println("Producto encontrado: " + productoConsultado.getNombre() + ", Cantidad: " + productoConsultado.getCantidad());
        } else {
            System.out.println("Producto no encontrado");
        }
    }
}
