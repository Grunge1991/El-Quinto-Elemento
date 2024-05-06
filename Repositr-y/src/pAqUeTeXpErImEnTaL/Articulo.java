package pAqUeTeXpErImEnTaL;

public class Articulo {
    private String nombre;
    private double precio;
    private int cantidad;
    private UbicacionArticulo ubicacion;

    public Articulo(String nombre, double precio, int cantidad, UbicacionArticulo ubicacion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
    }

    // Getters y setters para nombre, precio, cantidad y ubicacion

    @Override
    public String toString() {
        return "Articulo: " + nombre + ", Precio: " + precio + ", Cantidad: " + cantidad + ", Ubicación: " + ubicacion;
    }
}
