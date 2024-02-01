
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VentaKardex {
    
    
    int id=0,idKardex;
    String fecha,tipoVenta,tipoCliente,ruc,nombreCliente,direccion,vendedor,estadoPago;
    double montoNeto,canitdadIgv,montoIgv,montoTotal;
  String sql;
    PreparedStatement pst;
    ResultSet rs;
    public VentaKardex() {
    }

    public VentaKardex(int id,int idKardex,String fecha, String tipoVenta, String tipoCliente, String ruc, String nombreCliente, String direccion, String vendedor, String estadoPago, double montoNeto, double canitdadIgv, double montoIgv, double montoTotal) {
        this.id=id;
        this.idKardex=idKardex;
        this.fecha = fecha;
        this.tipoVenta = tipoVenta;
        this.tipoCliente = tipoCliente;
        this.ruc = ruc;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.vendedor = vendedor;
        this.estadoPago = estadoPago;
        this.montoNeto = montoNeto;
        this.canitdadIgv = canitdadIgv;
        this.montoIgv = montoIgv;
        this.montoTotal = montoTotal;
    }

    
    public int insertNewVentaKardex(int idx,String tipoVentax,String tipoClientex,String rucx,
            String clientx, String direccionx,String vendedorx, double montoNetox,
            double cantidadIgvx, double montoIgvx, double montoTotalx, String estadoPagox){
        int valor =0;
        
         sql = "call `sp.newVentaKardex` (?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

        pst = con.prepareCall(sql);
        pst.setString(1,tipoVentax);
        pst.setString(2,tipoClientex);
        pst.setString(3,rucx);
        pst.setString(4,clientx);
        pst.setString(5,direccionx);
        pst.setString(6,vendedorx);
        pst.setDouble(7,montoNetox);
        pst.setDouble(8,cantidadIgvx);
        pst.setDouble(9,montoIgvx);
        pst.setDouble(10,montoTotalx);
        pst.setString(11,estadoPagox);
        pst.setInt(12,idx);
        pst.executeQuery();
          } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
    
    public ArrayList getVentasxFecha(){
        ArrayList<VentaKardex> lista = new ArrayList();
        sql = "call `sp.ConsVentasKardex` ()";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
        pst = con.prepareCall(sql);
        rs=pst.executeQuery();
        while(rs.next()){
            lista.add(new VentaKardex(rs.getInt("id"),rs.getInt("idKardex"),
            rs.getString("fecha"),rs.getString("tipoVenta"),
                    rs.getString("tipoCliente"),rs.getString("ruc"),
                    rs.getString("cliente"),rs.getString("direccion"),
                    rs.getString("vendedor"),rs.getString("estadoPago"),
                    rs.getDouble("montoNeto"),rs.getDouble("cantidadIgv"),
                    rs.getDouble("montoIgv"),rs.getDouble("montoTotal")
            ));
        }
          } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(VentaKardex.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "VentaKardex{" + "fecha=" + fecha + ", tipoVenta=" + tipoVenta + ", tipoCliente=" + tipoCliente + ", ruc=" + ruc + ", nombreCliente=" + nombreCliente + ", direccion=" + direccion + ", vendedor=" + vendedor + ", estadoPago=" + estadoPago + ", montoNeto=" + montoNeto + ", canitdadIgv=" + canitdadIgv + ", montoIgv=" + montoIgv + ", montoTotal=" + montoTotal + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdKardex() {
        return idKardex;
    }

    public void setIdKardex(int idKardex) {
        this.idKardex = idKardex;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public double getMontoNeto() {
        return montoNeto;
    }

    public void setMontoNeto(double montoNeto) {
        this.montoNeto = montoNeto;
    }

    public double getCanitdadIgv() {
        return canitdadIgv;
    }

    public void setCanitdadIgv(double canitdadIgv) {
        this.canitdadIgv = canitdadIgv;
    }

    public double getMontoIgv() {
        return montoIgv;
    }

    public void setMontoIgv(double montoIgv) {
        this.montoIgv = montoIgv;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
     
     
}
