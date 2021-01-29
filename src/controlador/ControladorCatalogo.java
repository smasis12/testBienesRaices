package controlador;

import Modelo.Apartamento;
import Modelo.Casa;
import Modelo.CentroComercial;
import Modelo.ConsultaBienesRaices;
import Modelo.Lote;
import Modelo.Nivel;
import Vista.GestionCatalogoFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author USUARIO
 */
public class ControladorCatalogo implements ActionListener {
    
    

    Lote lote = new Lote();
    Casa casa = new Casa();
    Apartamento apartamento = new Apartamento();
    //public static Apartamento apartamento = new Apartamento();
    //Nivel nivel = new Nivel();
    CentroComercial CentroC = new CentroComercial();
    ConsultaBienesRaices controladorP = new ConsultaBienesRaices();

    GestionCatalogoFrame frmGestionCatalago = new GestionCatalogoFrame();

    public ControladorCatalogo(Lote pLote, Casa pCasa, Apartamento pApartamento, CentroComercial pCentroC,
            ConsultaBienesRaices pConsultaBienesRaices, GestionCatalogoFrame pGestionCatalogo) {

        this.lote = pLote;
        this.casa = pCasa;
        this.apartamento = pApartamento;
        this.CentroC = pCentroC;
        this.frmGestionCatalago = pGestionCatalogo;


        this.frmGestionCatalago.btnMostrarGestionLotes.addActionListener(this);
        this.frmGestionCatalago.btnMostrarGestionCasas.addActionListener(this);
        this.frmGestionCatalago.btnMostrarApartamentos.addActionListener(this);
        this.frmGestionCatalago.btnMostrarCentrosC.addActionListener(this);
    }

    public void iniciar() {
        frmGestionCatalago.setTitle("Gestion Catalogo");
        frmGestionCatalago.setLocationRelativeTo(null);
    }

    public void visualizarLotesCatalogo(JTable tabla, int idAgente) {
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
        dt.addColumn("Area Terreno");
        dt.addColumn("Valor Metro2");
        dt.addColumn("Valor Fiscal");
        dt.addColumn("Modalidad");

        String sql = "select * from ConsultarTablaLote ('" + idAgente + "')";

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
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCatalogo.class.getName()).log(Level.SEVERE, null, ex);
        }

        tabla.setModel(dt);
        tabla.setRowHeight(60);
        columnModel = tabla.getColumnModel();
        for (int i = 0; i < 5; i++) {
            columnModel.getColumn(i).setPreferredWidth(400);
        }
    }
    
    
    public void visualizarCasasCatalogo(JTable tabla, int idAgente) {
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
        dt.addColumn("Area Terreno");
        dt.addColumn("Area Construccion");
        dt.addColumn("Valor Metro2");
        dt.addColumn("Valor Fiscal");
        dt.addColumn("Cantidad Niveles");
        dt.addColumn("Color");
        dt.addColumn("Estilo");
        dt.addColumn("Modalidad");

        String sql = "select * from ConsultarTablaCasa ('" + idAgente + "')";

        try {
            ps = conec1.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object fila[] = new Object[9];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                fila[6] = rs.getString(7);
                fila[7] = rs.getString(8);
                fila[8] = rs.getString(9);
                dt.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCatalogo.class.getName()).log(Level.SEVERE, null, ex);
        }

        tabla.setModel(dt);
        tabla.setRowHeight(60);
        columnModel = tabla.getColumnModel();
        for (int i = 0; i < 9; i++) {
            columnModel.getColumn(i).setPreferredWidth(60);
        }
    }
    
    public void visualizarApartamentosCatalogo(JTable tabla, int idAgente) {
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
        dt.addColumn("Area Terreno");
        dt.addColumn("Area Construccion");
        dt.addColumn("Valor Metro2");
        dt.addColumn("Valor Fiscal");
        dt.addColumn("piscina");
        dt.addColumn("Area Parqueo");
        dt.addColumn("Estilo");
        dt.addColumn("Modalidad");
        
        String sql = "select * from ConsultarTablaApartamento ('" + idAgente + "')";

        try {
            ps = conec1.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object fila[] = new Object[9];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                fila[6] = rs.getString(7);
                fila[7] = rs.getString(8);
                fila[8] = rs.getString(9);
                dt.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCatalogo.class.getName()).log(Level.SEVERE, null, ex);
        }

        tabla.setModel(dt);
        tabla.setRowHeight(60);
        columnModel = tabla.getColumnModel();
        for (int i = 0; i < 9; i++) {
            columnModel.getColumn(i).setPreferredWidth(60);
        }
    }
    
    
    public void visualizarCentrosCCatalogo(JTable tabla, int idAgente) {
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
        dt.addColumn("Area Terreno");
        dt.addColumn("Area Construccion");
        dt.addColumn("Valor Metro2");
        dt.addColumn("Valor Fiscal");
        dt.addColumn("Cadena Cines");
        dt.addColumn("Cantidad Salas");
        dt.addColumn("Cantidad Tiendas");
        dt.addColumn("Cantidad Hotspot");
        dt.addColumn("Cantidad Escaleras");
        dt.addColumn("Espacios para personas con movilidad reducida");
        dt.addColumn("Estilo");
        dt.addColumn("Modalidad");
        
        String sql = "select * from ConsultarTablaCentroC ('" + idAgente + "')";

        try {
            ps = conec1.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object fila[] = new Object[13];
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                fila[6] = rs.getString(7);
                fila[7] = rs.getString(8);
                fila[8] = rs.getString(9);
                fila[9] = rs.getString(10);
                fila[10] = rs.getString(11);
                fila[11] = rs.getString(12);
                fila[12] = rs.getString(13);
                dt.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControladorCatalogo.class.getName()).log(Level.SEVERE, null, ex);
        }

        tabla.setModel(dt);
        tabla.setRowHeight(60);
        columnModel = tabla.getColumnModel();
        for (int i = 0; i < 13; i++) {
            columnModel.getColumn(i).setPreferredWidth(60);
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frmGestionCatalago.btnMostrarGestionLotes) {
            visualizarLotesCatalogo(frmGestionCatalago.tablaLotes, ControladorLogin.ag.getId());
        } 
        if (e.getSource() == frmGestionCatalago.btnMostrarGestionCasas){
            visualizarCasasCatalogo(frmGestionCatalago.tablaCasas, ControladorLogin.ag.getId());
        }
        if(e.getSource() == frmGestionCatalago.btnMostrarApartamentos){
            visualizarApartamentosCatalogo(frmGestionCatalago.tablaApartamentos, ControladorLogin.ag.getId());
        }
        if(e.getSource() == frmGestionCatalago.btnMostrarCentrosC){
            visualizarCentrosCCatalogo(frmGestionCatalago.tablaCentrosComerciales, ControladorLogin.ag.getId());
        }
    } 

}
