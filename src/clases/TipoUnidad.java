
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TipoUnidad {
    
    
    
    
    int id;
    String nombre,estado;
    
     String sql;
    PreparedStatement pst;
    ResultSet rs;

    public TipoUnidad() {
    }

    public TipoUnidad(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    
    public ArrayList Listar(String valor) {
         ArrayList<TipoUnidad>lista = new ArrayList();

        sql = "call `sp.ConstipoUnidadxEstado` (?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1,valor);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                lista.add(new TipoUnidad(rs.getInt("id"),rs.getString("nombre"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    
    public int newTipoUnidad(String nombrex) {
       int valor = 0;
        sql = "call  `sp.newTipoUnidad` (?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1,nombrex);
            valor=pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
      public int updateTipoUnidad(int idx, String nombrex,String estadox) {
       int valor = 0;
        sql = "call  `sp.UpdateTipoUnidad` (?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idx);
            pst.setString(2,nombrex);
            pst.setString(3,estadox);
            valor=pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
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
}
