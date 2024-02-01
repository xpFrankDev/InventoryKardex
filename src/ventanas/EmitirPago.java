/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.FacturaKardex;
import Clases.Kardex;
import Clases.PagoFacturaKardex;
import Clases.VentaKardex;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import javax.swing.ImageIcon;
import rojeru_san.complementos.RSUtilities;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Family
 */
public class EmitirPago extends javax.swing.JFrame {

    FacturaKardex factura = new FacturaKardex();
    PagoFacturaKardex pago = new PagoFacturaKardex();
    Kardex kardex = new Kardex();
    VentaKardex venta = new VentaKardex();
    int tipo = 1; // 1=Agregar , 2=Editar

    public EmitirPago() {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
    }

    public EmitirPago(Kardex k, FacturaKardex fk, PagoFacturaKardex pfk, VentaKardex vk, int tipo) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
        this.kardex = k;
        this.factura = fk;
        this.pago = pfk;
        this.venta = vk;
        this.tipo = tipo;
        IniciarValores();
    }

    public EmitirPago(Kardex k, FacturaKardex fk, VentaKardex vk, int tipo) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
        this.kardex = k;
        this.factura = fk;
        this.venta = vk;
        this.tipo = tipo;
        IniciarValores();
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
        rSPanelGradiente1 = new rojeru_san.rspanel.RSPanelGradiente();
        tituloTxt = new rojeru_san.rslabel.RSLabelVertical();
        jButton1 = new javax.swing.JButton();
        ClienteTxt = new javax.swing.JLabel();
        totalPagadoTxt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tipoPagoCombo = new rojerusan.RSComboBox();
        jLabel4 = new javax.swing.JLabel();
        bancoCombo = new rojerusan.RSComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        montoTxt = new rojeru_san.rsfield.RSTextFullRound();
        usuarioTxt = new rojeru_san.rsfield.RSTextFullRound();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fechaTxt = new rojeru_san.rsfield.RSTextFullRound();
        estadoTxt = new rojeru_san.rsfield.RSTextFullRound();
        jLabel9 = new javax.swing.JLabel();
        aceptarBtn = new RSComponentShade.RSButtonRippleShade();
        jLabel1 = new javax.swing.JLabel();
        referenciaTxt = new rojeru_san.rsfield.RSTextFullRound();
        jLabel10 = new javax.swing.JLabel();
        totalFacturaTxt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

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

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 204, 255));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 102, 102));
        rSPanelGradiente1.setGradiente(rojeru_san.rspanel.RSPanelGradiente.Gradiente.HORIZONTAL);

        tituloTxt.setForeground(new java.awt.Color(255, 255, 255));
        tituloTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTxt.setText("Actualizar Detalle de Pago");
        tituloTxt.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCentral.add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 520));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_close_window_32px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelCentral.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 50, -1));

        ClienteTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ClienteTxt.setText("@Esperando Datos");
        panelCentral.add(ClienteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 380, 20));

        totalPagadoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        totalPagadoTxt.setText("@Monto");
        panelCentral.add(totalPagadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 140, 40));
        panelCentral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 550, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Pago de Cliente:");
        panelCentral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, 20));

        tipoPagoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Transferencia Bancaria", "Deposito", "Pago por Agente", "Letra", "Yape", "Plin" }));
        tipoPagoCombo.setDisabledIdex(" ");
        panelCentral.add(tipoPagoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Seleccione Banco Receptor");
        panelCentral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 200, -1));

        bancoCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Requiere", "BCP", "Interbank", "Scotibank" }));
        bancoCombo.setDisabledIdex(" ");
        panelCentral.add(bancoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tipo de Pago");
        panelCentral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("Monto Pagado:");
        panelCentral.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 110, 40));

        montoTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        montoTxt.setSoloNumeros(true);
        panelCentral.add(montoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 190, -1));

        usuarioTxt.setEditable(false);
        usuarioTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        usuarioTxt.setPlaceholder("Esperando Datos");
        panelCentral.add(usuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 160, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("Usuario:");
        panelCentral.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 60, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("Fecha:");
        panelCentral.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 60, 40));

        fechaTxt.setEditable(false);
        fechaTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        fechaTxt.setPlaceholder("Esperando Datos");
        panelCentral.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 160, -1));

        estadoTxt.setEditable(false);
        estadoTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        estadoTxt.setMargin(new java.awt.Insets(3, 12, 3, 6));
        estadoTxt.setPlaceholder("Esperando Datos");
        estadoTxt.setSoloNumeros(true);
        panelCentral.add(estadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 350, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Estado:");
        panelCentral.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 60, 40));

        aceptarBtn.setText("Actualizar Registro");
        aceptarBtn.setBgHover(new java.awt.Color(0, 153, 153));
        aceptarBtn.setBgShadeHover(new java.awt.Color(204, 204, 204));
        aceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBtnActionPerformed(evt);
            }
        });
        panelCentral.add(aceptarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_client_management_20px.png"))); // NOI18N
        panelCentral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 30, 30));
        panelCentral.add(referenciaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 190, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("Referencia de Pago:");
        panelCentral.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 140, 40));

        totalFacturaTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        totalFacturaTxt.setText("@Monto");
        panelCentral.add(totalFacturaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 110, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setText("Total de Factura:");
        panelCentral.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("*");
        panelCentral.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 20, 40));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setText("Pagado hasta el Momento:");
        panelCentral.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 170, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setText("*");
        panelCentral.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 20, 40));

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private void aceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBtnActionPerformed

        if (validarCampos()) {

            String tipoPagox = tipoPagoCombo.getSelectedItem().toString();
            String bancox = bancoCombo.getSelectedItem().toString();
            String referenciax = referenciaTxt.getText();
            String usuariox = MainFrame.getUsuario();
            String estado = "Pendiente";
            double totalFacturado = factura.getMontoTotal();
            double montoRegistrado = Double.parseDouble(montoTxt.getText());
            double totalPagado = 0.0;
            totalPagado += montoRegistrado;
            for (PagoFacturaKardex pfk : kardex.getPagos()) {
                totalPagado += pfk.getMontoPagado();
            }

            if (totalPagado > totalFacturado || montoRegistrado > totalFacturado) {
                new rojerusan.RSNotifyFade("¡¡Monto Superior !!", "El monto registrado es mayor al facturado.", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            } else if ( montoRegistrado <= 0){
                 new rojerusan.RSNotifyFade("¡¡ Modificar Cantidad !!", "No se puede dejar el monto en 0 o números negativos.", 5,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            } else {
                if (tipo == 2) { // Editar pago
                    
                    if (montoRegistrado == totalFacturado) {
                        estado = "Pago Completo";
                    } else if (montoRegistrado < totalFacturado && montoRegistrado > 0) {
                        estado = "Parcial";
                    } else if (montoRegistrado <= 0) {
                        estado = "Pendiente";
                    }
                    System.out.println("Venta Usada: " + venta.toString());
                    int valor = new PagoFacturaKardex().updatePago(pago.getId(), factura.getId(),
                            venta.getId(), tipoPagox, bancox, referenciax, totalPagado, usuariox, estado);

                    if (valor > 0) {
                        new rojerusan.RSNotifyFade("¡¡Pago Agregado !!", "Datos actualizados correctamente.", 5,
                                RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                        this.dispose();
                    }
                } else if (tipo == 1) { // Agregar Pago
                    String tipoPago =tipoPagoCombo.getSelectedItem().toString();
                    String banco = bancoCombo.getSelectedItem().toString();
                    String ref = referenciaTxt.getText();
                    String user = MainFrame.getUsuario();
                    if(totalPagado<totalFacturado){
                        estado="Parcial";
                    }else if (totalPagado == totalFacturado){
                        estado ="Pago Completo";
                    }
                    
                     int valor = new PagoFacturaKardex()
                            .newPago(kardex.getId(), factura.getId(),venta.getId(), tipoPagox, bancox, referenciax,
                                    montoRegistrado, user, estado);
                     
                     if(valor > 0 ){
                         new rojerusan.RSNotifyFade("¡¡Pago #"+valor+" Agregado!!", 
                         "Se actualizaron los montos pagados asociados a la factura satisfactoriamente. ", 4,
                            RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                         this.dispose();
                         
                     }
                }
                
            }

        } else {
            new rojerusan.RSNotifyFade("¡¡Falta llenar Datos !!", "Referencia y el Monto pagado son valores indispensables. "
                    + "Recuerde que el monto pagado no puede ser un valor negativo.", 4,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
        }


    }//GEN-LAST:event_aceptarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EmitirPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmitirPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmitirPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmitirPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                new EmitirPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClienteTxt;
    private RSComponentShade.RSButtonRippleShade aceptarBtn;
    private rojerusan.RSComboBox bancoCombo;
    private rojeru_san.rsfield.RSTextFullRound estadoTxt;
    private rojeru_san.rsfield.RSTextFullRound fechaTxt;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private rojeru_san.rsfield.RSTextFullRound montoTxt;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    private rojeru_san.rsfield.RSTextFullRound referenciaTxt;
    private rojerusan.RSComboBox tipoPagoCombo;
    private rojeru_san.rslabel.RSLabelVertical tituloTxt;
    private javax.swing.JLabel totalFacturaTxt;
    private javax.swing.JLabel totalPagadoTxt;
    private rojeru_san.rsfield.RSTextFullRound usuarioTxt;
    // End of variables declaration//GEN-END:variables

    public void max() {

        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

    }

    private void IniciarValores() {
        if(factura.getEstado().equalsIgnoreCase("pago completo")){
            aceptarBtn.setVisible(false);
            tituloTxt.setText("Visualizar Pago - Factura ya está Pagada");
            tipoPagoCombo.setEnabled(false);
            bancoCombo.setEnabled(false);
            montoTxt.setEditable(false);
            referenciaTxt.setEditable(false);
        }
        
        if (tipo == 1) {
            tituloTxt.setText("Agregar Pago");
            fechaTxt.setText("-");
            estadoTxt.setText(factura.getEstado());
        } else {
            tipoPagoCombo.setSelectedItem(pago.getTipoPago());
            bancoCombo.setSelectedItem(pago.getBanco());
            referenciaTxt.setText(pago.getReferenciaPago().equalsIgnoreCase("Esperando Pago") ? "" : pago.getReferenciaPago());
            montoTxt.setText(pago.getMontoPagado() + "");
            fechaTxt.setText(pago.getFecha());
            estadoTxt.setText(pago.getEstado());
        }
        double suma = 0.0;
            for (PagoFacturaKardex pago : kardex.getPagos()) {
                suma += pago.getMontoPagado();
            }
        totalPagadoTxt.setText(suma + "");
        totalFacturaTxt.setText(factura.getMontoTotal() + "");
        usuarioTxt.setText(MainFrame.getUsuario());
        ClienteTxt.setText(kardex.getCliente());
    }
//MainFrame.diasModificarKardex

    private boolean validarCampos() {
        boolean llave = false;
        if (referenciaTxt.getText().length() > 0 && montoTxt.getText().length() > 0) {
            llave = true;
        }
        return llave;
    }

}
