/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.ConectarCloudcPanel;
import Clases.Usuario;
import Clases.TipoUnidad;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;

public class LoadingPage extends javax.swing.JFrame {

    Usuario x = new Usuario();
    private static ServerSocket SERVER_SOCKET;
    boolean llave = false;

    public LoadingPage() {
        changeIcon();
        iniSocket();
        if (llave == true) {
            initComponents();
            gif.setVisible(false);
            new Thread(this::initFunts).start();
        }
        jLabel2.setVisible(false);
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        gif = new javax.swing.JLabel();
        logoLabel = new necesario.RSLabelImage();
        panelIzquierdo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textoCarga = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        barraCarga = new rojeru_san.rsprogress.RSProgressBarAnimated();
        userTxt = new RSMaterialComponent.RSTextFieldIconDos();
        passTxt = new RSMaterialComponent.RSPasswordIconDos();
        btnAceptar = new RSComponentShade.RSButtonRippleShade();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelPrincipal.setBackground(new java.awt.Color(59, 59, 59));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/mov.gif"))); // NOI18N
        panelPrincipal.add(gif, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 180));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Imagen1.png"))); // NOI18N
        panelPrincipal.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 180));

        panelIzquierdo.setBackground(new java.awt.Color(148, 34, 36));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dev. by: corporacionAgama");

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIzquierdoLayout.createSequentialGroup()
                .addContainerGap(326, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        panelPrincipal.add(panelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        textoCarga.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        textoCarga.setForeground(new java.awt.Color(255, 255, 255));
        textoCarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCarga.setText("Cargando Interface de Usuario");
        panelPrincipal.add(textoCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 370, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestión de Inventario y Kardex");
        panelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 290, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        barraCarga.setColorBorde(new java.awt.Color(59, 59, 59));
        barraCarga.setVelocidad(29);
        panelPrincipal.add(barraCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 420, -1));

        userTxt.setBackground(new java.awt.Color(59, 59, 59));
        userTxt.setForeground(new java.awt.Color(255, 255, 255));
        userTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userTxt.setToolTipText("Usuario de Ingreso");
        userTxt.setBorderColor(new java.awt.Color(255, 255, 255));
        userTxt.setColorIcon(new java.awt.Color(255, 255, 255));
        userTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        userTxt.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        userTxt.setPhColor(new java.awt.Color(255, 255, 255));
        userTxt.setPlaceholder("username");
        panelPrincipal.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 170, -1));

        passTxt.setBackground(new java.awt.Color(59, 59, 59));
        passTxt.setForeground(new java.awt.Color(255, 255, 255));
        passTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passTxt.setToolTipText("Clave de Ingreso");
        passTxt.setBorderColor(new java.awt.Color(255, 255, 255));
        passTxt.setColorIcon(new java.awt.Color(255, 255, 255));
        passTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passTxt.setPhColor(new java.awt.Color(255, 255, 255));
        passTxt.setPlaceholder("Password");
        passTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passTxtKeyPressed(evt);
            }
        });
        panelPrincipal.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 170, -1));

        btnAceptar.setText("Ingresar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String codigo = userTxt.getText();
        String pass = passTxt.getText();
        if (codigo.length() < 1 || pass.length() < 1) {
            new rojerusan.RSNotifyFade("¡¡Usuario o Clave Vacio!! ", "Antes de continuar los campos no pueden estar en blanco.", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        } else {
            if (!x.getCodigo().equals(codigo)) {
                x = new Usuario().getUser(codigo);
            }
            if (x.getIdMensaje() < 1) {
                new rojerusan.RSNotifyFade("¡¡Usuario no Encontrado!! ", "No se ha encontrado ningún usuario con esa descripción", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            } else {
                if (!x.getEstadoMensaje().equals("Activo")) {
                    new rojerusan.RSNotifyFade("¡¡Usuario No Habilitado!! ", "El Usuario no se encuentra habilitado, contacte con el administrador", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                } else {
                    if (!x.getClave().equals(pass)) {
                        new rojerusan.RSNotifyFade("¡¡Clave Incorrecta!! ", "La constraeña no coincide con la Registrada", 5, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                    } else {
                        btnAceptar.setEnabled(false);
                        new Thread(this::activarGif).start();
                        new Thread(this::cargarModulos).start();
                    }
                }

            }
        }


    }//GEN-LAST:event_btnAceptarActionPerformed

    private void passTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAceptar.doClick();
        }
    }//GEN-LAST:event_passTxtKeyPressed

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
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsprogress.RSProgressBarAnimated barraCarga;
    private RSComponentShade.RSButtonRippleShade btnAceptar;
    private javax.swing.JLabel gif;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private necesario.RSLabelImage logoLabel;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelPrincipal;
    private RSMaterialComponent.RSPasswordIconDos passTxt;
    public static javax.swing.JLabel textoCarga;
    private RSMaterialComponent.RSTextFieldIconDos userTxt;
    // End of variables declaration//GEN-END:variables

    private void initFunts() {

        barraCarga.setVisible(false);
        textoCarga.setVisible(false);
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            System.out.println("MainFrame getting Connection: " + con);
        } catch (Exception e) {
            Logger.getLogger(TipoUnidad.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error Conectando con base de datos, contacte con el adm.\n" + e);
        }

    }

    public static void esperar() {
        try {
            Thread.sleep(250);

        } catch (InterruptedException ex) {
            Logger.getLogger(LoadingPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void esperar(int i) {
        try {
            Thread.sleep(i);

        } catch (InterruptedException ex) {
            Logger.getLogger(LoadingPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * crea una nueva instacia de MainFrame y le asigna el usuario Validado,
     * mientras carga los parametros por primera vez, espera hasta que este todo
     * listo y se cierra.
     *
     * @param void no requiere parametros
     *
     */
    private void cargarModulos() {

        barraCarga.setVisible(true);
        textoCarga.setVisible(true);
        x.getPermisos(x.getCodigo());
        MainFrame mf = new MainFrame(x);

        do {
            esperar();
        } while (!textoCarga.getText().equalsIgnoreCase("Listo"));
        mf.setVisible(true);
        //new Notificaciones(x).setVisible(true);
        this.dispose();

    }

    private void activarGif() {
        logoLabel.setVisible(false);
        gif.setVisible(true);
    }

    private void iniSocket() {
        try {
            SERVER_SOCKET = new ServerSocket(5386);
            llave=true;
        } catch (IOException x) {
            new rojerusan.RSNotifyFade("¡¡Aplicación Abierta ", "solo puede abrir (01) Instancia de la aplicación, cierrela"
                    + " y vuelva abrir. \n\nSi el problema persiste, llame al ADM", 8, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            new Thread(this::salir).start();
        }

    }

    private void salir() {
        esperar(3000);
        System.exit(0);
    }
}
