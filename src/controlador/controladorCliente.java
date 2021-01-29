/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.ConsultarClientesFrame;
import Vista.ConsultarClientesInteresadosFrame;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author Usuario
 */
public class controladorCliente implements ActionListener {

    private ConsultarClientesFrame frmCliente = new ConsultarClientesFrame();
    private ConsultarClientesInteresadosFrame frmClientesInteresados = new ConsultarClientesInteresadosFrame();
    public static int idInteres = 1;

    public controladorCliente(ConsultarClientesFrame frmCliente, ConsultarClientesInteresadosFrame frmClientesInteresados) {
        this.frmCliente = frmCliente;
        this.frmCliente.btnDescargar.addActionListener(this);
        this.frmCliente.Excel.addActionListener(this);
        this.frmClientesInteresados = frmClientesInteresados;
        this.frmClientesInteresados.btnMostrar.addActionListener(this);
    }

    public void Iniciar() {

        frmCliente.setTitle("Agente");
        frmCliente.setLocationRelativeTo(null);
    }

    public void IniciarInteresados() {

        frmClientesInteresados.setTitle("Clientes interesados");
        frmClientesInteresados.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmCliente.btnDescargar) {
            try {
                listar(frmCliente.tablaClientes);
                System.out.println("lol");
            } catch (Exception ex) {
                System.out.println("otro error");
            }
            System.out.println("wsdfads");
        }
        if (e.getSource() == frmCliente.Excel) {
            try {
                exportarExcel(frmCliente.tablaClientes);
            } catch (IOException ex) {
                System.out.println("ërror");
            }
        }
        if (e.getSource() == frmClientesInteresados.btnMostrar) {
            try {
                ConsultarClientesInteresados(frmClientesInteresados.tablaClientes);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido mostrar la informacion");
            }
        }

    }

    public void listar(JTable tabla) throws SQLException {
        Conexion conec1 = new Conexion();
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        dt.addColumn("Correo");
        dt.addColumn("Telefono");

        String sql = "select u.correo, u.telefono\n"
                + "from UsuarioCliente uc join Usuario u on uc.correo = u.correo";

        ResultSet rs = null;
        PreparedStatement ps = null;

        try {
            ps = conec1.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object fila[] = new Object[2];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
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

    public void exportarExcel(JTable t) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Mi hoja de trabajo 1");
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }

    public void ConsultarClientesInteresados(JTable tabla) throws SQLException {
        Conexion conec1 = new Conexion();
        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("idInteres");
        dt.addColumn("Correo");
        dt.addColumn("Telefono");
        dt.addColumn("numFinca");
        dt.addColumn("Tipo Propiedad");

        int tipoPropiedad = frmClientesInteresados.cbxTipoPropiedad.getSelectedIndex() + 1;

        String sql = "select * from ConsultarClientesInteresados ('" + tipoPropiedad + "', '" + ControladorLogin.ag.getId() + "')";

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

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA OPERACION");

        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
        TableColumnModel columnModel = tabla.getColumnModel();
        for (int i = 0; i < 5; i++) {
            columnModel.getColumn(i).setPreferredWidth(400);
        }
    }
    
    
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

        String sql = "select * from ConsultaRangoPreciosClientes ('" + precioDesde + "', '" + PrecioHasta + "')";

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

}
