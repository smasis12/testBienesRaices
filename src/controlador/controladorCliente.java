/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ConsultarClientesFrame;
import java.awt.event.ActionEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author Usuario
 */
public class controladorCliente {
    private ConsultarClientesFrame frmCliente= new ConsultarClientesFrame();

    public controladorCliente(ConsultarClientesFrame frmCliente) {
        this.frmCliente= frmCliente;
    }
    public void Iniciar() {

        frmCliente.setTitle("Agente");
        frmCliente.setLocationRelativeTo(null);
    }
    public void ActionPerformed(ActionEvent e){
        if(e.getSource()== frmCliente.btnDescargar){
            try {
                listar(frmCliente.tablaClientes);
            } catch (Exception ex) {
                System.out.println("otro error");
            }
            System.out.println("wsdfads");
 
            }
    }
    public void listar(JTable tabla) throws SQLException{
        Conexion conec1 = new Conexion();
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        dt.addColumn("Correo");
             

        String sql = "select * from UsuarioCliente";

        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conec1.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object fila[] = new Object[1];
                fila[0] = rs.getString(1);
             
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA OPERACION");

        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        for (int i = 0; i < 3; i++) {
            columnModel.getColumn(i).setPreferredWidth(400);
        }
    }

 
    public void generarQr(String id, String nombre, String ap, String correo, String tel) {

        String pb = "Informacion del agente: " + nombre + ap + "\n" + "id: " + id + "\n" + "correo: " + correo + "\n" + "telefono: " + tel;

        try {
            ByteArrayOutputStream out = QRCode.from(pb).to(ImageType.PNG).stream();
            String f_name = nombre;  //guarda el codigo qr con el nombre del agente 
            String Path_name = "C:\\QR\\";

            FileOutputStream fout = new FileOutputStream(new File(Path_name + (f_name + ".PNG")));
            fout.write(out.toByteArray());
            fout.flush();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
