package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Kardex {

    int id = 0;
    String fecha, usuario, tipoMovimiento, moneda, cliente, ruc, estado, documento, valorDocumento, categoria, subCategoria,
            observacion, ultimaModificacion, usuarioModificacion;
    int cantidadModificaciones;
    double cantidadArticulos = 0, totalValorizado;
    ArrayList<GuiaKardex> guias = new ArrayList();
    ArrayList<FacturaKardex> facturas = new ArrayList();
    ArrayList<ProductoKardex> productos = new ArrayList();
    ArrayList<PagoFacturaKardex> pagos = new ArrayList();
    ArrayList<VentaKardex> ventas = new ArrayList();
    String sql;
    PreparedStatement pst;
    ResultSet rs;

    public Kardex() {
    }

    public Kardex(int id, String fecha, String usuario, String tipoMovimiento, String moneda, String cliente, String ruc, String estado, String documento, String valorDocumento, String categoria, String subCategoria, String observacion, String ultimaModificacion, String usuarioModificacion, int cantidadModificaciones, double cantidadArticulos, double totalValorizado) {
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.tipoMovimiento = tipoMovimiento;
        this.moneda = moneda;
        this.cliente = cliente;
        this.ruc = ruc;
        this.estado = estado;
        this.documento = documento;
        this.valorDocumento = valorDocumento;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.observacion = observacion;
        this.ultimaModificacion = ultimaModificacion;
        this.usuarioModificacion = usuarioModificacion;
        this.cantidadModificaciones = cantidadModificaciones;
        this.cantidadArticulos = cantidadArticulos;
        this.totalValorizado = totalValorizado;
    }

    public int insertKardex(String usuariox, String tipoMovimientox, String monedax, String clientex, String rucx,
            String documentox, String valorDocumentox, String categoriax, String subCategoriax,
            String observacionx, double cantidadArticulosx, double totalValorizadox) {
        int valor = 0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.newKardex` (?,?,?,?,?,?,?,?,?,?,?,?,@v)";
            pst = con.prepareCall(sql);
            pst.setString(1, usuariox);
            pst.setString(2, tipoMovimientox);
            pst.setString(3, monedax);
            pst.setString(4, clientex);
            pst.setString(5, rucx);
            pst.setString(6, documentox);
            pst.setString(7, valorDocumentox);
            pst.setString(8, categoriax);
            pst.setString(9, subCategoriax);
            pst.setString(10, observacionx);

            pst.setDouble(11, cantidadArticulosx);
            pst.setDouble(12, totalValorizadox);
            rs = pst.executeQuery();
            while (rs.next()) {
                valor = rs.getInt("newIdKardex");
            }

        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public int anularKardex(int idx) {
        int valor = 0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.anularKardex` (?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idx);
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

    /*
    public ArrayList ListarKardex(int limitx){
        ArrayList<Kardex> lista = new ArrayList();
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.ListKardex` (?)";
            pst = con.prepareCall(sql);
            pst.setInt(1,limitx);
            rs = pst.executeQuery();
            while(rs.next()){
                Kardex k = new Kardex();
                k.setId(rs.getInt("id"));
                k.setFecha(rs.getString("fecha"));
                k.setUsuario(rs.getString("usuario"));
                k.setTipoMovimiento(rs.getString("tipoMovimiento"));
                k.setMoneda(rs.getString("moneda"));
                k.setCliente(rs.getString("cliente"));
                k.setRuc(rs.getString("ruc"));
                k.setCantidadArticulos(rs.getDouble("cantidadArticulos"));
                k.setTotalValorizado(rs.getDouble("totalValorizado"));
                k.setEstado(rs.getString("estado"));
                k.setDocumento(rs.getString("documento"));
                k.setValorDocumento(rs.getString("valorDocumento"));
                k.setCategoria(rs.getString("categoria"));
                k.setSubCategoria(rs.getString("subCategoria"));
                k.setObservacion(rs.getString("observacion"));
                k.setUltimaModificacion(rs.getString("ultimaModificacion"));
                k.setUsuarioModificacion(rs.getString("usuarioModificacion"));
                k.setCantidadModificaciones(rs.getInt("cantidadModificaciones"));
                lista.add
            }
    
     } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return lista;
    }
     */
    public int insertKardex() {
        int valor = 0;
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.newKardex` (?,?,?,?,?,?,?,?,?,?,?,?,@v)";
            pst = con.prepareCall(sql);
            pst.setString(1, usuario);
            pst.setString(2, tipoMovimiento);
            pst.setString(3, moneda);
            pst.setString(4, cliente);
            pst.setString(5, ruc);
            pst.setString(6, documento);
            pst.setString(7, valorDocumento);
            pst.setString(8, categoria);
            pst.setString(9, subCategoria);
            pst.setString(10, observacion);
            pst.setDouble(11, cantidadArticulos);
            pst.setDouble(12, totalValorizado);
            rs = pst.executeQuery();
            while (rs.next()) {
                valor = rs.getInt("newIdKardex");
            }
            setId(valor);

        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return valor;
    }

    public Kardex getKardex(int idKardex) {

        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.newKardex` (?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, idKardex);
            rs = pst.executeQuery();
            while (rs.next()) {
                if (cantidadArticulos < 1) {
                    setId(rs.getInt("id"));
                    setFecha(rs.getString("fecha"));
                    setEstado(rs.getString("estado"));
                    setUltimaModificacion(rs.getString("ultimaModificacion"));
                    setUsuarioModificacion(rs.getString("usuarioModificacion"));
                    setUsuario(rs.getString("usuario"));
                    setTipoMovimiento(rs.getString("tipoMovimiento"));
                    setMoneda(rs.getString("moneda"));
                    setCliente(rs.getString("cliente"));
                    setRuc(rs.getString("ruc"));
                    setDocumento(rs.getString("documento"));
                    setValorDocumento(rs.getString("valorDocumento"));
                    setCategoria(rs.getString("categoria"));
                    setSubCategoria(rs.getString("subCategoria"));
                    setObservacion(rs.getString("observacion"));
                    //GUias y productos
                    addGuia(new GuiaKardex(this.id, rs.getString("guia")));
                    addFactura(new FacturaKardex(this.id, rs.getString("factura")));
                    String codigoProducto = rs.getString("codigo");
                    String nombreProducto = rs.getString("nomre");
                    String fechaProducto = rs.getString("fechaProducto");
                    double cantidadProducto = rs.getDouble("cantidad");
                    double precioRegistrado = rs.getDouble("precioRegistrado");
                    addProducto(new ProductoKardex(this.id, codigoProducto, nombreProducto, fechaProducto,
                            this.moneda, cantidadProducto, precioRegistrado));
                } else {
                    //GUias y productos
                    addGuia(new GuiaKardex(this.id, rs.getString("guia")));
                    addFactura(new FacturaKardex(this.id, rs.getString("factura")));
                    String codigoProducto = rs.getString("codigo");
                    String nombreProducto = rs.getString("nomre");
                    String fechaProducto = rs.getString("fechaProducto");
                    double cantidadProducto = rs.getDouble("cantidad");
                    double precioRegistrado = rs.getDouble("precioRegistrado");
                    addProducto(new ProductoKardex(this.id, codigoProducto, nombreProducto, fechaProducto,
                            this.moneda, cantidadProducto, precioRegistrado));
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return this;
    }

    public ArrayList listKardex(int limitx) {
        ArrayList<Kardex> kList = new ArrayList();
        Kardex k = new Kardex();
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.ListKardex` (?)";
            pst = con.prepareCall(sql);
            pst.setInt(1, limitx);
            rs = pst.executeQuery();
            int idInicial = 0;
            int idSecundaria = 0;
            while (rs.next()) {
                idInicial = rs.getInt("id");
                if (idInicial != idSecundaria) {
                    k = new Kardex();
                    k.setId(rs.getInt("id"));
                    k.setFecha(rs.getString("fecha"));
                    k.setEstado(rs.getString("estado"));
                    k.setUltimaModificacion(rs.getString("ultimaModificacion"));
                    k.setUsuarioModificacion(rs.getString("usuarioModificacion"));
                    k.setUsuario(rs.getString("usuario"));
                    k.setTipoMovimiento(rs.getString("tipoMovimiento"));
                    k.setMoneda(rs.getString("moneda"));
                    k.setCliente(rs.getString("cliente"));
                    k.setRuc(rs.getString("ruc"));
                    k.setDocumento(rs.getString("documento"));
                    k.setValorDocumento(rs.getString("valorDocumento"));
                    k.setCategoria(rs.getString("categoria"));
                    k.setSubCategoria(rs.getString("subCategoria"));
                    k.setObservacion(rs.getString("observacion"));
                    //GUias y productos
                    k.addGuia(new GuiaKardex(this.id, rs.getString("guia")));
                    k.addFactura(new FacturaKardex(this.id, rs.getString("factura")));
                    String codigoProducto = rs.getString("codigo");
                    String nombreProducto = rs.getString("nombre");
                    String fechaProducto = rs.getString("fechaProducto");
                    double cantidadProducto = rs.getDouble("cantidad");
                    double precioRegistrado = rs.getDouble("precioRegistrado");
                    k.addProducto(new ProductoKardex(this.id, codigoProducto, nombreProducto, fechaProducto,
                            this.moneda, cantidadProducto, precioRegistrado));

                    kList.add(k);
                    idSecundaria = idInicial;

                } else {
                    for (int i = 0; i < kList.size(); i++) {
                        if (kList.get(i).getId() == idInicial) {
                            kList.get(i).addGuia(new GuiaKardex(this.id, rs.getString("guia")));
                            kList.get(i).addFactura(new FacturaKardex(this.id, rs.getString("factura")));
                            String codigoProducto = rs.getString("codigo");
                            String nombreProducto = rs.getString("nombre");
                            String fechaProducto = rs.getString("fechaProducto");
                            double cantidadProducto = rs.getDouble("cantidad");
                            double precioRegistrado = rs.getDouble("precioRegistrado");
                            kList.get(i).addProducto(new ProductoKardex(this.id, codigoProducto, nombreProducto, fechaProducto,
                                    this.moneda, cantidadProducto, precioRegistrado));
                        }
                    }
                    idSecundaria = idInicial;
                }

            }
        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

        return kList;
    }

    public ArrayList verDetalleKardex() {
        ArrayList<Kardex> kList = new ArrayList();
        Kardex k = new Kardex();
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            sql = "call `sp.verAllDetalleKardex` ()";
            pst = con.prepareCall(sql);
            rs = pst.executeQuery();
            int idInicial = 0;
            int idSecundaria = 0;
            while (rs.next()) {
                idInicial = rs.getInt("idKardex");
                if (idInicial != idSecundaria) {
                    k = new Kardex();
                    k.setId(rs.getInt("idKardex"));
                    k.setFecha(rs.getString("fechaKardex"));
                    k.setEstado(rs.getString("estadoKardex"));
                    k.setUltimaModificacion(rs.getString("ultimaModificacionKardex"));
                    k.setUsuarioModificacion(rs.getString("usuarioModificacionKardex"));
                    k.setUsuario(rs.getString("usuarioKardex"));
                    k.setTipoMovimiento(rs.getString("tipoMovimientoKardex"));
                    k.setMoneda(rs.getString("monedaKardex"));
                    k.setCliente(rs.getString("razonSocialCliente"));
                    k.setRuc(rs.getString("rucKardex"));
                    k.setDocumento(rs.getString("documentoKardex"));
                    k.setValorDocumento(rs.getString("valorDocumentoKardex"));
                    k.setCategoria(rs.getString("categoriaKardex"));
                    k.setSubCategoria(rs.getString("subCategoriaKardex"));
                    k.setObservacion(rs.getString("observacionKardex"));
                    //GUias,Factura, productos,Venta y Pagos
                    k.addGuia(new GuiaKardex(k.getId(), rs.getString("valorGuia")));
                    k.addFactura(new FacturaKardex(rs.getInt("idFacturak"), k.getId(), rs.getString("fechaFactura"),
                            rs.getString("valorFactura"), rs.getString("estadoFactura"), rs.getDouble("netoFactura"),
                            rs.getDouble("igvFactura"), rs.getDouble("totalFactura")));

                    String codigoProducto = rs.getString("codigoProducto");
                    String nombreProducto = rs.getString("nombreProducto");
                    String fechaProducto = rs.getString("fechaProducto");
                    double cantidadProducto = rs.getDouble("cantidadProducto");
                    double precioRegistrado = rs.getDouble("precioRegistradoProducto");
                    k.addProducto(new ProductoKardex(this.id, codigoProducto, nombreProducto, fechaProducto,
                            this.moneda, cantidadProducto, precioRegistrado));
                    k.addVenta(new VentaKardex(
                            rs.getInt("vkID"), rs.getInt("idKardex"), rs.getString("vkFecha"),
                            rs.getString("vkTipoVenta"), rs.getString("vkTipoCliente"),
                            k.getRuc(), k.getCliente(), rs.getString("vkDireccion"),
                            rs.getString("vkVendedor"), rs.getString("vkEstadoPago"),
                            rs.getDouble("netoVenta"), rs.getDouble("vkCantidadIgv"),
                            rs.getDouble("vkmontoIgv"), rs.getDouble("vkMontoTotal")
                    ));
                    k.addPago(new PagoFacturaKardex(
                            rs.getInt("idPago"), rs.getInt("pfkIdFact"), rs.getInt("idKardexPago"),
                            rs.getString("pfkTipoPago"), rs.getString("pfkBanco"),
                            rs.getString("pfkReferenciaPago"), rs.getString("pfkUsuario"),
                            rs.getString("pfkFecha"), rs.getString("pfkFechaPago"), rs.getDouble("pfkMontoPagado"), rs.getString("estadoPago")
                    ));

                    kList.add(k);
                    idSecundaria = idInicial;

                } else {
                    for (int i = 0; i < kList.size(); i++) {
                        if (kList.get(i).getId() == idInicial) {
                            kList.get(i).addGuia(new GuiaKardex(kList.get(i).getId(), rs.getString("valorGuia")));
                            k.addFactura(new FacturaKardex(rs.getInt("idFacturak"), k.getId(), rs.getString("fechaFactura"),
                                    rs.getString("valorFactura"), rs.getString("estadoFactura"), rs.getDouble("netoFactura"),
                                    rs.getDouble("igvFactura"), rs.getDouble("totalFactura")));
                            String codigoProducto = rs.getString("codigoProducto");
                            String nombreProducto = rs.getString("nombreProducto");
                            String fechaProducto = rs.getString("fechaProducto");
                            double cantidadProducto = rs.getDouble("cantidadProducto");
                            double precioRegistrado = rs.getDouble("precioRegistradoProducto");
                            kList.get(i).addProducto(new ProductoKardex(this.id, codigoProducto, nombreProducto, fechaProducto,
                                    this.moneda, cantidadProducto, precioRegistrado));

                            kList.get(i).addVenta(new VentaKardex(
                                    rs.getInt("vkID"), rs.getInt("idKardex"), rs.getString("vkFecha"),
                                    rs.getString("vkTipoVenta"), rs.getString("vkTipoCliente"),
                                    kList.get(i).getRuc(), kList.get(i).getCliente(), rs.getString("vkDireccion"),
                                    rs.getString("vkVendedor"), rs.getString("vkEstadoPago"),
                                    rs.getDouble("netoVenta"), rs.getDouble("vkCantidadIgv"),
                                    rs.getDouble("vkmontoIgv"), rs.getDouble("vkMontoTotal")
                            ));
                            k.addPago(new PagoFacturaKardex(
                                    rs.getInt("idPago"), rs.getInt("pfkIdFact"), rs.getInt("idKardexPago"),
                                    rs.getString("pfkTipoPago"), rs.getString("pfkBanco"),
                                    rs.getString("pfkReferenciaPago"), rs.getString("pfkUsuario"),
                                    rs.getString("pfkFecha"), rs.getString("pfkFechaPago"), rs.getDouble("pfkMontoPagado"), rs.getString("estadoPago")
                            ));

                        }
                    }
                    idSecundaria = idInicial;
                }

            }

        } catch (Exception e) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }
        return kList;
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
        return "Kardex{" + "id=" + id + ", fecha=" + fecha + ", usuario=" + usuario + ", tipoMovimiento="
                + tipoMovimiento + ", moneda=" + moneda + ", cliente=" + cliente + ", ruc=" + ruc
                + ", estado=" + estado + ", documento=" + documento + ", valorDocumento=" + valorDocumento
                + ", categoria=" + categoria + ", subCategoria=" + subCategoria + ", observacion=" + observacion
                + ", ultimaModificacion=" + ultimaModificacion + ", usuarioModificacion=" + usuarioModificacion
                + ", cantidadModificaciones=" + cantidadModificaciones + ", cantidadArticulos=" + cantidadArticulos
                + ", totalValorizado=" + totalValorizado + '}';
    }

    public void PrintValores() {
        printGuias();
        printFacturas();
        printProductos();
    }

    public void printGuias() {
        for (GuiaKardex guia : guias) {
            System.out.print(guia.getValor() + ", ");
        }
        System.out.println("");
    }

    public void printFacturas() {
        for (FacturaKardex factura : facturas) {
            System.out.print(factura.getNumFactura() + ", ");
        }
        System.out.println("");
    }

    public void printProductos() {
        for (ProductoKardex producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public int getCantidadGuias() {
        return guias.size();
    }

    public int getCantidadFacturas() {
        return facturas.size();
    }

    public void addFactura(FacturaKardex facturax) {
        boolean llave = false;
        for (FacturaKardex factura : facturas) {
            if (factura.getNumFactura().equalsIgnoreCase(facturax.getNumFactura())) {
                llave = true;
            }
        }
        if (llave == false) {
            facturas.add(facturax);
        }
    }

    public void addGuia(GuiaKardex guiax) {
        boolean llave = false;
        for (GuiaKardex guia : guias) {
            if (guia.getValor().equalsIgnoreCase(guiax.getValor())) {
                llave = true;
            }
        }
        if (llave == false) {
            guias.add(guiax);
        }
    }

    public void addProducto(ProductoKardex productox) {
        boolean llave = false;
        for (ProductoKardex producto : productos) {
            if (producto.getCodigo().equalsIgnoreCase(productox.getCodigo())) {
                llave = true;
            }
        }
        if (llave == false) {
            productos.add(productox);
            cantidadArticulos++;
            double suma = (productox.getCantidad() * productox.getPrecioRegistrado());
            totalValorizado += suma;
            setTotalValorizado(new tools().reducirDecimales(totalValorizado + ""));
        }
    }

    public void addPago(PagoFacturaKardex pagox) {
        boolean llave = false;
        for (PagoFacturaKardex pago : pagos) {
            if (pago.getId() == pagox.getId()) {
                llave = true;
            }
        }
        if (llave == false) {
            pagos.add(pagox);
        }
    }

    public void addVenta(VentaKardex ventaNew) {
        boolean llave = false;
        if (ventas.size() < 1) {
            ventas.add(ventaNew);
        } else {
            for (VentaKardex ventax : ventas) {
                if (ventaNew.getId() == ventax.getId()) {
                    llave = true;
                }

                if (llave == false) {
                    ventas.add(ventaNew);
                }
            }
        }

    }

    public ArrayList<GuiaKardex> getGuias() {
        return guias;
    }

    public void setGuias(ArrayList<GuiaKardex> guias) {
        this.guias = guias;
    }

    public ArrayList<FacturaKardex> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<FacturaKardex> facturas) {
        this.facturas = facturas;
    }

    public ArrayList<ProductoKardex> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<ProductoKardex> productos) {
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public ArrayList<PagoFacturaKardex> getPagos() {
        return pagos;
    }

    public void setPagos(ArrayList<PagoFacturaKardex> pagos) {
        this.pagos = pagos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getCliente() {
        return cliente;
    }

    public ArrayList<VentaKardex> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<VentaKardex> ventas) {
        this.ventas = ventas;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getValorDocumento() {
        return valorDocumento;
    }

    public void setValorDocumento(String valorDocumento) {
        this.valorDocumento = valorDocumento;
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public int getCantidadModificaciones() {
        return cantidadModificaciones;
    }

    public void setCantidadModificaciones(int cantidadModificaciones) {
        this.cantidadModificaciones = cantidadModificaciones;
    }

    public double getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(double cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public double getTotalValorizado() {
        return totalValorizado;
    }

    public void setTotalValorizado(double totalValorizado) {
        this.totalValorizado = totalValorizado;
    }

}
