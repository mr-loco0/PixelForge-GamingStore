package com.mycompany.pxfg_gamingstore; // Verifica el we

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    // Aquí es donde guardaremos la conexión abierta
    private Connection conectar = null;

    public Connection establecerConexion() {
        // 1. Datos de tu MySQL 
        String baseDatos = "PixelForgeStore";
        String usuario = "javauser";
        String contra = "1234"; // habrias de cambiar esto por tu clave de MySQL. si tienes claro
        String url = "jdbc:mysql://127.0.0.1:3306/pixelforgestore?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";        

        try {
            // 2. Intentamos conectar
            conectar = DriverManager.getConnection(url, usuario, contra);
            System.out.println("¡Conexión exitosa a PixelForge Gaming Store!");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.toString());
        }
        return conectar;
    }
}