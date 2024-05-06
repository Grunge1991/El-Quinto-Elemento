package pAqUeTeXpErImEnTaL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLDBManager {
    private Connection connection;

    public MySQLDBManager(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }

    public void agregarProducto(String nombre, String descripcion, double precio, int cantidad) throws SQLException {
        String query = "INSERT INTO productos (nombre, descripcion, precio, cantidad) VALUES (?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nombre);
            statement.setString(2, descripcion);
            statement.setDouble(3, precio);
            statement.setInt(4, cantidad);
            statement.executeUpdate();
        }
    }

    public void actualizarCantidadProducto(String nombre, int nuevaCantidad) throws SQLException {
        String query = "UPDATE productos SET cantidad = ? WHERE nombre = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, nuevaCantidad);
            statement.setString(2, nombre);
            statement.executeUpdate();
        }
    }
    public void eliminarProducto(String nombre) throws SQLException {
        String query = "DELETE FROM productos WHERE nombre = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nombre);
            statement.executeUpdate();
        }
    }

    // Otros métodos para consultar productos, gestionar proveedores, etc.
}


