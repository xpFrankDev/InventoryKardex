/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Area;
import Clases.FacturaKardex;
import Clases.Kardex;
import Clases.PagoFacturaKardex;
import Clases.VentaKardex;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import rojeru_san.complementos.RSUtilities;

/**
 *
 * @author Family
 */
public class verDetallePagos extends javax.swing.JFrame {

    Kardex kardex = new Kardex();
    PagoFacturaKardex pago = new PagoFacturaKardex();
    public verDetallePagos() {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
        
        
    }
public verDetallePagos(Kardex kardex,PagoFacturaKardex pago  ) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
        this.kardex=kardex;
        this.pago=pago;
        verDatos();
        
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        s = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        estadoTxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fechaTxt = new javax.swing.JLabel();
        numFacturaTxt = new javax.swing.JLabel();
        idFacturaTxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tipoPagoTxt = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bancoTxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        referenciaTxt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        montoTxt = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usuarioTxt = new javax.swing.JLabel();
        facturaBtn = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver Resumen del Pago");
        setUndecorated(true);
        setResizable(false);

        fondoPanel.setBackground(new java.awt.Color(0, 0, 0));

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));
        panelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelGradiente1.setColorPrimario(new java.awt.Color(0, 153, 153));
        rSPanelGradiente1.setColorSecundario(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DETALLE DE PAGO");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_close_window_32px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelGradiente1Layout = new javax.swing.GroupLayout(rSPanelGradiente1);
        rSPanelGradiente1.setLayout(rSPanelGradiente1Layout);
        rSPanelGradiente1Layout.setHorizontalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCentral.add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        s.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        s.setText("|");
        panelCentral.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 10, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Factura #:");
        panelCentral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        estadoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        estadoTxt.setText("@");
        panelCentral.add(estadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Estado:");
        panelCentral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Fecha:");
        panelCentral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        fechaTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        fechaTxt.setText("@");
        panelCentral.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 100, -1));

        numFacturaTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        numFacturaTxt.setText("@");
        panelCentral.add(numFacturaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, -1));

        idFacturaTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        idFacturaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idFacturaTxt.setText("@");
        panelCentral.add(idFacturaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Tipo de Pago:");
        panelCentral.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        tipoPagoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tipoPagoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tipoPagoTxt.setText("@");
        panelCentral.add(tipoPagoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, -1));
        panelCentral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 500, 10));

        bancoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        bancoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bancoTxt.setText("@");
        panelCentral.add(bancoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Banco:");
        panelCentral.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Tipo de Pago:");
        panelCentral.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        referenciaTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        referenciaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        referenciaTxt.setText("@");
        panelCentral.add(referenciaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Referencia:");
        panelCentral.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 80, -1));

        montoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        montoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        montoTxt.setText("@");
        panelCentral.add(montoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setText("Monto:");
        panelCentral.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Usuario:");
        panelCentral.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 80, -1));

        usuarioTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        usuarioTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarioTxt.setText("@");
        panelCentral.add(usuarioTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 120, -1));

        facturaBtn.setText("ver Factura...");
        facturaBtn.setContentAreaFilled(false);
        facturaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facturaBtn.setIconTextGap(0);
        facturaBtn.setMargin(new java.awt.Insets(2, 6, 2, 6));
        facturaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                facturaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                facturaBtnMouseExited(evt);
            }
        });
        facturaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaBtnActionPerformed(evt);
            }
        });
        panelCentral.add(facturaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 90, -1));

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(fondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void facturaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaBtnMouseEntered
        facturaBtn.setContentAreaFilled(true);
    }//GEN-LAST:event_facturaBtnMouseEntered

    private void facturaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facturaBtnMouseExited
      facturaBtn.setContentAreaFilled(false);
    }//GEN-LAST:event_facturaBtnMouseExited

    private void facturaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaBtnActionPerformed
        
        System.out.println("Facturas: "+kardex.getFacturas().size());
        System.out.println("Ventas: "+kardex.getVentas().size());
        
        VentaKardex vk;
        FacturaKardex fk = new FacturaKardex();
        if(kardex.getVentas().size()<1){
            vk = new VentaKardex();
        }else{
            vk=kardex.getVentas().get(0);
        }
        
        if(kardex.getFacturas().size()<1){
            fk = new FacturaKardex();
        }else{
            fk=kardex.getFacturas().get(0);
        }
        
        
        
        
        new verDetalleFactura(kardex,vk,fk).setVisible(true);
    }//GEN-LAST:event_facturaBtnActionPerformed

       

        

    

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
            java.util.logging.Logger.getLogger(verDetallePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verDetallePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verDetallePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verDetallePagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                new verDetallePagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bancoTxt;
    private javax.swing.JLabel estadoTxt;
    private javax.swing.JButton facturaBtn;
    private javax.swing.JLabel fechaTxt;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel idFacturaTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel montoTxt;
    private javax.swing.JLabel numFacturaTxt;
    private javax.swing.JPanel panelCentral;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    private javax.swing.JLabel referenciaTxt;
    private javax.swing.JLabel s;
    private javax.swing.JLabel tipoPagoTxt;
    private javax.swing.JLabel usuarioTxt;
    // End of variables declaration//GEN-END:variables

    public void max() {

        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

    }

    private void verDatos() {
        for(FacturaKardex fk : kardex.getFacturas()){
            if(fk.getId() == pago.getIdFacturaKardex()){
               idFacturaTxt.setText(fk.getId()+"");
                  numFacturaTxt.setText(fk.getNumFactura()); 
            }
        }
        estadoTxt.setText(pago.getEstado());
        fechaTxt.setText(pago.getFecha());
        tipoPagoTxt.setText(pago.getTipoPago());
        bancoTxt.setText(pago.getBanco());
        referenciaTxt.setText(pago.getReferenciaPago());
        montoTxt.setText(pago.getMontoPagado()+"");
        usuarioTxt.setText(pago.getUsuario());
        
        
    }
   
}
