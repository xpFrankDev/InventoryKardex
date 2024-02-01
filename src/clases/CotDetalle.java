
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CotDetalle {
    
    
    int id;
    String numCotDetalle,codigoProducto,nombreProducto,observacion,codigoBarra;
    double cantidad,precioNeto,montoIgv,precioTotal;
    String sql="";
    PreparedStatement pst;
    ResultSet rs;
    
    
    public CotDetalle() {
    }

    public CotDetalle(int id, String numCot, String codigoProducto, String nombreProducto, String observacion, String codigoBarra, double cantidad, double precioNeto, double montoIgv, double precioTotal) {
        this.id = id;
        this.numCotDetalle = numCot;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.observacion = observacion;
        this.codigoBarra = codigoBarra;
        this.cantidad = cantidad;
        this.precioNeto = precioNeto;
        this.montoIgv = montoIgv;
        this.precioTotal = precioTotal;
    }

    
     public int newDetalle(String numCotx, String codigoProductox, String nombreProductox,
             double cantidadx, double precioNetox, double montoIgvx, 
             double precioTotalx, String observacionx, String codigoBarrax){
        
        int valor=0;
        sql ="select ft.newCotizacion(?,?,?,?,?,?,?,?,?,?) as id";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
        pst = con.prepareStatement(sql);
        pst.setString(1,numCotx);
        pst.setString(2,codigoProductox);
        pst.setString(3,nombreProductox);
        pst.setDouble(4,cantidadx);
        pst.setDouble(5,precioNetox);
        pst.setDouble(6,montoIgvx);
        pst.setDouble(7,precioTotalx);
        pst.setString(8,observacionx);
        pst.setString(9,codigoBarrax);
        pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(CotModificacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    @Override
    public String toString() {
        return "CotDetalle{" + "id=" + id + ", numCot=" + numCotDetalle + ", codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", observacion=" + observacion + ", codigoBarra=" + codigoBarra + ", cantidad=" + cantidad + ", precioNeto=" + precioNeto + ", montoIgv=" + montoIgv + ", precioTotal=" + precioTotal + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCotDetalle() {
        return numCotDetalle;
    }

    public void setNumCotDetalle(String numCot) {
        this.numCotDetalle = numCot;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(double precioNeto) {
        this.precioNeto = precioNeto;
    }

    public double getMontoIgv() {
        return montoIgv;
    }

    public void setMontoIgv(double montoIgv) {
        this.montoIgv = montoIgv;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
    
    
    
    
}
