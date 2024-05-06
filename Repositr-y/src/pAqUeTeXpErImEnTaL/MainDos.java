package pAqUeTeXpErImEnTaL;

public class MainDos {
    public static void main(String[] args) {
        // Instanciar un objeto de la clase Producto
        Producto producto = new Producto("Producto A", 10);

        // Mostrar información del producto
        System.out.println("Producto inicial: " + producto);

        // Agregar stock
        producto.agregarStock(5);
        System.out.println("Después de agregar stock: " + producto);

        // Intentar vender más stock del disponible
        producto.venderStock(10);

        // Vender stock
        producto.venderStock(3);
        System.out.println("Después de vender stock: " + producto);
    }
}
