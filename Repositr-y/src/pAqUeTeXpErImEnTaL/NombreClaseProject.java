package pAqUeTeXpErImEnTaL;

public class NombreClaseProject {
    private String nombre;
    private int cantidad;

    public NombreClaseProject(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static void main(String[] args) {
        NombreClaseProject producto = new NombreClaseProject("Producto1", 10);
        System.out.println("Nombre del producto: " + producto.getNombre());
        System.out.println("Cantidad del producto: " + producto.getCantidad());
        
        // Cambiar la cantidad del producto
        producto.setCantidad(20);
        System.out.println("Nueva cantidad del producto: " + producto.getCantidad());
    }
}

