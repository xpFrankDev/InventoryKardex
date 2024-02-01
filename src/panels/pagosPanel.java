package Panels;

import Clases.ClienteI;
import Clases.FacturaKardex;
import Clases.Kardex;
import Clases.PagoFacturaKardex;
import Clases.ReporteJ;
import Clases.VentaKardex;
import Clases.tools;
import Frames.EmitirPago;
import Frames.KardexFrame;
import Frames.MainFrame;
import Frames.verCliente;
import Frames.verDetalleFactura;
import Frames.verDetallePagos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;

public class pagosPanel extends javax.swing.JPanel {

    static DefaultTableModel modelo;
    static ArrayList<Kardex> resultados = new ArrayList();
    static int contadorPagos = 0;
    static double acumulado = 0.0;
    static int contadorPagosPendientes = 0;
    static int contadorPagosAnulados = 0;
    static int contadorPagosCompletados = 0;
    static double pagosPendientes = 0.0;
    static double pagosCompletados = 0.0;
    ArrayList<ClienteI> clientes = new ArrayList();
    static boolean verPagos = true;
    ArrayList<String> vendedores = new ArrayList();
    static int l = 0;

    public pagosPanel() {

        initComponents();
        pagoRadio.setSelected(true);
        modelo = (DefaultTableModel) tabla.getModel();
        buscarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo = new javax.swing.ButtonGroup();
        subClickPagos = new javax.swing.JPopupMenu();
        verKardex = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        resumnePagos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        resumenFactura = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        verCliente = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        realizarPago = new javax.swing.JMenuItem();
        subClickFacturas = new javax.swing.JPopupMenu();
        resumenFactura1 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        verKardex1 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        verCliente1 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        agregarPago = new javax.swing.JMenuItem();
        PanelCentral = new javax.swing.JPanel();
        panelCategoria = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        pagoRadio = new rojerusan.RSRadioButton();
        facturaRadio = new rojerusan.RSRadioButton();
        panelResumen = new javax.swing.JPanel();
        titulo01Label = new javax.swing.JLabel();
        titulo02Label = new javax.swing.JLabel();
        valor02Txt = new javax.swing.JLabel();
        valor01Txt = new javax.swing.JLabel();
        titulo03Label = new javax.swing.JLabel();
        valor03Txt = new javax.swing.JLabel();
        titulo04Label = new javax.swing.JLabel();
        valor04Txt = new javax.swing.JLabel();
        titulo06Label = new javax.swing.JLabel();
        titulo05Label = new javax.swing.JLabel();
        valor05Txt = new javax.swing.JLabel();
        valor06Txt = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        panelDatosIzquierdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rSComboBox1 = new rojerusan.RSComboBox();
        jLabel3 = new javax.swing.JLabel();
        rSComboBox2 = new rojerusan.RSComboBox();
        jLabel4 = new javax.swing.JLabel();
        vendedorCombo = new rojerusan.RSComboBox();
        jButton1 = new javax.swing.JButton();

        verKardex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_note_20px.png"))); // NOI18N
        verKardex.setText("Visualizar Kardex");
        verKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verKardexActionPerformed(evt);
            }
        });
        subClickPagos.add(verKardex);
        subClickPagos.add(jSeparator2);

        resumnePagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_online_payment_with_a_credit_card_20px_1.png"))); // NOI18N
        resumnePagos.setText("Ver Resumen de Pagos");
        resumnePagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumnePagosActionPerformed(evt);
            }
        });
        subClickPagos.add(resumnePagos);
        subClickPagos.add(jSeparator3);

        resumenFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_20px.png"))); // NOI18N
        resumenFactura.setText("Ver Factura Asociada");
        resumenFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumenFacturaActionPerformed(evt);
            }
        });
        subClickPagos.add(resumenFactura);
        subClickPagos.add(jSeparator4);

        verCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_client_management_20px.png"))); // NOI18N
        verCliente.setText("ver Plantilla de Cliente");
        verCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verClienteActionPerformed(evt);
            }
        });
        subClickPagos.add(verCliente);
        subClickPagos.add(jSeparator6);

        realizarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_refund_20px.png"))); // NOI18N
        realizarPago.setText("Editar Pago");
        realizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarPagoActionPerformed(evt);
            }
        });
        subClickPagos.add(realizarPago);

        resumenFactura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_20px.png"))); // NOI18N
        resumenFactura1.setText("Ver Factura Asociada");
        resumenFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumenFactura1ActionPerformed(evt);
            }
        });
        subClickFacturas.add(resumenFactura1);
        subClickFacturas.add(jSeparator5);

        verKardex1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_note_20px.png"))); // NOI18N
        verKardex1.setText("Visualizar Kardex");
        verKardex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verKardex1ActionPerformed(evt);
            }
        });
        subClickFacturas.add(verKardex1);
        subClickFacturas.add(jSeparator7);

        verCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_client_management_20px.png"))); // NOI18N
        verCliente1.setText("ver Plantilla de Cliente");
        verCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCliente1ActionPerformed(evt);
            }
        });
        subClickFacturas.add(verCliente1);
        subClickFacturas.add(jSeparator8);

        agregarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_refund_20px.png"))); // NOI18N
        agregarPago.setText("Agregar Pago");
        agregarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPagoActionPerformed(evt);
            }
        });
        subClickFacturas.add(agregarPago);

        setBackground(new java.awt.Color(59, 59, 59));

        PanelCentral.setBackground(new java.awt.Color(59, 59, 59));

        panelCategoria.setOpaque(false);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tipo.add(pagoRadio);
        pagoRadio.setForeground(new java.awt.Color(255, 255, 255));
        pagoRadio.setText("Ver los Pagos");
        pagoRadio.setActionCommand("");
        pagoRadio.setColorCheck(new java.awt.Color(0, 204, 204));
        pagoRadio.setColorUnCheck(new java.awt.Color(0, 102, 102));
        pagoRadio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pagoRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pagoRadioItemStateChanged(evt);
            }
        });

        tipo.add(facturaRadio);
        facturaRadio.setForeground(new java.awt.Color(255, 255, 255));
        facturaRadio.setText("Ver las Facturas");
        facturaRadio.setActionCommand("");
        facturaRadio.setColorCheck(new java.awt.Color(0, 204, 204));
        facturaRadio.setColorUnCheck(new java.awt.Color(0, 102, 102));
        facturaRadio.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        facturaRadio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facturaRadioItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pagoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(facturaRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(facturaRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pagoRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelResumen.setOpaque(false);

        titulo01Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        titulo01Label.setForeground(new java.awt.Color(255, 255, 255));
        titulo01Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_20px.png"))); // NOI18N
        titulo01Label.setText("Pagos Registrados: ");
        titulo01Label.setIconTextGap(8);

        titulo02Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        titulo02Label.setForeground(new java.awt.Color(255, 255, 255));
        titulo02Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_20px.png"))); // NOI18N
        titulo02Label.setText("Monto Registrado");
        titulo02Label.setIconTextGap(8);

        valor02Txt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        valor02Txt.setForeground(new java.awt.Color(255, 255, 255));
        valor02Txt.setText("#");

        valor01Txt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        valor01Txt.setForeground(new java.awt.Color(255, 255, 255));
        valor01Txt.setText("#");

        titulo03Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        titulo03Label.setForeground(new java.awt.Color(255, 255, 255));
        titulo03Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_20px.png"))); // NOI18N
        titulo03Label.setText("Pagos Pendientes");
        titulo03Label.setIconTextGap(8);

        valor03Txt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        valor03Txt.setForeground(new java.awt.Color(255, 255, 255));
        valor03Txt.setText("#");

        titulo04Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        titulo04Label.setForeground(new java.awt.Color(255, 255, 255));
        titulo04Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_20px.png"))); // NOI18N
        titulo04Label.setText("Soles Pendientes");
        titulo04Label.setIconTextGap(8);

        valor04Txt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        valor04Txt.setForeground(new java.awt.Color(255, 255, 255));
        valor04Txt.setText("#");

        titulo06Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        titulo06Label.setForeground(new java.awt.Color(255, 255, 255));
        titulo06Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_20px.png"))); // NOI18N
        titulo06Label.setText("Soles Recibidos:");
        titulo06Label.setIconTextGap(8);

        titulo05Label.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        titulo05Label.setForeground(new java.awt.Color(255, 255, 255));
        titulo05Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_20px.png"))); // NOI18N
        titulo05Label.setText("Pagos Recibidos:");
        titulo05Label.setIconTextGap(8);

        valor05Txt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        valor05Txt.setForeground(new java.awt.Color(255, 255, 255));
        valor05Txt.setText("#");

        valor06Txt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        valor06Txt.setForeground(new java.awt.Color(255, 255, 255));
        valor06Txt.setText("#");

        javax.swing.GroupLayout panelResumenLayout = new javax.swing.GroupLayout(panelResumen);
        panelResumen.setLayout(panelResumenLayout);
        panelResumenLayout.setHorizontalGroup(
            panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResumenLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo01Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo02Label, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valor01Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor02Txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo04Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo03Label))
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResumenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valor03Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResumenLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(valor04Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo06Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo05Label))
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResumenLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valor05Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResumenLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(valor06Txt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panelResumenLayout.setVerticalGroup(
            panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResumenLayout.createSequentialGroup()
                        .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo01Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor01Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titulo03Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor03Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo02Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor02Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titulo04Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor04Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelResumenLayout.createSequentialGroup()
                        .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo05Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor05Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo06Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor06Txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        panelDatos.setOpaque(false);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Monto", "Cliente", "Vendedor", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setBackgoundHead(new java.awt.Color(0, 102, 102));
        tabla.setBackgoundHover(new java.awt.Color(0, 0, 102));
        tabla.setColorBorderHead(new java.awt.Color(255, 255, 255));
        tabla.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tabla.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tabla.setColorSecondary(new java.awt.Color(255, 255, 255));
        tabla.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tabla.setComponentPopupMenu(subClickPagos);
        tabla.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(65);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(65);
            tabla.getColumnModel().getColumn(0).setMaxWidth(65);
            tabla.getColumnModel().getColumn(1).setMinWidth(110);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(110);
            tabla.getColumnModel().getColumn(1).setMaxWidth(110);
            tabla.getColumnModel().getColumn(2).setMinWidth(120);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(2).setMaxWidth(140);
            tabla.getColumnModel().getColumn(4).setMinWidth(130);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(230);
            tabla.getColumnModel().getColumn(4).setMaxWidth(230);
            tabla.getColumnModel().getColumn(5).setMinWidth(150);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabla.getColumnModel().getColumn(5).setMaxWidth(185);
        }

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        panelDatosIzquierdo.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("--- Filtros ---");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_10px.png"))); // NOI18N
        jLabel2.setText("Seleccione Mes:");

        rSComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        rSComboBox1.setColorArrow(new java.awt.Color(0, 153, 153));
        rSComboBox1.setColorBorde(new java.awt.Color(0, 153, 153));
        rSComboBox1.setColorFondo(new java.awt.Color(0, 153, 153));
        rSComboBox1.setColorSeleccion(new java.awt.Color(0, 102, 102));
        rSComboBox1.setDisabledIdex("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_10px.png"))); // NOI18N
        jLabel3.setText("Tipo Pagos:");

        rSComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Completados", "Pendientes", "Anulados" }));
        rSComboBox2.setColorArrow(new java.awt.Color(0, 153, 153));
        rSComboBox2.setColorBorde(new java.awt.Color(0, 153, 153));
        rSComboBox2.setColorFondo(new java.awt.Color(0, 153, 153));
        rSComboBox2.setColorSeleccion(new java.awt.Color(0, 102, 102));
        rSComboBox2.setDisabledIdex("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_hexagon_10px.png"))); // NOI18N
        jLabel4.setText("Vendedor:");

        vendedorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos" }));
        vendedorCombo.setColorArrow(new java.awt.Color(0, 153, 153));
        vendedorCombo.setColorBorde(new java.awt.Color(0, 153, 153));
        vendedorCombo.setColorFondo(new java.awt.Color(0, 153, 153));
        vendedorCombo.setColorSeleccion(new java.awt.Color(0, 102, 102));
        vendedorCombo.setDisabledIdex("");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_search_32px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosIzquierdoLayout = new javax.swing.GroupLayout(panelDatosIzquierdo);
        panelDatosIzquierdo.setLayout(panelDatosIzquierdoLayout);
        panelDatosIzquierdoLayout.setHorizontalGroup(
            panelDatosIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosIzquierdoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelDatosIzquierdoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panelDatosIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosIzquierdoLayout.createSequentialGroup()
                        .addComponent(rSComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosIzquierdoLayout.createSequentialGroup()
                        .addComponent(rSComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendedorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDatosIzquierdoLayout.setVerticalGroup(
            panelDatosIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosIzquierdoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vendedorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosIzquierdoLayout.createSequentialGroup()
                        .addGroup(panelDatosIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDatosIzquierdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatosIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pagoRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pagoRadioItemStateChanged
        verPagos = true;
        if (l > 0) {
            activarPagos();
        }
        tabla.setComponentPopupMenu(subClickPagos);
    }//GEN-LAST:event_pagoRadioItemStateChanged

    private void facturaRadioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facturaRadioItemStateChanged
        verPagos = false;
        activarFacturas();
        tabla.setComponentPopupMenu(subClickFacturas);
    }//GEN-LAST:event_facturaRadioItemStateChanged

    private void verKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verKardexActionPerformed
        int row = tabla.getSelectedRow();

        if (row > -1 && verPagos == true && validarSeleccion()) {
            String idx = tabla.getValueAt(row, 0).toString();
            int id = Integer.valueOf(idx);
            for (Kardex k : resultados) {
                for (PagoFacturaKardex px : k.getPagos()) {
                    if (px.getId() == id) {
                        new KardexFrame(k, "ver", false).setVisible(true);
                    }

                }

            }
        }


    }//GEN-LAST:event_verKardexActionPerformed

    private void resumnePagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumnePagosActionPerformed
        int row = tabla.getSelectedRow();
        if (row > -1 && verPagos == true && validarSeleccion()) {
            String idx = tabla.getValueAt(row, 0).toString();
            int id = Integer.valueOf(idx);
            for (Kardex k : resultados) {
                for (PagoFacturaKardex px : k.getPagos()) {
                    if (id == px.getId()) {
                        new verDetallePagos(k, px).setVisible(true);
                    }
                }

            }
        }
    }//GEN-LAST:event_resumnePagosActionPerformed

    private void resumenFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenFacturaActionPerformed
        //(Kardex kardex,VentaKardex venta,FacturaKardex factura)

        int row = tabla.getSelectedRow();
        if (row > -1 && verPagos == true && validarSeleccion()) {
            String idx = tabla.getValueAt(row, 0).toString();
            int id = Integer.valueOf(idx);
            FacturaKardex fk1 = new FacturaKardex();
            VentaKardex vk1 = new VentaKardex();
            for (Kardex k : resultados) {
                for (PagoFacturaKardex pfk : k.getPagos()) {
                    if (pfk.getId() == id) {
                        for (FacturaKardex fk : k.getFacturas()) {
                            if (fk.getId() == pfk.getIdFacturaKardex()) {
                                fk1 = fk;
                            }
                        }
                        for (VentaKardex vk : k.getVentas()) {
                            if (vk.getIdKardex() == pfk.getIdKardex()) {
                                vk1 = vk;
                            }
                        }
                        new verDetalleFactura(k, vk1, fk1).setVisible(true);
                    }

                }
            }
        }

    }//GEN-LAST:event_resumenFacturaActionPerformed

    private void verClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verClienteActionPerformed

        int row = tabla.getSelectedRow();
        if (row > -1 && verPagos == true && validarSeleccion()) {
            String idx = tabla.getValueAt(row, 0).toString();
            int id = Integer.valueOf(idx);
            for (Kardex k : resultados) {
                for (ClienteI cliente : clientes) {
                    if (k.getRuc().equals(cliente.getRuc())) {
                        new verCliente(cliente).setVisible(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_verClienteActionPerformed

    private void verKardex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verKardex1ActionPerformed

        int row = tabla.getSelectedRow();
        if (row > -1) {
            int id = Integer.parseInt(tabla.getValueAt(row, 0).toString());

            for (Kardex k : resultados) {
                for (FacturaKardex fk : k.getFacturas()) {
                    if (id == fk.getId()) {
                        new KardexFrame(k, "ver", false).setVisible(true);
                    }
                }
            }
        }


    }//GEN-LAST:event_verKardex1ActionPerformed

    private void resumenFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumenFactura1ActionPerformed
        // ver factura
        int row = tabla.getSelectedRow();
        if (row > -1) {
            VentaKardex vk1 = new VentaKardex();
            int id = Integer.parseInt(tabla.getValueAt(row, 0).toString());
            for (Kardex k : resultados) {
                for (FacturaKardex fk : k.getFacturas()) {
                    if (id == fk.getId()) {
                        for (VentaKardex vk : k.getVentas()) {
                            if (vk.getIdKardex() == k.getId()) {
                                vk1 = vk;
                            }
                        }
                        new verDetalleFactura(k, vk1, fk).setVisible(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_resumenFactura1ActionPerformed

    private void verCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCliente1ActionPerformed
        int row = tabla.getSelectedRow();
        if (row > -1 && validarSeleccion()) { 
            String idx = tabla.getValueAt(row, 0).toString();
            int id = Integer.valueOf(idx);
            for (Kardex k : resultados) {
                for (FacturaKardex fk : k.getFacturas()) {
                    if (id == fk.getId()) {
                        for (ClienteI cliente : clientes) {
                            if (k.getRuc().equals(cliente.getRuc())) {
                                new verCliente(cliente).setVisible(true);
                            }
                        }
                    }
                }

            }
        }
    }//GEN-LAST:event_verCliente1ActionPerformed

    private void realizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarPagoActionPerformed
        int row = tabla.getSelectedRow();
        if (row > -1) {
            String estado = tabla.getValueAt(row, 5).toString();
            if (estado.equalsIgnoreCase("pago completo")) {
                if (validarModificacion()) {
                    pagar(2);
                }
            } else {
                pagar(2);
            }
        }


    }//GEN-LAST:event_realizarPagoActionPerformed

    private void agregarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPagoActionPerformed
        int row = tabla.getSelectedRow();
        if (row > -1) {
            if (validarModificacion()) {
                int id = Integer.valueOf(tabla.getValueAt(row, 0).toString());
                if (validarMontoPagado(id)) {
                    pagar(1);
                } else {
                    new rojerusan.RSNotifyFade("¡¡ Pago Completo !!", "-no se puede agregar más pagos,"
                            + " se ha registrado los pagos para el monto total registrado en la factura.", 5,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                }
            }
        } else {
            new rojerusan.RSNotifyFade("¡¡ Seleccione Factura !!", "Debe seleccionar un valor de la tabla para poder ejecutar una acción", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }
    }//GEN-LAST:event_agregarPagoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JMenuItem agregarPago;
    private rojerusan.RSRadioButton facturaRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private rojerusan.RSRadioButton pagoRadio;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatosIzquierdo;
    private javax.swing.JPanel panelResumen;
    private rojerusan.RSComboBox rSComboBox1;
    private rojerusan.RSComboBox rSComboBox2;
    private javax.swing.JMenuItem realizarPago;
    private javax.swing.JMenuItem resumenFactura;
    private javax.swing.JMenuItem resumenFactura1;
    private javax.swing.JMenuItem resumnePagos;
    private javax.swing.JPopupMenu subClickFacturas;
    private javax.swing.JPopupMenu subClickPagos;
    private rojerusan.RSTableMetro tabla;
    private javax.swing.ButtonGroup tipo;
    private static javax.swing.JLabel titulo01Label;
    private static javax.swing.JLabel titulo02Label;
    private static javax.swing.JLabel titulo03Label;
    private static javax.swing.JLabel titulo04Label;
    private static javax.swing.JLabel titulo05Label;
    private static javax.swing.JLabel titulo06Label;
    private static javax.swing.JLabel valor01Txt;
    private static javax.swing.JLabel valor02Txt;
    private static javax.swing.JLabel valor03Txt;
    private static javax.swing.JLabel valor04Txt;
    private static javax.swing.JLabel valor05Txt;
    private static javax.swing.JLabel valor06Txt;
    private rojerusan.RSComboBox vendedorCombo;
    private javax.swing.JMenuItem verCliente;
    private javax.swing.JMenuItem verCliente1;
    private javax.swing.JMenuItem verKardex;
    private javax.swing.JMenuItem verKardex1;
    // End of variables declaration//GEN-END:variables

    public static void iniValores() {
        resetContadores(verPagos);
        if (modelo.getRowCount() > 0) {
            modelo.setRowCount(0);
        }

        contadorPagos = 0;
        acumulado = 0.0;
        resultados.clear();
        if (verPagos == true) {
            resultados = (ArrayList) new Kardex().verDetalleKardex().clone();
            for (Kardex k : resultados) {
                for (PagoFacturaKardex pago : k.getPagos()) {
                    acumulado += pago.getMontoPagado();
                    modelo.addRow(new Object[]{
                        pago.getId(), pago.getFecha(), pago.getMontoPagado(),
                        k.getCliente(), k.getUsuario(), pago.getEstado()
                    });
                    contadorPagos++;
                    contadorPagos(pago);
                }

            }
            modelo.addRow(new Object[]{
                "", "Total->", acumulado
            });

            actualizarTextos();
        } else {
            activarFacturas();
        }
        l++;
    }

    private static void resetContadores(boolean valor) {
        if (valor == true) {
            valor01Txt.setText("#");
            valor02Txt.setText("#");
            valor03Txt.setText("#");
            valor04Txt.setText("#");
            valor05Txt.setText("#");
            valor06Txt.setText("#");

            titulo01Label.setText("Pagos Registrados:");
            titulo02Label.setText("Monto Registrado:");
            titulo03Label.setText("Pagos Pendientes:");
            titulo04Label.setText("Soles Pendientes:");
            titulo05Label.setText("Pagos Recibidos:");
            titulo06Label.setText("Pagos Recibidos:");
        } else {

            titulo01Label.setText("Facturas Registradas:");
            titulo02Label.setText("Monto Registrado:");
            titulo03Label.setText("Facturas Pendientes:");
            titulo04Label.setText("Soles Pendientes:");
            titulo05Label.setText("Facturas Recibidas:");
            titulo06Label.setText("Total Pagado:");

            valor01Txt.setText("#");
            valor02Txt.setText("#");
            valor03Txt.setText("#");
            valor04Txt.setText("#");
            valor05Txt.setText("#");
            valor06Txt.setText("#");
        }

    }

    private static void contadorPagos(PagoFacturaKardex pago) {
        if (pago.getEstado().equalsIgnoreCase("pendiente")) {
            contadorPagosPendientes++;
            pagosPendientes += pago.getMontoPagado();
        } else if (pago.getEstado().equalsIgnoreCase("completado") || pago.getEstado().equalsIgnoreCase("parcial")) {
            contadorPagosCompletados++;
            pagosCompletados += pago.getMontoPagado();
        }
        if (pago.getEstado().equalsIgnoreCase("anulado")) {
            contadorPagosAnulados++;
        }
    }

    private static void actualizarTextos() {
        valor01Txt.setText(contadorPagos + "");
        valor02Txt.setText(acumulado + "");
        valor03Txt.setText(contadorPagosPendientes + "");
        valor04Txt.setText(pagosPendientes + "");
        valor05Txt.setText(contadorPagosCompletados + "");
        valor06Txt.setText(pagosCompletados + "");
    }

    public static void activarFacturas() {
        modelo.setRowCount(0);
        resetContadores(verPagos);
        contadorPagos = 0;
        acumulado = 0;
        contadorPagosPendientes = 0;
        pagosPendientes = 0;
        contadorPagosCompletados = 0;
        pagosCompletados = 0;

        for (Kardex k : resultados) {

            for (FacturaKardex fk : k.getFacturas()) {
                contadorPagos++;
                acumulado += fk.getMontoTotal();
                modelo.addRow(new Object[]{
                    fk.getId(), fk.getFecha(), fk.getMontoTotal(),
                    k.getCliente(), k.getUsuario(), fk.getEstado()
                });

                if (!fk.getEstado().equalsIgnoreCase("por validar")) {
                    contadorPagosCompletados++;
                } else {
                    contadorPagosPendientes++;
                    pagosPendientes += fk.getMontoTotal();
                }

                for (PagoFacturaKardex pfk : k.getPagos()) {
                    if (pfk.getIdFacturaKardex() == fk.getId()) {
                        pagosCompletados += pfk.getMontoPagado();
                    }
                }

            }

        }
        valor01Txt.setText(contadorPagos + "");
        valor02Txt.setText(acumulado + "");
        valor03Txt.setText(contadorPagosPendientes + "");
        valor04Txt.setText(pagosPendientes + "");
        valor05Txt.setText(contadorPagosCompletados + "");
        valor06Txt.setText(pagosCompletados + "");

    }

    private void activarPagos() {
        iniValores();
    }

    private void agregarVendedor(String namex) {
        boolean llave = false;
        for (String newValor : vendedores) {
            if (newValor.equals(namex)) {
                llave = true;
            }
        }
        if (llave = false) {
            vendedores.add(namex);
            vendedorCombo.addItem(namex);
        }
    }

    private boolean validarSeleccion() {
        int row = tabla.getSelectedRow();
        String valor = tabla.getValueAt(row, 0).toString();

        boolean llave = false;
        if (!valor.equals("Total->")) {
            llave = true;
        }
        return llave;
    }

    private void buscarClientes() {
        clientes = (ArrayList) new ClienteI().ListarClientes("", "Activo").clone();
    }

    private boolean validarModificacion() {
        boolean llave = false;

        //if(tabla.getSelectedRow()>=0){
        try {
            int restriccion = MainFrame.getDiasModificarKardex();
            String fechaTabla = tabla.getValueAt(tabla.getSelectedRow(), 1).toString();
            Date fechaRegistro = new SimpleDateFormat("yyyy-MM-dd").parse(fechaTabla.replace("/", "-"));
            String fechaActualString = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            Date fechaActual = new SimpleDateFormat("yyyy-MM-dd").parse(fechaActualString);

            if (new tools().diferenciaFecha(fechaTabla + "", fechaActualString) > restriccion) {
                new rojerusan.RSNotifyFade("¡¡Modificiación no Disponible!! ", "Solo se Permite modificar un registro de Kardex hasta " + restriccion + " días luego de ser creada.", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            } else {
                int fila = tabla.getSelectedRow();
                String tipo = tabla.getValueAt(fila, 3).toString();
                if (tipo.equalsIgnoreCase("anulado")) {
                    new rojerusan.RSNotifyFade("¡¡Kardex Anulado!! ", "No se puede modificar un Kardex Anulado", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

                } else {
                    llave = true;
                }

            }
        } catch (ParseException ex) {
            Logger.getLogger(pagosPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        //}

        return llave;
    }

    private void pagar(int tipo) {
        int row = tabla.getSelectedRow();
        int id = Integer.valueOf(tabla.getValueAt(row, 0).toString());

        PagoFacturaKardex pfk1 = new PagoFacturaKardex();
        VentaKardex vk1 = new VentaKardex();
        Kardex k1 = new Kardex();
        FacturaKardex fk1 = new FacturaKardex();

        if (tipo == 1) { // AGREGAR PAGO
            for (Kardex k : resultados) {
                for (FacturaKardex fk : k.getFacturas()) {
                    if (id == fk.getId()) {
                        for (PagoFacturaKardex pfk : k.getPagos()) {
                            if (pfk.getIdKardex() == fk.getIdKardex()) {
                                pfk1 = pfk;
                            }
                        }
                        for (VentaKardex vk : k.getVentas()) {
                            if (vk.getIdKardex() == fk.getIdKardex()) {
                                vk1 = vk;
                            }
                        }
                        k1 = k;
                        fk1 = fk;
                    }
                }
            }
        } else if (tipo == 2) { // EDITAR PAGO
            for (Kardex k : resultados) {

                for (PagoFacturaKardex pfk : k.getPagos()) {
                    if (pfk.getId() == id) {
                        for (FacturaKardex fk : k.getFacturas()) {
                            if (fk.getIdKardex() == pfk.getIdKardex()) {
                                fk1 = fk;
                            }
                        }
                        for (VentaKardex vk : k.getVentas()) {
                            if (vk.getIdKardex() == pfk.getIdKardex()) {
                                vk1 = vk;
                            }
                        }
                        pfk1 = pfk;
                        k1 = k;
                    }
                }
                // PRIMERA FORMA DE HACERLO
                /*
                 for (FacturaKardex fk : k.getFacturas()) {
                    for (PagoFacturaKardex pfk : k.getPagos()) {
                        if (pfk.getIdKardex() == fk.getIdKardex()) {
                            pfk1 = pfk;
                        }
                        for (VentaKardex vk : k.getVentas()) {
                            if (vk.getIdKardex() == fk.getIdKardex()) {
                                vk1 = vk;
                            }
                        }
                    }
                    k1 = k;
                    fk1 = fk;
                }
                 */
            }
        }
        new EmitirPago(k1, fk1, pfk1, vk1, tipo).setVisible(true);
    }

    private boolean validarMontoPagado(int idx) {
        boolean llave = false;
        for (Kardex k : resultados) {
            for (FacturaKardex fk : k.getFacturas()) {
                if (fk.getId() == idx) {
                    double total = fk.getMontoTotal();
                    double pagado = 0.0;
                    for (PagoFacturaKardex pfk : k.getPagos()) {
                        pagado += pfk.getMontoPagado();
                    }
                    if (pagado >= total) {
                        llave = false;
                    } else {
                        llave = true;
                    }
                }
            }
        }

        return llave;
    }
}
