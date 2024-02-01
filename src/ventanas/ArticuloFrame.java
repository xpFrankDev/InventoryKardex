/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Area;
import Clases.Articulo;
import Clases.tipoColor;
import Clases.Familia;
import Clases.Talla;
import Clases.Tela;
import Clases.TipoUnidad;
import Clases.tools;
import Panels.InventarioPanel;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojeru_san.complementos.RSUtilities;
import rojerusan.RSNotifyFade;

public class ArticuloFrame extends javax.swing.JFrame {

    //String code = "";
    int repetido = 0;

    int valor = 0;
    // 0 es agregar
    // 1 es modificar
    ArrayList<Area> areas = new ArrayList();
    ArrayList<Area> hijos = new ArrayList();
    Area padre = new Area();
    Articulo item = new Articulo();
    Carga carga = new Carga();

    String aseptico = "f", antiFluido = "f", antiEstatico = "f", antiDeslizante = "f", descartable = "f", esteril = "f";

    public ArticuloFrame() {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
        eliminarBtn.setVisible(false);
        new Thread(this::llenarCategoria).start();
        eliminarBtn.setVisible(false);
    }

    public ArticuloFrame(Articulo articulox) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        changeIcon();
        this.valor = 1;
        this.item = articulox;
        max();
        eliminarBtn.setVisible(false);
        new Thread(this::llenarCategoria).start();

    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        fondoPanel = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        panelTitulo = new rojeru_san.rspanel.RSPanelGradiente();
        jButton1 = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        aceptarBtn = new RSComponentShade.RSButtonRippleShade();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelPrecio = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        solesTxt = new rojeru_san.rsfield.RSTextField();
        dolaresTxt = new rojeru_san.rsfield.RSTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pesoTxt = new rojeru_san.rsfield.RSTextField();
        eliminarBtn = new RSComponentShade.RSButtonRippleShade();
        ultimaLabel1 = new javax.swing.JLabel();
        ultimaLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        familiaCombo = new rojerusan.RSComboBox();
        jLabel7 = new javax.swing.JLabel();
        tallaCombo = new rojerusan.RSComboBox();
        jLabel6 = new javax.swing.JLabel();
        unidadCombo = new rojerusan.RSComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        telaCombo = new rojerusan.RSComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        colorCombo = new rojerusan.RSComboBox();
        gramajeTxt = new rojeru_san.rsfield.RSTextFullRound();
        asepticoCheck = new rojerusan.RSCheckBox();
        descartableCheck = new rojerusan.RSCheckBox();
        antiFluidoCheck = new rojerusan.RSCheckBox();
        antiEstaticoCheck = new rojerusan.RSCheckBox();
        antiDeslizanteCheck = new rojerusan.RSCheckBox();
        esterilCheck = new rojerusan.RSCheckBox();
        jLabel21 = new javax.swing.JLabel();
        categoriaCombo = new rojerusan.RSComboBox();
        jLabel18 = new javax.swing.JLabel();
        valorMinimo = new rojeru_san.rsfield.RSTextFullRound();
        jLabel19 = new javax.swing.JLabel();
        valorMaximo = new rojeru_san.rsfield.RSTextFullRound();
        jLabel20 = new javax.swing.JLabel();
        subCategoriaCombo = new rojerusan.RSComboBox();
        codigoTxt = new rojeru_san.rsfield.RSTextFullRound();
        nombreTxt = new rojeru_san.rsfield.RSTextFullRound();
        stockTxt = new rojeru_san.rsfield.RSTextFullRound();
        estadoCombo = new rojerusan.RSComboBox();
        estadoLabel = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Agregar nuevo Articulo");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_property_45px_1.png"))); // NOI18N

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 596, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelCentral.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        aceptarBtn.setBackground(new java.awt.Color(8, 255, 20));
        aceptarBtn.setText("Registrar Articulo");
        aceptarBtn.setBgHover(new java.awt.Color(51, 204, 0));
        aceptarBtn.setBgShade(new java.awt.Color(102, 255, 51));
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });
        panelCentral.add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 620, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 112, 192));
        jLabel1.setText("Stock Actual:");
        panelCentral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 112, 192));
        jLabel3.setText("Código del producto:");
        panelCentral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 112, 192));
        jLabel4.setText("Nombre de Producto / Articulo ( * )");
        panelCentral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        panelPrecio.setBackground(new java.awt.Color(59, 59, 59));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Peso y Precios");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_industrial_scales_connected_26px.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_price_tag_26px.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Precio en S/.");

        solesTxt.setBackground(new java.awt.Color(59, 59, 59));
        solesTxt.setForeground(new java.awt.Color(255, 255, 255));
        solesTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        solesTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        solesTxt.setPhColor(new java.awt.Color(255, 255, 255));
        solesTxt.setPlaceholder("Esperando Valor");
        solesTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                solesTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                solesTxtKeyTyped(evt);
            }
        });

        dolaresTxt.setBackground(new java.awt.Color(59, 59, 59));
        dolaresTxt.setForeground(new java.awt.Color(255, 255, 255));
        dolaresTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dolaresTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dolaresTxt.setPhColor(new java.awt.Color(255, 255, 255));
        dolaresTxt.setPlaceholder("Esperando Valor");
        dolaresTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dolaresTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dolaresTxtKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Precio en USD");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Peso Estimado Unidad (kilos)");

        pesoTxt.setBackground(new java.awt.Color(59, 59, 59));
        pesoTxt.setForeground(new java.awt.Color(255, 255, 255));
        pesoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pesoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pesoTxt.setPhColor(new java.awt.Color(255, 255, 255));
        pesoTxt.setPlaceholder("Esperando Valor");
        pesoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pesoTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoTxtKeyTyped(evt);
            }
        });

        eliminarBtn.setBackground(new java.awt.Color(225, 118, 44));
        eliminarBtn.setText("Eliminar Articulo");
        eliminarBtn.setBgHover(new java.awt.Color(230, 21, 28));
        eliminarBtn.setBgShade(new java.awt.Color(225, 118, 44));

        ultimaLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ultimaLabel1.setForeground(new java.awt.Color(255, 255, 255));
        ultimaLabel1.setText("Última Modificación: ");

        ultimaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ultimaLabel.setForeground(new java.awt.Color(255, 255, 255));
        ultimaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ultimaLabel.setText("@Fecha");

        javax.swing.GroupLayout panelPrecioLayout = new javax.swing.GroupLayout(panelPrecio);
        panelPrecio.setLayout(panelPrecioLayout);
        panelPrecioLayout.setHorizontalGroup(
            panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrecioLayout.createSequentialGroup()
                .addGroup(panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrecioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrecioLayout.createSequentialGroup()
                                .addGroup(panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(solesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dolaresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pesoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrecioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrecioLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrecioLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel14)
                                        .addGap(81, 81, 81))))))
                    .addGroup(panelPrecioLayout.createSequentialGroup()
                        .addGroup(panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrecioLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrecioLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ultimaLabel1)
                                    .addComponent(ultimaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPrecioLayout.setVerticalGroup(
            panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrecioLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panelPrecioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dolaresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(ultimaLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(ultimaLabel)
                .addGap(18, 18, 18)
                .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCentral.add(panelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 230, 640));

        jSeparator1.setForeground(new java.awt.Color(0, 37, 64));
        panelCentral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 640, 10));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caracteristicas del Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 11), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 112, 192));
        jLabel8.setText("Familia");

        familiaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Familia" }));
        familiaCombo.setToolTipText("");
        familiaCombo.setColorArrow(new java.awt.Color(255, 255, 255));
        familiaCombo.setColorBoton(new java.awt.Color(0, 37, 64));
        familiaCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                familiaComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                familiaComboFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 112, 192));
        jLabel7.setText("   Talla");

        tallaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Talla" }));
        tallaCombo.setColorArrow(new java.awt.Color(255, 255, 255));
        tallaCombo.setColorBoton(new java.awt.Color(0, 37, 64));
        tallaCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tallaComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tallaComboFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 112, 192));
        jLabel6.setText("Tipo de Unidad");

        unidadCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Unidad" }));
        unidadCombo.setColorArrow(new java.awt.Color(255, 255, 255));
        unidadCombo.setColorBoton(new java.awt.Color(0, 37, 64));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "    Descripción de la tela", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 112, 192));
        jLabel9.setText("Tipo de Tela");

        telaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Tela" }));
        telaCombo.setColorArrow(new java.awt.Color(255, 255, 255));
        telaCombo.setColorBoton(new java.awt.Color(0, 37, 64));
        telaCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telaComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                telaComboFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 112, 192));
        jLabel10.setText("   Gramaje");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 112, 192));
        jLabel11.setText("   Color");

        colorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Color" }));
        colorCombo.setColorArrow(new java.awt.Color(255, 255, 255));
        colorCombo.setColorBoton(new java.awt.Color(0, 37, 64));

        gramajeTxt.setForeground(new java.awt.Color(0, 102, 102));
        gramajeTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gramajeTxt.setBorderColor(new java.awt.Color(0, 102, 102));
        gramajeTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gramajeTxt.setPlaceholder("Inserte Valor");
        gramajeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gramajeTxtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(gramajeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(colorCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gramajeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        asepticoCheck.setText("Aséptico");
        asepticoCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                asepticoCheckItemStateChanged(evt);
            }
        });

        descartableCheck.setText("Descartable");
        descartableCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                descartableCheckItemStateChanged(evt);
            }
        });
        descartableCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descartableCheckActionPerformed(evt);
            }
        });

        antiFluidoCheck.setText("Anti fluidos");
        antiFluidoCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                antiFluidoCheckItemStateChanged(evt);
            }
        });

        antiEstaticoCheck.setText("Anti estático");
        antiEstaticoCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                antiEstaticoCheckItemStateChanged(evt);
            }
        });

        antiDeslizanteCheck.setText("Anti deslizante");
        antiDeslizanteCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                antiDeslizanteCheckItemStateChanged(evt);
            }
        });

        esterilCheck.setText("Esteril");
        esterilCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                esterilCheckItemStateChanged(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 112, 192));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Categoria:");

        categoriaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija Categoria" }));
        categoriaCombo.setColorArrow(new java.awt.Color(255, 255, 255));
        categoriaCombo.setColorBoton(new java.awt.Color(0, 37, 64));
        categoriaCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoriaComboItemStateChanged(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 112, 192));
        jLabel18.setText("Valor Minimo:");

        valorMinimo.setForeground(new java.awt.Color(0, 102, 102));
        valorMinimo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valorMinimo.setText("1");
        valorMinimo.setBorderColor(new java.awt.Color(0, 102, 102));
        valorMinimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorMinimo.setPhColor(new java.awt.Color(0, 102, 102));
        valorMinimo.setPlaceholder("...");
        valorMinimo.setSelectionColor(new java.awt.Color(0, 102, 102));
        valorMinimo.setSoloNumeros(true);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 112, 192));
        jLabel19.setText("Valor Máximo:");

        valorMaximo.setForeground(new java.awt.Color(0, 102, 102));
        valorMaximo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valorMaximo.setText("10");
        valorMaximo.setBorderColor(new java.awt.Color(0, 102, 102));
        valorMaximo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valorMaximo.setPhColor(new java.awt.Color(0, 102, 102));
        valorMaximo.setPlaceholder("...");
        valorMaximo.setSelectionColor(new java.awt.Color(0, 102, 102));
        valorMaximo.setSoloNumeros(true);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 112, 192));
        jLabel20.setText("Sub Categoria:");

        subCategoriaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Esperando categoria" }));
        subCategoriaCombo.setColorArrow(new java.awt.Color(255, 255, 255));
        subCategoriaCombo.setColorBoton(new java.awt.Color(0, 37, 64));
        subCategoriaCombo.setDisabledIdex("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(familiaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(tallaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(unidadCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(asepticoCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(descartableCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(esterilCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(antiFluidoCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addComponent(antiDeslizanteCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(antiEstaticoCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(categoriaCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(subCategoriaCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(familiaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tallaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidadCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asepticoCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antiFluidoCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antiEstaticoCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descartableCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(esterilCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antiDeslizanteCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valorMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subCategoriaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelCentral.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 690, 420));

        codigoTxt.setForeground(new java.awt.Color(0, 102, 102));
        codigoTxt.setBorderColor(new java.awt.Color(0, 102, 102));
        codigoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        codigoTxt.setPhColor(new java.awt.Color(0, 102, 102));
        codigoTxt.setPlaceholder("Código del Producto");
        codigoTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoTxtFocusLost(evt);
            }
        });
        panelCentral.add(codigoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 190, -1));

        nombreTxt.setForeground(new java.awt.Color(0, 102, 102));
        nombreTxt.setBorderColor(new java.awt.Color(0, 102, 102));
        nombreTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreTxt.setMayusculas(true);
        nombreTxt.setPhColor(new java.awt.Color(0, 102, 102));
        nombreTxt.setPlaceholder("Descripción del Producto");
        nombreTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreTxtFocusLost(evt);
            }
        });
        panelCentral.add(nombreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 300, -1));

        stockTxt.setColumns(2);
        stockTxt.setForeground(new java.awt.Color(0, 102, 102));
        stockTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        stockTxt.setBorderColor(new java.awt.Color(0, 102, 102));
        stockTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockTxt.setPhColor(new java.awt.Color(0, 102, 102));
        stockTxt.setPlaceholder("Stock del Producto");
        stockTxt.setSelectionColor(new java.awt.Color(0, 102, 102));
        stockTxt.setSoloNumeros(true);
        stockTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stockTxtFocusLost(evt);
            }
        });
        stockTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockTxtKeyTyped(evt);
            }
        });
        panelCentral.add(stockTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 120, -1));

        estadoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Estado", "Activo", "Inactivo" }));
        estadoCombo.setColorArrow(new java.awt.Color(255, 255, 255));
        estadoCombo.setColorBoton(new java.awt.Color(0, 37, 64));
        estadoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoComboActionPerformed(evt);
            }
        });
        panelCentral.add(estadoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 210, -1));

        estadoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        estadoLabel.setForeground(new java.awt.Color(0, 112, 192));
        estadoLabel.setText("Estado");
        panelCentral.add(estadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, -1, 30));

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        System.out.println(new File(".").getAbsolutePath());
        System.out.println(System.getProperty("os.name"));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void solesTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_solesTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_solesTxtKeyPressed

    private void dolaresTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dolaresTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_dolaresTxtKeyPressed

    private void pesoTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoTxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoTxtKeyPressed

    private void solesTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_solesTxtKeyTyped
        new tools().soloDoubleyCantidadDigitos(evt, solesTxt, 8);
    }//GEN-LAST:event_solesTxtKeyTyped

    private void dolaresTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dolaresTxtKeyTyped
        new tools().soloDoubleyCantidadDigitos(evt, dolaresTxt, 8);
    }//GEN-LAST:event_dolaresTxtKeyTyped

    private void pesoTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoTxtKeyTyped
        new tools().soloDoubleyCantidadDigitos(evt, pesoTxt, 8);
    }//GEN-LAST:event_pesoTxtKeyTyped

    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed
        
        new Thread(this::generar).start();
        //aceptarBtn.setEnabled(false);
    }//GEN-LAST:event_aceptarBtnActionPerformed

    private void categoriaComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoriaComboItemStateChanged
        if (categoriaCombo.getSelectedIndex() > 0) {
            for (Area area : areas) {
                String namePadre = categoriaCombo.getSelectedItem().toString();
                if (namePadre.equals(area.getNombre())) {
                    padre = new Area(area.getId(), area.getId(), area.getNombre(), area.getEstado());
                }
            }
            new Thread(this::actualizarHijos).start();
        }
    }//GEN-LAST:event_categoriaComboItemStateChanged

    private void codigoTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoTxtFocusLost
        if (valor == 0) {
            new Thread(this::validarCodigo).start();

        }
    }//GEN-LAST:event_codigoTxtFocusLost

    private void nombreTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTxtFocusLost

    private void stockTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stockTxtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_stockTxtFocusLost

    private void stockTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockTxtKeyTyped
        new tools().soloDoubleyCantidadDigitos(evt, stockTxt, 8);
    }//GEN-LAST:event_stockTxtKeyTyped

    private void estadoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoComboActionPerformed

    private void descartableCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descartableCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descartableCheckActionPerformed

    private void asepticoCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_asepticoCheckItemStateChanged
        aseptico = asepticoCheck.isSelected() ? "t" : "f";
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_asepticoCheckItemStateChanged

    private void antiFluidoCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_antiFluidoCheckItemStateChanged
        antiFluido = antiFluidoCheck.isSelected() ? "t" : "f";
    }//GEN-LAST:event_antiFluidoCheckItemStateChanged

    private void antiEstaticoCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_antiEstaticoCheckItemStateChanged
        antiEstatico = antiEstaticoCheck.isSelected() ? "t" : "f";

    }//GEN-LAST:event_antiEstaticoCheckItemStateChanged

    private void descartableCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_descartableCheckItemStateChanged
        descartable = descartableCheck.isSelected() ? "t" : "f";
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_descartableCheckItemStateChanged

    private void esterilCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_esterilCheckItemStateChanged
        esteril = esterilCheck.isSelected() ? "t" : "f";
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_esterilCheckItemStateChanged

    private void antiDeslizanteCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_antiDeslizanteCheckItemStateChanged
        antiDeslizante = antiDeslizanteCheck.isSelected() ? "t" : "f";
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_antiDeslizanteCheckItemStateChanged

    private void familiaComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_familiaComboFocusGained
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_familiaComboFocusGained

    private void familiaComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_familiaComboFocusLost
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_familiaComboFocusLost

    private void tallaComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tallaComboFocusGained
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_tallaComboFocusGained

    private void tallaComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tallaComboFocusLost
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_tallaComboFocusLost

    private void telaComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telaComboFocusGained
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_telaComboFocusGained

    private void telaComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telaComboFocusLost
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_telaComboFocusLost

    private void gramajeTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gramajeTxtKeyTyped
        new Thread(this::calcularNombre).start();
    }//GEN-LAST:event_gramajeTxtKeyTyped

    private boolean validarCamposLlenos() {
        boolean llave = false;

        if (codigoTxt.getText().length() > 0 && nombreTxt.getText().length() > 0 && solesTxt.getText().length() > 0
                && tallaCombo.getSelectedIndex() > 0 && stockTxt.getText().length() > 0 && valorMinimo.getText().length() > 0
                && valorMaximo.getText().length() > 0) {

            double minimo = Double.parseDouble(valorMinimo.getText());

            if (minimo > 0) {
                llave = true;
            } else {
                new rojerusan.RSNotifyFade("¡¡Valor < 0!! ", "Valor minimo no puede menor a 0", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

            }

        } else {
            new rojerusan.RSNotifyFade("¡¡Completar Datos Necesarios!! ", "Datos Necesarios para registrar un Articulo: \n\n Codigo, Stock, Nombre\n Precio en Soles, Talla\n Valor minimo y Valor Máximo.", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            aceptarBtn.setEnabled(true);
        }

        return llave;
    }

    private int validarCodigo() {
        String codex = codigoTxt.getText();
        Articulo ax = new Articulo().getArticulo(codex);
        if (!ax.getCodigo().equals("-")) {
            new rojerusan.RSNotifyFade("¡¡Código en uso!! <" + codigoTxt.getText() + ">", "Para crear un nuevo articulo debe utilizar un código libre, el actual ya se encuentra registrado", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            repetido = 1;
        } else {
            repetido = 0;
        }
        return repetido;
    }

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
            java.util.logging.Logger.getLogger(ArticuloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArticuloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArticuloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArticuloFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ArticuloFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSComponentShade.RSButtonRippleShade aceptarBtn;
    private rojerusan.RSCheckBox antiDeslizanteCheck;
    private rojerusan.RSCheckBox antiEstaticoCheck;
    private rojerusan.RSCheckBox antiFluidoCheck;
    private rojerusan.RSCheckBox asepticoCheck;
    private rojerusan.RSComboBox categoriaCombo;
    private rojeru_san.rsfield.RSTextFullRound codigoTxt;
    private rojerusan.RSComboBox colorCombo;
    private rojerusan.RSCheckBox descartableCheck;
    private rojeru_san.rsfield.RSTextField dolaresTxt;
    private RSComponentShade.RSButtonRippleShade eliminarBtn;
    private rojerusan.RSComboBox estadoCombo;
    private javax.swing.JLabel estadoLabel;
    private rojerusan.RSCheckBox esterilCheck;
    private rojerusan.RSComboBox familiaCombo;
    private javax.swing.JPanel fondoPanel;
    private rojeru_san.rsfield.RSTextFullRound gramajeTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.rsfield.RSTextFullRound nombreTxt;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelPrecio;
    private rojeru_san.rspanel.RSPanelGradiente panelTitulo;
    private rojeru_san.rsfield.RSTextField pesoTxt;
    private rojeru_san.rsfield.RSTextField solesTxt;
    private rojeru_san.rsfield.RSTextFullRound stockTxt;
    private rojerusan.RSComboBox subCategoriaCombo;
    private rojerusan.RSComboBox tallaCombo;
    private rojerusan.RSComboBox telaCombo;
    public javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel ultimaLabel;
    private javax.swing.JLabel ultimaLabel1;
    private rojerusan.RSComboBox unidadCombo;
    private rojeru_san.rsfield.RSTextFullRound valorMaximo;
    private rojeru_san.rsfield.RSTextFullRound valorMinimo;
    // End of variables declaration//GEN-END:variables

    public void max() {

        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

    }

    public void iniciarDatos() {
        if (valor == 1) {
            tituloLabel.setText("Modificar Articulo");
            aceptarBtn.setText("Actualizar Datos");
            codigoTxt.setEditable(false);
            stockTxt.setEditable(false);
        } else {
            codigoTxt.requestFocus();
            estadoCombo.setSelectedIndex(1);
            estadoCombo.setEnabled(false);
            ultimaLabel1.setVisible(false);
            ultimaLabel.setVisible(false);
            eliminarBtn.setVisible(false);
        }
        new Thread(this::llenarValores).start();
    }

    public void llenarValores() {
        new Thread(this::llenarUnidad).start();
        new Thread(this::llenarFamilia).start();
        new Thread(this::llenarTela).start();
        new Thread(this::llenarTalla).start();

        llenarColor();

        if (valor == 1) {

            codigoTxt.setText(item.getCodigo());
            nombreTxt.setText(item.getNombre());
            stockTxt.setText(item.getStock() + "");
            solesTxt.setText(item.getPrecioSigv() + "");
            dolaresTxt.setText(item.getPrecioUsdsigv() + "");
            pesoTxt.setText(item.getPesoInnerPack() + "");
            gramajeTxt.setText(item.getGramaje());
            ultimaLabel.setText(item.getUltimamodificacion());
            valorMinimo.setText(item.getValorMinimo() + "");
            valorMaximo.setText(item.getValorMaximo() + "");

            boolean llaveEstado = false;
            boolean llaveUnidad = false;
            boolean llaveTalla = false;
            boolean llaveFamilia = false;
            boolean llaveTela = false;
            do {

                if (estadoCombo.getItemCount() > 1) {
                    llaveEstado = true;
                }
                if (unidadCombo.getItemCount() > 1) {
                    llaveUnidad = true;
                }
                if (tallaCombo.getItemCount() > 1) {
                    llaveTalla = true;
                }
                if (familiaCombo.getItemCount() > 1) {
                    llaveFamilia = true;
                }
                if (telaCombo.getItemCount() > 1) {
                    llaveTela = true;
                }

            } while (llaveEstado == false && llaveUnidad == false && llaveTalla == false && llaveFamilia == false && llaveTela == false);

            estadoCombo.setSelectedItem(item.getEstado());
            unidadCombo.setSelectedItem(item.getTipoUnidad());
            tallaCombo.setSelectedItem(item.getTalla());
            familiaCombo.setSelectedItem(item.getFamilia());
            telaCombo.setSelectedItem(item.getTela());
            colorCombo.setSelectedItem(item.getColor());

            categoriaCombo.setSelectedItem(item.getCategoria());
            subCategoriaCombo.setSelectedItem(item.getSubCategoria());
            asepticoCheck.setSelected(item.getAseptico().equalsIgnoreCase("f") ? false : true);
            antiFluidoCheck.setSelected(item.getAntiFluido().equalsIgnoreCase("f") ? false : true);
            antiEstaticoCheck.setSelected(item.getAntiEstatico().equalsIgnoreCase("f") ? false : true);
            antiDeslizanteCheck.setSelected(item.getAntiDeslizante().equalsIgnoreCase("f") ? false : true);
            descartableCheck.setSelected(item.getDescartable().equalsIgnoreCase("f") ? false : true);
            esterilCheck.setSelected(item.getEsteril().equalsIgnoreCase("f") ? false : true);

        }

    }

    private void llenarUnidad() {

        for (TipoUnidad texto : MainFrame.getTipoUnidad()) {
            unidadCombo.addItem(texto.getNombre());
        }
        unidadCombo.setSelectedIndex(0);
    }

    public void actualizarHijos() {
        hijos.clear();
        hijos = (ArrayList) new Area().getHijos(padre.getId()).clone();

        if (subCategoriaCombo.getItemCount() > -1) {
            subCategoriaCombo.removeAllItems();
        }

        for (Area area : hijos) {
            boolean llave = false;
            if (subCategoriaCombo.getItemCount() == 0) {
                subCategoriaCombo.addItem(area.getNombre());
            }
            for (int h = 0; h < subCategoriaCombo.getItemCount(); h++) {

                if (subCategoriaCombo.getItemAt(h).equals(area.getNombre())) {
                    llave = true;
                }

            }
            if (llave == false) {
                subCategoriaCombo.addItem(area.getNombre());
            }

        }
        if (subCategoriaCombo.getItemCount() > 0) {
            subCategoriaCombo.setSelectedIndex(0);
        } else {
            subCategoriaCombo.addItem("Vacio");
          // subCategoriaCombo.removeItemAt(1);
        }
        subCategoriaCombo.setSelectedIndex(0);
    }

    private void llenarTalla() {
        //ArrayList<Talla> lista = (ArrayList) new Talla().Listar("").clone();

        for (Talla texto : MainFrame.getTalla()) {
            tallaCombo.addItem(texto.getNombre());
        }
        tallaCombo.setSelectedIndex(0);
    }

    private void llenarFamilia() {
        // ArrayList<Familia> lista = (ArrayList) new Familia().Listar("").clone();

        for (Familia texto : MainFrame.getFamilia()) {
            familiaCombo.addItem(texto.getNombre());
        }
        familiaCombo.setSelectedIndex(0);

    }

    private void llenarTela() {
        //ArrayList<Tela> lista = (ArrayList) new Tela().Listar("").clone();

        for (Tela texto : MainFrame.getTipoTela()) {
            telaCombo.addItem(texto.getNombre());
        }
        telaCombo.setSelectedIndex(0);
    }

    private void llenarColor() {
        //ArrayList<Color> lista = (ArrayList) new tipoColor().Listar("").clone();

        for (tipoColor texto : MainFrame.getColor()) {
            colorCombo.addItem(texto.getNombre());
        }
        colorCombo.setSelectedIndex(0);
    }

    public void llenarCategoria() {
        estadoLabel.setVisible(valor == 0 ? false : true);
        estadoCombo.setVisible(valor == 0 ? false : true);
        areas.clear();
        areas = (ArrayList) new Area().getAreaPrincipal().clone();

        for (Area area : areas) {
            if (area.getId() > 1) {
                categoriaCombo.addItem(area.getNombre());
            }

        }
        iniciarDatos();
    }

    private void verCarga() {
        carga.setVisible(true);
    }

    private void ocultarCarga() {
        carga.setVisible(false);
    }

    private void generar() {
        calcularNombre();
        if (valor == 0) {// Nuevo articulo
            if (repetido == 0 && validarCodigo() == 0) {//nos aseguramos de que el código no esté repetido
                if (validarCamposLlenos() == true) {
                    try {
                        new Thread(this::verCarga).start();
                        String codigox = codigoTxt.getText();
                        String familiax = familiaCombo.getSelectedItem().toString();
                        String nombrex = nombreTxt.getText();
                        String tipoUnidadx = unidadCombo.getSelectedItem().toString();
                        String tallax = tallaCombo.getSelectedItem().toString();
                        String cantInnerPackx = "No Asignado";
                        String cantMasterPackx = "No Asignado";
                        String telax = telaCombo.getSelectedItem().toString();
                        String gramajex = gramajeTxt.getText();
                        String colorx = colorCombo.getSelectedItem().toString();
                        Double valorMinimox = Double.parseDouble(valorMinimo.getText());
                        Double valorMaximox = Double.parseDouble(valorMaximo.getText());

                        String stockx = new DecimalFormat("#.00").parse(stockTxt.getText()) + "";
                        Double stockDouble = Double.parseDouble(stockx);
                        String precioSolesx = new DecimalFormat("#.00").parse(solesTxt.getText()) + "";
                        Double solesDouble = Double.parseDouble(precioSolesx);
                        String dolarexx = dolaresTxt.getText().length() == 0 ? "0.0" : dolaresTxt.getText();
                        String dolaresx = new DecimalFormat("#.00").parse(dolarexx) + "";
                        Double dolaresDouble = Double.parseDouble(dolaresx);
                        String pesoxx = pesoTxt.getText().length() == 0 ? "0.0" : pesoTxt.getText();
                        String pesox = new DecimalFormat("#.00").parse(pesoxx) + "";
                        Double pesoDouble = Double.parseDouble(pesox);
                        String cate = categoriaCombo.getSelectedItem().toString();
                        String subCate = subCategoriaCombo.getSelectedItem().toString();
                        int valor = new Articulo().insertArticulo(codigox, familiax, nombrex, tipoUnidadx, tallax,
                                cantInnerPackx, cantMasterPackx, telax, gramajex, colorx, stockDouble, solesDouble,
                                pesoDouble, 0.0, dolaresDouble, valorMinimox, valorMaximox, cate, subCate,
                                aseptico, antiFluido, antiEstatico, antiDeslizante, descartable, esteril);
                        if (valor > 0) {

                            new rojerusan.RSNotifyFade("¡¡Articulo Agregado!! ", "Se agregaron los datos con exito!", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                            new Thread(this::ocultarCarga).start();
                            InventarioPanel.reiniciarDatos(codigox);
                            this.dispose();
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(ArticuloFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {

                }
            } else {
                new rojerusan.RSNotifyFade("¡¡Código en uso!! <" + codigoTxt.getText() + ">", "Para crear un nuevo articulo debe utilizar un código libre, el actual ya se encuentra registrado", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

            }
        } else if (valor == 1) {//actualizar
            if (validarCamposLlenos() == true) {
                try {
                    new Thread(this::verCarga).start();
                    String codigox = codigoTxt.getText();
                    String familiax = familiaCombo.getSelectedItem().toString();
                    String nombrex = nombreTxt.getText();
                    String tipoUnidadx = unidadCombo.getSelectedItem().toString();
                    String tallax = tallaCombo.getSelectedItem().toString();
                    String cantInnerPackx = "No Asignado";
                    String cantMasterPackx = "No Asignado";
                    String telax = telaCombo.getSelectedItem().toString();
                    String gramajex = gramajeTxt.getText();
                    String colorx = colorCombo.getSelectedItem().toString();
                    Double valorMinimox = Double.parseDouble(valorMinimo.getText());
                    Double valorMaximox = Double.parseDouble(valorMaximo.getText());

                    String stockx = new DecimalFormat("#.00").parse(stockTxt.getText()) + "";
                    Double stockDouble = Double.parseDouble(stockx);
                    String precioSolesx = new DecimalFormat("#.00").parse(solesTxt.getText()) + "";
                    Double solesDouble = Double.parseDouble(precioSolesx);
                    String dolaresx = new DecimalFormat("#.00").parse(dolaresTxt.getText()) + "";
                    Double dolaresDouble = Double.parseDouble(dolaresx);
                    String pesox = new DecimalFormat("#.00").parse(pesoTxt.getText()) + "";
                    Double pesoDouble = Double.parseDouble(pesox);
                    String cate = categoriaCombo.getSelectedItem().toString();
                    String subCate = subCategoriaCombo.getSelectedItem().toString();
                    String estadox = estadoCombo.getSelectedItem().toString();

                    int valor = new Articulo().UpdateArticulo(familiax, nombrex, tipoUnidadx, tallax,
                            cantInnerPackx, cantMasterPackx, telax, gramajex, colorx, stockDouble, solesDouble,
                            pesoDouble, 0.0, dolaresDouble, valorMinimox, valorMaximox, cate, subCate, estadox, codigox,
                            aseptico, antiFluido, antiEstatico, antiDeslizante, descartable, esteril);
                    if (valor > 0) {
                        new rojerusan.RSNotifyFade("¡¡Actualización Exitosa!! ", "Se agregaron los datos con exito!", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                        new Thread(this::ocultarCarga).start();
                        InventarioPanel.reiniciarDatos(codigox);
                        this.dispose();
                    }

                } catch (ParseException ex) {
                    Logger.getLogger(ArticuloFrame.class.getName()).log(Level.SEVERE, null, ex);
                    new Thread(this::ocultarCarga).start();
                    JOptionPane.showMessageDialog(rootPane, "Error\n " + ex);
                    aceptarBtn.setEnabled(true);
                }
            }
        }
    }

    private void calcularNombre() {
        String nombre = "";

        nombre += familiaCombo.getSelectedIndex() > 0 ? "" + familiaCombo.getSelectedItem().toString() + "" : "";
        nombre += asepticoCheck.isSelected() ? " Aséptico" : "";
        nombre += descartableCheck.isSelected() ? " Descartable, " : "";
        nombre += telaCombo.getSelectedIndex() > 0 ? " 100% " + telaCombo.getSelectedItem().toString() + " " : "";
        nombre += gramajeTxt.getText().length() > 0 ? gramajeTxt.getText() + "," : "";
        nombre += esterilCheck.isSelected() ? " Estéril," : "";
        nombre += antiDeslizanteCheck.isSelected() ? " Anti deslizante," : "";
        nombre += tallaCombo.getSelectedIndex() > 0 ? " Talla " + tallaCombo.getSelectedItem().toString() + "," : "";
        nombre += colorCombo.getSelectedIndex() > 0 ? " Color " + colorCombo.getSelectedItem().toString() + "" : "";
        //nombreTxt.setText(nombre);
    }
}
