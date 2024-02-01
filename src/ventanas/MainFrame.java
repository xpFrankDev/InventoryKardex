/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Actualizar;
import Clases.Area;
import Clases.Articulo;
import Clases.Familia;
import Clases.KardexMovs;
import Clases.ScrollSens;
import Clases.Tela;
import Clases.Talla;
import Clases.Kardex;
import Clases.TipoUnidad;
import Clases.Usuario;
import Clases.tipoColor;
import Panels.DashBoard02;
import Panels.InventarioPanel;
import Panels.KardexPanel;
import Panels.ParametrosPanel;
import Panels.UsuariosPanel;
import Panels.pagosPanel;
import static java.awt.Frame.NORMAL;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import rojerusan.RSNotifyFade;


/**
 *
 * @author Family
 */
public class MainFrame extends javax.swing.JFrame {

    public static int max = 0;

    DashBoard02 dbPanel = new DashBoard02();
    InventarioPanel invPanel = new InventarioPanel();
    KardexPanel kardexPanel = new KardexPanel();
    ParametrosPanel paramPanel = new ParametrosPanel();
    UsuariosPanel userPanel = new UsuariosPanel();
    UpdateNotes upNotes = new UpdateNotes();
    pagosPanel pPagos = new pagosPanel();
    static ArrayList<Articulo> inventario = new ArrayList();
    static ArrayList<Kardex> kardex = new ArrayList();
    static int diasModificarKardex = 1;
    boolean subPanelKey = false;
    //Variable de permisos
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

    public static Usuario user = new Usuario();
    boolean mensajeNuevo = false;
    int minimizado = 0; 
    static ArrayList<Familia> familia = new ArrayList();
    static ArrayList<TipoUnidad> tipoUnidad = new ArrayList();
    static ArrayList<Talla> talla = new ArrayList();
    static ArrayList<Tela> tipoTela = new ArrayList();
    static ArrayList<tipoColor> color = new ArrayList();
    static ArrayList<Area> categoria = new ArrayList();
    static ArrayList<String> subCategoria = new ArrayList();
    static Kardex myKardex = new Kardex();

    public MainFrame() {
        initComponents();
        new Thread(this::ocultarSubPanel).start();
        changeIcon();
        setMaximimar();
        max++;
        activarBtn("Dash");
        new Thread(this::iniciarPrincipal).start();
    }

