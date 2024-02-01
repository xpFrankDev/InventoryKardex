/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Clases.KardexMovs;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Family
 */
public class panelPorcentaje extends javax.swing.JPanel {

    double total = 0.0;
    double movido = 0.0;
    int registros = 0;
    double valorBarra = 0;
    KardexMovs mov = new KardexMovs();

    public panelPorcentaje() {
        initComponents();
    }

    public panelPorcentaje(String producto, double total, double movido, int registros) {
        initComponents();
        this.nombreTxt.setText(producto);
        this.total = total;
        this.movido = movido;
        this.registros = registros;
        new Thread(this::ini).start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new rojeru_san.rsprogress.RSProgressCircle();
        jSeparator1 = new javax.swing.JSeparator();
        nombreTxt = new javax.swing.JLabel();
        rSPanelVector1 = new rojeru_san.rspanel.RSPanelVector();
        rSPanelVector2 = new rojeru_san.rspanel.RSPanelVector();
        registrosTxt = new javax.swing.JLabel();
        movidosTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(59, 59, 59));

        barra.setBackground(new java.awt.Color(0, 204, 204));
        barra.setForeground(new java.awt.Color(0, 204, 204));
        barra.setColorText(new java.awt.Color(0, 204, 204));
        barra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        barra.setIndeterminate(true);

        nombreTxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(255, 255, 255));
        nombreTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreTxt.setText("@Nombreproducto");

        rSPanelVector1.setBackground(new java.awt.Color(0, 204, 204));
        rSPanelVector1.setColorBorde(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout rSPanelVector1Layout = new javax.swing.GroupLayout(rSPanelVector1);
        rSPanelVector1.setLayout(rSPanelVector1Layout);
        rSPanelVector1Layout.setHorizontalGroup(
            rSPanelVector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        rSPanelVector1Layout.setVerticalGroup(
            rSPanelVector1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        rSPanelVector2.setBackground(new java.awt.Color(0, 204, 204));
        rSPanelVector2.setColorBorde(new java.awt.Color(0, 204, 204));

        registrosTxt.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        registrosTxt.setForeground(new java.awt.Color(51, 51, 51));
        registrosTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrosTxt.setText("Cantidad Movida");

        movidosTxt.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        movidosTxt.setForeground(new java.awt.Color(51, 51, 51));
        movidosTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movidosTxt.setText("Cantidad Movida");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cantidad Unidades Movidas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cantidad Generada");

        javax.swing.GroupLayout rSPanelVector2Layout = new javax.swing.GroupLayout(rSPanelVector2);
        rSPanelVector2.setLayout(rSPanelVector2Layout);
        rSPanelVector2Layout.setHorizontalGroup(
            rSPanelVector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
            .addGroup(rSPanelVector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelVector2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(rSPanelVector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(movidosTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(registrosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(27, Short.MAX_VALUE)))
        );
        rSPanelVector2Layout.setVerticalGroup(
            rSPanelVector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
            .addGroup(rSPanelVector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rSPanelVector2Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(rSPanelVector2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(rSPanelVector2Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(movidosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rSPanelVector2Layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(registrosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rSPanelVector2Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSPanelVector2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(223, 223, 223)
                            .addComponent(rSPanelVector1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(296, 296, 296)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(rSPanelVector1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(rSPanelVector2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsprogress.RSProgressCircle barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel movidosTxt;
    private javax.swing.JLabel nombreTxt;
    private rojeru_san.rspanel.RSPanelVector rSPanelVector1;
    private rojeru_san.rspanel.RSPanelVector rSPanelVector2;
    private javax.swing.JLabel registrosTxt;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        valorBarra = (movido * 100) / total;
        movidosTxt.setText(movido + "");
        registrosTxt.setText("S/. "+registros + "");
        new Thread(this::aumentarBarra).start();
        new Thread(this::aumentarPorcentaje).start();
    }

    private void aumentarBarra() {
        for (int i = 0; i <= valorBarra; i++) {
            barra.setValue(i);
            esperar();
        }
    }

    private void aumentarPorcentaje() {
        DecimalFormat df = new DecimalFormat("#.00");
        for (double i = 0.0; i <= valorBarra; i++) {
            barra.setString(i + "%");
            esperar();
        }
        String cc = df.format(valorBarra) + "%";
        barra.setString(valorBarra<1?"0"+cc:cc);
    }

    private void esperar() {
        try {
            Thread.sleep(33);
        } catch (InterruptedException ex) {
            Logger.getLogger(panelPorcentaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
