/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Area;
import Clases.ReporteJ;
import Clases.Articulo;
import Clases.ClienteI;
import Clases.FacturaKardex;
import Clases.GuiaKardex;
import Clases.Kardex;
import Clases.PagoFacturaKardex;
import Clases.ProductoKardex;
import Clases.VentaKardex;
import Clases.tools;
import Panels.KardexPanel;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojeru_san.complementos.RSUtilities;
import rojerusan.RSNotifyFade;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Family
 */
public class KardexFrame extends javax.swing.JFrame {

    String tipo = "nuevo";
    Kardex myKardex = new Kardex();
    static ClienteI myCliente = new ClienteI();
    static DefaultTableModel modelGuias, modelFacturas, modelProductos;
    static ArrayList<ProductoKardex> productos = new ArrayList();
    static ProductoKardex artTemp = new ProductoKardex();
    static ArrayList<String> guias = new ArrayList();
    static ArrayList<String> facturas = new ArrayList();
    ArrayList<Area> areas = new ArrayList();
    boolean llaveFailTipoRegistro = false;
    boolean padre = false;
    int mynewID = 0;

    public KardexFrame() {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
        tituloLabel.setText("Agregar Nuevo movimiento de Kardex");
        modelGuias = (DefaultTableModel) tablaGuias.getModel();
        modelFacturas = (DefaultTableModel) tablaFacturas.getModel();
        modelProductos = (DefaultTableModel) tablaProductos.getModel();
        estadoKardexTxt.setText("Nuevo");
        ini();
    }

    public KardexFrame(Kardex kardex, String tipox, boolean anular) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
        tituloLabel.setText("Modificar Movimiento de Kardex");
        modelGuias = (DefaultTableModel) tablaGuias.getModel();
        modelFacturas = (DefaultTableModel) tablaFacturas.getModel();
        modelProductos = (DefaultTableModel) tablaProductos.getModel();
        this.tipo = tipox;
        myKardex = kardex;
        ini();
        anularBtn.setVisible(anular);
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ppGuias = new javax.swing.JPopupMenu();
        Agregar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Eliminar = new javax.swing.JMenuItem();
        ppFacturas = new javax.swing.JPopupMenu();
        Agregar1 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        Eliminar1 = new javax.swing.JMenuItem();
        fondoPanel = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        panelTitulo = new rojeru_san.rspanel.RSPanelGradiente();
        jButton1 = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalArticulosTxt = new rojeru_san.rsfield.RSTextFullRound();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        totalValorizadoTxt = new rojeru_san.rsfield.RSTextFullRound();
        inicialLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelCaracteristicas = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cantidadProductoTxt = new rojeru_san.rsfield.RSTextFullRound();
        stockProductotxt = new rojeru_san.rsfield.RSTextFullRound();
        jButton4 = new javax.swing.JButton();
        codigoProductoTxt = new rojeru_san.rsfield.RSTextFullRound();
        agregarProductoBtn = new javax.swing.JButton();
        borrarProductoBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new rojerusan.RSTableMetro();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtProducto = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        subCategoriaCombo = new rojerusan.RSComboBox();
        categoriaCombo = new rojerusan.RSComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGuias = new rojerusan.RSTableMetro();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaFacturas = new rojerusan.RSTableMetro();
        jLabel17 = new javax.swing.JLabel();
        tipoDocumentoCombo = new rojerusan.RSComboBox();
        valorDocumentoTxt = new rojeru_san.rsfield.RSTextFullRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacionTxt = new javax.swing.JTextArea();
        facturaCantidadtxt = new javax.swing.JLabel();
        aceptarBtn = new rojeru_san.rsbutton.RSButtonEffect();
        eliminarGuiaBtn = new javax.swing.JButton();
        agregarGuiaBtn = new javax.swing.JButton();
        eliminarFacturaBtn = new javax.swing.JButton();
        agregarFacturaBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        guiasCantidadTxt = new javax.swing.JLabel();
        anularBtn = new rojeru_san.rsbutton.RSButtonEffect();
        estadoKardexTxt = new rojeru_san.rsfield.RSTextFullRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        monedaCombo = new rojerusan.RSComboBox();
        tipoRegistroCombo = new rojerusan.RSComboBox();
        jButton9 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        rucTxt = new rojeru_san.rsfield.RSTextFullRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        razonSocialTxt = new rojeru_san.rsfield.RSTextFullRound();
        buscarClientebtn = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Agregar.setBackground(new java.awt.Color(255, 255, 255));
        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_16px.png"))); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        ppGuias.add(Agregar);
        ppGuias.add(jSeparator3);

        Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_remove_16px.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        ppGuias.add(Eliminar);

