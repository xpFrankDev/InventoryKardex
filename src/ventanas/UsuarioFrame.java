/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Notificaciones;
import Clases.Usuario;
import Panels.UsuariosPanel;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import rojeru_san.complementos.RSUtilities;
import rojerusan.RSNotifyFade;

public class UsuarioFrame extends javax.swing.JFrame {

    String code = "";
    int repetido = 0;
    int valor = 0;
    // 0 es agregar
    // 1 es modificar
    Usuario myUser = new Usuario();
    boolean p1 = false;
    boolean p1a1 = false;
    boolean p1a2 = false;
    boolean p2 = false;
    boolean p2a1 = false;
    boolean p2a2 = false;
    boolean p2a3 = false;
    boolean p3 = false;
    boolean p3a1 = false;
    boolean p3a2 = false;
    boolean p3a3 = false;
    boolean p4 = false;
    boolean p4a1 = false;
    boolean p4a2 = false;

    public UsuarioFrame() {
        changeIcon();
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        panelPermisos.setVisible(false);
        panelNotificaciones.setVisible(false);
        estadoCombo.setSelectedIndex(0);
        estadoCombo.setEnabled(false);
        btnGuardar.setText("Agregar Usuario");
        btnPermisos.setText("Agregar Permisos");
        p2a3check.setVisible(false);
    }

