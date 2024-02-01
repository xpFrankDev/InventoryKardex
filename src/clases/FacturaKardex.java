package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FacturaKardex {

    int id=0, idKardex;
    String fecha, numFactura, estado;
    double montoNeto, montoIgv, montoTotal;
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public FacturaKardex() {
    }

    public FacturaKardex(int id, String numFactura) {
        this.id = id;
        this.numFactura = numFactura;

    }

    public FacturaKardex(int id, int idKardex, String fecha, String numFactura, String estado, double montoNeto, double montoIgv, double montoTotal) {
        this.id = id;
        this.idKardex = idKardex;
        this.fecha = fecha;
        this.numFactura = numFactura;
        this.estado = estado;
        this.montoNeto = montoNeto;
        this.montoIgv = montoIgv;
        this.montoTotal = montoTotal;
    }

    public int insertFacturaKardex(int idKardexz, String numFacturax, double montoNetox,
            double montoIgvx, double montoTotalx, String estadox) {
        int valor = 0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.newFacturaKardex` (?,?,?,?,?,?,@v)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idKardexz);
            pst.setString(2, numFacturax);
            pst.setDouble(3, montoNetox);
            pst.setDouble(4, montoIgvx);
            pst.setDouble(5, montoTotalx);
            pst.setString(6, estadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                valor = rs.getInt("idFactK");
            }
            return valor;
        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return 0;
        } finally {
            cerrar();
        }
    }
  public int updateFactura(int idFacturax, String numFacturax,String estadox) {
        int valor = 0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.updateFactura` (?,?,?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idFacturax);
            pst.setString(2, numFacturax);
            pst.setString(3, estadox);
            valor = pst.executeUpdate();
            return valor;
        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
            return 0;
        } finally {
            cerrar();
        }
    }
    public ArrayList getFacturasXKardex(int idKardexz) {
        ArrayList<FacturaKardex> lista = new ArrayList();

        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.ConsFacturaKardexByID` (?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idKardexz);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new FacturaKardex(
                        rs.getInt("id"), rs.getInt("idKardex"), rs.getString("fecha"),
                        rs.getString("numFactura"), rs.getString("estado"),
                        rs.getDouble("montoNeto"), rs.getDouble("montoIgv"),
                        rs.getDouble("montoTotal")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return lista;
    }
   public ArrayList ListFacturaxEstado(String estadox) {
        ArrayList<FacturaKardex> lista = new ArrayList();

        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.ConsFacturasEstado` (?)";
            pst = con.prepareCall(sql);
            pst.setString(1, estadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new FacturaKardex(
                        rs.getInt("id"), rs.getInt("idKardex"), rs.getString("fecha"),
                        rs.getString("numFactura"), rs.getString("estado"),
                        rs.getDouble("montoNeto"), rs.getDouble("montoIgv"),
                        rs.getDouble("montoTotal")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "FacturaKardex{" + "id=" + id + ", idKardex=" + idKardex + ", fecha=" + fecha + ", numFactura=" + numFactura + ", estado=" + estado + ", montoNeto=" + montoNeto + ", montoIgv=" + montoIgv + ", montoTotal=" + montoTotal + '}';
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

    public String getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(String numFactura) {
        this.numFactura = numFactura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getMontoNeto() {
        return montoNeto;
    }

    public void setMontoNeto(double montoNeto) {
        this.montoNeto = montoNeto;
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
