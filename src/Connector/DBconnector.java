package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnector {

    private static final String HOST = "localhost";
    private static final String PORT = "5432";
    private static final String BD   = "postgres";
    private static final String USER = "postgres";
    private static final String PASS = "admin";

    /** Devolve unha conexión nova. Quen a pida debe pechala (try-with-resources). */
    public static Connection conexion() {
        String url = "jdbc:postgresql://" + HOST + ":" + PORT + "/" + BD;
        try {
            return DriverManager.getConnection(url, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Erro na conexión: " + e.getMessage());
            return null;
        }
    }
}