    public UsuarioFrame(String codigo) {
        changeIcon();
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        this.valor = 1;
        this.code = codigo;
        max();
        panelPermisos.setVisible(false);
        panelNotificaciones.setVisible(false);
        codigoTxt.setEnabled(false);
        new Thread(this::llenarValores).start();

    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fondoPanel = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        panelTitulo = new rojeru_san.rspanel.RSPanelGradiente();
        jButton1 = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idTxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigoTxt = new rojeru_san.rsfield.RSTextField();
        nombreTxt = new rojeru_san.rsfield.RSTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        passTxt = new rojeru_san.rsfield.RSPassMaterial();
        btnPermisos = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel8 = new javax.swing.JLabel();
        estadoCombo = new rojerusan.RSComboBox();
        btnGuardar = new RSComponentShade.RSButtonRippleShade();
        btnNotificaciones = new rojeru_san.rsbutton.RSButtonEffect();
        panelPermisos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rSLabelVertical1 = new rojeru_san.rslabel.RSLabelVertical();
        p1check = new javax.swing.JCheckBox();
        p1a1check = new javax.swing.JCheckBox();
        p1a2check = new javax.swing.JCheckBox();
        p2check = new javax.swing.JCheckBox();
        p2a1check = new javax.swing.JCheckBox();
        p2a2check = new javax.swing.JCheckBox();
        p2a3check = new javax.swing.JCheckBox();
        p3check = new javax.swing.JCheckBox();
        p3a1check = new javax.swing.JCheckBox();
        p3a2check = new javax.swing.JCheckBox();
        p3a3check = new javax.swing.JCheckBox();
        p4check = new javax.swing.JCheckBox();
        p4a1check = new javax.swing.JCheckBox();
        p4a2check = new javax.swing.JCheckBox();
        rSButtonRippleShade1 = new RSComponentShade.RSButtonRippleShade();
        panelNotificaciones = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        noti01check = new javax.swing.JCheckBox();
        noti02check = new javax.swing.JCheckBox();
        noti03check = new javax.swing.JCheckBox();
        noti04check = new javax.swing.JCheckBox();
        noti05check = new javax.swing.JCheckBox();
        noti06check = new javax.swing.JCheckBox();
        noti07check = new javax.swing.JCheckBox();
        noti08check = new javax.swing.JCheckBox();
        noti09check = new javax.swing.JCheckBox();

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

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fondoPanel.setBackground(new java.awt.Color(0, 0, 0));

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));

        panelTitulo.setColorPrimario(new java.awt.Color(39, 39, 39));
        panelTitulo.setColorSecundario(new java.awt.Color(0, 255, 255));

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
        tituloLabel.setText("Agregar nuevo Usuario");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_menu_female_40px_1.png"))); // NOI18N

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("#");

        idTxt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        idTxt.setText("@serie");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Código de Usuario:");

        codigoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigoTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        codigoTxt.setPlaceholder("Código de Usuario");

        nombreTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombreTxt.setPlaceholder("Nombre de Usuario");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre de Usuario:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Contraseña:");

        passTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passTxt.setPlaceholder("Password");
        passTxt.setSelectionColor(new java.awt.Color(0, 112, 192));

        btnPermisos.setBackground(new java.awt.Color(255, 255, 255));
        btnPermisos.setForeground(new java.awt.Color(0, 0, 102));
        btnPermisos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_membership_card_30px.png"))); // NOI18N
        btnPermisos.setText("Ver Permisos");
        btnPermisos.setColorHover(new java.awt.Color(220, 220, 220));
        btnPermisos.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnPermisos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPermisos.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnPermisos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnPermisos.setMargin(new java.awt.Insets(2, 14, 2, 20));
        btnPermisos.setOpaque(true);
        btnPermisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPermisosActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Estado");

        estadoCombo.setForeground(new java.awt.Color(0, 0, 0));
        estadoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Activo", "Bloqueado" }));
        estadoCombo.setColorArrow(new java.awt.Color(255, 255, 255));
        estadoCombo.setColorBorde(new java.awt.Color(59, 59, 59));
        estadoCombo.setColorBoton(new java.awt.Color(39, 39, 39));
        estadoCombo.setColorFondo(new java.awt.Color(255, 255, 255));
        estadoCombo.setColorSeleccion(new java.awt.Color(59, 59, 59));
        estadoCombo.setDisabledIdex("");

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar Datos");
        btnGuardar.setBgHover(new java.awt.Color(0, 102, 102));
        btnGuardar.setBgShadeHover(new java.awt.Color(102, 0, 0));
        btnGuardar.setFgText(new java.awt.Color(0, 0, 0));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNotificaciones.setBackground(new java.awt.Color(255, 255, 255));
        btnNotificaciones.setForeground(new java.awt.Color(0, 0, 102));
        btnNotificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_notification_30px.png"))); // NOI18N
        btnNotificaciones.setText("Selc. Notificaciones");
        btnNotificaciones.setColorHover(new java.awt.Color(220, 220, 220));
        btnNotificaciones.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnNotificaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNotificaciones.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnNotificaciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNotificaciones.setMargin(new java.awt.Insets(2, 14, 2, 20));
        btnNotificaciones.setOpaque(true);
        btnNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCentralLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(passTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(estadoCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentralLayout.createSequentialGroup()
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelPermisos.setBackground(new java.awt.Color(255, 255, 255));
        panelPermisos.setMinimumSize(new java.awt.Dimension(473, 314));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        rSLabelVertical1.setForeground(new java.awt.Color(255, 255, 255));
        rSLabelVertical1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rSLabelVertical1.setText("Permisos permitidos para el Usuario");
        rSLabelVertical1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSLabelVertical1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSLabelVertical1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        p1check.setBackground(new java.awt.Color(255, 255, 255));
        p1check.setText("01. Inventario (Only View)");
        p1check.setOpaque(false);
        p1check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p1checkItemStateChanged(evt);
            }
        });

        p1a1check.setBackground(new java.awt.Color(255, 255, 255));
        p1a1check.setText("Agregar Articulo");
        p1a1check.setEnabled(false);
        p1a1check.setOpaque(false);
        p1a1check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p1a1checkItemStateChanged(evt);
            }
        });

        p1a2check.setBackground(new java.awt.Color(255, 255, 255));
        p1a2check.setText("Modificar Articulo");
        p1a2check.setEnabled(false);
        p1a2check.setOpaque(false);
        p1a2check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p1a2checkItemStateChanged(evt);
            }
        });

        p2check.setBackground(new java.awt.Color(255, 255, 255));
        p2check.setText("02. Kardex  (Only View)");
        p2check.setOpaque(false);
        p2check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p2checkItemStateChanged(evt);
            }
        });

        p2a1check.setBackground(new java.awt.Color(255, 255, 255));
        p2a1check.setText("Agregar Movimiento de Kardex");
        p2a1check.setEnabled(false);
        p2a1check.setOpaque(false);
        p2a1check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p2a1checkItemStateChanged(evt);
            }
        });

        p2a2check.setBackground(new java.awt.Color(255, 255, 255));
        p2a2check.setText("Modificar Kardex");
        p2a2check.setEnabled(false);
        p2a2check.setOpaque(false);
        p2a2check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p2a2checkItemStateChanged(evt);
            }
        });

        p2a3check.setBackground(new java.awt.Color(255, 255, 255));
        p2a3check.setText("Eliminar Kardex");
        p2a3check.setEnabled(false);
        p2a3check.setOpaque(false);
        p2a3check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p2a3checkItemStateChanged(evt);
            }
        });

        p3check.setBackground(new java.awt.Color(255, 255, 255));
        p3check.setText("03. Gestión de Usuarios  (Only View)");
        p3check.setOpaque(false);
        p3check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p3checkItemStateChanged(evt);
            }
        });

        p3a1check.setBackground(new java.awt.Color(255, 255, 255));
        p3a1check.setText("Agregar Usuario");
        p3a1check.setEnabled(false);
        p3a1check.setOpaque(false);
        p3a1check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p3a1checkItemStateChanged(evt);
            }
        });

        p3a2check.setBackground(new java.awt.Color(255, 255, 255));
        p3a2check.setText("Modificar Usuario");
        p3a2check.setEnabled(false);
        p3a2check.setOpaque(false);
        p3a2check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p3a2checkItemStateChanged(evt);
            }
        });

        p3a3check.setBackground(new java.awt.Color(255, 255, 255));
        p3a3check.setText("Eliminar Usuario");
        p3a3check.setEnabled(false);
        p3a3check.setOpaque(false);
        p3a3check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p3a3checkItemStateChanged(evt);
            }
        });

        p4check.setBackground(new java.awt.Color(255, 255, 255));
        p4check.setText("04. Gestión de Parámetros  (Only View)");
        p4check.setOpaque(false);
        p4check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p4checkItemStateChanged(evt);
            }
        });

        p4a1check.setBackground(new java.awt.Color(255, 255, 255));
        p4a1check.setText("Agregar Valores");
        p4a1check.setEnabled(false);
        p4a1check.setOpaque(false);
        p4a1check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p4a1checkItemStateChanged(evt);
            }
        });

        p4a2check.setBackground(new java.awt.Color(255, 255, 255));
        p4a2check.setText("Modificar Valores");
        p4a2check.setEnabled(false);
        p4a2check.setOpaque(false);
        p4a2check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                p4a2checkItemStateChanged(evt);
            }
        });

        rSButtonRippleShade1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_clone_30px.png"))); // NOI18N
        rSButtonRippleShade1.setText("Clonar Permisos");
        rSButtonRippleShade1.setToolTipText("Usa los permisos de otro Usuario para facilitar el proceso de selección.");
        rSButtonRippleShade1.setBgHover(new java.awt.Color(51, 51, 51));
        rSButtonRippleShade1.setBgShadeHover(new java.awt.Color(51, 51, 51));
        rSButtonRippleShade1.setFgText(new java.awt.Color(0, 0, 0));
        rSButtonRippleShade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRippleShade1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPermisosLayout = new javax.swing.GroupLayout(panelPermisos);
        panelPermisos.setLayout(panelPermisosLayout);
        panelPermisosLayout.setHorizontalGroup(
            panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPermisosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPermisosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1check))
                    .addGroup(panelPermisosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1a2check)
                            .addComponent(p1a1check)))
                    .addGroup(panelPermisosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3check)
                            .addGroup(panelPermisosLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p3a2check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p3a3check)
                                    .addComponent(p3a1check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4check)
                    .addGroup(panelPermisosLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p2a1check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p2a2check)
                            .addComponent(p2a3check)
                            .addComponent(p4a1check)
                            .addComponent(p4a2check)
                            .addComponent(rSButtonRippleShade1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(p2check))
                .addContainerGap())
        );
        panelPermisosLayout.setVerticalGroup(
            panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPermisosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPermisosLayout.createSequentialGroup()
                        .addGroup(panelPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPermisosLayout.createSequentialGroup()
                                .addComponent(p1check)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p1a1check)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p1a2check))
                            .addGroup(panelPermisosLayout.createSequentialGroup()
                                .addComponent(p2check)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p2a1check)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p2a2check)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p2a3check)))
                        .addGap(29, 29, 29)
                        .addComponent(p3check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p3a1check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p3a2check, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPermisosLayout.createSequentialGroup()
                        .addComponent(p4check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p4a1check)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p4a2check)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p3a3check)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(rSButtonRippleShade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelNotificaciones.setBackground(new java.awt.Color(255, 255, 255));
        panelNotificaciones.setMinimumSize(new java.awt.Dimension(473, 260));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Notificaciones disponibles para el Usuario ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        noti01check.setBackground(new java.awt.Color(255, 255, 255));
        noti01check.setText("01.- Stock bajo de Articulos");
        noti01check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noti01checkItemStateChanged(evt);
            }
        });

        noti02check.setBackground(new java.awt.Color(255, 255, 255));
        noti02check.setText("02.- Movimientos de Inventario");
        noti02check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noti02checkItemStateChanged(evt);
            }
        });

        noti03check.setBackground(new java.awt.Color(255, 255, 255));
        noti03check.setText("03.- Productos sobre Stockeados");
        noti03check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noti03checkItemStateChanged(evt);
            }
        });

        noti04check.setBackground(new java.awt.Color(255, 255, 255));
        noti04check.setText("04.- Nueva Solicitud de Compra");
        noti04check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noti04checkItemStateChanged(evt);
            }
        });

        noti05check.setBackground(new java.awt.Color(255, 255, 255));
        noti05check.setText("05.- Ventas");
        noti05check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noti05checkItemStateChanged(evt);
            }
        });

        noti06check.setBackground(new java.awt.Color(255, 255, 255));
        noti06check.setText("06.- ");
        noti06check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noti06checkItemStateChanged(evt);
            }
        });

        noti07check.setBackground(new java.awt.Color(255, 255, 255));
        noti07check.setText("07.- ");
        noti07check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noti07checkItemStateChanged(evt);
            }
        });

        noti08check.setBackground(new java.awt.Color(255, 255, 255));
        noti08check.setText("08.- ");
        noti08check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noti08checkItemStateChanged(evt);
            }
        });

        noti09check.setBackground(new java.awt.Color(255, 255, 255));
        noti09check.setText("09.- ");
        noti09check.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                noti09checkItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelNotificacionesLayout = new javax.swing.GroupLayout(panelNotificaciones);
        panelNotificaciones.setLayout(panelNotificacionesLayout);
        panelNotificacionesLayout.setHorizontalGroup(
            panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelNotificacionesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noti09check, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(noti07check, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noti01check, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noti03check, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noti05check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noti08check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noti06check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noti04check, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(noti02check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelNotificacionesLayout.setVerticalGroup(
            panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNotificacionesLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noti01check)
                    .addComponent(noti02check))
                .addGap(18, 18, 18)
                .addGroup(panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noti03check)
                    .addComponent(noti04check))
                .addGap(18, 18, 18)
                .addGroup(panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noti05check)
                    .addComponent(noti06check))
                .addGap(18, 18, 18)
                .addGroup(panelNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noti07check)
                    .addComponent(noti08check))
                .addGap(18, 18, 18)
                .addComponent(noti09check)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPermisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNotificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondoPanelLayout.createSequentialGroup()
                        .addComponent(panelPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        System.out.println(new File(".").getAbsolutePath());
        System.out.println(System.getProperty("os.name"));


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPermisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPermisosActionPerformed
        if (btnPermisos.getText().equals("Ver Permisos") || btnPermisos.getText().equals("Agregar Permisos")) {
            btnPermisos.setText("Ocultar Perms.");
            panelPermisos.setVisible(true);
        } else if (!btnPermisos.equals("Ver Permisos")) {
            btnPermisos.setText(valor == 0 ? "Ver Permisos" : "Agregar Permisos");
            panelPermisos.setVisible(false);
        }
        panelCentral.repaint();
    }//GEN-LAST:event_btnPermisosActionPerformed

    private void p1checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p1checkItemStateChanged
        if (p1check.isSelected()) {
            p1True();
        } else {
            p1False();
        }
    }//GEN-LAST:event_p1checkItemStateChanged

    private void p2checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p2checkItemStateChanged
        if (p2check.isSelected()) {
            p2True();
        } else {
            p2False();
        }
    }//GEN-LAST:event_p2checkItemStateChanged

    private void p3checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p3checkItemStateChanged
        if (p3check.isSelected()) {
            p3True();
        } else {
            p3False();
        }
    }//GEN-LAST:event_p3checkItemStateChanged

    private void p4checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p4checkItemStateChanged
        if (p4check.isSelected()) {
            p4True();
        } else {
            p4False();
        }
    }//GEN-LAST:event_p4checkItemStateChanged

    private void p1a1checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p1a1checkItemStateChanged
        myUser.setP1a1(p1a1check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p1a1checkItemStateChanged

    private void p1a2checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p1a2checkItemStateChanged
        myUser.setP1a2(p1a2check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p1a2checkItemStateChanged

    private void p2a1checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p2a1checkItemStateChanged
        myUser.setP2a1(p2a1check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p2a1checkItemStateChanged

    private void p2a2checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p2a2checkItemStateChanged
        myUser.setP2a2(p2a2check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p2a2checkItemStateChanged

    private void p2a3checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p2a3checkItemStateChanged
        myUser.setP2a3(p2a3check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p2a3checkItemStateChanged

    private void p3a1checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p3a1checkItemStateChanged
        myUser.setP3a1(p3a1check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p3a1checkItemStateChanged

    private void p3a2checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p3a2checkItemStateChanged
        myUser.setP3a2(p3a2check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p3a2checkItemStateChanged

    private void p3a3checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p3a3checkItemStateChanged
        myUser.setP3a3(p3a3check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p3a3checkItemStateChanged

    private void p4a1checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p4a1checkItemStateChanged
        myUser.setP4a1(p4a1check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p4a1checkItemStateChanged

    private void p4a2checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_p4a2checkItemStateChanged
        myUser.setP4a2(p4a2check.isSelected() ? "v" : "f");
    }//GEN-LAST:event_p4a2checkItemStateChanged

    private void rSButtonRippleShade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRippleShade1ActionPerformed

    }//GEN-LAST:event_rSButtonRippleShade1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validarCamposLlenos()) {
            String nombrex = nombreTxt.getText();
            String codigox = codigoTxt.getText();
            String passx = passTxt.getText();
            String estadox = estadoCombo.getSelectedItem().toString();
            String idx = idTxt.getText();

            if (valor == 1) { // editar
                myUser.setClave(passx);
                myUser.setNombre(nombrex);
                myUser.setEstadoMensaje(estadox);
                int v1 = myUser.updateUser();
                if (v1 > 0) {
                    new Thread(this::updateNotificacion).start();
                    int v2 = myUser.updatePermisos(codigox);
                    if (v2 > 0) {
                        new rojerusan.RSNotifyFade("¡¡Actualización Exitoso!! ", "se Actualizó con exito los datos del usuario.", 4, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                        UsuariosPanel.reiniciarDatos(codigox);
                        this.dispose();
                    } else {
                        new rojerusan.RSNotifyFade("¡¡Error!! ", "Problemas Actualizando Permisos del usuario", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                    }
                } else {
                    new rojerusan.RSNotifyFade("¡¡Error!! ", "Problemas Actuaizando Usuario", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                }
            } else { // nuevo
                myUser.setCodigo(codigox);
                myUser.setCodigoUsuarioMensaje(codigox);
                myUser.setClave(passx);
                myUser.setNombre(nombrex);
                myUser.setPrivilegio("-");
                int resultado = myUser.newUser(codigox, passx, nombrex, "-");
                if (resultado > 0) {
                    int valor2 = myUser.insertPermisos(codigox);
                    new Thread(this::newNotificacion).start();
                    if (valor2 > 0) {
                        new rojerusan.RSNotifyFade("¡¡Registro Exitoso!! ", "se agregaron los datos correctamente.", 4, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                        UsuariosPanel.reiniciarDatos(codigox);
                        this.dispose();
                    } else {
                        new rojerusan.RSNotifyFade("¡¡Error!! ", "Problemas Agregando Permisos del usuario", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                    }
                } else {
                    new rojerusan.RSNotifyFade("¡¡Error!! ", "Problemas Agregando Usuario", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionesActionPerformed
        panelNotificaciones.setVisible(!panelNotificaciones.isShowing());
    }//GEN-LAST:event_btnNotificacionesActionPerformed

    private void noti01checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noti01checkItemStateChanged
       myUser.setNoti01(noti01check.isSelected()==false?"f":"v");
    }//GEN-LAST:event_noti01checkItemStateChanged

    private void noti02checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noti02checkItemStateChanged
      myUser.setNoti02(noti02check.isSelected()==false?"f":"v");
    }//GEN-LAST:event_noti02checkItemStateChanged

    private void noti03checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noti03checkItemStateChanged
      myUser.setNoti03(noti03check.isSelected()==false?"f":"v");
    }//GEN-LAST:event_noti03checkItemStateChanged

    private void noti04checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noti04checkItemStateChanged
     myUser.setNoti04(noti04check.isSelected()==false?"f":"v");
    }//GEN-LAST:event_noti04checkItemStateChanged

    private void noti05checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noti05checkItemStateChanged
      myUser.setNoti05(noti05check.isSelected()==false?"f":"v");
    }//GEN-LAST:event_noti05checkItemStateChanged

    private void noti06checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noti06checkItemStateChanged
       myUser.setNoti06(noti06check.isSelected()==false?"f":"v");
    }//GEN-LAST:event_noti06checkItemStateChanged

    private void noti07checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noti07checkItemStateChanged
       myUser.setNoti07(noti07check.isSelected()==false?"f":"v");
    }//GEN-LAST:event_noti07checkItemStateChanged

    private void noti08checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noti08checkItemStateChanged
      myUser.setNoti08(noti08check.isSelected()==false?"f":"v");
    }//GEN-LAST:event_noti08checkItemStateChanged

    private void noti09checkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_noti09checkItemStateChanged
       myUser.setNoti09(noti09check.isSelected()==false?"f":"v");
    }//GEN-LAST:event_noti09checkItemStateChanged

    private void updateNotificacion(){
        myUser.updateUserNotificacion(myUser.getIdNotificacion());
    }
    private void newNotificacion(){
        myUser.newUserNotificacion();
    }
    
    private boolean validarCamposLlenos() {
        boolean llave = false;

        if (nombreTxt.getText().length() < 1 && nombreTxt.getText().length() < 1
                && passTxt.getText().length() < 1) {
            new rojerusan.RSNotifyFade("¡¡Campos Incompletos!! ", "Debe llenar todos los campos para continuar", 2, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);

        } else {
            llave = true;
        }

        return llave;
    }

    private int validarCodigo() {
        /*
        String codex = codigoTxt.getText();
        Articulo ax = new Articulo().getArticulo(codex);
        if (!ax.getCodigo().equals("-")) {
            new rojerusan.RSNotifyFade("¡¡Código en uso!! <" + codigoTxt.getText() + ">", "Para crear un nuevo articulo debe utilizar un código libre, el actual ya se encuentra registrado", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            repetido = 1;
        } else {
            repetido = 0;
        }
         */

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
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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

                new UsuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSComponentShade.RSButtonRippleShade btnGuardar;
    private rojeru_san.rsbutton.RSButtonEffect btnNotificaciones;
    private rojeru_san.rsbutton.RSButtonEffect btnPermisos;
    private rojeru_san.rsfield.RSTextField codigoTxt;
    private rojerusan.RSComboBox estadoCombo;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private rojeru_san.rsfield.RSTextField nombreTxt;
    private javax.swing.JCheckBox noti01check;
    private javax.swing.JCheckBox noti02check;
    private javax.swing.JCheckBox noti03check;
    private javax.swing.JCheckBox noti04check;
    private javax.swing.JCheckBox noti05check;
    private javax.swing.JCheckBox noti06check;
    private javax.swing.JCheckBox noti07check;
    private javax.swing.JCheckBox noti08check;
    private javax.swing.JCheckBox noti09check;
    private javax.swing.JCheckBox p1a1check;
    private javax.swing.JCheckBox p1a2check;
    private javax.swing.JCheckBox p1check;
    private javax.swing.JCheckBox p2a1check;
    private javax.swing.JCheckBox p2a2check;
    private javax.swing.JCheckBox p2a3check;
    private javax.swing.JCheckBox p2check;
    private javax.swing.JCheckBox p3a1check;
    private javax.swing.JCheckBox p3a2check;
    private javax.swing.JCheckBox p3a3check;
    private javax.swing.JCheckBox p3check;
    private javax.swing.JCheckBox p4a1check;
    private javax.swing.JCheckBox p4a2check;
    private javax.swing.JCheckBox p4check;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelNotificaciones;
    private javax.swing.JPanel panelPermisos;
    private rojeru_san.rspanel.RSPanelGradiente panelTitulo;
    private rojeru_san.rsfield.RSPassMaterial passTxt;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade1;
    private rojeru_san.rslabel.RSLabelVertical rSLabelVertical1;
    public javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables

    public void max() {

        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

    }
    private void getNotificaciones(){
        myUser.getUserNotificacion(code);
        System.out.println("myUserNotifiacion: "+myUser.toStringNotificaciones());
        noti01check.setSelected(myUser.getNoti01().equalsIgnoreCase("f")?false:true);
        noti02check.setSelected(myUser.getNoti02().equalsIgnoreCase("f")?false:true);
        noti03check.setSelected(myUser.getNoti03().equalsIgnoreCase("f")?false:true);
        noti04check.setSelected(myUser.getNoti04().equalsIgnoreCase("f")?false:true);
        noti05check.setSelected(myUser.getNoti05().equalsIgnoreCase("f")?false:true);
        noti06check.setSelected(myUser.getNoti06().equalsIgnoreCase("f")?false:true);
        noti07check.setSelected(myUser.getNoti07().equalsIgnoreCase("f")?false:true);
        noti08check.setSelected(myUser.getNoti08().equalsIgnoreCase("f")?false:true);
        noti09check.setSelected(myUser.getNoti09().equalsIgnoreCase("f")?false:true);
    }
    public void llenarValores() {

        myUser = new Usuario().getUser(code);
        new Thread(this::getNotificaciones).start();
        //getNotificaciones();
        myUser.getPermisos(code);
        codigoTxt.setText(myUser.getCodigo());
        nombreTxt.setText(myUser.getNombre());
        passTxt.setText(myUser.getClave());
        System.out.println(myUser.getClave());
        estadoCombo.setSelectedItem(myUser.getEstadoMensaje());
        idTxt.setText(myUser.getIdMensaje() + "");
        
        
        if (myUser.getP1().equals("f")) {
            p1False();
        } else {
            p1True();
            p1a1check.setSelected(myUser.getP1a1().equals("f") ? false : true);
            p1a2check.setSelected(myUser.getP1a2().equals("f") ? false : true);

        }

        if (myUser.getP2().equals("f")) {
            p2False();
        } else {
            p2True();
            p2a1check.setSelected(myUser.getP2a1().equals("f") ? false : true);
            p2a2check.setSelected(myUser.getP2a2().equals("f") ? false : true);
            p2a3check.setSelected(myUser.getP2a3().equals("f") ? false : true);
        }

        if (myUser.getP3().equals("f")) {
            p3False();
        } else {
            p3True();
            p3a1check.setSelected(myUser.getP3a1().equals("f") ? false : true);
            p3a2check.setSelected(myUser.getP3a2().equals("f") ? false : true);
            p3a3check.setSelected(myUser.getP3a3().equals("f") ? false : true);
        }

        if (myUser.getP4().equals("f")) {
            p4False();
        } else {
            p4True();
            p4a1check.setSelected(myUser.getP4a1().equals("f") ? false : true);
            p4a2check.setSelected(myUser.getP4a2().equals("f") ? false : true);
        }
    }

    private void mostrarPermisos() {
        // panelPermisos.setVisible(true);
        do {
            x += 2;
            panelPermisos.setBackground(new Color(255, 255, 255, 90));
            esperar();
            if (x >= 70) {
            }
        } while (x < 100);

    }
    int x = 0;

    private void esperar() {
        try {
            Thread.sleep(12);
        } catch (InterruptedException ex) {
            Logger.getLogger(UsuarioFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ocultarPermisos() {
        do {
            x -= 2;
            panelPermisos.setBackground(new Color(255, 255, 255, 10));
            esperar();

        } while (x > 0);
        // panelPermisos.setVisible(false);
    }

    private void p1False() {
        p1check.setSelected(false);
        p1a1check.setEnabled(false);
        p1a2check.setEnabled(false);

        p1a1check.setSelected(false);
        p1a2check.setSelected(false);
        p1 = false;
        p1a1 = false;
        p1a2 = false;
        myUser.setP1("f");
        myUser.setP1a1("f");
        myUser.setP1a2("f");
    }

    private void p1True() {
        p1check.setSelected(true);
        p1check.setEnabled(true);
        p1a1check.setEnabled(true);
        p1a2check.setEnabled(true);
        p1 = true;
        myUser.setP1("v");
    }

    private void p2False() {
        p2check.setSelected(false);
        p2a1check.setEnabled(false);
        p2a2check.setEnabled(false);
        p2a3check.setEnabled(false);

        p2a1check.setSelected(false);
        p2a2check.setSelected(false);
        p2a3check.setSelected(false);
        p2 = false;
        p2a1 = false;
        p2a2 = false;
        p2a3 = false;
        myUser.setP2("f");
        myUser.setP2a1("f");
        myUser.setP2a2("f");
        myUser.setP2a3("f");
    }

    private void p2True() {
        p2check.setSelected(true);
        p2check.setEnabled(true);
        p2a1check.setEnabled(true);
        p2a2check.setEnabled(true);
        p2a3check.setEnabled(true);
        p2 = true;
        myUser.setP2("v");

    }

    private void p3False() {
        p3check.setSelected(false);
        p3a1check.setEnabled(false);
        p3a2check.setEnabled(false);
        p3a3check.setEnabled(false);

        p3a1check.setSelected(false);
        p3a2check.setSelected(false);
        p3a3check.setSelected(false);
        p3 = false;
        p3a1 = false;
        p3a2 = false;
        p3a3 = false;
        myUser.setP3("f");
        myUser.setP3a1("f");
        myUser.setP3a2("f");
        myUser.setP3a3("f");
    }

    private void p3True() {
        p3check.setSelected(true);
        p3check.setEnabled(true);
        p3a1check.setEnabled(true);
        p3a2check.setEnabled(true);
        p3a3check.setEnabled(true);
        p3 = true;
        myUser.setP3("v");
    }

    private void p4False() {
        p4check.setSelected(false);
        p4a1check.setEnabled(false);
        p4a2check.setEnabled(false);
        p4a1check.setSelected(false);
        p4a2check.setSelected(false);

        p4 = false;
        p4a1 = false;
        p4a2 = false;
        myUser.setP4("f");
        myUser.setP4a1("f");
        myUser.setP4a2("f");
    }

    private void p4True() {
        p4check.setSelected(true);
        p4check.setEnabled(true);
        p4a1check.setEnabled(true);
        p4a2check.setEnabled(true);
        p4 = true;
        myUser.setP4("v");
    }
}
