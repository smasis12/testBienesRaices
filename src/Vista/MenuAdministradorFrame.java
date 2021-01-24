package Vista;

import Modelo.Agente;
import Modelo.ConsultaBienesRaices;
import static controlador.Conexion.getConexion;
import controlador.ControladorAgente;
import java.sql.Connection;
import javax.swing.JOptionPane;


/**
 *
 * @author Vaglio
 */
public class MenuAdministradorFrame extends javax.swing.JFrame {

    
    public MenuAdministradorFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnConsultaAgentes = new javax.swing.JButton();
        btnConsultaClientes = new javax.swing.JButton();
        btnRegistroAgentes = new javax.swing.JButton();
        lblSesion = new javax.swing.JLabel();
        lblNombreSesion = new javax.swing.JLabel();
        btnFinSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Modulo de Administrador");

        btnConsultaAgentes.setText("Consultar agentes de Bienes Raices");
        btnConsultaAgentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaAgentesActionPerformed(evt);
            }
        });

        btnConsultaClientes.setText("Consulta de Clientes");
        btnConsultaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaClientesActionPerformed(evt);
            }
        });

        btnRegistroAgentes.setText("Registrar un nuevo agente de ventas");
        btnRegistroAgentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAgentesActionPerformed(evt);
            }
        });

        lblSesion.setText("Sesion de: ");

        btnFinSesion.setText("Cerrar Sesion");
        btnFinSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblSesion)
                .addGap(18, 18, 18)
                .addComponent(lblNombreSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(btnFinSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnRegistroAgentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultaAgentes, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnConsultaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultaAgentes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistroAgentes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnConsultaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombreSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnFinSesion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaAgentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaAgentesActionPerformed
        Agente agente= new Agente();
       ConsultaBienesRaices consultas = new ConsultaBienesRaices();
       RegistrarAgenteFrame frmRegistrar= new RegistrarAgenteFrame(); 
       ConsultarAgentesFrame frmConsultar= new ConsultarAgentesFrame();
       
       
       ControladorAgente ctrl = new ControladorAgente(agente, consultas, frmRegistrar, frmConsultar);
       ctrl.IniciarConsulta();
       frmConsultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaAgentesActionPerformed

    private void btnConsultaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaClientesActionPerformed
        ConsultarClientesFrame ventana = new ConsultarClientesFrame();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultaClientesActionPerformed

    private void btnRegistroAgentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAgentesActionPerformed
       Agente agente= new Agente();
       ConsultaBienesRaices consultas = new ConsultaBienesRaices();
       RegistrarAgenteFrame frmRegistrar= new RegistrarAgenteFrame(); 
       ConsultarAgentesFrame frmConsultar= new ConsultarAgentesFrame();
       
       
       ControladorAgente ctrl = new ControladorAgente(agente, consultas, frmRegistrar, frmConsultar);
       ctrl.Iniciar();
       frmRegistrar.setVisible(true);
       
       
        this.dispose();
    }//GEN-LAST:event_btnRegistroAgentesActionPerformed

    private void btnFinSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinSesionActionPerformed
        LoginFrame ventana = new LoginFrame();
        ventana.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null, "Se ha cerrado la sesion");
    }//GEN-LAST:event_btnFinSesionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdministradorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministradorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministradorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministradorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministradorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConsultaAgentes;
    public javax.swing.JButton btnConsultaClientes;
    private javax.swing.JButton btnFinSesion;
    public javax.swing.JButton btnRegistroAgentes;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblNombreSesion;
    private javax.swing.JLabel lblSesion;
    // End of variables declaration//GEN-END:variables
}
