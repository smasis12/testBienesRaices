
package Vista;

/**
 *
 * @author USUARIO
 */
public class RegistrarNuevaCasaFrame extends javax.swing.JFrame {

    /** Creates new form RegistrarNuevoLoteFrame */
    public RegistrarNuevaCasaFrame() {
        initComponents();
        
        cbxModalidad.addItem("Venta");
        cbxModalidad.addItem("Alquiler");
        
        cbxProvincias.addItem("San Jose");
        cbxProvincias.addItem("Cartago");
        cbxProvincias.addItem("Alajuela");
        cbxProvincias.addItem("Heredia");
        cbxProvincias.addItem("Pintarenas");
        cbxProvincias.addItem("Guanacaste");
        cbxProvincias.addItem("Limon");
        
        cbxEstilo.addItem("Gotico");
        cbxEstilo.addItem("Contemporaneo");
        cbxEstilo.addItem("Barroco");
        cbxEstilo.addItem("Modernista");
        cbxEstilo.addItem("Art-Deco");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUbicacionExacta = new javax.swing.JTextArea();
        lblNumFinca = new javax.swing.JLabel();
        lblValorMetro2 = new javax.swing.JLabel();
        lblAreaTerreno = new javax.swing.JLabel();
        lblValorFiscal = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblDistrito = new javax.swing.JLabel();
        lblCanton = new javax.swing.JLabel();
        lblModalidad = new javax.swing.JLabel();
        lblCantNiveles = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnAgregarImagen = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtNumFinca = new javax.swing.JTextField();
        txtAreaTerreno = new javax.swing.JTextField();
        txtValorMetro2 = new javax.swing.JTextField();
        txtValorFiscal = new javax.swing.JTextField();
        txtCanton = new javax.swing.JTextField();
        cbxProvincias = new javax.swing.JComboBox<>();
        cbxModalidad = new javax.swing.JComboBox<>();
        cbxEstilo = new javax.swing.JComboBox<>();
        lblEstilo = new javax.swing.JLabel();
        txtAreaConstruccion = new javax.swing.JTextField();
        lblAreaConstruccion = new javax.swing.JLabel();
        txtDistrito = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtAreaConstruccion1 = new javax.swing.JTextField();
        txtCantidadNiveles = new javax.swing.JTextField();
        lblAñoConstruccion = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(19, 221, 178));

        txtUbicacionExacta.setColumns(20);
        txtUbicacionExacta.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txtUbicacionExacta.setRows(5);
        jScrollPane1.setViewportView(txtUbicacionExacta);

        lblNumFinca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumFinca.setText("Numero de Finca");

        lblValorMetro2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorMetro2.setText("Valor por metro cuadrado");

        lblAreaTerreno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAreaTerreno.setText("Area del terreno");

        lblValorFiscal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorFiscal.setText("Valor Fiscal");

        lblUbicacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUbicacion.setText("Ubicacion Exacta ");

        lblProvincia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProvincia.setText("Provincia");

        lblDistrito.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDistrito.setText("Distrito");

        lblCanton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCanton.setText("Canton");

        lblModalidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblModalidad.setText("Modalidad");

        lblCantNiveles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCantNiveles.setText("Cantidad de Niveles");

        lblTitulo.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblTitulo.setText("Registro de Nueva Casa");

