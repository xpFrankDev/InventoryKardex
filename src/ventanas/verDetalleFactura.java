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
import Panels.pagosPanel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import rojeru_san.complementos.RSUtilities;
import rojerusan.RSNotifyFade;


public class verDetalleFactura extends javax.swing.JFrame {

     Kardex kardex = new Kardex();
    FacturaKardex factura = new FacturaKardex();
    VentaKardex venta = new VentaKardex();
    DefaultTableModel modelo;
    public verDetalleFactura() {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
        modelo = (DefaultTableModel)tabla.getModel();
    }
 public verDetalleFactura(Kardex kardex,VentaKardex venta,FacturaKardex factura) {

        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        max();
        changeIcon();
        this.kardex=kardex;
        this.venta=venta;
        this.factura=factura;
        modelo = (DefaultTableModel)tabla.getModel();
        iniciarValores();
    }
   

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subClickPagos = new javax.swing.JPopupMenu();
        resumnePagos = new javax.swing.JMenuItem();
        fondoPanel = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();
        rSPanelGradiente1 = new rojeru_san.rspanel.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fechaTxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idKardex = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        montoNetoTxt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        montoIgvTxt = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JLabel();
        estadoTxt = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        cantPagosTxt = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        kardexBtn = new javax.swing.JButton();
        numFacturaTxt = new rojeru_san.rsfield.RSTextFullRound();
        rSButtonRippleShade1 = new RSComponentShade.RSButtonRippleShade();

        resumnePagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_online_payment_with_a_credit_card_20px_1.png"))); // NOI18N
        resumnePagos.setText("Ver Detalle de Pago");
        resumnePagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumnePagosActionPerformed(evt);
            }
        });
        subClickPagos.add(resumnePagos);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jLabel1.setText("DETALLE DE FACTURA");

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
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        rSPanelGradiente1Layout.setVerticalGroup(
            rSPanelGradiente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelGradiente1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelCentral.add(rSPanelGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        fechaTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        fechaTxt.setText("@");
        panelCentral.add(fechaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("Fecha:");
        panelCentral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Kardex #:");
        panelCentral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        idKardex.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        idKardex.setText("@");
        panelCentral.add(idKardex, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 80, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Pagos Registrados:");
        panelCentral.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));
        panelCentral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 680, 10));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("Monto Neto:");
        panelCentral.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        montoNetoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        montoNetoTxt.setText("@");
        panelCentral.add(montoNetoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 100, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("Monto Igv:");
        panelCentral.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        montoIgvTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        montoIgvTxt.setText("@");
        panelCentral.add(montoIgvTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 100, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("Total:");
        panelCentral.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        totalTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        totalTxt.setText("@");
        panelCentral.add(totalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 110, -1));

        estadoTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        estadoTxt.setText("@");
        panelCentral.add(estadoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 200, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Estado Factura:");
        panelCentral.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 200, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Tipo Pago", "Monto", "Referencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(75);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(75);
            tabla.getColumnModel().getColumn(0).setMaxWidth(75);
            tabla.getColumnModel().getColumn(1).setMinWidth(90);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(90);
            tabla.getColumnModel().getColumn(1).setMaxWidth(90);
        }

        panelCentral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 520, 200));

        cantPagosTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cantPagosTxt.setText("@");
        panelCentral.add(cantPagosTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel18.setText("# Factura:");
        panelCentral.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 108, -1, 30));

        kardexBtn.setFont(new java.awt.Font("Segoe UI", 2, 13)); // NOI18N
        kardexBtn.setText("ver Kardex...");
        kardexBtn.setContentAreaFilled(false);
        kardexBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kardexBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kardexBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kardexBtnMouseExited(evt);
            }
        });
        kardexBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kardexBtnActionPerformed(evt);
            }
        });
        panelCentral.add(kardexBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, -1));

        numFacturaTxt.setForeground(new java.awt.Color(0, 0, 0));
        numFacturaTxt.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        numFacturaTxt.setPlaceholder("Esperando Factura");
        panelCentral.add(numFacturaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 150, 30));

        rSButtonRippleShade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_save_36px.png"))); // NOI18N
        rSButtonRippleShade1.setBgHover(new java.awt.Color(0, 102, 102));
        rSButtonRippleShade1.setBgShade(new java.awt.Color(0, 102, 102));
        rSButtonRippleShade1.setBgShadeHover(new java.awt.Color(0, 102, 102));
        rSButtonRippleShade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRippleShade1ActionPerformed(evt);
            }
        });
        panelCentral.add(rSButtonRippleShade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 40, -1));

        javax.swing.GroupLayout fondoPanelLayout = new javax.swing.GroupLayout(fondoPanel);
        fondoPanel.setLayout(fondoPanelLayout);
        fondoPanelLayout.setHorizontalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoPanelLayout.setVerticalGroup(
            fondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
     int row = tabla.getSelectedRow();
     if(row >-1 && evt.getClickCount()  == 2){
         String idx = tabla.getValueAt(row, 0).toString();
         int id = Integer.valueOf(idx);
         for(PagoFacturaKardex px : kardex.getPagos()){
             if(id == px.getId()){
                 new verDetallePagos(kardex,px).setVisible(true);
             }
         }
         
        
     }
    }//GEN-LAST:event_tablaMouseClicked

    private void kardexBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kardexBtnMouseEntered
      kardexBtn.setContentAreaFilled(true);
    }//GEN-LAST:event_kardexBtnMouseEntered

    private void kardexBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kardexBtnMouseExited
      kardexBtn.setContentAreaFilled(false);
    }//GEN-LAST:event_kardexBtnMouseExited

    private void kardexBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kardexBtnActionPerformed
       new KardexFrame(kardex, "ver",false).setVisible(true);
    }//GEN-LAST:event_kardexBtnActionPerformed

    private void rSButtonRippleShade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRippleShade1ActionPerformed
       if(validarFactura()){
           double montoTotal = factura.getMontoTotal();
           double pagado = 0.0;
           String estado="";
           String numFac = numFacturaTxt.getText();
           for(PagoFacturaKardex p : kardex.getPagos()){
               pagado += p.getMontoPagado();
           }
           if(pagado == montoTotal){
               estado="Completado";
           }else if(pagado < montoTotal){
               estado="Factura subido - Pago Parcial";
           }else if(pagado == 0){
               estado="Factura subido - Falta Pago";
           }
          int r = new FacturaKardex().updateFactura(factura.getId(), numFac, estado);
          if(r>0){
              new rojerusan.RSNotifyFade("¡¡Factura Actualizada!! ", "se agregaron los datos al historial de la factura", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
              pagosPanel.activarFacturas();
              pagosPanel.iniValores();
              this.dispose();
          }else{
               new rojerusan.RSNotifyFade("¡¡Error!! ", "No se pudo actualizar la factura, contacte con el ADM", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
          }
       }
    }//GEN-LAST:event_rSButtonRippleShade1ActionPerformed

    private void resumnePagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumnePagosActionPerformed
         int row = tabla.getSelectedRow();
     if(row >-1){
         String idx = tabla.getValueAt(row, 0).toString();
         int id = Integer.valueOf(idx);
         for(PagoFacturaKardex px : kardex.getPagos()){
             if(id == px.getId()){
                 new verDetallePagos(kardex,px).setVisible(true);
             }
         }
         
        
     }
    }//GEN-LAST:event_resumnePagosActionPerformed

       

        

    

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
            java.util.logging.Logger.getLogger(verDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verDetalleFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

                new verDetalleFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cantPagosTxt;
    private javax.swing.JLabel estadoTxt;
    private javax.swing.JLabel fechaTxt;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel idKardex;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton kardexBtn;
    private javax.swing.JLabel montoIgvTxt;
    private javax.swing.JLabel montoNetoTxt;
    private rojeru_san.rsfield.RSTextFullRound numFacturaTxt;
    private javax.swing.JPanel panelCentral;
    private RSComponentShade.RSButtonRippleShade rSButtonRippleShade1;
    private rojeru_san.rspanel.RSPanelGradiente rSPanelGradiente1;
    private javax.swing.JMenuItem resumnePagos;
    private javax.swing.JPopupMenu subClickPagos;
    private rojerusan.RSTableMetro tabla;
    private javax.swing.JLabel totalTxt;
    // End of variables declaration//GEN-END:variables

    public void max() {

        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

    }

    private void iniciarValores() {
       if(factura.getId()<1){
           kardexBtn.setVisible(false);
           jLabel1.setText("No registra datos de Factura");
       } else{
           fechaTxt.setText(factura.getFecha());
        idKardex.setText(kardex.getId()+"");
        numFacturaTxt.setText(factura.getNumFactura());
        montoNetoTxt.setText(factura.getMontoNeto()+"");
        montoIgvTxt.setText(factura.getMontoIgv()+"");
        totalTxt.setText(factura.getMontoTotal()+"");
        estadoTxt.setText(factura.getEstado());
        int cont=0;
        for(PagoFacturaKardex pagox : kardex.getPagos()){
            modelo.addRow(new Object[]{
                  pagox.getId(),pagox.getFecha(),pagox.getTipoPago(),
                pagox.getMontoPagado(),pagox.getReferenciaPago()
            });
            cont++;
        }
        cantPagosTxt.setText(cont+"");
       }
        
        
        
    }

    private boolean validarFactura() {
        if(numFacturaTxt.getText().length()<0){
           new rojerusan.RSNotifyFade("¡¡Factura Vacia!! ", "Debe ingresar valor de Factura", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            return false;
        }else{
            return true;
        }
    }
   
}
