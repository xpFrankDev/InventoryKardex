
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Operario {
    String codigo,nombres,dni,fechaIngreso,area,estado;
    String sql;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public Operario(){
        
    }

    public Operario(String codigo, String nombres, String dni, String fechaIngreso, String area, String estado) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.area = area;
        this.estado = estado;
    }
    
    
    
    public int newOperario(String codigox, String nombres,String dnix,String areax){
    int valor=0;

    try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
        sql = "call `sp.newOperario` (?,?,?,?,@v)"; 
        pst = con.prepareCall(sql);
        pst.setString(1,codigox);
        pst.setString(2,nombres);
        pst.setString(3,dnix);
        pst.setString(4,areax);
        rs= pst.executeQuery();
        while(rs.next()){
            valor = rs.getInt("idx");
        }
    } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
    
    return valor;
}
    
    
     public int updateOperario(int idx, String codigox, String nombres,String dnix,String areax, String estadox){
    int valor=0;

    try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
        sql = "call `sp.updateOperario` (?,?,?,?,?,?)"; 
        pst = con.prepareCall(sql);
        pst.setInt(1,idx);
        pst.setString(2,codigox);
        pst.setString(3,nombres);
        pst.setString(4,dnix);
        pst.setString(4,areax);
        pst.setString(4,estadox);
        valor=pst.executeUpdate();
    } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    @Override
    public String toString() {
        return "Operario{" + "codigo=" + codigo + ", nombres=" + nombres + ", dni=" + dni + ", fechaIngreso=" + fechaIngreso + ", area=" + area + ", estado=" + estado + '}';
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
    
    
    
}