        btnAgregarImagen.setText("Adjuntar Imagen...");

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtNumFinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFincaActionPerformed(evt);
            }
        });

        txtAreaTerreno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtValorMetro2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtValorFiscal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorFiscalActionPerformed(evt);
            }
        });

        txtCanton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantonActionPerformed(evt);
            }
        });

        cbxProvincias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProvinciasActionPerformed(evt);
            }
        });

        cbxEstilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstiloActionPerformed(evt);
            }
        });

        lblEstilo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEstilo.setText("Estilo Construccion");

        txtAreaConstruccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAreaConstruccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaConstruccionActionPerformed(evt);
            }
        });

        lblAreaConstruccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAreaConstruccion.setText("Area de Construccion");

        lblColor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblColor.setText("Color");

        txtAreaConstruccion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAreaConstruccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaConstruccion1ActionPerformed(evt);
            }
        });

        txtCantidadNiveles.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadNiveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadNivelesActionPerformed(evt);
            }
        });

        lblAñoConstruccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAñoConstruccion.setText("Año de Construcción");

        txtColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lblNumFinca))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lblValorFiscal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(lblEstilo)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(lblColor)
                                .addGap(219, 219, 219)
                                .addComponent(lblModalidad)
                                .addGap(220, 220, 220))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblAreaTerreno)
                                        .addGap(468, 468, 468))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblAreaConstruccion)
                                                .addGap(116, 116, 116))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAreaConstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnAgregarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(96, 96, 96)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtValorMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblValorMetro2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(lblCantNiveles))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtCanton, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbxModalidad, javax.swing.GroupLayout.Alignment.LEADING, 0, 172, Short.MAX_VALUE)
                                                .addComponent(txtCantidadNiveles, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addGap(161, 161, 161))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lblAñoConstruccion)
                .addGap(192, 192, 192)
                .addComponent(lblProvincia)
                .addGap(205, 205, 205)
                .addComponent(lblCanton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblUbicacion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAreaConstruccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbxEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtValorFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txtNumFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(txtAreaTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblDistrito)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaTerreno)
                            .addComponent(lblValorMetro2)
                            .addComponent(lblNumFinca))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAreaTerreno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaConstruccion)
                            .addComponent(lblValorFiscal)
                            .addComponent(lblCantNiveles))
                        .addGap(20, 20, 20)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAreaConstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadNiveles, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstilo)
                    .addComponent(lblColor)
                    .addComponent(lblModalidad))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAñoConstruccion)
                    .addComponent(lblProvincia)
                    .addComponent(lblCanton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAreaConstruccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxProvincias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCanton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lblDistrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(lblUbicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrar)
                        .addComponent(btnVolver))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        tipoPropiedadFrame ventana = new tipoPropiedadFrame();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbxProvinciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProvinciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProvinciasActionPerformed

    private void txtAreaConstruccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaConstruccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaConstruccionActionPerformed

    private void txtCantonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantonActionPerformed

    private void txtNumFincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumFincaActionPerformed

    private void cbxEstiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstiloActionPerformed

    private void txtAreaConstruccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaConstruccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaConstruccion1ActionPerformed

    private void txtCantidadNivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadNivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadNivelesActionPerformed

    private void txtValorFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorFiscalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorFiscalActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarNuevaCasaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevaCasaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevaCasaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarNuevaCasaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarNuevaCasaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarImagen;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxEstilo;
    private javax.swing.JComboBox<String> cbxModalidad;
    private javax.swing.JComboBox<String> cbxProvincias;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAreaConstruccion;
    private javax.swing.JLabel lblAreaTerreno;
    private javax.swing.JLabel lblAñoConstruccion;
    private javax.swing.JLabel lblCantNiveles;
    private javax.swing.JLabel lblCanton;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDistrito;
    private javax.swing.JLabel lblEstilo;
    private javax.swing.JLabel lblModalidad;
    private javax.swing.JLabel lblNumFinca;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblValorFiscal;
    private javax.swing.JLabel lblValorMetro2;
    private javax.swing.JTextField txtAreaConstruccion;
    private javax.swing.JTextField txtAreaConstruccion1;
    private javax.swing.JTextField txtAreaTerreno;
    private javax.swing.JTextField txtCantidadNiveles;
    private javax.swing.JTextField txtCanton;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtNumFinca;
    private javax.swing.JTextArea txtUbicacionExacta;
    private javax.swing.JTextField txtValorFiscal;
    private javax.swing.JTextField txtValorMetro2;
    // End of variables declaration//GEN-END:variables

}
