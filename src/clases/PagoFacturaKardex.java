package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PagoFacturaKardex {

    int id = 0, idFacturaKardex,idKardex;
    String tipoPago, banco, referenciaPago, usuario, fecha,estado,fechaPago;
    double montoPagado;
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public PagoFacturaKardex() {
    }

    public PagoFacturaKardex(int id, int idFacturaKardex,int idKardex, String tipoPago, String banco, String referenciaPago, String usuario, String fecha,String fechaPago, double montoPagado,String estado) {
        this.id = id;
        this.idFacturaKardex = idFacturaKardex;
        this.idKardex=idKardex;
        this.tipoPago = tipoPago;
        this.banco = banco;
        this.referenciaPago = referenciaPago;
        this.usuario = usuario;
        this.fecha = fecha;
        this.fechaPago=fechaPago;
        this.montoPagado = montoPagado;
        this.estado=estado;
    }

    public int newPagoFacturaKardex(int idFacturaKardexz,int idKardex, String tipoPagox,
            String bancox,String referenciaPagox,double montoPagadox, String usuariox) {
        int valor = 0;

        sql = "call `sp.newPagoFacturaKardex` (?,?,?,?,?,?,?,@v)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
        pst = con.prepareCall(sql);
        pst.setInt(1,idFacturaKardexz);
        pst.setInt(2,idKardex);
        pst.setString(3,tipoPagox);
        pst.setString(4,bancox);
        pst.setString(5,referenciaPagox);
        pst.setDouble(6,montoPagadox);
        pst.setString(7,usuariox);
        
        rs= pst.executeQuery();
        while(rs.next()){
            valor =rs.getInt("idFactx");
        }
        
        return valor;
        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return 0;
        } finally {
            cerrar();
        }
    }
      public int updatePago(int idPagox,int idFacturax, int idVentax,String tipoPagox,
            String bancox,String referenciaPagox,double montoPagadox, String usuariox, String estadox) {
        int valor = 0;

        sql = "call `sp.updatePagoFactura` (?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
        pst = con.prepareCall(sql);
        pst.setInt(1,idPagox);
        pst.setInt(2,idFacturax);
        pst.setInt(3,idVentax);
        pst.setString(4,tipoPagox);
        pst.setString(5,bancox);
        pst.setString(6,referenciaPagox);
        pst.setDouble(7,montoPagadox);
        pst.setString(8,usuariox);
        pst.setString(9,estadox);
        
        valor = pst.executeUpdate();
        
        return valor;
        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return 0;
        } finally {
            cerrar();
        }
    }
   public int newPagoPendiente(int idKardex,int idFacturaKardexz) {
        int valor = 0;

        sql = "call `sp.newPagoPendiente` (?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
        pst = con.prepareCall(sql);
        pst.setInt(1,idKardex);
        pst.setInt(2,idFacturaKardexz);
        valor = pst.executeUpdate();
        
        return valor;
        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return 0;
        } finally {
            cerrar();
        }
    } 
public int newPago(int idKardexz,int idFacturax,int idVentax, String tipoPagox, String bancox, String referenciaPagox,
        double montoPagadox, String usuariox, String estadox) {
        int valor = 0;

        sql = "call `sp.newPago` (?,?,?,?,?,?,?,?,?,@v)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
        pst = con.prepareCall(sql);
        pst.setInt(1,idKardexz);
        pst.setInt(2,idFacturax);
        pst.setInt(3,idVentax);
        pst.setString(4,tipoPagox);
        pst.setString(5,bancox);
        pst.setString(6,referenciaPagox);
        pst.setDouble(7,montoPagadox);
        pst.setString(8,usuariox);
        pst.setString(9,estadox);
        
        rs = pst.executeQuery();
        while(rs.next()){
            valor = rs.getInt("idX");
        }
        
        return valor;
        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return 0;
        } finally {
            cerrar();
        }
    }
    public ArrayList getPagos() {
        ArrayList<PagoFacturaKardex> lista = new ArrayList();

        sql = "call `sp.ConsPagoFacturaKardex` ()";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
        pst = con.prepareCall(sql);
        rs= pst.executeQuery();
        while(rs.next()){
            lista.add(new PagoFacturaKardex(
            rs.getInt("id"),rs.getInt("idFacturaKardex"),rs.getInt("idKardex"),rs.getString("tipoPago"),rs.getString("banco"),
                    rs.getString("referenciaPago"),rs.getString("usuario"),
                    rs.getString("fecha"),rs.getString("fechaPago"),rs.getDouble("montoPagado"),rs.getString("estado")
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
    public ArrayList getPagosxIdFactura(int idFacturax){
        ArrayList<PagoFacturaKardex> lista = new ArrayList();
        
        
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
        return "PagoFacturaKardex{" + "id=" + id + ", idFacturaKardex=" + idFacturaKardex + ", idKardex=" + idKardex + ", tipoPago=" + tipoPago + ", banco=" + banco + ", referenciaPago=" + referenciaPago + ", usuario=" + usuario + ", fecha=" + fecha + ", estado=" + estado + ", fechaPago=" + fechaPago + ", montoPagado=" + montoPagado + '}';
    }

    

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    
    public int getIdKardex() {
        return idKardex;
    }

    public void setIdKardex(int idKardex) {
        this.idKardex = idKardex;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdFacturaKardex() {
        return idFacturaKardex;
    }

    public void setIdFacturaKardex(int idFacturaKardex) {
        this.idFacturaKardex = idFacturaKardex;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getReferenciaPago() {
        return referenciaPago;
    }

    public void setReferenciaPago(String referenciaPago) {
        this.referenciaPago = referenciaPago;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

}
