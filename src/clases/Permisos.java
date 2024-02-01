
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Permisos extends Notificaciones{

    public Permisos() {
    }
    
    String p1="f",p1a1="f",p1a2="f",p2="f",
            p2a1="f",p2a2="f",p2a3="f",p3="f",
            p3a1="f",p3a2="f",p3a3="f",p4="f",
            p4a1="f",p4a2="f";
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public Permisos( String p1, String p1a1, String p1a2, String p2, String p2a1, String p2a2, String p2a3, String p3, String p3a1, String p3a2, String p3a3, String p4, String p4a1, String p4a2) {
        this.p1 = p1;
        this.p1a1 = p1a1;
        this.p1a2 = p1a2;
        this.p2 = p2;
        this.p2a1 = p2a1;
        this.p2a2 = p2a2;
        this.p2a3 = p2a3;
        this.p3 = p3;
        this.p3a1 = p3a1;
        this.p3a2 = p3a2;
        this.p3a3 = p3a3;
        this.p4 = p4;
        this.p4a1 = p4a1;
        this.p4a2 = p4a2;
    }

    
    
    public int insertPermisos(String codigox){
        int resultado=0;
        
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
          
            sql ="call `sp.newPermiso` (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pst = con.prepareCall(sql);
            pst.setString(1,codigox);
            pst.setString(2,p1);
            pst.setString(3,p1a1);
            pst.setString(4,p1a2);
            pst.setString(5,p2);
            
            pst.setString(6,p2a1);
            pst.setString(7,p2a2);
            pst.setString(8,p2a3);
            pst.setString(9,p3);
            pst.setString(10,p3a1);
            
            pst.setString(11,p3a2);
            pst.setString(12,p3a3);
            pst.setString(13,p4);
            pst.setString(14,p4a1);
            pst.setString(15,p4a2);
            
            resultado = pst.executeUpdate();
        
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        
        
        return resultado;
    }
    
    
      public int updatePermisos(String codigox){
        int resultado=0;
        
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
          
            sql ="call `sp.UpdatePermisos` (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            pst = con.prepareCall(sql);
            pst.setString(1,codigox);
            pst.setString(2,p1);
            pst.setString(3,p1a1);
            pst.setString(4,p1a2);
            pst.setString(5,p2);
            
            pst.setString(6,p2a1);
            pst.setString(7,p2a2);
            pst.setString(8,p2a3);
            pst.setString(9,p3);
            pst.setString(10,p3a1);
            
            pst.setString(11,p3a2);
            pst.setString(12,p3a3);
            pst.setString(13,p4);
            pst.setString(14,p4a1);
            pst.setString(15,p4a2);
            
            resultado = pst.executeUpdate();
        
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        
        
        return resultado;
    }
    
      
      public Permisos getPermisos(String codigox){
          
          try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
              sql="call `sp.ConsPermisos`(?)";
              pst=con.prepareCall(sql);
              pst.setString(1,codigox);
              rs = pst.executeQuery();
              while(rs.next()){
                  this.p1=rs.getString("p1");
                  this.p1a1=rs.getString("p1a1");
                  this.p1a2=rs.getString("p1a2");
                  
                  this.p2=rs.getString("p2");
                  this.p2a1=rs.getString("p2a1");
                  this.p2a2=rs.getString("p2a2");
                  this.p2a3=rs.getString("p2a3");
                  
                  this.p3=rs.getString("p3");
                  this.p3a1=rs.getString("p3a1");
                  this.p3a2=rs.getString("p3a2");
                  this.p3a3=rs.getString("p3a3");
                  
                  this.p4=rs.getString("p4");
                  this.p4a1=rs.getString("p4a1");
                  this.p4a2=rs.getString("p4a2");
              }
          
          } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
          return this;
          
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
            Logger.getLogger(Talla.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public String PrintPermisos() {
        return "Permisos{, p1=" + p1 + ", p1a1=" + p1a1 + ", p1a2=" + p1a2 + ", p2=" + p2 + ", p2a1=" + p2a1 + ", p2a2=" + p2a2 + ", p2a3=" + p2a3 + ", p3=" + p3 + ", p3a1=" + p3a1 + ", p3a2=" + p3a2 + ", p3a3=" + p3a3 + ", p4=" + p4 + ", p4a1=" + p4a1 + ", p4a2=" + p4a2 + '}';
    }

   

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP1a1() {
        return p1a1;
    }

    public void setP1a1(String p1a1) {
        this.p1a1 = p1a1;
    }

    public String getP1a2() {
        return p1a2;
    }

    public void setP1a2(String p1a2) {
        this.p1a2 = p1a2;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP2a1() {
        return p2a1;
    }

    public void setP2a1(String p2a1) {
        this.p2a1 = p2a1;
    }

    public String getP2a2() {
        return p2a2;
    }

    public void setP2a2(String p2a2) {
        this.p2a2 = p2a2;
    }

    public String getP2a3() {
        return p2a3;
    }

    public void setP2a3(String p2a3) {
        this.p2a3 = p2a3;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getP3a1() {
        return p3a1;
    }

    public void setP3a1(String p3a1) {
        this.p3a1 = p3a1;
    }

    public String getP3a2() {
        return p3a2;
    }

    public void setP3a2(String p3a2) {
        this.p3a2 = p3a2;
    }

    public String getP3a3() {
        return p3a3;
    }

    public void setP3a3(String p3a3) {
        this.p3a3 = p3a3;
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4;
    }

    public String getP4a1() {
        return p4a1;
    }

    public void setP4a1(String p4a1) {
        this.p4a1 = p4a1;
    }

    public String getP4a2() {
        return p4a2;
    }

    public void setP4a2(String p4a2) {
        this.p4a2 = p4a2;
    }
    
    
    
    
    
}
