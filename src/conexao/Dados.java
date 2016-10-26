package conexao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dados {

    private java.sql.Statement stmt;
    public Connection conn;

    public java.sql.Statement conectar() throws ClassNotFoundException, SQLException {
        return this.conectarSqlServer();
    }

    public void desconectar() throws SQLException {
        conn.close();
    }

    private java.sql.Statement conectarSqlServer() throws ClassNotFoundException, SQLException {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://localhost;DatabaseName=Hotel";
        String usuario = "sa";
        String senha = "123";
        Class.forName(driver);
        //obtem uma conexao com o sgbd
        conn = DriverManager.getConnection(url, usuario, senha);
        stmt = conn.createStatement();
        return stmt;
    }
}