    public MainFrame(Usuario x) {
        LoadingPage.textoCarga.setText("Cargando Ventana Principal");
        user = x;
        initComponents();
        new Thread(this::ocultarSubPanel).start();
        changeIcon();
        setMaximimar();
        max++;
        activarBtn("Dash");
        new ScrollSens(scrollCentral, 90);
        new Thread(this::iniciarPrincipal).start();
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        panelSuperior = new rojeru_san.rspanel.RSPanelGradiente();
        btnSalir = new javax.swing.JButton();
        btnMax = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        btnMin1 = new javax.swing.JButton();
        rSLabelFecha1 = new rojeru_san.rsdate.RSLabelFecha();
        panelMenu = new javax.swing.JPanel();
        btnDash = new rojeru_san.rsbutton.RSButtonEffect();
        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();
        bienvenido = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JLabel();
        btnInventario = new rojeru_san.rsbutton.RSButtonEffect();
        btnKardex = new rojeru_san.rsbutton.RSButtonEffect();
        btnParam = new rojeru_san.rsbutton.RSButtonEffect();
        btnUsuario = new rojeru_san.rsbutton.RSButtonEffect();
        btnUsuario1 = new rojeru_san.rsbutton.RSButtonEffect();
        btnPagos = new rojeru_san.rsbutton.RSButtonEffect();
        btnProduccion = new rojeru_san.rsbutton.RSButtonEffect();
        scrollCentral = new javax.swing.JScrollPane();
        rSLabelHora1 = new rojeru_san.rsdate.RSLabelHora();
        subPanel = new rojeru_san.rspanel.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        rSButtonRippleShade1 = new RSComponentShade.RSButtonRippleShade();
        rSButtonRippleShade2 = new RSComponentShade.RSButtonRippleShade();
        rSButtonRippleShade3 = new RSComponentShade.RSButtonRippleShade();
        jLabel2 = new javax.swing.JLabel();
        rSButtonRippleShade6 = new RSComponentShade.RSButtonRippleShade();
        rSButtonRippleShade7 = new RSComponentShade.RSButtonRippleShade();
        rSButtonRippleShade8 = new RSComponentShade.RSButtonRippleShade();
        jLabel3 = new javax.swing.JLabel();
        rSButtonRippleShade4 = new RSComponentShade.RSButtonRippleShade();
        rSButtonRippleShade5 = new RSComponentShade.RSButtonRippleShade();
        rSButtonRippleShade9 = new RSComponentShade.RSButtonRippleShade();
        versionTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación para Controlar el Inventario y Kardex");
        setUndecorated(true);
        setResizable(false);

        panelCentral.setBackground(new java.awt.Color(59, 59, 59));

        panelSuperior.setColorPrimario(new java.awt.Color(59, 59, 59));
        panelSuperior.setColorSecundario(new java.awt.Color(128, 69, 28));

        btnSalir.setBackground(new java.awt.Color(59, 59, 59));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_close_window_32px.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnMax.setBackground(new java.awt.Color(59, 59, 59));
        btnMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_maximize_window_32px.png"))); // NOI18N
        btnMax.setContentAreaFilled(false);
        btnMax.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMax.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaxMouseExited(evt);
            }
        });
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });

        btnMin.setBackground(new java.awt.Color(59, 59, 59));
        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_minimize_window_32px.png"))); // NOI18N
        btnMin.setContentAreaFilled(false);
        btnMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        btnMin1.setBackground(new java.awt.Color(59, 59, 59));
        btnMin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_info_32px.png"))); // NOI18N
        btnMin1.setContentAreaFilled(false);
        btnMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(btnMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMax, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMin1))
        );

        rSLabelFecha1.setForeground(new java.awt.Color(255, 255, 255));

        panelMenu.setBackground(new java.awt.Color(59, 59, 59));
        panelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMenuMouseExited(evt);
            }
        });

        btnDash.setBackground(new java.awt.Color(59, 59, 59));
        btnDash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_120_degrees_40px.png"))); // NOI18N
        btnDash.setText("   DashBoard");
        btnDash.setColorHover(new java.awt.Color(38, 38, 38));
        btnDash.setContentAreaFilled(true);
        btnDash.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnDash.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDash.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDash.setOpaque(false);
        btnDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashActionPerformed(evt);
            }
        });

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_115px.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );

        bienvenido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bienvenido.setText("Bienvenido/a");

        nombreTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreTxt.setText("@Nombre");

        btnInventario.setBackground(new java.awt.Color(59, 59, 59));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_box_40px.png"))); // NOI18N
        btnInventario.setText("   Inventario");
        btnInventario.setColorHover(new java.awt.Color(38, 38, 38));
        btnInventario.setContentAreaFilled(true);
        btnInventario.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnInventario.setEnabled(false);
        btnInventario.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventario.setOpaque(false);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnKardex.setBackground(new java.awt.Color(59, 59, 59));
        btnKardex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_up_down_arrow_40px.png"))); // NOI18N
        btnKardex.setText("   Kardex");
        btnKardex.setColorHover(new java.awt.Color(38, 38, 38));
        btnKardex.setContentAreaFilled(true);
        btnKardex.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnKardex.setEnabled(false);
        btnKardex.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnKardex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKardex.setOpaque(false);
        btnKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKardexActionPerformed(evt);
            }
        });

        btnParam.setBackground(new java.awt.Color(59, 59, 59));
        btnParam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_administrative_tools_40px.png"))); // NOI18N
        btnParam.setText("   Parámetros");
        btnParam.setColorHover(new java.awt.Color(38, 38, 38));
        btnParam.setContentAreaFilled(true);
        btnParam.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnParam.setEnabled(false);
        btnParam.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnParam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnParam.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnParam.setOpaque(false);
        btnParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParamActionPerformed(evt);
            }
        });

        btnUsuario.setBackground(new java.awt.Color(59, 59, 59));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_user_menu_female_40px_1.png"))); // NOI18N
        btnUsuario.setText("   Usuarios");
        btnUsuario.setColorHover(new java.awt.Color(38, 38, 38));
        btnUsuario.setContentAreaFilled(true);
        btnUsuario.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnUsuario.setEnabled(false);
        btnUsuario.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuario.setOpaque(false);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnUsuario1.setBackground(new java.awt.Color(59, 59, 59));
        btnUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_online_store_40px.png"))); // NOI18N
        btnUsuario1.setText("Ventas");
        btnUsuario1.setColorHover(new java.awt.Color(38, 38, 38));
        btnUsuario1.setContentAreaFilled(true);
        btnUsuario1.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnUsuario1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuario1.setOpaque(false);
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario1ActionPerformed(evt);
            }
        });

        btnPagos.setBackground(new java.awt.Color(59, 59, 59));
        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_receipt_approved_40px.png"))); // NOI18N
        btnPagos.setText(" Pago & Facturas");
        btnPagos.setColorHover(new java.awt.Color(38, 38, 38));
        btnPagos.setContentAreaFilled(true);
        btnPagos.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnPagos.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnPagos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPagos.setOpaque(false);
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });

        btnProduccion.setBackground(new java.awt.Color(59, 59, 59));
        btnProduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_construction_workers_40px.png"))); // NOI18N
        btnProduccion.setText("Producción");
        btnProduccion.setColorHover(new java.awt.Color(38, 38, 38));
        btnProduccion.setContentAreaFilled(true);
        btnProduccion.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        btnProduccion.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnProduccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProduccion.setOpaque(false);
        btnProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProduccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDash, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnParam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKardex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(btnProduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKardex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        scrollCentral.setToolTipText("");
        scrollCentral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                scrollCentralFocusGained(evt);
            }
        });
        scrollCentral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                scrollCentralMouseEntered(evt);
            }
        });

        rSLabelHora1.setForeground(new java.awt.Color(255, 255, 255));

        subPanel.setColorPrimario(new java.awt.Color(59, 59, 59));
        subPanel.setColorSecundario(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cotizaciones");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        rSButtonRippleShade1.setText("Generar Nueva Cot.");
        rSButtonRippleShade1.setBgShade(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade1.setBgShadeHover(new java.awt.Color(0, 160, 255));

        rSButtonRippleShade2.setText("Consultar Cotizaciones");
        rSButtonRippleShade2.setBgShade(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade2.setBgShadeHover(new java.awt.Color(0, 160, 255));

        rSButtonRippleShade3.setText("Sin opcion Definida");
        rSButtonRippleShade3.setBgShade(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade3.setBgShadeHover(new java.awt.Color(0, 160, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Solicitudes de Compras");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        rSButtonRippleShade6.setBackground(new java.awt.Color(0, 153, 102));
        rSButtonRippleShade6.setText("Generar Orden de Compra");
        rSButtonRippleShade6.setBgHover(new java.awt.Color(0, 120, 102));
        rSButtonRippleShade6.setBgShade(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade6.setBgShadeHover(new java.awt.Color(0, 120, 102));

        rSButtonRippleShade7.setBackground(new java.awt.Color(0, 153, 102));
        rSButtonRippleShade7.setText("Consultar Solicitudes");
        rSButtonRippleShade7.setBgHover(new java.awt.Color(0, 120, 102));
        rSButtonRippleShade7.setBgShade(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade7.setBgShadeHover(new java.awt.Color(0, 120, 102));

        rSButtonRippleShade8.setBackground(new java.awt.Color(0, 153, 102));
        rSButtonRippleShade8.setText("Nueva Solicitud Compra");
        rSButtonRippleShade8.setBgHover(new java.awt.Color(0, 120, 102));
        rSButtonRippleShade8.setBgShade(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade8.setBgShadeHover(new java.awt.Color(0, 120, 102));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Pedidos y Orden de Fabricación(OF)");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        rSButtonRippleShade4.setBackground(new java.awt.Color(0, 153, 204));
        rSButtonRippleShade4.setText("Ver Pedidos Activos");
        rSButtonRippleShade4.setBgHover(new java.awt.Color(0, 204, 255));
        rSButtonRippleShade4.setBgShade(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade4.setBgShadeHover(new java.awt.Color(0, 204, 255));

        rSButtonRippleShade5.setBackground(new java.awt.Color(0, 153, 204));
        rSButtonRippleShade5.setText("OF Pendientes");
        rSButtonRippleShade5.setBgHover(new java.awt.Color(0, 204, 255));
        rSButtonRippleShade5.setBgShade(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade5.setBgShadeHover(new java.awt.Color(0, 204, 255));

        rSButtonRippleShade9.setBackground(new java.awt.Color(0, 153, 204));
        rSButtonRippleShade9.setText("Sin opcion Definida");
        rSButtonRippleShade9.setBgHover(new java.awt.Color(0, 204, 255));
        rSButtonRippleShade9.setBgShade(new java.awt.Color(255, 255, 255));
        rSButtonRippleShade9.setBgShadeHover(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout subPanelLayout = new javax.swing.GroupLayout(subPanel);
        subPanel.setLayout(subPanelLayout);
        subPanelLayout.setHorizontalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonRippleShade1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(rSButtonRippleShade8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonRippleShade4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonRippleShade5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonRippleShade9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonRippleShade6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonRippleShade7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonRippleShade2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSButtonRippleShade3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        subPanelLayout.setVerticalGroup(
            subPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRippleShade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRippleShade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRippleShade3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRippleShade8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRippleShade7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRippleShade6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRippleShade4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRippleShade5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonRippleShade9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        versionTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        versionTxt.setForeground(new java.awt.Color(255, 255, 255));
        versionTxt.setText("@Version");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(versionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollCentral))))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSLabelFecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelHora1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(versionTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                    .addComponent(subPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParamActionPerformed
        activarBtn("Param");
    }//GEN-LAST:event_btnParamActionPerformed

    private void btnKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKardexActionPerformed
        activarBtn("Kardex");
    }//GEN-LAST:event_btnKardexActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setContentAreaFilled(true);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setContentAreaFilled(false);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMouseEntered
        btnMax.setContentAreaFilled(true);
    }//GEN-LAST:event_btnMaxMouseEntered

    private void btnMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaxMouseExited
        btnMax.setContentAreaFilled(false);
    }//GEN-LAST:event_btnMaxMouseExited

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        btnMin.setContentAreaFilled(true);
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        btnMin.setContentAreaFilled(false);
    }//GEN-LAST:event_btnMinMouseExited

    private void btnDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashActionPerformed
        activarBtn("Dash");
    }//GEN-LAST:event_btnDashActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        activarBtn("Inv");
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
        if (max == 0) {
            setMaximimar();
            max++;

        } else if (max == 1) {
            setMaximimar();
            max--;
        }
    }//GEN-LAST:event_btnMaxActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        this.setExtendedState(ICONIFIED);
        
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        activarBtn("User");
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMin1ActionPerformed
        if (upNotes.isShowing()) {
            upNotes.mostrar();
        } else if (upNotes == null) {
            upNotes = new UpdateNotes();
            upNotes.setVisible(true);
        } else {
            upNotes.setVisible(true);
            //upNotes.mostrar();
        }
    }//GEN-LAST:event_btnMin1ActionPerformed

    private void btnUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario1ActionPerformed
        if(subPanelKey==true){
           new Thread(this::ocultarSubPanel).start();
       }else{
           new Thread(this::mostrarSubPanel).start();
       }
       
    }//GEN-LAST:event_btnUsuario1ActionPerformed

    private void scrollCentralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_scrollCentralFocusGained
        
    }//GEN-LAST:event_scrollCentralFocusGained

    private void scrollCentralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrollCentralMouseEntered
     if(subPanel.isShowing()){
         new Thread(this::ocultarSubPanel).start();
     }
        
    }//GEN-LAST:event_scrollCentralMouseEntered

    private void panelMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMenuMouseExited
      
    }//GEN-LAST:event_panelMenuMouseExited

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
       activarBtn("Pagos");
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProduccionActionPerformed
        activarBtn("produccion");
    }//GEN-LAST:event_btnProduccionActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private rojeru_san.rsbutton.RSButtonEffect btnDash;
    private rojeru_san.rsbutton.RSButtonEffect btnInventario;
    private rojeru_san.rsbutton.RSButtonEffect btnKardex;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnMin1;
    private rojeru_san.rsbutton.RSButtonEffect btnPagos;
    private rojeru_san.rsbutton.RSButtonEffect btnParam;
    private rojeru_san.rsbutton.RSButtonEffect btnProduccion;
    private javax.swing.JButton btnSalir;
    private rojeru_san.rsbutton.RSButtonEffect btnUsuario;
    private rojeru_san.rsbutton.RSButtonEffect btnUsuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel nombreTxt;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelMenu;
    private rojeru_san.rspanel.RSPanelGradiente panelSuperior;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade1;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade2;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade3;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade4;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade5;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade6;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade7;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade8;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade9;
    private rojeru_san.rsdate.RSLabelFecha rSLabelFecha1;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora1;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    private javax.swing.JScrollPane scrollCentral;
    private rojeru_san.rspanel.RSPanelGradiente subPanel;
    private javax.swing.JLabel versionTxt;
    // End of variables declaration//GEN-END:variables

    private void activarBtn(String valor) {

        switch (valor) {
            case "Dash":
                btnDash.setSelected(true);
                btnInventario.setSelected(false);
                btnKardex.setSelected(false);
                btnPagos.setSelected(false);
                btnParam.setSelected(false);
                btnUsuario.setSelected(false);
                 btnProduccion.setSelected(false);
                scrollCentral.setViewportView(dbPanel);
                break;

            case "Inv":
                btnDash.setSelected(false);
                btnInventario.setSelected(true);
                btnKardex.setSelected(false);
                btnParam.setSelected(false);
                btnUsuario.setSelected(false);
                btnPagos.setSelected(false);
                 btnProduccion.setSelected(false);
                scrollCentral.setViewportView(invPanel);
                invPanel.actualizarFiltros();
                new Thread(InventarioPanel::llenarTabla).start();
                break;
            case "Kardex":
                btnDash.setSelected(false);
                btnInventario.setSelected(false);
                btnKardex.setSelected(true);
                btnParam.setSelected(false);
                btnPagos.setSelected(false);
                btnUsuario.setSelected(false);
                 btnProduccion.setSelected(false);
                scrollCentral.setViewportView(kardexPanel);
                //new Thread(KardexPanel::getMovimientosLikeAll).start();
                break;

            case "Param":
                btnDash.setSelected(false);
                btnInventario.setSelected(false);
                btnKardex.setSelected(false);
                btnParam.setSelected(true);
                btnPagos.setSelected(false);
                btnUsuario.setSelected(false);
                 btnProduccion.setSelected(false);
                scrollCentral.setViewportView(paramPanel);
                break;
            case "User":
                btnDash.setSelected(false);
                btnInventario.setSelected(false);
                btnKardex.setSelected(false);
                btnParam.setSelected(false);
                btnUsuario.setSelected(true);
                btnPagos.setSelected(false);
                 btnProduccion.setSelected(false);
                scrollCentral.setViewportView(userPanel);

                break;
            case "Pagos":
                //new Thread(pagosPanel::iniValores).start();
                pPagos.iniValores();
                scrollCentral.setViewportView(pPagos);
                btnDash.setSelected(false);
                btnInventario.setSelected(false);
                btnKardex.setSelected(false);
                btnParam.setSelected(false);
                btnUsuario.setSelected(false);
                btnPagos.setSelected(true);
                 btnProduccion.setSelected(false);
                break;
//produccion
                case "produccion":
                //new Thread(pagosPanel::iniValores).start();
                pPagos.iniValores();
                scrollCentral.setViewportView(pPagos);
                btnDash.setSelected(false);
                btnInventario.setSelected(false);
                btnKardex.setSelected(false);
                btnParam.setSelected(false);
                btnUsuario.setSelected(false);
                btnPagos.setSelected(false);
                btnProduccion.setSelected(true);
                break; 
                
        }

    }

    public void setMaximimar() {
        switch (max) {
            case 0:
                GraphicsEnvironment env
                        = GraphicsEnvironment.getLocalGraphicsEnvironment();
                this.setMaximizedBounds(env.getMaximumWindowBounds());
                this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

                break;
            case 1:
                this.setResizable(false);
                this.setExtendedState(NORMAL);
                break;
        }
    }

    public void setMaximimar(int rsp) {
        switch (rsp) {
            case 0:
                GraphicsEnvironment env
                        = GraphicsEnvironment.getLocalGraphicsEnvironment();
                this.setMaximizedBounds(env.getMaximumWindowBounds());
                this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

                break;
            case 1:
                this.setExtendedState(NORMAL);
                break;
        }
    }

    public static String getUsuario() {
        return nombreTxt.getText();
    }

    private void iniciarPrincipal() {
        nombreTxt.setText(user.getNombre());
        LoadingPage.textoCarga.setText("Cargando DashBoard");
        cargarDashBoard();
        LoadingPage.textoCarga.setText("Validando Permisos y Notificaciones");
        validandoPermisosyNotificaciones();
        LoadingPage.textoCarga.setText("Cargando por primera vez el inventario");
        cargarInventario();
        LoadingPage.textoCarga.setText("Cargando resumen de Kardex");
        new Thread(this::cargarKardex).start();
        LoadingPage.textoCarga.setText("Cargando Parametros");
        cargarParametros();
        LoadingPage.textoCarga.setText("Cargando Usuarios");
        cargarUsuarios();
        DashBoard02.setValores();
        LoadingPage.textoCarga.setText("Listo");
    }

    private void cargarDashBoard() {
        activarBtn("Dash");
        String newVersion =new Actualizar().getVersion();
        versionTxt.setText("Version: v"+newVersion);
        
    }

    private void validandoPermisosyNotificaciones() {
        user.getUserNotificacion(user.getCodigo());
        if (!user.getP1().equals("f")) {
            btnInventario.setEnabled(true);
            invPanel.agregarBtn.setEnabled(user.getP1a1().equals("f") ? false : true);
            invPanel.editBtn.setEnabled(user.getP1a2().equals("f") ? false : true);
        }
        if (!user.getP2().equals("f")) {
            btnKardex.setEnabled(true);
            kardexPanel.agregarBtn.setEnabled(user.getP2a1().equals("f") ? false : true);
            kardexPanel.editBtn.setEnabled(user.getP2a2().equals("f") ? false : true);

            kardexPanel.agregarBtn.setEnabled(user.getP2a1().equals("f") ? false : true);
            kardexPanel.editBtn.setEnabled(user.getP2a2().equals("f") ? false : true);
        }
        if (!user.getP3().equals("f")) {
            btnUsuario.setEnabled(true);
            userPanel.agregarBtn.setEnabled(user.getP3a1().equals("f") ? false : true);
            userPanel.editBtn.setEnabled(user.getP2a2().equals("f") ? false : true);
        }
        if (!user.getP4().equals("f")) {
            btnParam.setEnabled(true);

        }

    }

    private void cargarInventario() {
        InventarioPanel.llenarTabla();

    }

    private void cargarKardex() {
        KardexPanel.getMovimientosGeneral();

    }

    private void cargarParametros() {
        boolean agregar = user.getP4a1().equalsIgnoreCase("f") ? false : true;
        boolean editar = user.getP4a2().equalsIgnoreCase("f") ? false : true;
        diasModificarKardex = new KardexMovs().getDiasModificarKarfex();
        paramPanel.iniciar(agregar, editar);
        
        
        setColor(new tipoColor().Listar(""));
        setTipoUnidad(new TipoUnidad().Listar(""));
        setTipoTela(new Tela().Listar(""));
        setTalla(new Talla().Listar(""));
        setFamilia(new Familia().Listar(""));
        
    }

    private void cargarUsuarios() {
        UsuariosPanel.llenarTabla();
    }

    private void buscarNotificaciones() {
        new rojerusan.RSNotifyFade("¡¡Buscando Notifcs.!! ", "Espere mientras revisamos si tiene mensajes pendientes", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        
    }


    private void esperar() {
        try {
            Thread.sleep(750);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getDiasModificarKardex() {
        return diasModificarKardex;
    }

    public static void setDiasModificarKardex(int diasModificarKardex) {
        MainFrame.diasModificarKardex = diasModificarKardex;
    }
    
    private void ocultarSubPanel(){
        subPanelKey= false;
        subPanel.setVisible(false);
        subPanel.repaint();
        /*
         int ancho = subPanel.getWidth();
        int alto = subPanel.getHeight();
        for(int i= ancho; i>10;i--){
            subPanel.setSize(i,alto);
            subPanel.repaint();
            //this.repaint();
            scrollCentral.repaint();
            esperar2();
        }
        subPanel.setVisible(false);
        */
        
       
    }
    private void mostrarSubPanel(){
        
        subPanelKey= true;
       subPanel.setVisible(true);
       subPanel.repaint();
        /*
        int ancho=226;
        int alto = subPanel.getHeight();
        subPanel.setVisible(true);
        for(int i=10; i<ancho;i++){
            subPanel.setSize(i,alto);
            subPanel.repaint();
            scrollCentral.repaint();
            esperar2();
        }
        */
        
    }
    
    private void esperar2(){
        try {
            Thread.sleep(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Familia> getFamilia() {
        return familia;
    }

    public static void setFamilia(ArrayList<Familia> familia) {
        MainFrame.familia.clear();
        MainFrame.familia = (ArrayList)familia.clone();
    }

    public static ArrayList<TipoUnidad> getTipoUnidad() {
        return tipoUnidad;
    }

    public static void setTipoUnidad(ArrayList<TipoUnidad> tipoUnidad) {
        MainFrame.tipoUnidad.clear();
        MainFrame.tipoUnidad = (ArrayList)tipoUnidad.clone();
    }

    public static ArrayList<Talla> getTalla() {
        return talla;
    }

    public static void setTalla(ArrayList<Talla> talla) {
       MainFrame.talla.clear();
        MainFrame.talla = (ArrayList)talla.clone();
    }

    public static ArrayList<Tela> getTipoTela() {
        return tipoTela;
    }

    public static void setTipoTela(ArrayList<Tela> tipoTela) {
       MainFrame.tipoTela.clear();
        MainFrame.tipoTela = (ArrayList)tipoTela.clone();
    }

    public static ArrayList<tipoColor> getColor() {
        return color;
    }

    public static void setColor(ArrayList<tipoColor> color) {
        MainFrame.color.clear();
        MainFrame.color = (ArrayList)color.clone();
    }

    public static ArrayList<Area> getCategoria() {
        return categoria;
    }

    public static void setCategoria(ArrayList<Area> categoria) {
         MainFrame.categoria.clear();
        MainFrame.categoria = (ArrayList)categoria.clone();
    }

    public static ArrayList<String> getSubCategoria() {
        return subCategoria;
    }

    public static void setSubCategoria(ArrayList<String> subCategoria) {
        MainFrame.subCategoria.clear();
        MainFrame.subCategoria = (ArrayList)subCategoria.clone();
        
    }
    
    public static void setKardex(Kardex nKardex){
        myKardex = nKardex;
        
    }
    
    public static void setInventario(ArrayList<Articulo> listax){
        inventario = (ArrayList) listax.clone();
    }
    public static void setKardex(ArrayList<Kardex> k){
        kardex = (ArrayList) k.clone();
    }
}
