package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SolicitudCompra {

    String sql;
    PreparedStatement pst;
    ResultSet rs;
    int id = -1;
    String codigoProducto, nombreProducto, fecha, stock, solicitante, estado, atendidoPor, fechaRegistro, tipoIngreso, fechaComopra, numeroFactura;
    Double cantidadOptima, unidadesCompradas;

    public SolicitudCompra() {
    }

    public SolicitudCompra(int id, String codigoProducto, String nombreProducto, Double cantidadOptima, String fecha, String stock, String solicitante, String estado, String atendidoPor, Double unidadesCompradas, String fechaRegistro, String fechaComopra, String numeroFactura, String tipoIngreso) {
        this.id = id;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.fecha = fecha;
        this.stock = stock;
        this.solicitante = solicitante;
        this.estado = estado;
        this.atendidoPor = atendidoPor;
        this.fechaRegistro = fechaRegistro;
        this.fechaComopra = fechaComopra;
        this.numeroFactura = numeroFactura;
        this.cantidadOptima = cantidadOptima;
        this.unidadesCompradas = unidadesCompradas;
        this.tipoIngreso = tipoIngreso;
    }

    public int newSolCompra(String codigoProductox, String nombreProductox,
            double cantidadOptimax, String stockx, String solicitantex, String tipoRegistrox) {
        int valor = 0;

        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            sql = "call `sp.newSolicitudCompra`(?,?,?,?,?,?)";
            pst = con.prepareCall(sql);
            pst.setString(1, codigoProductox);
            pst.setString(2, nombreProductox);
            pst.setDouble(3, cantidadOptimax);
            pst.setString(4, stockx);
            pst.setString(5, solicitantex);
            pst.setString(6, tipoRegistrox);
            valor = pst.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public int newCompra(int idx, String atendidoPorx, double unidadesCompradasx, String fechaRegistrox,
            String tipoIngresox, String numeroFacturax) {
        int valor = 0;

        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            sql = "call `sp.newCompra`(?,?,?,?,?,?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            pst.setString(2, atendidoPorx);
            pst.setDouble(3, unidadesCompradasx);
            pst.setString(4, fechaRegistrox);
            pst.setString(5, tipoIngresox);
            pst.setString(6, numeroFacturax);
            valor = pst.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public ArrayList getComprasLikeAll(String valorx) {
        ArrayList<SolicitudCompra> lista = new ArrayList();
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            sql = "call `sp.ConsAllComprasLikeAll`(?)";
            pst = con.prepareCall(sql);
            pst.setString(1, valorx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new SolicitudCompra(
                        rs.getInt("id"), rs.getString("codigoProducto"),
                        rs.getString("nombreProducto"), rs.getDouble("cantidadOptima"),
                        rs.getString("fecha"), rs.getString("stock"),
                        rs.getString("solicitante"), rs.getString("estado"),
                        rs.getString("atendidoPor"), rs.getDouble("unidadesCompradas"),
                        rs.getString("fechaRegistro"), rs.getString("fechaCompra"),
                        rs.getString("numeroFactura"), rs.getString("tipoIngreso")
                ));
            }

        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public ArrayList getSolicitudxCodigoyEstado(String codigox, String estadox) {
        SolicitudCompra sc = new SolicitudCompra();
        ArrayList<SolicitudCompra> lista = new ArrayList();
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            sql = "call `sp.ConsSolicitudxCodyEstado`(?,?)";
            pst = con.prepareCall(sql);
            pst.setString(1, codigox);
            pst.setString(2, estadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                sc = new SolicitudCompra(
                        rs.getInt("id"), rs.getString("codigoProducto"),
                        rs.getString("nombreProducto"), rs.getDouble("cantidadOptima"),
                        rs.getString("fecha"), rs.getString("stock"),
                        rs.getString("solicitante"), rs.getString("estado"),
                        rs.getString("atendidoPor"), rs.getDouble("unidadesCompradas"),
                        rs.getString("fechaRegistro"), rs.getString("fechaCompra"),
                        rs.getString("numeroFactura"), rs.getString("tipoIngreso")
                );
                lista.add(sc);
            }
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return lista;
    }

    public SolicitudCompra getLastSolicitudCodigoxEstado(String codigox, String estadox) {
        SolicitudCompra sc = new SolicitudCompra();
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            sql = "call `sp.ConsSolicitudxCodyEstado`(?,?)";
            pst = con.prepareCall(sql);
            pst.setString(1, codigox);
            pst.setString(2, estadox);
            rs = pst.executeQuery();
            if (rs.next()) {
                sc = new SolicitudCompra(
                        rs.getInt("id"), rs.getString("codigoProducto"),
                        rs.getString("nombreProducto"), rs.getDouble("cantidadOptima"),
                        rs.getString("fecha"), rs.getString("stock"),
                        rs.getString("solicitante"), rs.getString("estado"),
                        rs.getString("atendidoPor"), rs.getDouble("unidadesCompradas"),
                        rs.getString("fechaRegistro"), rs.getString("fechaCompra"),
                        rs.getString("numeroFactura"), rs.getString("tipoIngreso")
                );
            }
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return sc;
    }

    public void updateSolicitud(double cantidadOptimax, double stockx, String estadox, String tipoIngreso, int idx) {
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            sql = "call `sp.updateSolicitud`(?,?,?,?)";
            pst = con.prepareCall(sql);
            pst.setDouble(1, cantidadOptimax);
            pst.setDouble(2, stockx);
            pst.setString(3, estadox);
            pst.setString(4, tipoIngreso);
            pst.setInt(5, idx);
            pst.executeUpdate();

        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
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
            Logger.getLogger(Talla.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "SolicitudCompra{" + "id=" + id + ", codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto + ", fecha=" + fecha + ", stock=" + stock + ", solicitante=" + solicitante + ", estado=" + estado + ", atendidoPor=" + atendidoPor + ", fechaRegistro=" + fechaRegistro + ", fechaComopra=" + fechaComopra + ", numeroFactura=" + numeroFactura + ", cantidadOptima=" + cantidadOptima + ", unidadesCompradas=" + unidadesCompradas + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAtendidoPor() {
        return atendidoPor;
    }

    public void setAtendidoPor(String atendidoPor) {
        this.atendidoPor = atendidoPor;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaComopra() {
        return fechaComopra;
    }

    public void setFechaComopra(String fechaComopra) {
        this.fechaComopra = fechaComopra;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Double getCantidadOptima() {
        return cantidadOptima;
    }

    public void setCantidadOptima(Double cantidadOptima) {
        this.cantidadOptima = cantidadOptima;
    }

    public Double getUnidadesCompradas() {
        return unidadesCompradas;
    }

    public void setUnidadesCompradas(Double unidadesCompradas) {
        this.unidadesCompradas = unidadesCompradas;
    }

    public String getTipoIngreso() {
        return tipoIngreso;
    }

    public void setTipoIngreso(String tipoIngreso) {
        this.tipoIngreso = tipoIngreso;
    }

}
