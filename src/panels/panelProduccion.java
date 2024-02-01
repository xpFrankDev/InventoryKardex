/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import javax.swing.table.DefaultTableModel;

public class panelProduccion extends javax.swing.JPanel {

    DefaultTableModel modelo;
    public panelProduccion() {
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesGroupRadio = new javax.swing.ButtonGroup();
        panelCentral = new javax.swing.JPanel();
        panelResumen = new rojeru_san.rspanel.RSPanelGradiente();
        jLabel1 = new javax.swing.JLabel();
        totalOperariosTxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        operariosAyerTxt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        operariosHoyTxt = new javax.swing.JLabel();
        panelRendimiento = new rojeru_san.rspanel.RSPanelGradiente();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panelFunciones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(59, 59, 59));

        panelCentral.setBackground(new java.awt.Color(59, 59, 59));

        panelResumen.setColorPrimario(new java.awt.Color(0, 102, 153));
        panelResumen.setColorSecundario(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total Oeprarios Registrados:");

        totalOperariosTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalOperariosTxt.setForeground(new java.awt.Color(255, 255, 255));
        totalOperariosTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalOperariosTxt.setText("@ ###");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Op. Laboraron Ayer");

        operariosAyerTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        operariosAyerTxt.setForeground(new java.awt.Color(255, 255, 255));
        operariosAyerTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        operariosAyerTxt.setText("@ ###");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Op. Laborando hoy");

        operariosHoyTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        operariosHoyTxt.setForeground(new java.awt.Color(255, 255, 255));
        operariosHoyTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        operariosHoyTxt.setText("@ ###");

        javax.swing.GroupLayout panelResumenLayout = new javax.swing.GroupLayout(panelResumen);
        panelResumen.setLayout(panelResumenLayout);
        panelResumenLayout.setHorizontalGroup(
            panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalOperariosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operariosAyerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operariosHoyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        panelResumenLayout.setVerticalGroup(
            panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResumenLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operariosHoyTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResumenLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(operariosAyerTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResumenLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalOperariosTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Rendimiento del");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("@Fecha");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("#1");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("#Nombre y Apellido");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cantidad");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("#2");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("#Nombre y Apellido");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cantidad");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("#3");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("#Nombre y Apellido");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Cantidad");

        javax.swing.GroupLayout panelRendimientoLayout = new javax.swing.GroupLayout(panelRendimiento);
        panelRendimiento.setLayout(panelRendimientoLayout);
        panelRendimientoLayout.setHorizontalGroup(
            panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRendimientoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelRendimientoLayout.setVerticalGroup(
            panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRendimientoLayout.createSequentialGroup()
                .addGroup(panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRendimientoLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRendimientoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRendimientoLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelRendimientoLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(0, 0, 0)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelRendimientoLayout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(0, 0, 0)
                                    .addGroup(panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6)
                                    .addGroup(panelRendimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(6, 6, 6))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        jButton1.setText("Agregar Operario");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_increase_32px_1.png"))); // NOI18N
        jButton2.setText("Ratio de los Trabajadores");
        jButton2.setToolTipText("Ratio de los Trabajadores");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelFuncionesLayout = new javax.swing.GroupLayout(panelFunciones);
        panelFunciones.setLayout(panelFuncionesLayout);
        panelFuncionesLayout.setHorizontalGroup(
            panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFuncionesLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelFuncionesLayout.setVerticalGroup(
            panelFuncionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "DNI", "Nombre y Apellido", "Área", "Estado"
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
        tabla.setBackgoundHover(new java.awt.Color(204, 204, 204));
        tabla.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tabla.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        tabla.setColorSecondary(new java.awt.Color(255, 255, 255));
        tabla.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        tabla.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla.setFontHead(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tabla.setFontRowHover(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(85);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(85);
            tabla.getColumnModel().getColumn(0).setMaxWidth(85);
            tabla.getColumnModel().getColumn(1).setMinWidth(130);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(130);
            tabla.getColumnModel().getColumn(1).setMaxWidth(155);
            tabla.getColumnModel().getColumn(3).setMinWidth(120);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(3).setMaxWidth(140);
            tabla.getColumnModel().getColumn(4).setMinWidth(110);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(110);
            tabla.getColumnModel().getColumn(4).setMaxWidth(140);
        }

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRendimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelFunciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(panelResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRendimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.ButtonGroup opcionesGroupRadio;
    private javax.swing.JLabel operariosAyerTxt;
    private javax.swing.JLabel operariosHoyTxt;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelFunciones;
    private rojeru_san.rspanel.RSPanelGradiente panelRendimiento;
    private rojeru_san.rspanel.RSPanelGradiente panelResumen;
    private rojerusan.RSTableMetro tabla;
    private javax.swing.JLabel totalOperariosTxt;
    // End of variables declaration//GEN-END:variables


}
