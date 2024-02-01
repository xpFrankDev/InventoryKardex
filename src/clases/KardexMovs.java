package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KardexMovs {

    String codigo, nombre, descripcion, tipoRegistro,tipoMovimiento, tipoDocumento, numDocumento, estado, fecha, usuario;
    double cantidad, precioSigv;
    String sql;
    PreparedStatement pst;
    ResultSet rs;
    int id;

    public KardexMovs() {
    }

    public KardexMovs(String codigo, String nombre, String descripcion, String tipoRegistro, String tipoDocumento, String numDocumento, String estado, String fecha, double cantidad, double precioSigv,String Usuario,String tipoMovimiento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipoRegistro = tipoRegistro;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.estado = estado;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioSigv = precioSigv;
        this.usuario=Usuario;
        this.tipoMovimiento=tipoMovimiento;
    }

    public KardexMovs(int id, String codigo, String nombre, String descripcion, String tipoRegistro, String tipoDocumento, String numDocumento, String estado, String fecha, double cantidad, double precioSigv,String usuario,String tipoMovimiento) {

        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoRegistro = tipoRegistro;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.estado = estado;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precioSigv = precioSigv;
        this.usuario=usuario;
        this.tipoMovimiento=tipoMovimiento;
    }

    public int insertMovimiento(String codigoz, String nombrez, String descripcion, String tipoRegistro,
            double cantidad, double precioSigv, String tipoDocumento, String numDocumento, String usuariox,
            String tipoMovimientox) {
        /*
         Valores de respuesta:
         1. se Ingresó correctamente
         2. No cuenta con stock minimo
         3. 
         */

        int valor = 0;
        sql = "call `sp.newMovimiento` (?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            pst = con.prepareCall(sql);
            pst.setString(1, codigoz);
            pst.setString(2, nombrez);
            pst.setString(3, descripcion);
            pst.setString(4, tipoRegistro);
            pst.setDouble(5, cantidad);
            pst.setDouble(6, precioSigv);
            pst.setString(7, tipoDocumento);
            pst.setString(8, numDocumento);
            pst.setString(9, usuariox);
            pst.setString(10, tipoMovimientox);

            pst.executeUpdate();
            valor = 1;

        } catch (Exception e) {
            Logger.getLogger(KardexMovs.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;
    }
    public int updateMovimiento(int idx,String codigoz, String nombrez, String descripcion, String tipoRegistro,
            double cantidad, double precioSigv, String tipoDocumento, String numDocumento,String estadoz,
            String tipoMovimientox) {
       

        int valor = 0;
        sql = "call `sp.updateMovimiento` (?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            pst = con.prepareCall(sql);
            pst.setString(1, codigoz);
            pst.setString(2, nombrez);
            pst.setString(3, descripcion);
            pst.setString(4, tipoRegistro);
            pst.setDouble(5, cantidad);
            pst.setDouble(6, precioSigv);
            pst.setString(7, tipoDocumento);
            pst.setString(8, numDocumento);
            pst.setString(9, "Modificado");
            pst.setString(10, tipoMovimientox);
            pst.setInt(11,idx);
            
            valor = pst.executeUpdate();
            System.out.println("valor al ejecutar es: "+valor);
        } catch (Exception e) {
            Logger.getLogger(KardexMovs.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;
    }
    public void newMovimientoKardex(String usuarioz, String descripcionx, 
            String articulox, String cantInicialx,String cantFinalx){
         try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
             
             sql ="call `sp.newKardexSeguimiento` (?,?,?,?,?)";
             pst = con.prepareCall(sql);
             pst.setString(1,usuarioz);
             pst.setString(2,descripcionx);
             pst.setString(3,articulox);
             pst.setString(4,cantInicialx);
             pst.setString(5,cantFinalx);
             pst.executeQuery();
            
         }catch (Exception e) {
            Logger.getLogger(KardexMovs.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con la actualización de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
    }
    public ArrayList getLastKardexMovs(int cantidadx) {

        ArrayList<KardexMovs> lista = new ArrayList();

        int valor = 0;
        sql = "call `sp.ConsKardexLimit` (?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            pst = con.prepareCall(sql);
            pst.setInt(1, cantidadx);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new KardexMovs(
                        rs.getInt("id"), rs.getString("codigo"), 
                        rs.getString("nombre"),rs.getString("descripcion"),
                        rs.getString("tipoRegistro"), rs.getString("tipoDocumento"),
                        rs.getString("numDocumento"), rs.getString("estado"),
                        rs.getString("fecha") + "", rs.getDouble("cantidad"), rs.getDouble("preciosigv"),
                        rs.getString("usuario"),rs.getString("tipoMovimiento")
                ));
            }

            pst.executeUpdate();
            valor = 1;

        } catch (Exception e) {
            Logger.getLogger(KardexMovs.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public ArrayList getKardexMovsLikeAll(String codigoz, String tipoRegistroz, String tipoDocumentoz,
            String estadoz, String fecha1z, String fecha2z, int cantidadx) {

        ArrayList<KardexMovs> lista = new ArrayList();

        int valor = 0;
        sql = "call `sp.ConsKardexMovsLikeAll` (?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            pst = con.prepareCall(sql);
            pst.setString(1, codigoz);
            pst.setString(2, tipoRegistroz);
            pst.setString(3, tipoDocumentoz);
            pst.setString(4, estadoz);
            pst.setString(5, fecha1z);
            pst.setString(6, fecha2z);
            pst.setInt(7, cantidadx);

            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new KardexMovs(
                        rs.getInt("id"), rs.getString("codigo"), 
                        rs.getString("nombre"),rs.getString("descripcion"),
                        rs.getString("tipoRegistro"), rs.getString("tipoDocumento"),
                        rs.getString("numDocumento"), rs.getString("estado"),
                        rs.getString("fecha") + "", rs.getDouble("cantidad"), 
                        rs.getDouble("preciosigv"),rs.getString("usuario"),
                        rs.getString("tipoMovimiento")
                 ));
            }

            pst.executeUpdate();
            valor = 1;

        } catch (Exception e) {
            Logger.getLogger(KardexMovs.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public int getDiasModificarKarfex() {

        int valor = 0;
        sql = "call `sp.ConsDiasKardex` ()";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                valor = rs.getInt("valor");
            }
        } catch (Exception e) {
            Logger.getLogger(KardexMovs.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;
    }

    public int updateDiasModificarKardex(int valorx) {

        int valor = 0;
        sql = "call `sp.UpdateDiasKardex` (?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1, valorx);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(KardexMovs.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;
    }
//sp.ConsInventarioxCodyNombrexEstado

    @Override
    public String toString() {
        return "KardexMovs{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tipoRegistro=" + tipoRegistro + ", tipoMovimiento=" + tipoMovimiento + ", tipoDocumento=" + tipoDocumento + ", numDocumento=" + numDocumento + ", estado=" + estado + ", fecha=" + fecha + ", usuario=" + usuario + ", cantidad=" + cantidad + ", precioSigv=" + precioSigv + ", id=" + id + '}';
    }

   
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioSigv() {
        return precioSigv;
    }

    public void setPrecioSigv(double precioSigv) {
        this.precioSigv = precioSigv;
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

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
    private void a(){
       
    }
}
