package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:postgresql://localhost:5432/DB_Delivery";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";

    public Connection conectarBanco(){

        try (
    Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);) {
        System.out.println("Conectado com sucesso!");
        return conn;
    } catch (
    SQLException e) {
            IO.println("Erro ao conectar!!!");
            e.printStackTrace();
            return null;
        }

    }
}
