package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GuiaKardex {

    int idKardex = 0;
    String valor = "";
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public GuiaKardex() {
    }

    public GuiaKardex(int idKardex, String valor) {
        this.idKardex = idKardex;
        this.valor = valor;
    }

    public void insertGuiaKardex(int idKardex, String valorx) {

        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.newGuiaKardex` (?,?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idKardex);
            pst.setString(2, valorx);
            pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
    }

    private void cerrar() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getIdKardex() {
        return idKardex;
    }

    public void setIdKardex(int idKardex) {
        this.idKardex = idKardex;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
