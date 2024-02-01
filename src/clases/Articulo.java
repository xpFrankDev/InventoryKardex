package Clases;

import Frames.MainFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Articulo {

    int id = -1;
    String codigo = "-", familia, nombre, tipoUnidad, talla, cantInnerPack,
            cantMasterPack, tela, gramaje, color, fechaCreacion, ultimamodificacion, estado;
    Double stock, precioSigv, pesoInnerPack, pesoMasterPack, precioUsdsigv, valorMinimo, valorMaximo;
    String categoria, subCategoria;
    String tipoMovimiento = "-";
    String aseptico, antiFluido, antiEstatico, antiDeslizante, descartable, esteril;
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public Articulo() {
    }

    public Articulo(int id, String codigo, String familia, String nombre, String tipoUnidad, String talla, String cantInnerPack,
            String cantMasterPack, String tela, String gramaje, String color, String fechaCreacio, String ultimamodificacion,
            String estado, Double stock, Double precioSigv, Double pesoInnerPack, Double pesoMasterPack,
            Double precioUsdsigv, String categoria, String subCatergoria, String aseptico, String antiFluido, String antiEstatico, String antiDeslizante,
            String descartable, String esteril) {
        this.id = id;
        this.codigo = codigo;
        this.familia = familia;
        this.nombre = nombre;
        this.tipoUnidad = tipoUnidad;
        this.talla = talla;
        this.cantInnerPack = cantInnerPack;
        this.cantMasterPack = cantMasterPack;
        this.tela = tela;
        this.gramaje = gramaje;
        this.color = color;
        this.fechaCreacion = fechaCreacio;
        this.ultimamodificacion = ultimamodificacion;
        this.estado = estado;
        this.stock = stock;
        this.precioSigv = precioSigv;
        this.pesoInnerPack = pesoInnerPack;
        this.pesoMasterPack = pesoMasterPack;
        this.precioUsdsigv = precioUsdsigv;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.aseptico = aseptico;
        this.antiFluido = antiFluido;
        this.antiEstatico = antiEstatico;
        this.antiDeslizante = antiDeslizante;
        this.descartable = descartable;
        this.esteril = esteril;
    }

    public Articulo(int id, String familia, String nombre, String tipoUnidad, String talla, String cantInnerPack,
            String cantMasterPack, String tela, String gramaje, String color, String fechaCreacion,
            String ultimamodificacion, String estado, Double stock, Double precioSigv, Double pesoInnerPack,
            Double pesoMasterPack, Double precioUsdsigv, Double valorMinimo, Double valorMaximo,
            String categoria, String subCategoria, String aseptico, String antiFluido, String antiEstatico, String antiDeslizante,
            String descartable, String esteril) {
        this.id = id;
        this.familia = familia;
        this.nombre = nombre;
        this.tipoUnidad = tipoUnidad;
        this.talla = talla;
        this.cantInnerPack = cantInnerPack;
        this.cantMasterPack = cantMasterPack;
        this.tela = tela;
        this.gramaje = gramaje;
        this.color = color;
        this.fechaCreacion = fechaCreacion;
        this.ultimamodificacion = ultimamodificacion;
        this.estado = estado;
        this.stock = stock;
        this.precioSigv = precioSigv;
        this.pesoInnerPack = pesoInnerPack;
        this.pesoMasterPack = pesoMasterPack;
        this.precioUsdsigv = precioUsdsigv;
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.aseptico = aseptico;
        this.antiFluido = antiFluido;
        this.antiEstatico = antiEstatico;
        this.antiDeslizante = antiDeslizante;
        this.descartable = descartable;
        this.esteril = esteril;
    }

    public Articulo getArticulo(String codigo) {
        Articulo a = new Articulo();

        sql = "call `sp.ConsInventarioxCodigo` (?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            pst = con.prepareCall(sql);
            pst.setString(1, codigo);
            rs = pst.executeQuery();
            while (rs.next()) {
                a.setCodigo(rs.getString("codigo"));
                a.setFamilia(rs.getString("familia"));
                a.setNombre(rs.getString("nombre"));
                a.setTipoUnidad(rs.getString("tipoUnidad"));
                a.setTalla(rs.getString("talla"));
                a.setCantInnerPack(rs.getString("cantInnerPack"));
                a.setCantMasterPack(rs.getString("cantMasterPack"));
                a.setTela(rs.getString("tela"));
                a.setGramaje(rs.getString("gramaje"));
                a.setColor(rs.getString("color"));
                a.setFechaCreacio(rs.getString("fechaCreacion"));
                a.setUltimamodificacion(rs.getString("ultimaModificacion"));
                a.setEstado(rs.getString("estado"));
                a.setStock(rs.getDouble("stock"));
                a.setPesoInnerPack(rs.getDouble("pesoInnerPack"));
                a.setPesoMasterPack(rs.getDouble("pesoMasterPack"));
                a.setPrecioSigv(rs.getDouble("precioSigv"));
                a.setPrecioUsdsigv(rs.getDouble("precioUsdsigv"));
                a.setValorMinimo(rs.getDouble("valorMinimo"));
                a.setValorMaximo(rs.getDouble("valorMaximo"));
                a.setCategoria(rs.getString("categoria"));
                a.setSubCategoria(rs.getString("subCategoria"));
                a.setAseptico(rs.getString("aseptico"));
                a.setAntiFluido(rs.getString("antiFluido"));
                a.setAntiDeslizante(rs.getString("antiDeslizante"));
                a.setAntiEstatico(rs.getString("antiEstatico"));
                a.setDescartable(rs.getString("descartable"));
                a.setEsteril(rs.getString("esteril"));

            }
        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return a;
    }

    public double getStockArticulo(String codigox) {
        double valor = 0;
        sql = "call `sp.ConsStockArticulo` (?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, codigox);
            rs = pst.executeQuery();
            while (rs.next()) {
                valor = rs.getDouble("stock");
            }
        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;
    }

    public int updateStockArticulo(double cantidadx, String codigox, String tipoMovimientox) {

        int valor = 0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            double newStock = 0.0;
            Articulo producto = new Articulo().getArticulo(codigox);
            
            if (tipoMovimientox.equalsIgnoreCase("entrada")) {
                newStock = producto.getStock() + cantidadx;
            } else if (tipoMovimientox.equalsIgnoreCase("salida")) {
                newStock = producto.getStock() - cantidadx;
            }
            producto.setStock(newStock);
            if (newStock > 0) {
                sql = "call `sp.UpdateStockArticulo` (?,?)";
                pst = con.prepareCall(sql);
                pst.setDouble(1, newStock);
                pst.setString(2, codigox);
                valor = pst.executeUpdate();
            }
            // new Thread(this::revisarExistencias).start();
        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;
    }
 public int updateStockArticuloANULAR(double cantidadx, String codigox, String tipoMovimientox) {

        int valor = 0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            double newStock = 0.0;
            Articulo producto = new Articulo().getArticulo(codigox);
            if (tipoMovimientox.equalsIgnoreCase("entrada")) {
                newStock = producto.getStock() - cantidadx;
            } else if (tipoMovimientox.equalsIgnoreCase("salida")) {
                newStock = producto.getStock() + cantidadx;
            }
            if (newStock > 0) {
                sql = "call `sp.UpdateStockArticulo` (?,?)";
                pst = con.prepareCall(sql);
                pst.setDouble(1, newStock);
                pst.setString(2, codigox);
                valor = pst.executeUpdate();
            }
            // new Thread(this::revisarExistencias).start();
        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;
    }
    
    /*
   
    private void revisarExistencias(String tipoMov){
        
        SolicitudCompra sc = new SolicitudCompra().getSolicitudxCodigoyEstado(codigo, "Pendiente");
        ArrayList<Mail> correos = (ArrayList)new Mail().getAllCuentasCorreo().clone();
        String notiCuenta ="";
        String clave ="";
        String correoUsuario="";
        double cantidadOptima=getValorMaximo()/2;
        
        
        for(Mail m : correos){
            if(m.getUsuario().equals("noti")){
                notiCuenta = m.getCorreo();
                clave = m.getClave();
            }
            if (m.getUsuario().equals(MainFrame.user.getCodigo())){
                correoUsuario = m.getCorreo();
            }
        }
        if(sc.getId()>0){// si posee una solicitud de compra con pendiente (actualizar actual)
            
        }else{//No posee una solicitud de compra ( generar nuevo )
            if(getStock()<=getValorMinimo()){
                
                new SolicitudCompra().newSolCompra(getCodigo(),
                        getNombre(), cantidadOptima, getStock()+"", MainFrame.getUsuario(),tipoMov);
                
                new Mail().enviarCorreo(correoUsuario, "Stock Bajo - "+getNombre(), "Se ha registrado un producto"
                        + " que cuenta con un Stock Bajo, considerar en reponer sus unidades. "
                        + "Pd. se ha generado una solicitud de Compra en el sistema "
                        + "para el mismo.\n\n        Codigo       -\t           Nombre\n     "+getCodigo()+"       -\t           "+getNombre()+"\nStock Actual: "+getStock(), notiCuenta, clave);
            }else if (stock>=valorMaximo){
                
            }
        }
        
    }
     
 */
    
  
    public int insertArticulo(String codigoz, String familiaz, String nombrez, String tipoUnidadz, String tallaz,
            String cantInnerPack, String cantMasterPack, String telaz, String gramajez, String colorz,
            double stockz, double precioSigvz, double pesoInnerPackz, double pesoMasterPackz,
            double precioUsdSigvz, double valorMinimoz, double valorMaximoz, String categoriaz, String subCategoriaz,
            String asepticoz, String antiFluidoz, String antiEstaticoz, String antiDeslizantez,
            String descartablez, String esterilz) {

        int valor = 0;
        sql = "call `sp.newArticulo` (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            pst = con.prepareCall(sql);
            pst.setString(1, codigoz);
            pst.setString(2, familiaz);
            pst.setString(3, nombrez);
            pst.setString(4, tipoUnidadz);
            pst.setString(5, tallaz);

            pst.setString(6, cantInnerPack);
            pst.setString(7, cantMasterPack);
            pst.setString(8, telaz);
            pst.setString(9, gramajez);
            pst.setString(10, colorz);

            pst.setDouble(11, stockz);
            pst.setDouble(12, precioSigvz);
            pst.setDouble(13, pesoInnerPackz);
            pst.setDouble(14, pesoMasterPackz);
            pst.setDouble(15, precioUsdSigvz);
            pst.setDouble(16, valorMinimoz);
            pst.setDouble(17, valorMaximoz);
            pst.setString(18, categoriaz);
            pst.setString(19, subCategoriaz);

            pst.setString(20, asepticoz);
            pst.setString(21, antiFluidoz);
            pst.setString(22, antiEstaticoz);
            pst.setString(23, antiDeslizantez);
            pst.setString(24, descartablez);
            pst.setString(25, esterilz);

            System.out.println("Imprimiendo exceute: " + pst.executeUpdate());
            valor = 1;

        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return valor;
    }

    public int UpdateArticulo(String familiaz, String nombrez, String tipoUnidadz, String tallaz,
            String cantInnerPack, String cantMasterPack, String telaz, String gramajez, String colorz,
            double stockz, double precioSigvz, double pesoInnerPackz, double pesoMasterPackz,
            double precioUsdSigvz, double valorMinimoz, double valorMaximoz,
            String categoriaz, String subCategoriaz, String estadoz, String codigoz,
            String asepticoz, String antiFluidoz, String antiEstaticoz, String antiDeslizantez,
            String descartablez, String esterilz) {

        int valor = 0;
        sql = "call `sp.UpdateArticulo` (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {

            pst = con.prepareCall(sql);

            pst.setString(1, familiaz);
            pst.setString(2, nombrez);
            pst.setString(3, tipoUnidadz);
            pst.setString(4, tallaz);

            pst.setString(5, cantInnerPack);
            pst.setString(6, cantMasterPack);
            pst.setString(7, telaz);
            pst.setString(8, gramajez);
            pst.setString(9, colorz);

            pst.setDouble(10, stockz);
            pst.setDouble(11, precioSigvz);
            pst.setDouble(12, pesoInnerPackz);
            pst.setDouble(13, pesoMasterPackz);
            pst.setDouble(14, precioUsdSigvz);

            pst.setDouble(15, valorMinimoz);
            pst.setDouble(16, valorMaximoz);
            pst.setString(17, categoriaz);
            pst.setString(18, subCategoriaz);
            pst.setString(19, estadoz);
            pst.setString(20, codigoz);

            pst.setString(21, asepticoz);
            pst.setString(22, antiFluidoz);
            pst.setString(23, antiEstaticoz);
            pst.setString(24, antiDeslizantez);
            pst.setString(25, descartablez);
            pst.setString(26, esterilz);

            valor = pst.executeUpdate();
            System.out.println("Actualización ejecutada: valor: " + valor);
        } catch (Exception e) {
            Logger.getLogger(Articulo.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

        public ArrayList ConsInventarioxCodyNombrexEstado(String valorx, String estadox) {
        Articulo a = new Articulo();
        ArrayList<Articulo> lista = new ArrayList();
        sql = "call `sp.ConsInventarioxCodyNombrexEstado` (?,?)";
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            pst = con.prepareCall(sql);
            pst.setString(1, valorx);
            pst.setString(2, estadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                a = new Articulo();
                a.setId(rs.getInt("id"));
                a.setCodigo(rs.getString("codigo"));
                a.setFamilia(rs.getString("familia"));
                a.setNombre(rs.getString("nombre"));
                a.setTipoUnidad(rs.getString("tipoUnidad"));
                a.setTalla(rs.getString("talla"));
                a.setCantInnerPack(rs.getString("cantInnerPack"));
                a.setCantMasterPack(rs.getString("cantMasterPack"));
                a.setTela(rs.getString("tela"));
                a.setGramaje(rs.getString("gramaje"));
                a.setColor(rs.getString("color"));
                a.setFechaCreacio(rs.getString("fechaCreacion"));
                a.setUltimamodificacion(rs.getString("ultimaModificacion"));
                a.setEstado(rs.getString("estado"));
                a.setStock(rs.getDouble("stock"));
                a.setPesoInnerPack(rs.getDouble("pesoInnerPack"));
                a.setPesoMasterPack(rs.getDouble("pesoMasterPack"));
                a.setPrecioSigv(rs.getDouble("precioSigv"));
                a.setPrecioUsdsigv(rs.getDouble("precioUsdsigv"));
                a.setValorMinimo(rs.getDouble("valorMinimo"));
                a.setValorMaximo(rs.getDouble("valorMaximo"));
                a.setCategoria(rs.getString("categoria"));
                a.setSubCategoria(rs.getString("subCategoria"));
                a.setAseptico(rs.getString("aseptico"));
                a.setAntiFluido(rs.getString("antiFluido"));
                a.setAntiDeslizante(rs.getString("antiDeslizante"));
                a.setAntiEstatico(rs.getString("antiEstatico"));
                a.setDescartable(rs.getString("descartable"));
                a.setEsteril(rs.getString("esteril"));
                lista.add(a);
                a = new Articulo();
            }
        } catch (Exception e) {
            Logger.getLogger(KardexMovs.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return lista;
    }

    public void revisarStockCritico(Kardex myKardex) {
        SolicitudCompra sc = new SolicitudCompra().getLastSolicitudCodigoxEstado(codigo, "");

        // Verificamos que no tenga un expediente abierto
        if (sc.getId() > 0 || !sc.getEstado().equalsIgnoreCase("cerrado")) {
            if (stock <= valorMinimo) {
                sc.updateSolicitud(this.valorMinimo, this.stock, "Abierta", "Stock Bajo", sc.getId());
                /*
                    ENVIAR CORREO
                 */

            } else if (stock >= valorMaximo) {
                sc.updateSolicitud(this.valorMaximo, this.stock, "Abierta", "Stock Alto", sc.getId());
                /*
                    ENVIAR CORREO
                 */
            } else {
                if (myKardex.getTipoMovimiento().equalsIgnoreCase("compra")) {
                    double compradas = 0.0;
                    for (ProductoKardex articulo : myKardex.getProductos()) {
                        if (codigo.equalsIgnoreCase(articulo.getCodigo())) {
                            compradas = articulo.getCantidad();
                        }
                    }
                    String hoy = new SimpleDateFormat("yyyy-MM.dd").format(new Date());
                    String facturas = "";
                    for (FacturaKardex factura : myKardex.getFacturas()) {
                        facturas += factura.getNumFactura() + "/";
                    }
                    sc.newCompra(sc.getId(), myKardex.usuario,
                            compradas, hoy, "Compra", facturas);
                    /*
                        ENVIAR CORREO
                     */
                } else {
                    double compradas = 0.0;
                    for (ProductoKardex articulo : myKardex.getProductos()) {
                        if (codigo.equalsIgnoreCase(articulo.getCodigo())) {
                            compradas = articulo.getCantidad();
                        }
                    }
                    String hoy = new SimpleDateFormat("yyyy-MM.dd").format(new Date());
                    String facturas = "";
                    for (FacturaKardex factura : myKardex.getFacturas()) {
                        facturas += factura.getNumFactura() + "/";
                    }
                    sc.newCompra(sc.getId(), myKardex.usuario,
                            compradas, hoy, myKardex.getTipoMovimiento(), facturas);
                    /*
                        ENVIAR CORREO
                     */
                }
            }
        } else {// no tiene un expediente abierto
            if (stock <= valorMinimo) {
                new SolicitudCompra().newSolCompra(codigo, nombre, valorMinimo, stock + "", myKardex.usuario,
                        "Stock Bajo");
                /*
                        ENVIAR CORREO
                 */
            } else if (stock >= valorMaximo) {
                new SolicitudCompra().newSolCompra(codigo, nombre, valorMaximo, stock + "", myKardex.usuario,
                        "Stock Alto");
                /*
                        ENVIAR CORREO
                 */
            } else {

            }
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
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return "Articulo{" + "id=" + id + ", codigo=" + codigo + ", familia=" + familia + ", nombre=" + nombre + ", tipoUnidad=" + tipoUnidad + ", talla=" + talla + ", cantInnerPack=" + cantInnerPack + ", cantMasterPack=" + cantMasterPack + ", tela=" + tela + ", gramaje=" + gramaje + ", color=" + color + ", fechaCreacion=" + fechaCreacion + ", ultimamodificacion=" + ultimamodificacion + ", estado=" + estado + ", stock=" + stock + ", precioSigv=" + precioSigv + ", pesoInnerPack=" + pesoInnerPack + ", pesoMasterPack=" + pesoMasterPack + ", precioUsdsigv=" + precioUsdsigv + ", valorMinimo=" + valorMinimo + ", valorMaximo=" + valorMaximo + ", categoria=" + categoria + ", subCategoria=" + subCategoria + ", tipoMovimiento=" + tipoMovimiento + ", aseptico=" + aseptico + ", antiFluido=" + antiFluido + ", antiEstatico=" + antiEstatico + ", antiDeslizante=" + antiDeslizante + ", descartable=" + descartable + ", esteril=" + esteril + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUnidad() {
        return tipoUnidad;
    }

    public void setTipoUnidad(String tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getCantInnerPack() {
        return cantInnerPack;
    }

    public void setCantInnerPack(String cantInnerPack) {
        this.cantInnerPack = cantInnerPack;
    }

    public String getCantMasterPack() {
        return cantMasterPack;
    }

    public void setCantMasterPack(String cantMasterPack) {
        this.cantMasterPack = cantMasterPack;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getGramaje() {
        return gramaje;
    }

    public void setGramaje(String gramaje) {
        this.gramaje = gramaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFechaCreacio() {
        return fechaCreacion;
    }

    public void setFechaCreacio(String fechaCreacio) {
        this.fechaCreacion = fechaCreacio;
    }

    public String getUltimamodificacion() {
        return ultimamodificacion;
    }

    public void setUltimamodificacion(String ultimamodificacion) {
        this.ultimamodificacion = ultimamodificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getStock() {
        return stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Double getPrecioSigv() {
        return precioSigv;
    }

    public void setPrecioSigv(Double precioSigv) {
        this.precioSigv = precioSigv;
    }

    public Double getPesoInnerPack() {
        return pesoInnerPack;
    }

    public void setPesoInnerPack(Double pesoInnerPack) {
        this.pesoInnerPack = pesoInnerPack;
    }

    public Double getPesoMasterPack() {
        return pesoMasterPack;
    }

    public void setPesoMasterPack(Double pesoMasterPack) {
        this.pesoMasterPack = pesoMasterPack;
    }

    public Double getPrecioUsdsigv() {
        return precioUsdsigv;
    }

    public void setPrecioUsdsigv(Double precioUsdsigv) {
        this.precioUsdsigv = precioUsdsigv;
    }

    public Double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public Double getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(Double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getAseptico() {
        return aseptico;
    }

    public void setAseptico(String aseptico) {
        this.aseptico = aseptico;
    }

    public String getAntiFluido() {
        return antiFluido;
    }

    public void setAntiFluido(String antiFluido) {
        this.antiFluido = antiFluido;
    }

    public String getAntiEstatico() {
        return antiEstatico;
    }

    public void setAntiEstatico(String antiEstatico) {
        this.antiEstatico = antiEstatico;
    }

    public String getAntiDeslizante() {
        return antiDeslizante;
    }

    public void setAntiDeslizante(String antiDeslizante) {
        this.antiDeslizante = antiDeslizante;
    }

    public String getDescartable() {
        return descartable;
    }

    public void setDescartable(String descartable) {
        this.descartable = descartable;
    }

    public String getEsteril() {
        return esteril;
    }

    public void setEsteril(String esteril) {
        this.esteril = esteril;
    }

}
