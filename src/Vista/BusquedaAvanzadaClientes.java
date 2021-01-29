/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.ControladorAgente;
import controlador.ControladorLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class BusquedaAvanzadaClientes extends javax.swing.JFrame {

    /**
     * Creates new form BusquedaAvanzadaFrame
     */
    public BusquedaAvanzadaClientes() {
        initComponents();
        //System.out.println(ControladorLogin.ag.getCorreo());

        cbxModalidad.addItem("venta");
        cbxModalidad.addItem("alquiler");

        cbxProvincias.addItem("San Jose");
        cbxProvincias.addItem("Cartago");
        cbxProvincias.addItem("Alajuela");
        cbxProvincias.addItem("Heredia");
        cbxProvincias.addItem("Puntarenas");
        cbxProvincias.addItem("Guanacaste");
        cbxProvincias.addItem("Limon");

        cbxTipoPropiedad.addItem("Lote");
        cbxTipoPropiedad.addItem("Casa");
        cbxTipoPropiedad.addItem("Apartamento");
        cbxTipoPropiedad.addItem("Centro Comercial");
    }

    public void limpiarTabla() {
        tablaConsultas.removeAll();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblTipoPropiedad = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblModalidadPropiedad = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        cbxModalidad = new javax.swing.JComboBox<>();
        lblPrecioDesde = new javax.swing.JLabel();
        lblPrecioHasta = new javax.swing.JLabel();
        txtPrecioDesde = new javax.swing.JTextField();
        txtPrecioHasta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultas = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnBuscar3 = new javax.swing.JButton();
        cbxTipoPropiedad = new javax.swing.JComboBox<>();
        cbxProvincias = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnSolicitarficha = new javax.swing.JButton();
        txtComentario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setText("Consulta Avanzada - Catalogo");

        lblTipoPropiedad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTipoPropiedad.setText("Tipo de propiedad");

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setText("Precio");

        lblModalidadPropiedad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblModalidadPropiedad.setText("Modalidad de la propiedad");

        lblProvincia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProvincia.setText("Provincias");

        cbxModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        lblPrecioDesde.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecioDesde.setText("Desde");

        lblPrecioHasta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecioHasta.setText("Hasta");

        txtPrecioHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioHastaActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaConsultas);

        btnBuscar1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar1.setText("Ver detalle...");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVolver.setText("volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnBuscar3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar3.setText("Seleccionar");
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });

        cbxTipoPropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cbxProvincias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jButton1.setText("Me interesa esta propiedad ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSolicitarficha.setText("Solicitar ficha de propiedad");
        btnSolicitarficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarfichaActionPerformed(evt);
            }
        });

        txtComentario.setText("Agrega aquí un comentario sobre la propiedad");
        txtComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComentarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModalidadPropiedad)
                                    .addComponent(lblTipoPropiedad))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxTipoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(395, 395, 395)
                                .addComponent(lblPrecioDesde))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(335, 335, 335)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProvincia)
                                    .addComponent(lblPrecio))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrecioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(lblPrecioHasta)
                                .addGap(18, 18, 18)
                                .addComponent(txtPrecioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(81, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnVolver)
                                        .addGap(242, 242, 242)
                                        .addComponent(btnSolicitarficha)
                                        .addGap(103, 103, 103)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addComponent(btnBuscar3)
                                .addGap(35, 35, 35)
                                .addComponent(btnBuscar1)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTipoPropiedad)
                                    .addComponent(cbxTipoPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPrecioDesde)
                                    .addComponent(lblPrecioHasta)
                                    .addComponent(txtPrecioDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblProvincia)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblModalidadPropiedad)
                                .addComponent(cbxModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblPrecio)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar1)
                            .addComponent(btnBuscar3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(txtComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnSolicitarficha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioHastaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtPrecioHasta.getText().equals("") == false || txtPrecioDesde.getText().equals("") == false) {
            controlador.ControladorAgente tabla_consulta1_agente = new ControladorAgente();
            tabla_consulta1_agente.visualizarBusquedaPrecios(tablaConsultas, txtPrecioDesde.getText(), txtPrecioHasta.getText() /*idTienda*/);
        } else {
            //JOptionPane.showMessageDialog(null, "Ingrese los precios de forma completa");

            if (cbxProvincias.getSelectedIndex() != 0) {
                ControladorAgente tabla_consultaProvincia_agente = new ControladorAgente();
                tabla_consultaProvincia_agente.visualizarBusquedaProvincia(tablaConsultas, cbxProvincias.getSelectedIndex());
            } else {
                if (cbxTipoPropiedad.getSelectedIndex() != 0) {
                    ControladorAgente tabla_consultaTipoPropiedad_agente = new ControladorAgente();
                    tabla_consultaTipoPropiedad_agente.visualizarBusquedaTipoPropiedad(tablaConsultas, cbxTipoPropiedad.getSelectedIndex());

                } else {
                    if (cbxModalidad.getSelectedItem().equals("venta") || cbxModalidad.getSelectedItem().equals("alquiler")) {
                        ControladorAgente tabla_consultaTipoModalidad = new ControladorAgente();
                        tabla_consultaTipoModalidad.visualizarBusquedaPorModalidad(tablaConsultas, cbxModalidad.getSelectedIndex());
                    }
                }
            }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuAgentesFrame ventana = new MenuAgentesFrame();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Mostraste interes en esta propiedad");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComentarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComentarioActionPerformed

    private void btnSolicitarfichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarfichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSolicitarfichaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BusquedaAvanzadaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaAvanzadaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaAvanzadaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelblTipoPropiedad ex) {
            java.util.logging.Logger.getLogger(BusquedaAvanzadaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaAvanzadaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnBuscar1;
    public javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnSolicitarficha;
    public javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxModalidad;
    private javax.swing.JComboBox<String> cbxProvincias;
    private javax.swing.JComboBox<String> cbxTipoPropiedad;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblModalidadPropiedad;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecioDesde;
    private javax.swing.JLabel lblPrecioHasta;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTipoPropiedad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaConsultas;
    private javax.swing.JTextField txtComentario;
    private javax.swing.JTextField txtPrecioDesde;
    private javax.swing.JTextField txtPrecioHasta;
    // End of variables declaration//GEN-END:variables
}
