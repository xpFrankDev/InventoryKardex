
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Area {
    
    
    int id,idPadre;
    String nombre,estado;
String sql;
    PreparedStatement pst;
    ResultSet rs;
    public Area() {
    }

    public Area(int id, int idPadre, String nombre, String estado) {
        this.id = id;
        this.idPadre = idPadre;
        this.nombre = nombre;
        this.estado = estado;
    }

    
    public ArrayList getAllArea(String estadox){
        ArrayList<Area> lista = new ArrayList();
        sql = "call `sp.ConsAllAreasxEstado` (?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1,estadox);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                lista.add( new Area(rs.getInt("id"),rs.getInt("idPadre"),rs.getString("nombre"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return lista;
    }
    
    public ArrayList getAreaPrincipal(){
        ArrayList<Area> lista = new ArrayList();
        sql = "call `sp.ConsAreaPrincipal` ()";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                lista.add( new Area(rs.getInt("id"),rs.getInt("idPadre"),rs.getString("nombre"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return lista;
    }
    public ArrayList getHijos(int idPadrex){
        ArrayList<Area> lista = new ArrayList();
        sql = "call `sp.ListarHijosArea` (?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idPadrex);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                lista.add( new Area(rs.getInt("id"),rs.getInt("idPadre"),rs.getString("nombre"),rs.getString("estado")));
            }
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return lista;
    }
    
    
       public int updateArea(int idx,String nombrex, String estadox){
           int valor=0;
        
        sql = "call `sp.updateArea` (?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idx);
            pst.setString(2,nombrex);
            pst.setString(3,estadox);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
       public int newArea(int idPadrex, String nombrex){
           int valor=0;
        
        sql = "call `sp.newArea` (?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idPadrex);
            pst.setString(2,nombrex);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
       
        public int updatePadre(int idx,int idPadrex){
           int valor=0;
        
        sql = "call `sp.CambiarPadreArea` (?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idx);
            pst.setInt(2,idPadrex);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
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
        return "Area{" + "id=" + id + ", idPadre=" + idPadre + ", nombre=" + nombre + ", estado=" + estado + '}';
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
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
