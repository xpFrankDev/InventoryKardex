package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Parametros {

    int id;
    String nombre, estado;

    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public Parametros() {

    }

    public Parametros(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public ArrayList getParametros() {
        ArrayList<Parametros> lista = new ArrayList();
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql ="call `sp.ConsAllParametros` ()";
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                lista.add(new Parametros(
                rs.getInt("id"),rs.getString("nombre"),rs.getString("estado")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return lista;
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
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "Parametros{" + "id=" + id + ", nombre=" + nombre + ", estado=" + estado + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
