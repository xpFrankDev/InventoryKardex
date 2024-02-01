
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Usuario extends Permisos{
    
     int id=0;
    String codigo="-",clave,nombre,privilegio,estado;
    String sql;
    PreparedStatement pst;
    ResultSet rs;
    public Usuario() {
        super();
    }

    public Usuario(int id, String codigo, String clave, String nombre, String privilegio, String estado) {
        super();
        this.id = id;
        this.codigo = codigo;
        this.clave = clave;
        this.nombre = nombre;
        this.privilegio = privilegio;
        this.estado = estado;
    }
    
    
     public Usuario getUser(String codigox){
        Usuario a = new Usuario();
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            
            sql = "call `sp.ConsGetUser`(?)";
            pst = con.prepareCall(sql);
            pst.setString(1, codigox);
            rs = pst.executeQuery();
            while(rs.next()){
                a.setIdMensaje(rs.getInt("id"));
                a.setCodigo(rs.getString("codigo"));
                a.setClave(rs.getString("clave"));
                a.setNombre(rs.getString("nombre"));
                a.setPrivilegio(rs.getString("privilegio"));
                a.setEstadoMensaje(rs.getString("estado"));
            }
           // getPermisos(codigox);
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return a;
    }
    
    public int newUser(String codigox, String clavex, String nombrex, String privilegiox){
        int a = 0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            String clavezx = new AES256().encrypt(clavex);
                    
                    
            sql = " call `sp.newUsuario`(?,?,?,?,?)";
            pst = con.prepareCall(sql);
            pst.setString(1, codigox);
            pst.setString(2, clavezx);
            pst.setString(3, nombrex);
            pst.setString(4, privilegiox);
            pst.setString(5, "Activo");
            a = pst.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return a;
    }

    
     public int updateUser(){
        int a = 0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            String clavezx = new AES256().encrypt(clave);
                    
            sql = " call `sp.UpdateUser`(?,?,?,?,?,?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, id);
            pst.setString(2, codigo);
            pst.setString(3, clavezx);
            pst.setString(4, nombre);
            pst.setString(5, privilegio);
            pst.setString(6, estado);
            a = pst.executeUpdate();
            
        } catch (Exception e) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return a;
    }
    
    
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", codigo=" + codigo + ", clave=" + clave + ", nombre=" + nombre + ", privilegio=" + privilegio + ", estado=" + estado + '}';
    }
    

    public int getIdMensaje() {
        return id;
    }

    public void setIdMensaje(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClave() {
        return new AES256().decrypt(this.clave);
    }

    public void setClave(String clave) {
        this.clave=clave;// = new AES256().encrypt(clave);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public String getEstadoMensaje() {
        return estado;
    }

    public void setEstadoMensaje(String estado) {
        this.estado = estado;
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
    
}
