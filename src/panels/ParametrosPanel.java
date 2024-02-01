/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

public class ParametrosPanel extends javax.swing.JPanel {

    panelParametroColor ppColor = new panelParametroColor();
    panelParametroTallas ppTalla = new panelParametroTallas();
    panelParametroTipoUnidad ppUnidad = new panelParametroTipoUnidad();
    panelParametroTela ppTela = new panelParametroTela();
    panelParametroFamilia ppFamilia = new panelParametroFamilia();
    panelParametroArea ppArea = new panelParametroArea();
    panelParametroCliente ppCliente = new panelParametroCliente();
    panelParametroProcesoProduccion ppProcesos = new panelParametroProcesoProduccion();

    public ParametrosPanel() {
        initComponents();
        btn1.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        btn1 = new RSComponentShade.RSButtonRippleShade();
        jLabel2 = new javax.swing.JLabel();
        btn3 = new RSComponentShade.RSButtonRippleShade();
        btn5 = new RSComponentShade.RSButtonRippleShade();
        btn4 = new RSComponentShade.RSButtonRippleShade();
        btn7 = new RSComponentShade.RSButtonRippleShade();
        btn2 = new RSComponentShade.RSButtonRippleShade();
        btn6 = new RSComponentShade.RSButtonRippleShade();
        btn8 = new RSComponentShade.RSButtonRippleShade();

        setBackground(new java.awt.Color(59, 59, 59));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Parámetros");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(58, 58, 58));
        btn1.setText("Color");
        btn1.setBgHover(new java.awt.Color(255, 255, 255));
        btn1.setBgShade(new java.awt.Color(255, 255, 255));
        btn1.setBgShadeHover(new java.awt.Color(59, 59, 59));
        btn1.setFgHover(new java.awt.Color(59, 59, 59));
        btn1.setTypeBorder(RSComponentShade.RSButtonRippleShade.TYPEBORDER.ROUND);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_conversion_24px_1.png"))); // NOI18N

        btn3.setBackground(new java.awt.Color(58, 58, 58));
        btn3.setText("Tipo unidad");
        btn3.setBgHover(new java.awt.Color(255, 255, 255));
        btn3.setBgShade(new java.awt.Color(255, 255, 255));
        btn3.setBgShadeHover(new java.awt.Color(59, 59, 59));
        btn3.setFgHover(new java.awt.Color(59, 59, 59));
        btn3.setTypeBorder(RSComponentShade.RSButtonRippleShade.TYPEBORDER.ROUND);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(58, 58, 58));
        btn5.setText("Familia");
        btn5.setBgHover(new java.awt.Color(255, 255, 255));
        btn5.setBgShade(new java.awt.Color(255, 255, 255));
        btn5.setBgShadeHover(new java.awt.Color(59, 59, 59));
        btn5.setFgHover(new java.awt.Color(59, 59, 59));
        btn5.setTypeBorder(RSComponentShade.RSButtonRippleShade.TYPEBORDER.ROUND);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(58, 58, 58));
        btn4.setText("Tela");
        btn4.setBgHover(new java.awt.Color(255, 255, 255));
        btn4.setBgShade(new java.awt.Color(255, 255, 255));
        btn4.setBgShadeHover(new java.awt.Color(59, 59, 59));
        btn4.setFgHover(new java.awt.Color(59, 59, 59));
        btn4.setTypeBorder(RSComponentShade.RSButtonRippleShade.TYPEBORDER.ROUND);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(58, 58, 58));
        btn7.setText("Clientes");
        btn7.setBgHover(new java.awt.Color(255, 255, 255));
        btn7.setBgShade(new java.awt.Color(255, 255, 255));
        btn7.setBgShadeHover(new java.awt.Color(59, 59, 59));
        btn7.setFgHover(new java.awt.Color(59, 59, 59));
        btn7.setTypeBorder(RSComponentShade.RSButtonRippleShade.TYPEBORDER.ROUND);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(58, 58, 58));
        btn2.setText("Talla");
        btn2.setBgHover(new java.awt.Color(255, 255, 255));
        btn2.setBgShade(new java.awt.Color(255, 255, 255));
        btn2.setBgShadeHover(new java.awt.Color(59, 59, 59));
        btn2.setFgHover(new java.awt.Color(59, 59, 59));
        btn2.setTypeBorder(RSComponentShade.RSButtonRippleShade.TYPEBORDER.ROUND);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(58, 58, 58));
        btn6.setText("Areas");
        btn6.setBgHover(new java.awt.Color(255, 255, 255));
        btn6.setBgShade(new java.awt.Color(255, 255, 255));
        btn6.setBgShadeHover(new java.awt.Color(59, 59, 59));
        btn6.setFgHover(new java.awt.Color(59, 59, 59));
        btn6.setTypeBorder(RSComponentShade.RSButtonRippleShade.TYPEBORDER.ROUND);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(58, 58, 58));
        btn8.setText("Procesos Producción");
        btn8.setBgHover(new java.awt.Color(255, 255, 255));
        btn8.setBgShade(new java.awt.Color(255, 255, 255));
        btn8.setBgShadeHover(new java.awt.Color(59, 59, 59));
        btn8.setFgHover(new java.awt.Color(59, 59, 59));
        btn8.setTypeBorder(RSComponentShade.RSButtonRippleShade.TYPEBORDER.ROUND);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
            .addComponent(jScrollPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        botonear(1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        botonear(2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        botonear(3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        botonear(4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        botonear(5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        botonear(6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        botonear(7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       botonear(8);
    }//GEN-LAST:event_btn8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSComponentShade.RSButtonRippleShade btn1;
    private RSComponentShade.RSButtonRippleShade btn2;
    private RSComponentShade.RSButtonRippleShade btn3;
    private RSComponentShade.RSButtonRippleShade btn4;
    private RSComponentShade.RSButtonRippleShade btn5;
    private RSComponentShade.RSButtonRippleShade btn6;
    private RSComponentShade.RSButtonRippleShade btn7;
    private RSComponentShade.RSButtonRippleShade btn8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables

    public void botonear(int valor) {

        switch (valor) {
            case 1:
                btn1.setSelected(true);
                btn2.setSelected(false);
                btn3.setSelected(false);
                btn4.setSelected(false);
                btn5.setSelected(false);
                btn6.setSelected(false);
                btn7.setSelected(false);
                btn8.setSelected(false);
                jScrollPane.setViewportView(ppColor);
                break;
            case 2:
                btn1.setSelected(false);
                btn2.setSelected(true);
                btn3.setSelected(false);
                btn4.setSelected(false);
                btn5.setSelected(false);
                btn6.setSelected(false);
                btn7.setSelected(false);
                btn8.setSelected(false);
                jScrollPane.setViewportView(ppTalla);
                break;
            case 3:
                btn1.setSelected(false);
                btn2.setSelected(false);
                btn3.setSelected(true);
                btn4.setSelected(false);
                btn5.setSelected(false);
                btn6.setSelected(false);
                btn7.setSelected(false);
                btn8.setSelected(false);
                jScrollPane.setViewportView(ppUnidad);
                break;
            case 4:
                btn1.setSelected(false);
                btn2.setSelected(false);
                btn3.setSelected(false);
                btn4.setSelected(true);
                btn5.setSelected(false);
                btn6.setSelected(false);
                btn7.setSelected(false);
                btn8.setSelected(false);
                jScrollPane.setViewportView(ppTela);
                break;
            case 5:
                btn1.setSelected(false);
                btn2.setSelected(false);
                btn3.setSelected(false);
                btn4.setSelected(false);
                btn5.setSelected(true);
                btn6.setSelected(false);
                btn7.setSelected(false);
                btn8.setSelected(false);
                jScrollPane.setViewportView(ppFamilia);
                break;
            case 6:
                btn1.setSelected(false);
                btn2.setSelected(false);
                btn3.setSelected(false);
                btn4.setSelected(false);
                btn5.setSelected(false);
                btn6.setSelected(true);
                btn7.setSelected(false);
                btn8.setSelected(false);
                jScrollPane.setViewportView(ppArea);

                break;
            case 7:
                btn1.setSelected(false);
                btn2.setSelected(false);
                btn3.setSelected(false);
                btn4.setSelected(false);
                btn5.setSelected(false);
                btn6.setSelected(false);
                btn7.setSelected(true);
                btn8.setSelected(false);
                jScrollPane.setViewportView(ppCliente);
                break;
                 case 8:
                btn1.setSelected(false);
                btn2.setSelected(false);
                btn3.setSelected(false);
                btn4.setSelected(false);
                btn5.setSelected(false);
                btn6.setSelected(false);
                btn7.setSelected(false);
                btn8.setSelected(true);
                jScrollPane.setViewportView(ppProcesos);
                break;
        }

    }

    public void iniciar(boolean agregar, boolean editar) {
        new Thread(ppColor::llenarColores).start();;
        ppTalla.llenarTallas("");
        ppUnidad.llenarUnidades("");
        new Thread(ppTela::llenarTelas).start();
        ppFamilia.llenarFamilia("");
        new Thread(ppArea::llenarClasePrincipal).start();
        ppProcesos.llenarProcesos("");

        ppColor.nuevoBtn.setEnabled(agregar);
        ppTalla.nuevoBtn.setEnabled(agregar);
        ppUnidad.nuevoBtn.setEnabled(agregar);
        ppTela.nuevoBtn.setEnabled(agregar);
        ppFamilia.nuevoBtn.setEnabled(agregar);
        ppArea.nuevoBtn.setEnabled(agregar);
        ppCliente.nuevoBtn.setEnabled(agregar);
        ppProcesos.nuevoBtn.setEnabled(agregar);
        
        ppColor.editarBtn.setEnabled(editar);
        ppTalla.editarBtn.setEnabled(editar);
        ppUnidad.editarBtn.setEnabled(editar);
        ppTela.editarBtn.setEnabled(editar);
        ppFamilia.editarBtn.setEnabled(editar);
        ppArea.editarBtn.setEnabled(editar);
        ppCliente.editarBtn.setEnabled(agregar);
        ppProcesos.editarBtn.setEnabled(agregar);
        
        ppColor.agregar=agregar;
        ppTalla.agregar=agregar;
        ppUnidad.agregar=agregar;
        ppTela.agregar=agregar;
        ppFamilia.agregar=agregar;
        ppArea.agregar=agregar;
        ppCliente.agregar=agregar;
        ppProcesos.agregar=agregar;
                
        ppColor.editar=editar;
        ppTalla.editar=editar;
        ppUnidad.editar=editar;
        ppTela.editar=editar;
        ppFamilia.editar=editar;
        ppArea.editar=editar;
         ppCliente.editar=editar;
         ppProcesos.editar=editar;
    }

    public void setAgregar(boolean llave) {

    }

    public void setModificar(boolean llave) {

    }

}