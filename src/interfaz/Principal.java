/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author baltamar3
 */
public class Principal extends javax.swing.JFrame {

    DefaultTableModel tm, tm2;

    public Principal() {
        initComponents();
        JButton botonesA[] = {cmdCrear, cmdLimpiar};
        JButton botonesB[] = {cmdAutomatico, cmdManual, cmdOperacion};
        Helper.habilitarBotones(botonesA);
        Helper.deshabilitarBotones(botonesB);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumFilas = new javax.swing.JTextField();
        txtNumColumnas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbOperacion = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("OPERACIONES CON MATRICES ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Principales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("N° De Filas:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("N° De Columnas:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        txtNumFilas.setBackground(new java.awt.Color(204, 255, 204));
        txtNumFilas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNumFilas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumFilas.setDoubleBuffered(true);
        txtNumFilas.setSelectionColor(new java.awt.Color(255, 0, 0));
        jPanel2.add(txtNumFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 60, 20));

        txtNumColumnas.setBackground(new java.awt.Color(204, 255, 204));
        txtNumColumnas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNumColumnas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumColumnas.setSelectionColor(new java.awt.Color(255, 0, 0));
        jPanel2.add(txtNumColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 360, 60));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setBackground(new java.awt.Color(204, 255, 204));
        cmdCrear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));

        cmdManual.setBackground(new java.awt.Color(204, 255, 204));
        cmdManual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, -1));

        cmdAutomatico.setBackground(new java.awt.Color(204, 255, 204));
        cmdAutomatico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdAutomatico.setText("Automatico");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        cmdOperacion.setBackground(new java.awt.Color(204, 255, 204));
        cmdOperacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        cmdLimpiar.setBackground(new java.awt.Color(204, 255, 204));
        cmdLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 70, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 470, 60));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 360, 330));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 360, 330));

        cmbOperacion.setBackground(new java.awt.Color(204, 255, 204));
        cmbOperacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Promedio", "Trinagular inferior", "Tabla de ajedrez", "Recorrido 1", "Recorrido 2" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 160, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultados.setColumns(20);
        txtResultados.setRows(5);
        jScrollPane1.setViewportView(txtResultados);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 700, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 760, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int nf, nc;
        int sw = 1;

        if (txtNumFilas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Ingrese el numero de filas Por favor", 1);
            txtNumFilas.requestFocusInWindow();
            sw = 0;
        } else if (txtNumColumnas.getText().trim().isEmpty()) {
            Helper.mensaje(this, "Ingrese el numero de Colummnas Por favor", 1);
            txtNumColumnas.requestFocusInWindow();
            sw = 0;
        } else {
            try {
                nf = Integer.parseInt(txtNumFilas.getText());
            } catch (NumberFormatException ex) {
                Helper.mensaje(this, "Error Parametro NO valido", 3);
                txtNumFilas.requestFocusInWindow();
                txtNumFilas.selectAll();
                sw = 0;
            }
            try {
                nc = Integer.parseInt(txtNumColumnas.getText());
            } catch (NumberFormatException ex) {
                Helper.mensaje(this, "Error Parametro NO valido", 3);
                txtNumColumnas.requestFocusInWindow();
                txtNumColumnas.selectAll();
                sw = 0;
            }
        }

        if (sw == 1) {
            // limita al usuario a crar una matriz de minimo 2 filas ya que si acepta 1 como fila seria un vector
            if (Integer.parseInt(txtNumFilas.getText()) < 5) {
                Helper.mensaje(this, "El numero de filas debe ser un numero impar mayor ó igual a 5", 1);
                txtNumFilas.requestFocusInWindow();
                txtNumFilas.selectAll();
            } else if (Integer.parseInt(txtNumColumnas.getText()) < 5) {
                Helper.mensaje(this, "El numero de columnas debe ser un numero impar mayor ó igual a 5", 1);
                txtNumColumnas.requestFocusInWindow();
                txtNumColumnas.selectAll();
            } else if (Integer.parseInt(txtNumColumnas.getText()) != Integer.parseInt(txtNumFilas.getText())) {
                Helper.mensaje(this, "El numero de filas debe ser igual al numero de columnas ", 1);

            } else {
                nf = Integer.parseInt(txtNumFilas.getText());
                nc = Integer.parseInt(txtNumColumnas.getText());

                tm = (DefaultTableModel) tblTablaInicial.getModel();
                tm2 = (DefaultTableModel) tblTablaResultado.getModel();

                tm.setRowCount(nf);
                tm.setColumnCount(nc);

                tm2.setRowCount(nf);
                tm2.setColumnCount(nc);

                JButton botonesA[] = {cmdAutomatico, cmdManual, cmdLimpiar};
                JButton botonesB[] = {cmdCrear, cmdOperacion};
                Helper.habilitarBotones(botonesA);
                Helper.deshabilitarBotones(botonesB);

            }

        }


    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        int nf, nc, n, res, sw, sw2 = 0;

        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    sw2 = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero Entero en la posicion " + "Fila: " + i + " columna: " + j).trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException ex) {
                        Helper.mensaje(this, "Error Parametro NO valido", 3);
                        sw = 0;
                    } catch (NullPointerException ex) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea Salir?", "ADvertencia", JOptionPane.YES_NO_OPTION);

                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;
                            sw2 = 0;

                            Helper.porDefectoTabla(tblTablaInicial);
                            Helper.porDefectoTabla(tblTablaResultado);

                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);

            }
        }
        if (sw2 == 0) {
            JButton botonesA[] = {cmdCrear, cmdLimpiar};
            JButton botonesB[] = {cmdManual, cmdAutomatico, cmdOperacion};
            Helper.habilitarBotones(botonesA);
            Helper.deshabilitarBotones(botonesB);
        } else {
            JButton botonesA[] = {cmdOperacion, cmdLimpiar};
            JButton botonesB[] = {cmdManual, cmdAutomatico};
            Helper.habilitarBotones(botonesA);
            Helper.deshabilitarBotones(botonesB);
        }
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed

        Helper.llenadoAutomatico(tblTablaInicial);
        JButton botonesA[] = {cmdOperacion, cmdLimpiar};
        JButton botonesB[] = {cmdAutomatico, cmdManual};
        Helper.habilitarBotones(botonesA);
        Helper.deshabilitarBotones(botonesB);

    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int nf, nc, op;
        op = cmbOperacion.getSelectedIndex();

        nf = tm.getRowCount();
        nc = tm.getColumnCount();
        tm2.setColumnCount(nc);
        tm2.setRowCount(nf);
        Helper.limpiadoTabla(tblTablaResultado);

        switch (op) {
            case 0:
                txtResultados.setText(Helper.promedio(tblTablaInicial));
                break;
            case 1:
                Helper.triangularInferiro(tblTablaInicial, tblTablaResultado);
                break;
            case 2:
                if (nf % 2 != 0 && nc % 2 != 0) {
                    Helper.TablaDeAjedrez(tblTablaInicial, tblTablaResultado);
                } else {
                    Helper.mensaje(this, "Operacion NO valida, intentelo con una matriz nxn, n debe ser impar", 3);
                }
                break;
            case 3:
                txtResultados.setText(Helper.recorridoUno(tblTablaInicial));
                break;
            case 4:
                if (nf % 2 != 0 && nc % 2 != 0) {
                    txtResultados.setText(Helper.recorridoDos(tblTablaInicial));
                } else {
                    Helper.mensaje(this, "Operacion NO valida, intentelo con una matriz nxn, n debe ser impar", 3);
                }
                break;
        }
        JButton botonesA[] = {cmdOperacion, cmdLimpiar};
        JButton botonesB[] = {cmdCrear};
        Helper.habilitarBotones(botonesA);
        Helper.deshabilitarBotones(botonesB);

    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNumFilas.setText("");
        txtNumColumnas.setText("");
        txtNumFilas.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);

        JButton botonesA[] = {cmdCrear, cmdLimpiar};
        JButton botonesB[] = {cmdManual, cmdAutomatico, cmdOperacion};
        Helper.habilitarBotones(botonesA);
        Helper.deshabilitarBotones(botonesB);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNumColumnas;
    private javax.swing.JTextField txtNumFilas;
    private javax.swing.JTextArea txtResultados;
    // End of variables declaration//GEN-END:variables
}
