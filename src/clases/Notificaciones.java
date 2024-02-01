package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Notificaciones extends Mensaje{

    int idNotificacion = -1;
    String codigoUsuario = "-", noti01 = "f", noti02 = "f", noti03 = "f", noti04 = "f", noti05 = "f", noti06 = "f", noti07 = "f", noti08 = "f", noti09 = "f";

    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public Notificaciones() {
    }

    public Notificaciones(int id, String codigoUsuario, String noti01, String noti02, String noti03, String noti04, String noti05, String noti06, String noti07, String noti08, String noti09) {
        this.idNotificacion = id;
        this.codigoUsuario = codigoUsuario;
        this.noti01 = noti01;
        this.noti02 = noti02;
        this.noti03 = noti03;
        this.noti04 = noti04;
        this.noti05 = noti05;
        this.noti06 = noti06;
        this.noti07 = noti07;
        this.noti08 = noti08;
        this.noti09 = noti09;
    }

    public ArrayList Listar(String valor) {
        ArrayList<Notificaciones> lista = new ArrayList();

        sql = "call  `sp.ConsAllNotificaciones` ()";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {

                lista.add(new Notificaciones(
                        rs.getInt("id"), rs.getString("codigoUsuario"),
                        rs.getString("noti01"), rs.getString("noti02"), rs.getString("noti03"),
                        rs.getString("noti04"), rs.getString("noti05"), rs.getString("noti06"),
                        rs.getString("noti07"), rs.getString("noti08"), rs.getString("noti09")
                ));

            }
        } catch (Exception e) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public Notificaciones getUserNotificacion(String codigoUsuariox) {
        Notificaciones es = new Notificaciones();
        sql = "call  `sp.getUserNotificaciones` (?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, codigoUsuariox);
            rs = pst.executeQuery();
            while (rs.next()) {
                        this.idNotificacion=rs.getInt("id");
                        this.codigoUsuario=rs.getString("codigoUsuario");
                        this.noti01 = rs.getString("noti01");
                        this.noti02 = rs.getString("noti02");
                        this.noti03 = rs.getString("noti03");
                        this.noti04 = rs.getString("noti04");
                        this.noti05 = rs.getString("noti05");
                        this.noti06 = rs.getString("noti06");
                        this.noti07 = rs.getString("noti07");
                        this.noti08 = rs.getString("noti08");
                        this.noti09 = rs.getString("noti09");
            }
        } catch (Exception e) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return this;
    }

    public int newUserNotificacion() {
        int valor= 0;
        sql = "call  `sp.newUserNotifiacion` (?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, codigoUsuario);
            pst.setString(2, noti01);
            pst.setString(3, noti02);
            pst.setString(4, noti03);
            pst.setString(5, noti04);
            
            pst.setString(6, noti05);
            pst.setString(7, noti06);
            pst.setString(8, noti07);
            pst.setString(9, noti08);
            pst.setString(10, noti09);
            valor = pst.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }
    
     public int updateUserNotificacion(int idNotificacionx) {
        int valor= 0;
        sql = "call  `sp.updateUserNotificacion` (?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setInt(1,idNotificacionx);
            pst.setString(2, codigoUsuario);
            pst.setString(3, noti01);
            pst.setString(4, noti02);
            pst.setString(5, noti03);
            pst.setString(6, noti04);
            
            pst.setString(7, noti05);
            pst.setString(8, noti06);
            pst.setString(9, noti07);
            pst.setString(10, noti08);
            pst.setString(11, noti09);
            valor = pst.executeUpdate();
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
            Logger.getLogger(Talla.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public String toStringNotificaciones() {
        return "Notificaciones{" + "idNotificacion=" + idNotificacion + ", codigoUsuario=" + codigoUsuario + ", noti01=" + noti01 + ", noti02=" + noti02 + ", noti03=" + noti03 + ", noti04=" + noti04 + ", noti05=" + noti05 + ", noti06=" + noti06 + ", noti07=" + noti07 + ", noti08=" + noti08 + ", noti09=" + noti09 + '}';
    }

    
    
    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    
    
    public String getCodigoUsuarioMensaje() {
        return codigoUsuario;
    }

    public void setCodigoUsuarioMensaje(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNoti01() {
        return noti01;
    }

    public void setNoti01(String noti01) {
        this.noti01 = noti01;
    }

    public String getNoti02() {
        return noti02;
    }

    public void setNoti02(String noti02) {
        this.noti02 = noti02;
    }

    public String getNoti03() {
        return noti03;
    }

    public void setNoti03(String noti03) {
        this.noti03 = noti03;
    }

    public String getNoti04() {
        return noti04;
    }

    public void setNoti04(String noti04) {
        this.noti04 = noti04;
    }

    public String getNoti05() {
        return noti05;
    }

    public void setNoti05(String noti05) {
        this.noti05 = noti05;
    }

    public String getNoti06() {
        return noti06;
    }

    public void setNoti06(String noti06) {
        this.noti06 = noti06;
    }

    public String getNoti07() {
        return noti07;
    }

    public void setNoti07(String noti07) {
        this.noti07 = noti07;
    }

    public String getNoti08() {
        return noti08;
    }

    public void setNoti08(String noti08) {
        this.noti08 = noti08;
    }

    public String getNoti09() {
        return noti09;
    }

    public void setNoti09(String noti09) {
        this.noti09 = noti09;
    }

}
