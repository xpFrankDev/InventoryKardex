
package Clases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CotModificacion {
    
    
    int id=-1;
    String numCot,numPedido,vendedor,fechaEmision,cliente,ruc,
            direccion,moneda,ultimaModificacion,usuario,estado;
    double precioNeto,montoIgv,precioTotal;
    
    String sql="";
    PreparedStatement pst;
    ResultSet rs;
    public CotModificacion() {
    }

    public CotModificacion(int id, String numCot, String numPedido, String vendedor, String fechaEmision, String cliente, String ruc, String direccion, String moneda, String ultimaModificacion, String usuario, String estado, double precioNeto, double montoIgv, double precioTotal) {
        this.id = id;
        this.numCot = numCot;
        this.numPedido = numPedido;
        this.vendedor = vendedor;
        this.fechaEmision = fechaEmision;
        this.cliente = cliente;
        this.ruc = ruc;
        this.direccion = direccion;
        this.moneda = moneda;
        this.ultimaModificacion = ultimaModificacion;
        this.usuario = usuario;
        this.estado = estado;
        this.precioNeto = precioNeto;
        this.montoIgv = montoIgv;
        this.precioTotal = precioTotal;
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
        return "Cotizacion{" + "id=" + id + ", numCot=" + numCot + ", numPedido=" + numPedido + ", vendedor=" + vendedor + ", fechaEmision=" + fechaEmision + ", cliente=" + cliente + ", ruc=" + ruc + ", direccion=" + direccion + ", moneda=" + moneda + ", ultimaModificacion=" + ultimaModificacion + ", usuario=" + usuario + ", estado=" + estado + ", precioNeto=" + precioNeto + ", montoIgv=" + montoIgv + ", precioTotal=" + precioTotal + '}';
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCot() {
        return numCot;
    }

    public void setNumCot(String numCot) {
        this.numCot = numCot;
    }

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
