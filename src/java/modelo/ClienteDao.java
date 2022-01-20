package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDao extends Conexion {

    PreparedStatement ps;
    ResultSet rs;
    Statement st;
    Connection con = null;

    //Registrar Cliente
    public boolean registrar(Cliente cli) throws SQLException {
        boolean respuesta = false;
        con = getConexion();
        String sql = "insert into cliente(usuario,mail,password) values(?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getUsuario());
            ps.setString(2, cli.getMail());
            ps.setString(3, cli.getPassword());
            int row = ps.executeUpdate();
            if (row > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
        } finally {
            ps.close();
            con.close();
        }
        return respuesta;
    }

    //Validar Cliente
    public boolean validar(String usuario, String password) throws SQLException {
        boolean respuesta = false;
        String sql = "select * from cliente where usuario = '" + usuario + "'";
        con = getConexion();
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString("password").equals(password)) {
                    respuesta = true;
                }
            }
        } catch (SQLException e) {
        } finally {
            st.close();
            rs.close();
            con.close();
        }
        return respuesta;
    }
}
