package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User
{
    // "Função" de criação da conexão com o Banco de Dados
    public Connection ConectarBD()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1/uiux_db?user=joao&password=senha123";
            conn = DriverManager.getConnection(url);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public String nome = "";
    public boolean result = false;

    public boolean verificarUsuario(String login, String senha)
    {
        String sql = "";
        Connection conn = ConectarBD();

        // INSTRUÇÃO SQL
        sql += "SELECT nome FROM usuarios ";
        sql += "WHERE login = " + "'" + login + "' ";
        sql += "AND senha = " + "'" + senha + "'";
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next())
            {
                result = true;
                nome = rs.getString("nome");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
