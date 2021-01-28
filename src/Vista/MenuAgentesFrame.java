package Vista;

import controlador.controladorCliente;
import javax.swing.JOptionPane;


/**
 *
 * @author Vaglio
 */
public class MenuAgentesFrame extends javax.swing.JFrame {

    
    public MenuAgentesFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnGestionCatalogo = new javax.swing.JButton();
        btnConsultaClientesInteresados = new javax.swing.JButton();
        btnRegistroBienInmueble = new javax.swing.JButton();
        btnFinSesion = new javax.swing.JButton();
        btnConsultaAvanzada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setText("Modulo de Agente de bienes raices");

        btnGestionCatalogo.setText("Gestion de Catalogo de Bienes Inmuebles");
        btnGestionCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionCatalogoActionPerformed(evt);
            }
        });

        btnConsultaClientesInteresados.setText("Consulta de Clientes Interesados");
        btnConsultaClientesInteresados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaClientesInteresadosActionPerformed(evt);
            }
        });

        btnRegistroBienInmueble.setText("Registrar un Nuevo Bien Inmueble");
        btnRegistroBienInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroBienInmuebleActionPerformed(evt);
            }
        });

        btnFinSesion.setText("Cerrar Sesion");
        btnFinSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinSesionActionPerformed(evt);
            }
        });

        btnConsultaAvanzada.setText("Busqueda Avanzada");
        btnConsultaAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaAvanzadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistroBienInmueble, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(btnConsultaAvanzada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsultaClientesInteresados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGestionCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblTitulo)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGestionCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroBienInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultaClientesInteresados, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnFinSesion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionCatalogoActionPerformed
        GestionCatalogoFrame ventana = new GestionCatalogoFrame();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionCatalogoActionPerformed

    private void btnConsultaClientesInteresadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaClientesInteresadosActionPerformed
        ConsultarClientesFrame ventana = new ConsultarClientesFrame();
        ConsultarClientesInteresadosFrame ventana2 = new ConsultarClientesInteresadosFrame();
        controladorCliente ctrl= new controladorCliente(ventana,ventana2);
        ctrl.IniciarInteresados();
        ventana2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaClientesInteresadosActionPerformed

    private void btnRegistroBienInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroBienInmuebleActionPerformed
        tipoPropiedadFrame ventana = new tipoPropiedadFrame();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroBienInmuebleActionPerformed

    private void btnFinSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinSesionActionPerformed
        LoginFrame ventana = new LoginFrame();
        ventana.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null, "Se ha cerrado la sesion");
    }//GEN-LAST:event_btnFinSesionActionPerformed

    private void btnConsultaAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaAvanzadaActionPerformed
        BusquedaAvanzadaFrame ventana = new BusquedaAvanzadaFrame();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaAvanzadaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAgentesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAgentesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAgentesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAgentesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAgentesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConsultaAvanzada;
    public javax.swing.JButton btnConsultaClientesInteresados;
    private javax.swing.JButton btnFinSesion;
    public javax.swing.JButton btnGestionCatalogo;
    public javax.swing.JButton btnRegistroBienInmueble;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
