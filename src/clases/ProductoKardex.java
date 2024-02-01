
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ProductoKardex {
    
    int idKardex=0;
    String codigo="-",nombre,fecha,moneda,estado;
    double cantidad=0,precioRegistrado=0;
String sql;
    PreparedStatement pst;
    ResultSet rs;
    public ProductoKardex() {
    }

    public ProductoKardex(int idKardex, String codigo, String nombre, String fecha, String moneda, double cantidad, double precioRegistrado) {
        this.idKardex = idKardex;
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.moneda = moneda;
        this.cantidad = cantidad;
        this.precioRegistrado = precioRegistrado;
        
    }
 public ProductoKardex(int idKardex, String codigo, String nombre, String fecha, String moneda, double cantidad, double precioRegistrado,String estado) {
        this.idKardex = idKardex;
        this.codigo = codigo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.moneda = moneda;
        this.cantidad = cantidad;
        this.precioRegistrado = precioRegistrado;
        this.estado=estado;
    }
    
    
      public void insertProductoKardex(int idKardexz, String codigox,String nombrex,double cantidadx,
              double precioRegistradox, String monedax) {

        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.newProductoKardex` (?,?,?,?,?,?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idKardexz);
            pst.setString(2, codigox);
            pst.setString(3, nombrex);
            pst.setDouble(4, cantidadx);
            pst.setDouble(5, precioRegistradox);
            pst.setString(6, monedax);
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
    
    @Override
    public String toString() {
        return "ProductoKardex{" + "idKardex=" + idKardex + ", codigo=" + codigo + ", nombre=" + nombre + ", fecha=" + fecha + ", moneda=" + moneda + ", cantidad=" + cantidad + ", precioRegistrado=" + precioRegistrado + '}';
    }

    public int getIdKardex() {
        return idKardex;
    }

    public void setIdKardex(int idKardex) {
        this.idKardex = idKardex;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioRegistrado() {
        return precioRegistrado;
    }

    public void setPrecioRegistrado(double precioRegistrado) {
        this.precioRegistrado = precioRegistrado;
    }
    
    
}