        Agregar1.setBackground(new java.awt.Color(255, 255, 255));
        Agregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_16px.png"))); // NOI18N
        Agregar1.setText("Agregar");
        Agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar1ActionPerformed(evt);
            }
        });
        ppFacturas.add(Agregar1);
        ppFacturas.add(jSeparator4);

        Eliminar1.setBackground(new java.awt.Color(255, 255, 255));
        Eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_remove_16px.png"))); // NOI18N
        Eliminar1.setText("Eliminar");
        Eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar1ActionPerformed(evt);
            }
        });
        ppFacturas.add(Eliminar1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kardex");
        setUndecorated(true);
        setResizable(false);

        fondoPanel.setBackground(new java.awt.Color(0, 0, 0));

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_close_window_32px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tituloLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("kardexsfdf");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_empty_box_32px.png"))); // NOI18N

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelCentral.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 50));

        totalArticulosTxt.setEditable(false);
        totalArticulosTxt.setBackground(new java.awt.Color(255, 255, 255));
        totalArticulosTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalArticulosTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        totalArticulosTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalArticulosTxt.setPlaceholder("  Esperando");
        panelCentral.add(totalArticulosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 130, 30));
        panelCentral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 680, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cantidad Articulos");
        panelCentral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 130, -1));

        totalValorizadoTxt.setEditable(false);
        totalValorizadoTxt.setBackground(new java.awt.Color(255, 255, 255));
        totalValorizadoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalValorizadoTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        totalValorizadoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalValorizadoTxt.setPlaceholder(" Esperando Valor");
        panelCentral.add(totalValorizadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 160, 30));

        inicialLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inicialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicialLabel.setText("Total Valorizado S/.");
        panelCentral.add(inicialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 160, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Estado Kardex");
        panelCentral.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 130, 30));

        panelCaracteristicas.setBackground(new java.awt.Color(255, 255, 255));
        panelCaracteristicas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caracteristicas del Kardex", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        panelCaracteristicas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Código");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Stock");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 90, 20));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cantidad");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 90, 20));

        cantidadProductoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadProductoTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        cantidadProductoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cantidadProductoTxt.setPlaceholder("Esperando ");
        cantidadProductoTxt.setSoloNumeros(true);
        cantidadProductoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoTxtActionPerformed(evt);
            }
        });
        cantidadProductoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadProductoTxtKeyPressed(evt);
            }
        });
        jPanel3.add(cantidadProductoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 90, 30));

        stockProductotxt.setEditable(false);
        stockProductotxt.setBackground(new java.awt.Color(255, 255, 255));
        stockProductotxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stockProductotxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        stockProductotxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockProductotxt.setPlaceholder("Esperando ");
        stockProductotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockProductotxtActionPerformed(evt);
            }
        });
        jPanel3.add(stockProductotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 90, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_search_32px.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 40, 30));

        codigoProductoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigoProductoTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        codigoProductoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        codigoProductoTxt.setPlaceholder("Esperando ");
        jPanel3.add(codigoProductoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, 30));

        agregarProductoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_checkmark_32px.png"))); // NOI18N
        agregarProductoBtn.setContentAreaFilled(false);
        agregarProductoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarProductoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProductoBtnActionPerformed(evt);
            }
        });
        jPanel3.add(agregarProductoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 40, 30));

        borrarProductoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_remove_32px_1.png"))); // NOI18N
        borrarProductoBtn.setContentAreaFilled(false);
        borrarProductoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarProductoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarProductoBtnActionPerformed(evt);
            }
        });
        jPanel3.add(borrarProductoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 40, 40));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Código", "Cantidad", "Precio S/."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setColorBorderHead(new java.awt.Color(128, 128, 128));
        tablaProductos.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaProductos.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaProductos);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 420, 200));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtProducto.setEditable(false);
        txtProducto.setColumns(20);
        txtProducto.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtProducto.setLineWrap(true);
        txtProducto.setRows(2);
        txtProducto.setWrapStyleWord(true);
        jScrollPane5.setViewportView(txtProducto);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 420, 80));

        panelCaracteristicas.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 440, 350));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Sub Categoría");
        panelCaracteristicas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 190, 20));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelCaracteristicas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 30, 240));

        subCategoriaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija el tipo", "Entrada", "Salida" }));
        subCategoriaCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                subCategoriaComboItemStateChanged(evt);
            }
        });
        panelCaracteristicas.add(subCategoriaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 190, -1));

        categoriaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija el tipo", "Entrada", "Salida" }));
        categoriaCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoriaComboItemStateChanged(evt);
            }
        });
        panelCaracteristicas.add(categoriaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 190, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tablaGuias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaGuias.setColorBorderHead(new java.awt.Color(128, 128, 128));
        tablaGuias.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaGuias.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaGuias.setComponentPopupMenu(ppGuias);
        tablaGuias.setEffectHover(true);
        tablaGuias.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tablaGuias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaGuiasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaGuias);

        panelCaracteristicas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 170, 150));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Facturas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaFacturas.setColorBorderHead(new java.awt.Color(128, 128, 128));
        tablaFacturas.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tablaFacturas.setColorSecondary(new java.awt.Color(255, 255, 255));
        tablaFacturas.setComponentPopupMenu(ppFacturas);
        tablaFacturas.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane4.setViewportView(tablaFacturas);

        panelCaracteristicas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 170, 150));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Obsv.");
        panelCaracteristicas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 60, 20));

        tipoDocumentoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Requiere", "N. Cotización", "N. Pedido", "Nt. Ingreso", "Nt.  Salida" }));
        tipoDocumentoCombo.setDisabledIdex("");
        panelCaracteristicas.add(tipoDocumentoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 170, -1));

        valorDocumentoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valorDocumentoTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        valorDocumentoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorDocumentoTxt.setPlaceholder("  Esperando valor");
        panelCaracteristicas.add(valorDocumentoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 190, 30));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        observacionTxt.setColumns(20);
        observacionTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        observacionTxt.setLineWrap(true);
        observacionTxt.setRows(2);
        observacionTxt.setWrapStyleWord(true);
        jScrollPane2.setViewportView(observacionTxt);

        panelCaracteristicas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 320, 60));

        facturaCantidadtxt.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        facturaCantidadtxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        facturaCantidadtxt.setText("0 Facturas Ingresadas");
        panelCaracteristicas.add(facturaCantidadtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 170, 20));

        aceptarBtn.setBackground(new java.awt.Color(0, 102, 102));
        aceptarBtn.setText("Aceptar");
        aceptarBtn.setColorHover(new java.awt.Color(0, 153, 153));
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, 30));

        eliminarGuiaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_remove_16px.png"))); // NOI18N
        eliminarGuiaBtn.setContentAreaFilled(false);
        eliminarGuiaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarGuiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarGuiaBtnActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(eliminarGuiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 40, 30));

        agregarGuiaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_16px.png"))); // NOI18N
        agregarGuiaBtn.setContentAreaFilled(false);
        agregarGuiaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarGuiaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarGuiaBtnActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(agregarGuiaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 40, 30));

        eliminarFacturaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_remove_16px.png"))); // NOI18N
        eliminarFacturaBtn.setContentAreaFilled(false);
        eliminarFacturaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarFacturaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFacturaBtnActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(eliminarFacturaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 40, 30));

        agregarFacturaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_16px.png"))); // NOI18N
        agregarFacturaBtn.setContentAreaFilled(false);
        agregarFacturaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarFacturaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarFacturaBtnActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(agregarFacturaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 40, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Categoría");
        panelCaracteristicas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 190, 20));

        guiasCantidadTxt.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        guiasCantidadTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guiasCantidadTxt.setText("0 Guias Ingresadas");
        panelCaracteristicas.add(guiasCantidadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 170, 20));

        anularBtn.setBackground(new java.awt.Color(255, 102, 102));
        anularBtn.setText("ANULAR");
        anularBtn.setColorHover(new java.awt.Color(204, 0, 0));
        anularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anularBtnActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(anularBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 110, 30));

        panelCentral.add(panelCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 900, 420));

        estadoKardexTxt.setEditable(false);
        estadoKardexTxt.setBackground(new java.awt.Color(255, 255, 255));
        estadoKardexTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        estadoKardexTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        estadoKardexTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estadoKardexTxt.setPlaceholder("Esperando");
        panelCentral.add(estadoKardexTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 130, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("RUC/DNI:");
        panelCentral.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Moneda");
        panelCentral.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 100, 30));

        monedaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soles", "Dólares" }));
        monedaCombo.setDisabledIdex("");
        panelCentral.add(monedaCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 120, -1));

        tipoRegistroCombo.setBackground(new java.awt.Color(0, 112, 192));
        tipoRegistroCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija el tipo", "Entrada", "Salida" }));
        tipoRegistroCombo.setColorDisabledIndex(new java.awt.Color(0, 112, 192));
        tipoRegistroCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoRegistroComboItemStateChanged(evt);
            }
        });
        tipoRegistroCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tipoRegistroComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tipoRegistroComboFocusLost(evt);
            }
        });
        tipoRegistroCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipoRegistroComboMouseClicked(evt);
            }
        });
        panelCentral.add(tipoRegistroCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 150, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_refresh_24px.png"))); // NOI18N
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelCentral.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 30, 30));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelCentral.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 20, 130));

        rucTxt.setEditable(false);
        rucTxt.setBackground(new java.awt.Color(255, 255, 255));
        rucTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rucTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        rucTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rucTxt.setPlaceholder("  Esperando");
        panelCentral.add(rucTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 190, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tipo Movimiento");
        panelCentral.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 150, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Razón Social");
        panelCentral.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 340, -1));

        razonSocialTxt.setEditable(false);
        razonSocialTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        razonSocialTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        razonSocialTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        razonSocialTxt.setPlaceholder("  Esperando");
        panelCentral.add(razonSocialTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 340, 40));

        buscarClientebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_search_32px.png"))); // NOI18N
        buscarClientebtn.setContentAreaFilled(false);
        buscarClientebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarClientebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClientebtnActionPerformed(evt);
            }
        });
        panelCentral.add(buscarClientebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 50, 40));

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void stockProductotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockProductotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockProductotxtActionPerformed

    private void cantidadProductoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProductoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadProductoTxtActionPerformed

    private void borrarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarProductoBtnActionPerformed
        int row = tablaProductos.getSelectedRow();
        if (row > -1) {
            String codigo = tablaProductos.getValueAt(row, 1).toString();
            for (ProductoKardex producto : productos) {
                if (codigo.equalsIgnoreCase(producto.getCodigo())) {
                    modelProductos.removeRow(row);
                    productos.remove(producto);
                    calcularTotalValorizado();
                }
            }

        } else {
            new rojerusan.RSNotifyFade("¡¡Selecciona un Valor!!", "Seleccione un valor a Eliminar", 4,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        }
    }//GEN-LAST:event_borrarProductoBtnActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        modelGuias.addRow(new Object[]{"Editame"});
    }//GEN-LAST:event_AgregarActionPerformed

    private void Agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar1ActionPerformed
        modelFacturas.addRow(new Object[]{"Editame"});
    }//GEN-LAST:event_Agregar1ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila = tablaGuias.getSelectedRow();
        if (fila > -1) {
            modelGuias.removeRow(fila);
        } else {
            new rojerusan.RSNotifyFade("¡¡Selecciona un Valor!!", "Seleccione un valor a Eliminar", 4,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void Eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar1ActionPerformed
        int fila = tablaGuias.getSelectedRow();
        if (fila > -1) {
            modelGuias.removeRow(fila);
        } else {
            new rojerusan.RSNotifyFade("¡¡Selecciona un Valor!!", "Seleccione un valor a Eliminar", 4,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }
    }//GEN-LAST:event_Eliminar1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        calcularTotalValorizado();
        codigoProductoTxt.setText("");
        stockProductotxt.setText("");
        artTemp = new ProductoKardex();
        new ListarArticulosxKardex(1).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void agregarProductoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProductoBtnActionPerformed
        if (validarCampos() == true) {
            double stock = Double.parseDouble(stockProductotxt.getText().length() > 0 ? stockProductotxt.getText() : "0");
            double cantidad = Double.parseDouble(cantidadProductoTxt.getText());
            String tipo = tipoRegistroCombo.getSelectedItem().toString();

            if (tipo.equalsIgnoreCase("entrada") || (tipo.equalsIgnoreCase("salida") && cantidad < stock)) {
                addProducto();
            } else {
                new rojerusan.RSNotifyFade("¡¡Stock Insuficiente!!", "No puede retirar más productos que el stock actual", 4,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            }
        } else {
            String camposFaltantes = "";
            if (tipoRegistroCombo.getSelectedIndex() == 0) {
                camposFaltantes += " Tipo de Registro(Entrada o Salida), ";
                new Thread(this::failTipoRegistro).start();
            }

            if (codigoProductoTxt.getText().length() < 1) {
                camposFaltantes += " Código, ";
                new Thread(this::failCodigotxt).start();

            }
            if (cantidadProductoTxt.getText().length() < 1) {
                camposFaltantes += " Cantidad, ";
                new Thread(this::failCantidadtxt).start();

            }
            if (stockProductotxt.getText().length() < 1) {
                camposFaltantes += " y Stock actual Pendiente ";
                new Thread(this::failStocktxt).start();

            }
            new rojerusan.RSNotifyFade("¡¡Campos Incompletos!!", "Rellene los siguientes campos antes de continuar:\n" + camposFaltantes, 4,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }

    }//GEN-LAST:event_agregarProductoBtnActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int row = tablaProductos.getSelectedRow();
        if (row > -1) {
            String codigo = tablaProductos.getValueAt(row, 1).toString();
            String cantidad = tablaProductos.getValueAt(row, 2).toString();

            for (ProductoKardex producto : productos) {
                if (codigo.equalsIgnoreCase(producto.getCodigo())) {
                    txtProducto.setText("#" + (row + 1) + "\nCódigo: " + codigo + "  x  "
                            + cantidad + "\nProducto: " + producto.getNombre());
                }
            }

        }
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void tipoRegistroComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoRegistroComboItemStateChanged

    }//GEN-LAST:event_tipoRegistroComboItemStateChanged

    private void tipoRegistroComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipoRegistroComboMouseClicked

    }//GEN-LAST:event_tipoRegistroComboMouseClicked

    private void tipoRegistroComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tipoRegistroComboFocusGained
        llaveFailTipoRegistro = true;
        tipoRegistroCombo.setColorFondo(new Color(0, 112, 192));
        tipoRegistroCombo.repaint();
    }//GEN-LAST:event_tipoRegistroComboFocusGained

    private void tipoRegistroComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tipoRegistroComboFocusLost
        llaveFailTipoRegistro = false;
    }//GEN-LAST:event_tipoRegistroComboFocusLost

    private void tablaGuiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGuiasMouseClicked

    }//GEN-LAST:event_tablaGuiasMouseClicked

    private void agregarGuiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarGuiaBtnActionPerformed
        modelGuias.addRow(new Object[]{"Editame"});
        totalGuias();
    }//GEN-LAST:event_agregarGuiaBtnActionPerformed

    private void eliminarGuiaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarGuiaBtnActionPerformed
        int fila = tablaGuias.getSelectedRow();
        if (fila > -1) {
            modelGuias.removeRow(fila);
        } else {
            new rojerusan.RSNotifyFade("¡¡Selecciona un Valor!!", "Seleccione un valor a Eliminar", 4,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }
        totalGuias();
    }//GEN-LAST:event_eliminarGuiaBtnActionPerformed

    private void agregarFacturaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarFacturaBtnActionPerformed
        modelFacturas.addRow(new Object[]{"Editame"});
        totalFacturas();
    }//GEN-LAST:event_agregarFacturaBtnActionPerformed

    private void eliminarFacturaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFacturaBtnActionPerformed
        int fila = tablaGuias.getSelectedRow();
        if (fila > -1) {
            modelGuias.removeRow(fila);
        } else {
            new rojerusan.RSNotifyFade("¡¡Selecciona un Valor!!", "Seleccione un valor a Eliminar", 4,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }
        totalFacturas();
    }//GEN-LAST:event_eliminarFacturaBtnActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        calcularTotalValorizado();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cantidadProductoTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadProductoTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            agregarProductoBtn.doClick();
        } else if (evt.getKeyChar() == 44 || evt.getKeyChar() == 46) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadProductoTxtKeyPressed

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        getFacturas();
        getGuias();
        calcularTotalValorizado();
        if (validarDatos()) {
            String ruc = rucTxt.getText();
            String razonSocial = razonSocialTxt.getText();
            String cArticulos = totalArticulosTxt.getText() + "";
            double cantidadArticulos = Double.parseDouble(cArticulos);
            double totalValorizado = new tools().reducirDecimales(totalValorizadoTxt.getText());
            String moneda = monedaCombo.getSelectedItem().toString();
            String tipoMovimiento = tipoRegistroCombo.getSelectedItem().toString();
            String categoria = categoriaCombo.getSelectedItem().toString();
            String subCategoria = subCategoriaCombo.getSelectedItem().toString();
            String tipoDocumento = tipoDocumentoCombo.getSelectedItem().toString();
            String valorDocumento = valorDocumentoTxt.getText();
            String observacion = observacionTxt.getText();
            String usuario = MainFrame.getUsuario();

            if (tipo.equalsIgnoreCase("nuevo")) {
                mynewID = new Kardex().insertKardex(usuario, tipoMovimiento,
                        moneda, razonSocial, ruc, tipoDocumento, valorDocumento,
                        categoria, subCategoria, observacion, cantidadArticulos, totalValorizado);
                
                if (mynewID > 0) {
                    new Thread(this::generateGuias).start();
                    new Thread(this::generateFacturas).start();
                    new Thread(this::generateProductos).start();

                    if (categoria.equalsIgnoreCase("venta")) {
                        double cantidadIgv = 18.0;
                        double montoIgv = (totalValorizado * 0.18);
                        montoIgv = new tools().reducirDecimales(montoIgv + "");
                        double montoNeto = new tools().reducirDecimales((totalValorizado - montoIgv)+"");
                        String fecha = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

                         new VentaKardex().insertNewVentaKardex(mynewID,subCategoria,ruc,ruc,razonSocial,"-s/dir",MainFrame.getUsuario(),
                                 montoNeto,18,montoIgv, totalValorizado,"por Validar");

                    } else if (categoria.equalsIgnoreCase("compra")) {

                    }

                    KardexPanel.getMovimientosGeneral();
                    new rojerusan.RSNotifyFade("¡¡Kardex Agregado!!", "Las existencias fueron actualizadas.", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    
                    
                    ReporteJ rp = new ReporteJ("kardex");
                    rp.setParametros("idKardexz",mynewID);
                    //new Thread(rp::llamarReporte).start();
                    
                    this.dispose();
                     
                }
            }
        }

    }//GEN-LAST:event_aceptarBtnActionPerformed

    private void subCategoriaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_subCategoriaComboItemStateChanged

    }//GEN-LAST:event_subCategoriaComboItemStateChanged

    private void categoriaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoriaComboItemStateChanged
        if (padre == false) {
            subCategoriaCombo.removeAllItems();
            subCategoriaCombo.addItem("Seleccione subCaregoria");

            String valor = categoriaCombo.getSelectedItem().toString();
            Area temp = new Area();
            for (Area area : areas) {
                if (valor.equals(area.getNombre())) {
                    temp = area;
                }
            }

            for (Area area : areas) {
                if (temp.getId() == area.getIdPadre()) {
                    subCategoriaCombo.addItem(area.getNombre());
                }
            }
        }
    }//GEN-LAST:event_categoriaComboItemStateChanged

    private void buscarClientebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClientebtnActionPerformed
        new ListarClientes(1).setVisible(true);
    }//GEN-LAST:event_buscarClientebtnActionPerformed

    private void anularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anularBtnActionPerformed
        int rsp = new Kardex().anularKardex(myKardex.getId());
        if (rsp > 0) {
            for (int i = 0; i < modelProductos.getRowCount(); i++) {
                String codigox = tablaProductos.getValueAt(i, 1).toString();
                for (ProductoKardex prod : productos) {
                    if (codigox.equalsIgnoreCase(prod.getCodigo())) {
                        String tipoRegistro = tipoRegistroCombo.getSelectedItem().toString();
                        double cantidad = new tools().reducirDecimales(tablaProductos.getValueAt(i, 2).toString());
                        String nombrex = prod.getNombre();
                        new Articulo().updateStockArticuloANULAR(cantidad, codigox, tipoRegistro);

                    }
                }
            }
            KardexPanel.getMovimientosGeneral();
            this.dispose();
            new rojerusan.RSNotifyFade("¡¡Kardex Anulado!!", "Se regresaron las unidades modificadas en el kardex Anulado", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
        }

    }//GEN-LAST:event_anularBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KardexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KardexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KardexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KardexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new KardexFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregar;
    private javax.swing.JMenuItem Agregar1;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Eliminar1;
    private rojeru_san.rsbutton.RSButtonEffect aceptarBtn;
    private javax.swing.JButton agregarFacturaBtn;
    private javax.swing.JButton agregarGuiaBtn;
    private static javax.swing.JButton agregarProductoBtn;
    private rojeru_san.rsbutton.RSButtonEffect anularBtn;
    private javax.swing.JButton borrarProductoBtn;
    private javax.swing.JButton buscarClientebtn;
    private static rojeru_san.rsfield.RSTextFullRound cantidadProductoTxt;
    private rojerusan.RSComboBox categoriaCombo;
    private static rojeru_san.rsfield.RSTextFullRound codigoProductoTxt;
    private javax.swing.JButton eliminarFacturaBtn;
    private javax.swing.JButton eliminarGuiaBtn;
    private static rojeru_san.rsfield.RSTextFullRound estadoKardexTxt;
    private javax.swing.JLabel facturaCantidadtxt;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel guiasCantidadTxt;
    private javax.swing.JLabel inicialLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private rojerusan.RSComboBox monedaCombo;
    private javax.swing.JTextArea observacionTxt;
    private javax.swing.JPanel panelCaracteristicas;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente panelTitulo;
    private javax.swing.JPopupMenu ppFacturas;
    private javax.swing.JPopupMenu ppGuias;
    public static rojeru_san.rsfield.RSTextFullRound razonSocialTxt;
    public static rojeru_san.rsfield.RSTextFullRound rucTxt;
    private static rojeru_san.rsfield.RSTextFullRound stockProductotxt;
    private rojerusan.RSComboBox subCategoriaCombo;
    private rojerusan.RSTableMetro tablaFacturas;
    private rojerusan.RSTableMetro tablaGuias;
    public static rojerusan.RSTableMetro tablaProductos;
    private rojerusan.RSComboBox tipoDocumentoCombo;
    private rojerusan.RSComboBox tipoRegistroCombo;
    public javax.swing.JLabel tituloLabel;
    private static rojeru_san.rsfield.RSTextFullRound totalArticulosTxt;
    private static rojeru_san.rsfield.RSTextFullRound totalValorizadoTxt;
    private javax.swing.JTextArea txtProducto;
    private rojeru_san.rsfield.RSTextFullRound valorDocumentoTxt;
    // End of variables declaration//GEN-END:variables

    public void max() {

        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

    }

    public static void addProducto() {
        int valor = modelProductos.getRowCount() + 1;
        if (!artTemp.getCodigo().equals("-")) {
            double cantidadIngresada = Double.parseDouble(cantidadProductoTxt.getText());
            artTemp.setCantidad(cantidadIngresada);
            productos.add(artTemp);
            double x = Double.parseDouble(cantidadProductoTxt.getText());
            int cantidad = (int) x;
            modelProductos.addRow(new Object[]{valor, artTemp.getCodigo(), cantidad, artTemp.getPrecioRegistrado()});
            artTemp = new ProductoKardex();
            stockProductotxt.setText("");
            codigoProductoTxt.setText("");
            cantidadProductoTxt.setText("");
            calcularTotalValorizado();
        } else {
            new rojerusan.RSNotifyFade("¡¡No hay Producto!!", "Primero debe buscar un producto para agregar", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        }

    }

    public static boolean validarProducto(String codigox) {
        boolean llave = false;
        for (ProductoKardex producto : productos) {
            if (producto.getCodigo().equalsIgnoreCase(codigox)) {
                llave = true;
            }
        }
        return llave;
    }

    public static void setProductoTemporal(ProductoKardex atx, String stockx) {
        if (!atx.getCodigo().equals("-")) {
            artTemp = atx;
            codigoProductoTxt.setText(atx.getCodigo());
            stockProductotxt.setText(stockx);
            cantidadProductoTxt.requestFocus();
        }

    }

    private boolean validarCampos() {
        boolean llave = false;
        if (codigoProductoTxt.getText().length() > 0 && stockProductotxt.getText().length() > 0
                && cantidadProductoTxt.getText().length() > 0 && tipoRegistroCombo.getSelectedIndex() > 0) {
            llave = true;
        }
        return llave;
    }

    private void esperar() {
        try {
            Thread.sleep(350);
        } catch (InterruptedException ex) {
            Logger.getLogger(KardexFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void failTipoRegistro() {
        for (int i = 0; i < 5 && llaveFailTipoRegistro == false; i++) {
            if (llaveFailTipoRegistro == true) {
                break;
            }
            tipoRegistroCombo.setColorFondo(Color.red);
            tipoRegistroCombo.repaint();
            esperar();
            if (llaveFailTipoRegistro == true) {
                break;
            }
            tipoRegistroCombo.setColorFondo(new Color(0, 112, 192));
            tipoRegistroCombo.repaint();
            esperar();
        }

    }

    private void failCodigotxt() {
        for (int i = 0; i < 5; i++) {
            codigoProductoTxt.setBorderColor(Color.red);
            codigoProductoTxt.repaint();
            esperar();
            codigoProductoTxt.setBorderColor(new Color(0, 112, 192));
            codigoProductoTxt.repaint();
            esperar();
        }
    }

    private void failStocktxt() {
        for (int i = 0; i < 5; i++) {
            stockProductotxt.setBorderColor(Color.red);
            stockProductotxt.repaint();
            esperar();
            stockProductotxt.setBorderColor(new Color(0, 112, 192));
            stockProductotxt.repaint();
            esperar();
        }
    }

    private void failCantidadtxt() {
        for (int i = 0; i < 5; i++) {
            cantidadProductoTxt.setBorderColor(Color.red);
            cantidadProductoTxt.repaint();
            esperar();
            cantidadProductoTxt.setBorderColor(new Color(0, 112, 192));
            cantidadProductoTxt.repaint();
            esperar();
        }
    }

    private void ini() {
        
        
        padre = true;
        productos.clear();
        facturas.clear();
        guias.clear();

        categoriaCombo.removeAllItems();
        subCategoriaCombo.removeAllItems();
        categoriaCombo.addItem("Seleccione Categoria");
        subCategoriaCombo.addItem("Esperando Categoria");

        areas = (ArrayList) new Area().getAllArea("activo").clone();

        // Llenar Categoria Principal
        for (Area area : areas) {
            if (area.getIdPadre() == 1) {
                categoriaCombo.addItem(area.getNombre());
            }
        }

        if (tipo.equalsIgnoreCase("ver")) {
            mostrarDatos();
            //tablaProductos.setEnabled(false);
            buscarClientebtn.setVisible(false);
            agregarProductoBtn.setVisible(false);
            borrarProductoBtn.setVisible(false);
            agregarGuiaBtn.setVisible(false);
            eliminarGuiaBtn.setVisible(false);
            agregarFacturaBtn.setVisible(false);
            eliminarFacturaBtn.setVisible(false);
            observacionTxt.setEditable(false);
            categoriaCombo.setEnabled(false);
            subCategoriaCombo.setEnabled(false);
            jButton4.setVisible(false);
            tipoDocumentoCombo.setEnabled(false);
            aceptarBtn.setVisible(false);
            tipoRegistroCombo.setEnabled(false);
            monedaCombo.setEnabled(false);
            tituloLabel.setText("Visualizando información de Kardex");
            
        } else if (tipo.equalsIgnoreCase("nuevo")) {
            anularBtn.setVisible(false);
            categoriaCombo.setSelectedIndex(0);
            subCategoriaCombo.setSelectedIndex(0);
            tipoDocumentoCombo.setSelectedIndex(0);
            monedaCombo.setSelectedIndex(0);
            tipoRegistroCombo.setSelectedIndex(0);
             agregarGuiaBtn.doClick();
              agregarFacturaBtn.doClick();
        } else if (tipo.equalsIgnoreCase("editar")) {
            mostrarDatos();
        }
        
        padre = false;
    }

    private void totalGuias() {
        int valor = modelGuias.getRowCount();
        guiasCantidadTxt.setText(valor + " Guias Ingresadas");
    }

    private void totalFacturas() {
        int valor = modelFacturas.getRowCount();
        facturaCantidadtxt.setText(valor + " Facturas Ingresadas");
    }

    private static void calcularTotalValorizado() {
        double totalSoles = 0.0;
        for (int i = 0; i < modelProductos.getRowCount(); i++) {
            String codigo = tablaProductos.getValueAt(i, 1).toString();
            double soles = Double.parseDouble(tablaProductos.getValueAt(i, 3).toString());
            double cantidad = Double.parseDouble(tablaProductos.getValueAt(i, 2).toString());
            totalSoles += (cantidad * soles);
        }

        totalSoles = new tools().reducirDecimales(totalSoles + "");
        totalValorizadoTxt.setText(totalSoles + "");
        totalArticulosTxt.setText(productos.size() + "");
    }

    private void getFacturas() {
        if (facturas.size() > 0) {
            facturas.clear();
        }
        for (int i = 0; i < modelFacturas.getRowCount(); i++) {
            String valor = modelFacturas.getValueAt(i, 0).toString();
            if (!valor.equalsIgnoreCase("editame") && valor.length() > 0) {
                facturas.add(valor);
            }
        }
    }

    private void getGuias() {
        if (guias.size() > 0) {
            guias.clear();
        }
        for (int i = 0; i < modelGuias.getRowCount(); i++) {
            String valor = modelGuias.getValueAt(i, 0).toString();
            if (!valor.equalsIgnoreCase("editame") && valor.length() > 0) {
                guias.add(valor);
            }
        }
    }

    private boolean validarDatos() {
        String faltantes = "";
        boolean llave = false;

        if (razonSocialTxt.getText().length() > 1 && tipoRegistroCombo.getSelectedIndex() > 0
                && productos.size() > 0 && categoriaCombo.getSelectedIndex() > 0 && subCategoriaCombo.getSelectedIndex() > 0) {
            llave = true;
        } else {
            if (razonSocialTxt.getText().length() < 1) {
                faltantes += "Elejir Cliente, ";
                new Thread(this::failCliente).start();
            }
            if (tipoRegistroCombo.getSelectedIndex() == 0) {
                faltantes += " Tipo Registro, ";
                new Thread(this::failRegistro).start();
            }
            if (productos.size() == 0) {
                faltantes += " Agregar Productos, ";
                new Thread(this::failProductos).start();
            }
            if (categoriaCombo.getSelectedIndex() == 0) {
                faltantes += " Elejir Categoria, ";
                new Thread(this::failCategoria).start();

            }
            if (subCategoriaCombo.getSelectedIndex() == 0) {
                faltantes += " Elejir Subcategoria, ";
                new Thread(this::failSubCategoria).start();
            }

            new rojerusan.RSNotifyFade("¡¡Datos Faltantes!! ",
                    "Faltan agregar los siguientes valores para generar el kardex!\n" + faltantes, 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

        }

        return llave;
    }//tipoRegistroCombo

    private void failCliente() {
        for (int i = 0; i < 7; i++) {
            razonSocialTxt.setBorderColor(Color.red);
            razonSocialTxt.repaint();
            esperar();
            razonSocialTxt.setBorderColor(new Color(0, 112, 192));
            razonSocialTxt.repaint();
            esperar();
        }
        razonSocialTxt.setBorderColor(new Color(0, 112, 192));
        razonSocialTxt.repaint();
    }

    private void failRegistro() {
        for (int i = 0; i < 7; i++) {
            tipoRegistroCombo.setColorFondo(Color.red);
            tipoRegistroCombo.repaint();
            esperar();
            tipoRegistroCombo.setColorFondo(new Color(0, 112, 192));
            tipoRegistroCombo.repaint();
            esperar();
        }
        tipoRegistroCombo.setColorFondo(new Color(0, 112, 192));
        tipoRegistroCombo.repaint();
    }

    private void failProductos() {
        for (int i = 0; i < 7; i++) {
            tablaProductos.setBackgoundHead(Color.red);
            tablaProductos.repaint();
            esperar();
            tablaProductos.setBackgoundHead(new Color(0, 112, 192));
            tablaProductos.repaint();
            esperar();
        }
        tablaProductos.setBackgoundHead(new Color(0, 112, 192));
        tablaProductos.repaint();
    }

    private void failCategoria() {
        for (int i = 0; i < 7; i++) {
            categoriaCombo.setColorFondo(Color.red);
            categoriaCombo.repaint();
            esperar();
            categoriaCombo.setColorFondo(new Color(0, 112, 192));
            categoriaCombo.repaint();
            esperar();
        }
        categoriaCombo.setColorFondo(new Color(0, 112, 192));
        categoriaCombo.repaint();
    }

    private void failSubCategoria() {
        for (int i = 0; i < 7; i++) {
            subCategoriaCombo.setColorFondo(Color.red);
            subCategoriaCombo.repaint();
            esperar();
            subCategoriaCombo.setColorFondo(new Color(0, 112, 192));
            subCategoriaCombo.repaint();
            esperar();
        }
        subCategoriaCombo.setColorFondo(new Color(0, 112, 192));
        subCategoriaCombo.repaint();
    }

    private void mostrarDatos() {
        rucTxt.setText(myKardex.getRuc());
        razonSocialTxt.setText(myKardex.getCliente());
        totalArticulosTxt.setText(myKardex.getCantidadArticulos() + "");
        totalValorizadoTxt.setText(myKardex.getTotalValorizado() + "");
        estadoKardexTxt.setText(myKardex.getEstado());
        tipoRegistroCombo.setSelectedItem(myKardex.getTipoMovimiento());
        monedaCombo.setSelectedItem(myKardex.getMoneda());
        categoriaCombo.setSelectedItem(myKardex.getCategoria());
        cargarCategorias();
        subCategoriaCombo.setSelectedItem(myKardex.getSubCategoria());
        
        tipoDocumentoCombo.setSelectedItem(myKardex.getDocumento());
        valorDocumentoTxt.setText(myKardex.getValorDocumento());
        observacionTxt.setText(myKardex.getObservacion());
        productos = (ArrayList) myKardex.getProductos().clone();
        int i = 1;
        for (ProductoKardex kk : myKardex.getProductos()) {
            modelProductos.addRow(new Object[]{
                i++, kk.getCodigo(), kk.getCantidad(), kk.getPrecioRegistrado()
            });

        }
        for (GuiaKardex gg : myKardex.getGuias()) {
            modelGuias.addRow(new Object[]{gg.getValor()});
        }
        for (FacturaKardex ff : myKardex.getFacturas()) {
            modelFacturas.addRow(new Object[]{ff.getNumFactura()});
        }
        calcularTotalValorizado();
        if(myKardex.getEstado().equalsIgnoreCase("anulado")){
                anularBtn.setVisible(false);
            }
    }

    private void generateGuias() {
        if(modelGuias.getRowCount() <1){
            modelGuias.addRow(new Object[]{"Vacio"});
        }
        
        for (int i = 0; i < modelGuias.getRowCount(); i++) {
            String valorGuiaTemp = tablaGuias.getValueAt(i, 0).toString();
            new GuiaKardex().insertGuiaKardex(mynewID, valorGuiaTemp);
        }
    }

    private void generateFacturas() {
         if(modelFacturas.getRowCount() <1){
            modelFacturas.addRow(new Object[]{"Vacio"});
        }
        
        double totalValorizado = new tools().reducirDecimales(totalValorizadoTxt.getText());
        double montoIgv = new tools().reducirDecimales((totalValorizado * 0.18) + "");
        double montoNeto = new tools().reducirDecimales((totalValorizado - montoIgv) + "");
        int newIDfactura =0;
        for (int i = 0; i < modelFacturas.getRowCount(); i++) {
            String valorFacturaTemp = tablaFacturas.getValueAt(i, 0).toString();
            newIDfactura = new FacturaKardex().insertFacturaKardex(mynewID, valorFacturaTemp, montoNeto, montoIgv, totalValorizado, "por Validar");
        }
        
        generarPagoPendiente(mynewID, newIDfactura);
    }

    private void generateProductos() {
        String monedax = monedaCombo.getSelectedItem().toString();
        for (int i = 0; i < modelProductos.getRowCount(); i++) {
            String codigox = tablaProductos.getValueAt(i, 1).toString();
            for (ProductoKardex prod : productos) {
                if (codigox.equalsIgnoreCase(prod.getCodigo())) {
                    String tipoRegistro = tipoRegistroCombo.getSelectedItem().toString();
                    double cantidad = new tools().reducirDecimales(tablaProductos.getValueAt(i, 2).toString());
                    double precioRegistradox = new tools().reducirDecimales(tablaProductos.getValueAt(i, 3).toString());
                    String nombrex = prod.getNombre();
                    new ProductoKardex().insertProductoKardex(mynewID, codigox, nombrex,
                            cantidad, precioRegistradox, monedax);
                    new Articulo().updateStockArticulo(cantidad, codigox, tipoRegistro);

                }
            }
        }
    }
 private void generarPagoPendiente(int idKardex, int idFacturax){
     new PagoFacturaKardex().newPagoPendiente(idKardex,idFacturax);
 }
    public static void setCliente(ClienteI cliente) {
        myCliente = cliente;
        rucTxt.setText(cliente.getRuc());
        razonSocialTxt.setText(cliente.getRazonSocial());
    }
 private void cargarCategorias(){
     subCategoriaCombo.removeAllItems();
            subCategoriaCombo.addItem("Seleccione subCaregoria");

            String valor = categoriaCombo.getSelectedItem().toString();
            Area temp = new Area();
            for (Area area : areas) {
                if (valor.equals(area.getNombre())) {
                    temp = area;
                }
            }

            for (Area area : areas) {
                if (temp.getId() == area.getIdPadre()) {
                    subCategoriaCombo.addItem(area.getNombre());
                }
            }
 }
}
