/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Clases.Articulo;
import Clases.ConectarCloudcPanel;
import Clases.ProductoKardex;
import Panels.InventarioPanel;
import static Panels.InventarioPanel.vaciarTabla;
import Panels.KardexPanel;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojeru_san.complementos.RSUtilities;
import rojerusan.RSNotifyFade;

public class ListarArticulosxKardex extends javax.swing.JFrame {

    static ArrayList<Articulo> k = new ArrayList();
    int valor = 0;

    public ListarArticulosxKardex() {
        initComponents();
        changeIcon();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.panelCentral, 150);
        max();
        valorTxt.requestFocus();
        new Thread(this::iniTabla).start();
    }

    public ListarArticulosxKardex(int valorx) {
        initComponents();
        changeIcon();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.panelCentral, 150);
        max();
        valorTxt.requestFocus();
        new Thread(this::iniTabla).start();
        this.valor = valorx;
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valorTxt = new rojeru_san.rsfield.RSTextFullRound();
        rSButtonEffect1 = new rojeru_san.rsbutton.RSButtonEffect();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        rSButtonEffect2 = new rojeru_san.rsbutton.RSButtonEffect();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelCentral.setBackground(new java.awt.Color(0, 0, 0));

        panelContenido.setBackground(new java.awt.Color(59, 59, 59));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Filtre por Articulo o código:");

        valorTxt.setBackground(new java.awt.Color(59, 59, 59));
        valorTxt.setForeground(new java.awt.Color(194, 232, 255));
        valorTxt.setToolTipText("Solo puede buscar Articulos Activos.");
        valorTxt.setBorderColor(new java.awt.Color(194, 232, 255));
        valorTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        valorTxt.setPhColor(new java.awt.Color(194, 232, 255));
        valorTxt.setPlaceholder("Descripción de Articulo");

        rSButtonEffect1.setBackground(new java.awt.Color(59, 59, 59));
        rSButtonEffect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_search_32px.png"))); // NOI18N
        rSButtonEffect1.setToolTipText("Buscar articulo por el texto ingresado");
        rSButtonEffect1.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonEffect1.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        rSButtonEffect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonEffect1ActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Código", "Descripción", "Talla", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setBackgoundHead(new java.awt.Color(148, 34, 36));
        tabla.setBackgoundHover(new java.awt.Color(139, 183, 240));
        tabla.setColorBorderHead(new java.awt.Color(59, 59, 59));
        tabla.setColorBorderRows(new java.awt.Color(59, 59, 59));
        tabla.setColorSecondary(new java.awt.Color(255, 255, 255));
        tabla.setGridColor(new java.awt.Color(59, 59, 59));
        tabla.setSelectionBackground(new java.awt.Color(194, 232, 255));
        tabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(60);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(60);
            tabla.getColumnModel().getColumn(0).setMaxWidth(60);
            tabla.getColumnModel().getColumn(1).setMinWidth(95);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(95);
            tabla.getColumnModel().getColumn(1).setMaxWidth(95);
            tabla.getColumnModel().getColumn(2).setMinWidth(140);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(140);
            tabla.getColumnModel().getColumn(3).setMinWidth(85);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(85);
            tabla.getColumnModel().getColumn(3).setMaxWidth(85);
            tabla.getColumnModel().getColumn(4).setMinWidth(110);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(110);
            tabla.getColumnModel().getColumn(4).setMaxWidth(110);
        }

        rSButtonEffect2.setBackground(new java.awt.Color(59, 59, 59));
        rSButtonEffect2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_checkmark_32px.png"))); // NOI18N
        rSButtonEffect2.setToolTipText("Buscar articulo por el texto ingresado");
        rSButtonEffect2.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonEffect2.setEfecto(rojeru_san.rsbutton.RSButtonEffect.EFECTO.RIPPLE);
        rSButtonEffect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonEffect2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELECCIONE ARTICULO QUE DESEA GENERAR UN MOVIMIENTO");

        javax.swing.GroupLayout panelContenidoLayout = new javax.swing.GroupLayout(panelContenido);
        panelContenido.setLayout(panelContenidoLayout);
        panelContenidoLayout.setHorizontalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelContenidoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(valorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSButtonEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(rSButtonEffect2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelContenidoLayout.setVerticalGroup(
            panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButtonEffect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonEffect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setContentAreaFilled(true);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setContentAreaFilled(false);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void rSButtonEffect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonEffect1ActionPerformed
        String valor = valorTxt.getText();
        llenarTabla(valor);
    }//GEN-LAST:event_rSButtonEffect1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if (evt.getClickCount() == 1) {

        } else if (evt.getClickCount() == 2 && tabla.getSelectedRow() > -1) {
            getValores();
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void rSButtonEffect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonEffect2ActionPerformed
        if (tabla.getSelectedRow() > -1) {
            getValores();
        }
    }//GEN-LAST:event_rSButtonEffect2ActionPerformed

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
            java.util.logging.Logger.getLogger(ListarArticulosxKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarArticulosxKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarArticulosxKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarArticulosxKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarArticulosxKardex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelContenido;
    private rojeru_san.rsbutton.RSButtonEffect rSButtonEffect1;
    private rojeru_san.rsbutton.RSButtonEffect rSButtonEffect2;
    public static rojerusan.RSTableMetro tabla;
    private rojeru_san.rsfield.RSTextFullRound valorTxt;
    // End of variables declaration//GEN-END:variables

    public void max() {

        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

    }

    private void iniTabla() {
        llenarTabla("");
    }

    public static void llenarTabla(String text) {

            vaciarTabla();
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            k = (ArrayList) new Articulo().ConsInventarioxCodyNombrexEstado(text, "Activo").clone();

            for (Articulo km : k) {
                modelo.addRow(new Object[]{
                    km.getId(), km.getCodigo(), km.getNombre(),
                    km.getTalla(), km.getStock()
                });
            }

            if (modelo.getRowCount() == 0) {
                modelo.addRow(new Object[]{
                    "", "Sin resultados"
                });
            }
       
    }

    private void getValores() {
         String codigox = tabla.getValueAt(tabla.getSelectedRow(), 1).toString();
            String nombrex = tabla.getValueAt(tabla.getSelectedRow(), 2).toString();
            String stockx = tabla.getValueAt(tabla.getSelectedRow(), 4).toString();
        if (valor == 0) {
           
        } else {
            boolean llave = KardexFrame.validarProducto(codigox);
            if(llave==false){
                for (Articulo km : k) {
                if (km.getCodigo().equals(codigox)) {
                    ProductoKardex a = new ProductoKardex();
                    a.setCodigo(codigox);
                    a.setNombre(km.getNombre());
                    a.setPrecioRegistrado(km.getPrecioSigv());
                    
                    KardexFrame.setProductoTemporal(a,km.getStock()+"");
                }
            }
                this.dispose();
            }else{
                new rojerusan.RSNotifyFade("¡¡Producto ya Agregado!!", "No puede elejir 2 veces el mismo producto, seleccione otro", 5,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
            }
        }

        
    }

}
