/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Agente;
import Modelo.ConsultaBienesRaices;
import Vista.ConsultarAgentesFrame;
import Vista.RegistrarAgenteFrame;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import controlador.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ControladorAgente implements ActionListener {

    private Agente agente;
    private ConsultaBienesRaices consultas;
    private RegistrarAgenteFrame frmRegistrar;
    private ConsultarAgentesFrame frmConsultar;
    private DefaultTableModel modelo= new DefaultTableModel();

    public ControladorAgente() {

    }

    public ControladorAgente(Agente agente, ConsultaBienesRaices consultas, RegistrarAgenteFrame frmRegistrar, ConsultarAgentesFrame frmConsultar) {
        this.agente = agente;
        this.consultas = consultas;
        this.frmRegistrar = frmRegistrar;
        this.frmConsultar = frmConsultar; 
        this.frmRegistrar.btnRegistrar.addActionListener(this);   
        this.frmConsultar.btnMostrar.addActionListener(this);
        this.frmRegistrar.btnRegistrar.addActionListener(this);
    }
    
    public void Iniciar() {

        frmRegistrar.setTitle("Agente");
        frmRegistrar.setLocationRelativeTo(null);
    }
        public void IniciarConsulta(){
     
        frmConsultar.setTitle("Agente");
        frmConsultar.setLocationRelativeTo(null);
    }

    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmRegistrar.btnRegistrar) {
            if (ControladorAgente.isNumeric(frmRegistrar.txtId.getText()) && ControladorAgente.isNumeric(frmRegistrar.txtNumTelefono.getText()) ){
                agente.setCorreo(frmRegistrar.txtCorreo.getText());
                agente.setApellido(frmRegistrar.txtApellido.getText());
                agente.setNombre(frmRegistrar.txtNombre.getText());
                agente.setTelefono(Integer.parseInt((frmRegistrar.txtNumTelefono.getText())));
                agente.setId(Integer.parseInt((frmRegistrar.txtId.getText())));
            
            if (consultas.registrarAgente(agente)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Presione volver para regresar al menu anterior");
            }
        }
            else{
                JOptionPane.showMessageDialog(null, "Favor ingresar los datos correctos");
            }}
     else if(e.getSource()== frmConsultar.btnMostrar){
            try {
                listar(frmConsultar.tablaAgentes);
            } catch (Exception ex) {
                System.out.println("Por favor, ingrese los datos correctos");
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
        dt.addColumn("identificacion");  
        dt.addColumn("Nombre");
        dt.addColumn("Apellido");
        dt.addColumn("Correo");
             

        String sql = "select * from UsuarioAgente";

        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conec1.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object fila[] = new Object[4];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                dt.addRow(fila);
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
    
    
        //Para Busqueda Avanzada por Precios
    public void visualizarBusquedaPrecios(JTable tabla, String precioDesde, String PrecioHasta) {
        Conexion conec1 = new Conexion();

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dt.addColumn("Num Finca");
        dt.addColumn("Valor Metro^2");
        dt.addColumn("Valor Fiscal");
        //dt.addColumn("Modalidad");       

        String sql = "select * from ConsultaRangoPrecios ('" + precioDesde + "', '" + PrecioHasta + "')";

        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conec1.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object fila[] = new Object[3];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                dt.addRow(fila);
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

    //PROVINCIAS
    public void visualizarBusquedaProvincia(JTable tabla, int Provincia) {
        Conexion conec1 = new Conexion();

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dt.addColumn("Num Finca");
        dt.addColumn("Valor Metro^2");
        dt.addColumn("Valor Fiscal");
        dt.addColumn("Area Terreno");
        dt.addColumn("Id Provincia");

        String sql = "select * from ConsultaPorProvincia ('" + Provincia + "')";

        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conec1.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object fila[] = new Object[5];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                dt.addRow(fila);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA OPERACION");

        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        for (int i = 0; i < 5; i++) {
            columnModel.getColumn(i).setPreferredWidth(400);
        }
    }

    //TipoPropiedad
    public void visualizarBusquedaTipoPropiedad(JTable tabla, int TipoPropiedad) {
        Conexion conec1 = new Conexion();

        ResultSet rs = null;
        PreparedStatement ps = null;

        TableColumnModel columnModel = null;

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("Num Finca");
        dt.addColumn("Valor Metro^2");
        dt.addColumn("Valor Fiscal");
        dt.addColumn("Area Terreno");
        dt.addColumn("Tipo de propiedad");

        switch (TipoPropiedad) {
            case 0:
                JOptionPane.showMessageDialog(null, "Seleccione un tipo de propiedad");
                break;
            case 1:
                System.out.println("entro");
                String lbl = "Lote";
                String sql = "select * from ConsultaPorTipoPropiedadLote ('" + TipoPropiedad + "')";

                try {
                    ps = Conexion.getConexion().prepareStatement(sql);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        Object fila[] = new Object[5];
                        fila[0] = rs.getString(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getString(4);
                        fila[4] = lbl;
                        dt.addRow(fila);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR EN LA OPERACION");

                }
                tabla.setModel(dt);
                tabla.setRowHeight(60);
                columnModel = tabla.getColumnModel();
            /*for (int i = 0; i < 5; i++) {
                    columnModel.getColumn(i).setPreferredWidth(400);
                }
                break; */
            case 2:
                System.out.println("entro en 2");
                /*DefaultTableModel dt1 = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                dt1.addColumn("Num Finca");
                dt1.addColumn("Valor Metro^2");
                dt1.addColumn("Valor Fiscal");
                dt1.addColumn("Area Terreno");
                dt1.addColumn("Tipo de propiedad"); */

                String lbl1 = "Casa";
                String sql1 = "select * from ConsultaPorTipoPropiedadCasa ('" + TipoPropiedad + "')";

                try {
                    ps = conec1.getConexion().prepareStatement(sql1);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        Object fila[] = new Object[5];
                        fila[0] = rs.getString(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getString(4);
                        fila[4] = lbl1;
                        dt.addRow(fila);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR EN LA OPERACION");

                }
                tabla.setModel(dt);
                tabla.setRowHeight(60);
                columnModel = tabla.getColumnModel();
                for (int i = 0; i < 5; i++) {
                    columnModel.getColumn(i).setPreferredWidth(400);
                }
                break;
            case 3:
                /*DefaultTableModel dt2 = new DefaultTableModel() {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                };
                dt2.addColumn("Num Finca");
                dt2.addColumn("Valor Metro^2");
                dt2.addColumn("Valor Fiscal");
                dt2.addColumn("Area Terreno");
                dt2.addColumn("Tipo de propiedad"); */

                String lbl2 = "Apartamento";
                String sql2 = "select * from ConsultaPorTipoPropiedadLote ('" + TipoPropiedad + "')";

                try {
                    ps = conec1.getConexion().prepareStatement(sql2);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        Object fila[] = new Object[5];
                        fila[0] = rs.getString(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getString(4);
                        fila[4] = lbl2;
                        dt.addRow(fila);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR EN LA OPERACION");

                }
                tabla.setModel(dt);
                tabla.setRowHeight(60);
                columnModel = tabla.getColumnModel();
                for (int i = 0; i < 5; i++) {
                    columnModel.getColumn(i).setPreferredWidth(400);
                }
                break;
            case 4:
                System.out.println("entro");
                String lbl3 = "Centro Comercial";
                String sql3 = "select * from ConsultaPorTipoPropiedadCentroComercial ('" + TipoPropiedad + "')";

                try {
                    ps = Conexion.getConexion().prepareStatement(sql3);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        Object fila[] = new Object[5];
                        fila[0] = rs.getString(1);
                        fila[1] = rs.getString(2);
                        fila[2] = rs.getString(3);
                        fila[3] = rs.getString(4);
                        fila[4] = lbl3;
                        dt.addRow(fila);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR EN LA OPERACION");

                }
                tabla.setModel(dt);
                tabla.setRowHeight(60);
                columnModel = tabla.getColumnModel();
                for (int i = 0; i < 5; i++) {
                    columnModel.getColumn(i).setPreferredWidth(400);
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Error");
        }

    }

}
