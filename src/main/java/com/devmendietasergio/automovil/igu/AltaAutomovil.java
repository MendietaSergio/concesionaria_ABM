package com.devmendietasergio.automovil.igu;

import com.devmendietasergio.automovil.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class AltaAutomovil extends javax.swing.JFrame {

    Controladora control = new Controladora();

    public AltaAutomovil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtCantPuertas = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jAgregar = new javax.swing.JButton();
        jLimpiar1 = new javax.swing.JButton();
        txtColor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("ALTA DE AUTOMOVILES");

        jLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\vieja\\OneDrive\\Documentos\\NetBeansProjects\\automovil\\chevrolet.png")); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel35.setText("Modelo:");

        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel36.setText("Marca:");

        txtMotor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setText("Color:");

        txtPatente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Patente:");

        txtCantPuertas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel40.setText("Cant. Puertas:");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setText("Motor:");

        jAgregar.setText("Agregar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jLimpiar1.setText("Limpiar");
        jLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiar1ActionPerformed(evt);
            }
        });

        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel38))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtMotor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(526, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(450, Short.MAX_VALUE)
                    .addComponent(jLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String motor = txtMotor.getText();
        String color = txtColor.getText();
        String patente = txtPatente.getText();
        int cantPuertas = Integer.parseInt(txtCantPuertas.getText());

        control.agregarAutomovil(modelo, marca, motor, color, patente, cantPuertas);
        mostrarMensaje("Agregado correctamente", "Info", "Guardado Exitoso!");
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiar1ActionPerformed
        txtModelo.setText("");
        txtMarca.setText("");
        txtMotor.setText("");
        txtColor.setText("");
        txtPatente.setText("");
        txtCantPuertas.setText("");
        mostrarMensaje("Campos limpiados correctamente", "Info", "Limpiado!");
    }//GEN-LAST:event_jLimpiar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAgregar;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JButton jLimpiar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantPuertas;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

}
