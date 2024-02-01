/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Family
 */
public class Mensaje {

    int id = -1;
    String codigoUsuario, titulo, nombreProducto, mensaje, estado, fecha, fechaLeido;
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public Mensaje() {
    }

    public Mensaje(int id, String codigoUsuario, String titulo, String nombreProducto, String mensaje, String estado, String fecha, String fechaLeido) {
        this.id = id;
        this.codigoUsuario = codigoUsuario;
        this.titulo = titulo;
        this.nombreProducto = nombreProducto;
        this.mensaje = mensaje;
        this.estado = estado;
        this.fecha = fecha;
        this.fechaLeido = fechaLeido;
    }

    public ArrayList getUserMensajes(String codigoUsuariox, String estadox) {
        ArrayList<Mensaje> lista = new ArrayList();

        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.getUserMensajes`(?,?)";
            pst = con.prepareCall(sql);
            pst.setString(1, codigoUsuariox);
            pst.setString(2, estadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                lista.add(new Mensaje(
                        rs.getInt("id"), rs.getString("codigoUsuario"),
                        rs.getString("titulo"), rs.getString("nombreProducto"),
                        rs.getString("mensaje"), rs.getString("estado"),
                        rs.getString("fecha"), rs.getString("fechaLeido")
                ));
            }
        } catch (Exception e) {
            Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;

    }
 public int newMensaje(String codigoUsuariox, String titulox, String nombreProductox, String mensajex) {
int valor=0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.newMensaje`(?,?,?,?)";
            pst = con.prepareCall(sql);
            pst.setString(1, codigoUsuariox);
            pst.setString(2, titulox);
            pst.setString(3, nombreProductox);
            pst.setString(4, mensajex);
            valor=pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;

    }
 
 public int leerMensaje(int idx) {
int valor=0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.LeerMensaje`(?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
            valor=pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Mensaje.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;

    }

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", codigoUsuario=" + codigoUsuario + ", titulo=" + titulo + ", nombreProducto=" + nombreProducto + ", mensaje=" + mensaje + ", estado=" + estado + ", fecha=" + fecha + ", fechaLeido=" + fechaLeido + '}';
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

    public int getIdMensaje() {
        return id;
    }

    public void setIdMensaje(int id) {
        this.id = id;
    }

    public String getCodigoUsuarioMensaje() {
        return codigoUsuario;
    }

    public void setCodigoUsuarioMensaje(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getTituloMensaje() {
        return titulo;
    }

    public void setTituloMensaje(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreProductoMensaje() {
        return nombreProducto;
    }

    public void setNombreProductoMensaje(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEstadoMensaje() {
        return estado;
    }

    public void setEstadoMensaje(String estado) {
        this.estado = estado;
    }

    public String getFechaMensaje() {
        return fecha;
    }

    public void setFechaMensaje(String fecha) {
        this.fecha = fecha;
    }

    public String getFechaLeidoMensaje() {
        return fechaLeido;
    }

    public void setFechaLeidoMensaje(String fechaLeido) {
        this.fechaLeido = fechaLeido;
    }

}
