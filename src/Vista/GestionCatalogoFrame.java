package Vista;

import Animacion.Animacion;
import controlador.Conexion;
import static controlador.Conexion.getConexion;
import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionCatalogoFrame extends javax.swing.JFrame {

    Conexion conexionBD = new Conexion();
    Connection conn = Conexion.getConexion();

    //General
    public int numFinca;
    public int areaT;
    public int valorMetro;
    public int valorFiscal;
    public int modalidad;

    //Especificos
    public int areaC;
    public int cantNiveles;
    public String estiloC;
    public String color;
    public String piscina;
    public int areaParqueo;
    public String cadenaCines;
    public int cantTiendas;
    public int cantSalasCine;
    public int cantHotspot;
    public int cantEscaleras;
    public int cantEspaciosE;

    public static ResultSet resultado;

    public GestionCatalogoFrame() {
        initComponents();

        //LOTES
        cbxModalidadGestionLotes.addItem("venta");
        cbxModalidadGestionLotes.addItem("alquiler");

        // CASAS
        cbxModalidadGestionCasas.addItem("venta");
        cbxModalidadGestionCasas.addItem("alquiler");
        cbxEstiloCasas.addItem("gotico");
        cbxEstiloCasas.addItem("contemporaneo");
        cbxEstiloCasas.addItem("barroco");
        cbxEstiloCasas.addItem("modernista");
        cbxEstiloCasas.addItem("art-deco");

        //APARTAMENTOS
        cbxModalidadApartamentos.addItem("venta");
        cbxModalidadApartamentos.addItem("alquiler");
        cbxEstiloApartamentos.addItem("gotico");
        cbxEstiloApartamentos.addItem("contemporaneo");
        cbxEstiloApartamentos.addItem("barroco");
        cbxEstiloApartamentos.addItem("modernista");
        cbxEstiloApartamentos.addItem("art-deco");
        cbxPiscina.addItem("si");
        cbxPiscina.addItem("no");

        //CentroComercial
        cbxModalidadCentroC.addItem("venta");
        cbxModalidadCentroC.addItem("alquiler");
        cbxEstiloCentroC.addItem("gotico");
        cbxEstiloCentroC.addItem("contemporaneo");
        cbxEstiloCentroC.addItem("barroco");
        cbxEstiloCentroC.addItem("modernista");
        cbxEstiloCentroC.addItem("art-deco");
    }

    void limpiarLotes() {
        txtAreaTerrenoGestionLotes.setText("");
        txtValorMetro2GestionLotes.setText("");
        txtValorFiscalGestionLotes.setText("");
        txtNumFincaGestionLotes.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JPanel();
        GestionLotes = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaLotes = new javax.swing.JTable();
        lblModalidad = new javax.swing.JLabel();
        lblNumFinca = new javax.swing.JLabel();
        lblAreaTerreno = new javax.swing.JLabel();
        lblValorFiscal = new javax.swing.JLabel();
        txtNumFincaGestionLotes = new javax.swing.JTextField();
        txtAreaTerrenoGestionLotes = new javax.swing.JTextField();
        txtValorFiscalGestionLotes = new javax.swing.JTextField();
        lblValorMetro2 = new javax.swing.JLabel();
        txtValorMetro2GestionLotes = new javax.swing.JTextField();
        btnModificarGestionLotes = new javax.swing.JButton();
        btnSeleccionarGestionLotes = new javax.swing.JButton();
        btnVerCasas = new javax.swing.JButton();
        btnVolverGestionLotes = new javax.swing.JButton();
        btnEliminarGestionLotes = new javax.swing.JButton();
        cbxModalidadGestionLotes = new javax.swing.JComboBox();
        btnMostrarGestionLotes = new javax.swing.JButton();
        GestionCasas = new javax.swing.JPanel();
        btnVolverGestionCasas = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCasas = new javax.swing.JTable();
        lblTitulo1 = new javax.swing.JLabel();
        txtAreaConstruccionGestionCasas = new javax.swing.JTextField();
        lblAreaTerreno1 = new javax.swing.JLabel();
        lblAreaConstruccion = new javax.swing.JLabel();
        lblValorFiscal1 = new javax.swing.JLabel();
        txtCantidadNivelesGestionCasas = new javax.swing.JTextField();
        lblCantNiveles = new javax.swing.JLabel();
        txtNumFincaGestionCasas = new javax.swing.JTextField();
        txtAreaTerrenoGestionCasas = new javax.swing.JTextField();
        txtValorMetro2GestionCasas = new javax.swing.JTextField();
        txtValorFiscalGestionCasas = new javax.swing.JTextField();
        lblNumFinca1 = new javax.swing.JLabel();
        lblValorMetro3 = new javax.swing.JLabel();
        lblEstilo = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblModalidad1 = new javax.swing.JLabel();
        txtColorGestionCasas = new javax.swing.JTextField();
        btnSeleccionarGestionCasas = new javax.swing.JToggleButton();
        btnModificarGestionCasas = new javax.swing.JToggleButton();
        btnEliminarGestionCasas = new javax.swing.JToggleButton();
        btnVerApartamentos = new javax.swing.JToggleButton();
        btnMostrarGestionCasas = new javax.swing.JButton();
        cbxModalidadGestionCasas = new javax.swing.JComboBox();
        cbxEstiloCasas = new javax.swing.JComboBox();
        GestionApartamentos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolverGestionApartamentos = new javax.swing.JToggleButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaApartamentos = new javax.swing.JTable();
        txtAreaConstruccionGestionCasas1 = new javax.swing.JTextField();
        lblAreaTerreno2 = new javax.swing.JLabel();
        lblAreaConstruccion1 = new javax.swing.JLabel();
        lblValorFiscal2 = new javax.swing.JLabel();
        txtNumFincaGestionCasas1 = new javax.swing.JTextField();
        txtAreaTerrenoGestionCasas1 = new javax.swing.JTextField();
        txtValorMetro2GestionCasas1 = new javax.swing.JTextField();
        txtValorFiscalGestionCasas1 = new javax.swing.JTextField();
        lblNumFinca2 = new javax.swing.JLabel();
        lblValorMetro4 = new javax.swing.JLabel();
        lblEstilo1 = new javax.swing.JLabel();
        txtParqueoAparta = new javax.swing.JTextField();
        lblAñoConstruccion1 = new javax.swing.JLabel();
        lblModalidad2 = new javax.swing.JLabel();
        lblEstilo2 = new javax.swing.JLabel();
        btnVerCentrosComerciales = new javax.swing.JToggleButton();
        btnSeleccionarGestionApartamentos = new javax.swing.JToggleButton();
        btnModificarGestionApartamentos = new javax.swing.JToggleButton();
        btnEliminarGestionApartamentos = new javax.swing.JToggleButton();
        cbxEstiloApartamentos = new javax.swing.JComboBox();
        cbxModalidadApartamentos = new javax.swing.JComboBox();
        cbxPiscina = new javax.swing.JComboBox();
        btnMostrarApartamentos = new javax.swing.JToggleButton();
        GestionCentrosComerciales = new javax.swing.JPanel();
        btnVolverGestionCentrosComerciales = new javax.swing.JToggleButton();
        lblTituloCentrosC = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCentrosComerciales = new javax.swing.JTable();
        txtAreaConstruccionGestionCC = new javax.swing.JTextField();
        lblAreaTerreno3 = new javax.swing.JLabel();
        lblAreaConstruccion2 = new javax.swing.JLabel();
        lblValorFiscal3 = new javax.swing.JLabel();
        txtCantidadTiendas = new javax.swing.JTextField();
        txtNumFincaGestionCC = new javax.swing.JTextField();
        txtAreaTerrenoGestionCC = new javax.swing.JTextField();
        txtValorMetro2GestionCC = new javax.swing.JTextField();
        txtValorFiscalGestionCC = new javax.swing.JTextField();
        lblNumFincaGestionCC = new javax.swing.JLabel();
        lblCantTiendas = new javax.swing.JLabel();
        lblEstilo3 = new javax.swing.JLabel();
        txtEspaciosGestionCC = new javax.swing.JTextField();
        lblEspacios = new javax.swing.JLabel();
        lblModalidad3 = new javax.swing.JLabel();
        txtCantidadSalasCines = new javax.swing.JTextField();
        lblValorMetro6 = new javax.swing.JLabel();
        lblCantTiendas1 = new javax.swing.JLabel();
        lblCantTiendas2 = new javax.swing.JLabel();
        txtCadenaCine = new javax.swing.JTextField();
        lblCantHotspot = new javax.swing.JLabel();
        txtCantidadEscaleras = new javax.swing.JTextField();
        lblCantEscaleras = new javax.swing.JLabel();
        txtCantidadHotspot = new javax.swing.JTextField();
        btnRegresarGestionCC = new javax.swing.JToggleButton();
        btnSeleccionarGestionCC = new javax.swing.JToggleButton();
        btnModificarGestionCC = new javax.swing.JToggleButton();
        btnEliminarGestionCC = new javax.swing.JToggleButton();
        cbxModalidadCentroC = new javax.swing.JComboBox();
        cbxEstiloCentroC = new javax.swing.JComboBox();
        btnMostrarCentrosC = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelprincipal.setMinimumSize(new java.awt.Dimension(850, 560));
        panelprincipal.setName(""); // NOI18N
        panelprincipal.setPreferredSize(new java.awt.Dimension(850, 560));
        panelprincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GestionLotes.setPreferredSize(new java.awt.Dimension(850, 560));
        GestionLotes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Gestion de Lotes");
        GestionLotes.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 200, 40));

        tablaLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(tablaLotes);

        GestionLotes.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 480, 220));

        lblModalidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblModalidad.setText("Modalidad");
        GestionLotes.add(lblModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        lblNumFinca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNumFinca.setText("Numero de Finca");
        GestionLotes.add(lblNumFinca, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        lblAreaTerreno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAreaTerreno.setText("Area del terreno");
        GestionLotes.add(lblAreaTerreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        lblValorFiscal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorFiscal.setText("Valor Fiscal");
        GestionLotes.add(lblValorFiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));
        GestionLotes.add(txtNumFincaGestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 130, 30));

        txtAreaTerrenoGestionLotes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GestionLotes.add(txtAreaTerrenoGestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 130, 30));

        txtValorFiscalGestionLotes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorFiscalGestionLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorFiscalGestionLotesActionPerformed(evt);
            }
        });
        GestionLotes.add(txtValorFiscalGestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 130, 30));

        lblValorMetro2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValorMetro2.setText("Valor por metro cuadrado");
        GestionLotes.add(lblValorMetro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        txtValorMetro2GestionLotes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GestionLotes.add(txtValorMetro2GestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, 60, 30));

        btnModificarGestionLotes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnModificarGestionLotes.setText("Modificar");
        btnModificarGestionLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGestionLotesActionPerformed(evt);
            }
        });
        GestionLotes.add(btnModificarGestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, 30));

        btnSeleccionarGestionLotes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSeleccionarGestionLotes.setText("Seleccionar");
        btnSeleccionarGestionLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarGestionLotesActionPerformed(evt);
            }
        });
        GestionLotes.add(btnSeleccionarGestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, 30));

        btnVerCasas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVerCasas.setText("Ver Casas");
        btnVerCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCasasActionPerformed(evt);
            }
        });
        GestionLotes.add(btnVerCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 100, 30));

        btnVolverGestionLotes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVolverGestionLotes.setText("Volver");
        btnVolverGestionLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverGestionLotesActionPerformed(evt);
            }
        });
        GestionLotes.add(btnVolverGestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 20));

        btnEliminarGestionLotes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminarGestionLotes.setText("Eliminar");
        btnEliminarGestionLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGestionLotesActionPerformed(evt);
            }
        });
        GestionLotes.add(btnEliminarGestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 100, 30));

        GestionLotes.add(cbxModalidadGestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 130, 30));

        btnMostrarGestionLotes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMostrarGestionLotes.setText("Mostrar");
        btnMostrarGestionLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarGestionLotesActionPerformed(evt);
            }
        });
        GestionLotes.add(btnMostrarGestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 30));

        panelprincipal.add(GestionLotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 810, 560));
        GestionLotes.getAccessibleContext().setAccessibleName("");

        GestionCasas.setMinimumSize(new java.awt.Dimension(850, 560));
        GestionCasas.setPreferredSize(new java.awt.Dimension(850, 560));
        GestionCasas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolverGestionCasas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVolverGestionCasas.setText("Volver");
        btnVolverGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(btnVolverGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        tablaCasas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCasas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tablaCasas);

        GestionCasas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 510, 270));

        lblTitulo1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Gestion de Casas");
        GestionCasas.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 200, 40));

        txtAreaConstruccionGestionCasas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAreaConstruccionGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaConstruccionGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(txtAreaConstruccionGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 90, -1));

        lblAreaTerreno1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAreaTerreno1.setText("Area del terreno");
        GestionCasas.add(lblAreaTerreno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        lblAreaConstruccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAreaConstruccion.setText("Area de Construccion");
        GestionCasas.add(lblAreaConstruccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        lblValorFiscal1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorFiscal1.setText("Valor Fiscal");
        GestionCasas.add(lblValorFiscal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        txtCantidadNivelesGestionCasas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadNivelesGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadNivelesGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(txtCantidadNivelesGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 240, 90, -1));

        lblCantNiveles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantNiveles.setText("Cantidad de Niveles");
        GestionCasas.add(lblCantNiveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        txtNumFincaGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFincaGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(txtNumFincaGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 90, -1));

        txtAreaTerrenoGestionCasas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GestionCasas.add(txtAreaTerrenoGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 90, -1));

        txtValorMetro2GestionCasas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GestionCasas.add(txtValorMetro2GestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 90, -1));

        txtValorFiscalGestionCasas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorFiscalGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorFiscalGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(txtValorFiscalGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 90, -1));

        lblNumFinca1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumFinca1.setText("Numero de Finca");
        GestionCasas.add(lblNumFinca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        lblValorMetro3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorMetro3.setText("Valor por metro cuadrado");
        GestionCasas.add(lblValorMetro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        lblEstilo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstilo.setText("Estilo Construccion");
        GestionCasas.add(lblEstilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        lblColor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblColor.setText("Color");
        GestionCasas.add(lblColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, -1));

        lblModalidad1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModalidad1.setText("Modalidad");
        GestionCasas.add(lblModalidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        txtColorGestionCasas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColorGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(txtColorGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 90, -1));

        btnSeleccionarGestionCasas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSeleccionarGestionCasas.setText("Seleccionar");
        btnSeleccionarGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(btnSeleccionarGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        btnModificarGestionCasas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModificarGestionCasas.setText("Modificar");
        btnModificarGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(btnModificarGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        btnEliminarGestionCasas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminarGestionCasas.setText("Eliminar");
        btnEliminarGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(btnEliminarGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        btnVerApartamentos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVerApartamentos.setText("Ver Apartamentos");
        btnVerApartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerApartamentosActionPerformed(evt);
            }
        });
        GestionCasas.add(btnVerApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        btnMostrarGestionCasas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMostrarGestionCasas.setText("Mostrar");
        btnMostrarGestionCasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarGestionCasasActionPerformed(evt);
            }
        });
        GestionCasas.add(btnMostrarGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 20));

        GestionCasas.add(cbxModalidadGestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 90, 20));

        GestionCasas.add(cbxEstiloCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 90, 20));

        panelprincipal.add(GestionCasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-800, 0, 850, 560));

        GestionApartamentos.setMinimumSize(new java.awt.Dimension(850, 560));
        GestionApartamentos.setPreferredSize(new java.awt.Dimension(850, 560));
        GestionApartamentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Gestion de Apartamentos");
        GestionApartamentos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        btnVolverGestionApartamentos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVolverGestionApartamentos.setText("Volver");
        btnVolverGestionApartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverGestionApartamentosActionPerformed(evt);
            }
        });
        GestionApartamentos.add(btnVolverGestionApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        tablaApartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaApartamentos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane6.setViewportView(tablaApartamentos);

        GestionApartamentos.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 530, 290));

        txtAreaConstruccionGestionCasas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAreaConstruccionGestionCasas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaConstruccionGestionCasas1ActionPerformed(evt);
            }
        });
        GestionApartamentos.add(txtAreaConstruccionGestionCasas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 80, -1));

        lblAreaTerreno2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAreaTerreno2.setText("Area del terreno");
        GestionApartamentos.add(lblAreaTerreno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        lblAreaConstruccion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAreaConstruccion1.setText("Area de Construccion");
        GestionApartamentos.add(lblAreaConstruccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        lblValorFiscal2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorFiscal2.setText("Valor Fiscal");
        GestionApartamentos.add(lblValorFiscal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, -1, -1));

        txtNumFincaGestionCasas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFincaGestionCasas1ActionPerformed(evt);
            }
        });
        GestionApartamentos.add(txtNumFincaGestionCasas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, 80, -1));

        txtAreaTerrenoGestionCasas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GestionApartamentos.add(txtAreaTerrenoGestionCasas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 80, -1));

        txtValorMetro2GestionCasas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GestionApartamentos.add(txtValorMetro2GestionCasas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 80, -1));

        txtValorFiscalGestionCasas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorFiscalGestionCasas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorFiscalGestionCasas1ActionPerformed(evt);
            }
        });
        GestionApartamentos.add(txtValorFiscalGestionCasas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 80, -1));

        lblNumFinca2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumFinca2.setText("Numero de Finca");
        GestionApartamentos.add(lblNumFinca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        lblValorMetro4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorMetro4.setText("Valor por metro cuadrado");
        GestionApartamentos.add(lblValorMetro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        lblEstilo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstilo1.setText("Estilo Construccion");
        GestionApartamentos.add(lblEstilo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        txtParqueoAparta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtParqueoAparta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParqueoApartaActionPerformed(evt);
            }
        });
        GestionApartamentos.add(txtParqueoAparta, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 80, -1));

        lblAñoConstruccion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAñoConstruccion1.setText("Espacios Parqueo");
        GestionApartamentos.add(lblAñoConstruccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        lblModalidad2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModalidad2.setText("Modalidad");
        GestionApartamentos.add(lblModalidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, -1, -1));

        lblEstilo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstilo2.setText("Piscina");
        GestionApartamentos.add(lblEstilo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

        btnVerCentrosComerciales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVerCentrosComerciales.setText("Ver Centros Comerciales");
        btnVerCentrosComerciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCentrosComercialesActionPerformed(evt);
            }
        });
        GestionApartamentos.add(btnVerCentrosComerciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        btnSeleccionarGestionApartamentos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSeleccionarGestionApartamentos.setText("Seleccionar");
        btnSeleccionarGestionApartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarGestionApartamentosActionPerformed(evt);
            }
        });
        GestionApartamentos.add(btnSeleccionarGestionApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        btnModificarGestionApartamentos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModificarGestionApartamentos.setText("Modificar");
        btnModificarGestionApartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGestionApartamentosActionPerformed(evt);
            }
        });
        GestionApartamentos.add(btnModificarGestionApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        btnEliminarGestionApartamentos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminarGestionApartamentos.setText("Eliminar");
        btnEliminarGestionApartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGestionApartamentosActionPerformed(evt);
            }
        });
        GestionApartamentos.add(btnEliminarGestionApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        GestionApartamentos.add(cbxEstiloApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 80, 20));

        GestionApartamentos.add(cbxModalidadApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 80, 20));

        GestionApartamentos.add(cbxPiscina, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 80, 20));

        btnMostrarApartamentos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMostrarApartamentos.setText("Mostrar");
        btnMostrarApartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarApartamentosActionPerformed(evt);
            }
        });
        GestionApartamentos.add(btnMostrarApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        panelprincipal.add(GestionApartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-800, 11, 850, 560));

        GestionCentrosComerciales.setMinimumSize(new java.awt.Dimension(850, 560));
        GestionCentrosComerciales.setPreferredSize(new java.awt.Dimension(850, 560));
        GestionCentrosComerciales.setRequestFocusEnabled(false);
        GestionCentrosComerciales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolverGestionCentrosComerciales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVolverGestionCentrosComerciales.setText("Volver");
        btnVolverGestionCentrosComerciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverGestionCentrosComercialesActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(btnVolverGestionCentrosComerciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        lblTituloCentrosC.setBackground(new java.awt.Color(0, 102, 102));
        lblTituloCentrosC.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        lblTituloCentrosC.setForeground(new java.awt.Color(0, 102, 102));
        lblTituloCentrosC.setText("Gestion de Centros Comerciales");
        GestionCentrosComerciales.add(lblTituloCentrosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        tablaCentrosComerciales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCentrosComerciales.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane5.setViewportView(tablaCentrosComerciales);

        GestionCentrosComerciales.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 540, 240));

        txtAreaConstruccionGestionCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAreaConstruccionGestionCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaConstruccionGestionCCActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(txtAreaConstruccionGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, 70, -1));

        lblAreaTerreno3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAreaTerreno3.setText("Area del terreno");
        GestionCentrosComerciales.add(lblAreaTerreno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        lblAreaConstruccion2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAreaConstruccion2.setText("Area de Construccion");
        GestionCentrosComerciales.add(lblAreaConstruccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

        lblValorFiscal3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorFiscal3.setText("Valor Fiscal");
        GestionCentrosComerciales.add(lblValorFiscal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        txtCantidadTiendas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadTiendasActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(txtCantidadTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 70, -1));

        txtNumFincaGestionCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumFincaGestionCCActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(txtNumFincaGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 40, 70, -1));

        txtAreaTerrenoGestionCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GestionCentrosComerciales.add(txtAreaTerrenoGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 70, -1));

        txtValorMetro2GestionCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GestionCentrosComerciales.add(txtValorMetro2GestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 70, -1));

        txtValorFiscalGestionCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorFiscalGestionCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorFiscalGestionCCActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(txtValorFiscalGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 70, -1));

        lblNumFincaGestionCC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumFincaGestionCC.setText("Numero de Finca");
        GestionCentrosComerciales.add(lblNumFincaGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        lblCantTiendas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCantTiendas.setText("Cantidad de tiendas");
        GestionCentrosComerciales.add(lblCantTiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        lblEstilo3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstilo3.setText("Estilo Construccion");
        GestionCentrosComerciales.add(lblEstilo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        txtEspaciosGestionCC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEspaciosGestionCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspaciosGestionCCActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(txtEspaciosGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 70, -1));

        lblEspacios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEspacios.setText("Espacios/personas Mov. Red.");
        GestionCentrosComerciales.add(lblEspacios, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        lblModalidad3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblModalidad3.setText("Modalidad");
        GestionCentrosComerciales.add(lblModalidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        txtCantidadSalasCines.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadSalasCines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadSalasCinesActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(txtCantidadSalasCines, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 70, -1));

        lblValorMetro6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValorMetro6.setText("Valor por metro cuadrado");
        GestionCentrosComerciales.add(lblValorMetro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        lblCantTiendas1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCantTiendas1.setText("Cantidad de salas de cine");
        GestionCentrosComerciales.add(lblCantTiendas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        lblCantTiendas2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCantTiendas2.setText("Cadena de Cine");
        GestionCentrosComerciales.add(lblCantTiendas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        txtCadenaCine.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCadenaCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadenaCineActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(txtCadenaCine, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 70, -1));

        lblCantHotspot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantHotspot.setText("Cantidad de Hotspot WiFi");
        GestionCentrosComerciales.add(lblCantHotspot, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        txtCantidadEscaleras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadEscaleras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadEscalerasActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(txtCantidadEscaleras, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 70, -1));

        lblCantEscaleras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCantEscaleras.setText("Cantidad de Escaleras");
        GestionCentrosComerciales.add(lblCantEscaleras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        txtCantidadHotspot.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadHotspot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadHotspotActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(txtCantidadHotspot, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 70, -1));

        btnRegresarGestionCC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegresarGestionCC.setText("Regresar al Menu");
        btnRegresarGestionCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarGestionCCActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(btnRegresarGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btnSeleccionarGestionCC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSeleccionarGestionCC.setText("Seleccionar");
        btnSeleccionarGestionCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarGestionCCActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(btnSeleccionarGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        btnModificarGestionCC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnModificarGestionCC.setText("Modificar");
        btnModificarGestionCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGestionCCActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(btnModificarGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        btnEliminarGestionCC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEliminarGestionCC.setText("Eliminar");
        btnEliminarGestionCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGestionCCActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(btnEliminarGestionCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        GestionCentrosComerciales.add(cbxModalidadCentroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 80, 20));

        GestionCentrosComerciales.add(cbxEstiloCentroC, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 70, 20));

        btnMostrarCentrosC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMostrarCentrosC.setText("Mostrar");
        btnMostrarCentrosC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCentrosCActionPerformed(evt);
            }
        });
        GestionCentrosComerciales.add(btnMostrarCentrosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        panelprincipal.add(GestionCentrosComerciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(-800, 0, -1, -1));

        getContentPane().add(panelprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 850, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverGestionApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverGestionApartamentosActionPerformed
        Animacion.mover_derecha(0, 800, 5, 7, GestionApartamentos);
        Animacion.mover_derecha(-800, 0, 5, 7, GestionCasas);
    }//GEN-LAST:event_btnVolverGestionApartamentosActionPerformed


    private void btnVolverGestionCentrosComercialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverGestionCentrosComercialesActionPerformed
        Animacion.mover_derecha(0, 800, 5, 7, GestionCentrosComerciales);
        Animacion.mover_derecha(-800, 0, 5, 7, GestionApartamentos);
    }//GEN-LAST:event_btnVolverGestionCentrosComercialesActionPerformed

    private void btnVolverGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverGestionCasasActionPerformed
        Animacion.mover_derecha(0, 800, 5, 7, GestionCasas);
        Animacion.mover_derecha(-800, 0, 5, 7, GestionLotes);
    }//GEN-LAST:event_btnVolverGestionCasasActionPerformed

    private void txtValorFiscalGestionLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorFiscalGestionLotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorFiscalGestionLotesActionPerformed

    private void btnVerCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCasasActionPerformed
        Animacion.mover_izquierda(800, 0, 5, 10, GestionCasas);
        Animacion.mover_izquierda(0, -800, 5, 10, GestionLotes);
    }//GEN-LAST:event_btnVerCasasActionPerformed

    private void txtAreaConstruccionGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaConstruccionGestionCasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaConstruccionGestionCasasActionPerformed

    private void txtCantidadNivelesGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadNivelesGestionCasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadNivelesGestionCasasActionPerformed

    private void txtNumFincaGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFincaGestionCasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumFincaGestionCasasActionPerformed

    private void txtValorFiscalGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorFiscalGestionCasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorFiscalGestionCasasActionPerformed

    private void txtColorGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorGestionCasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorGestionCasasActionPerformed

    private void btnVerApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerApartamentosActionPerformed
        Animacion.mover_izquierda(800, 0, 5, 10, GestionApartamentos);
        Animacion.mover_izquierda(0, -800, 5, 10, GestionCasas);
    }//GEN-LAST:event_btnVerApartamentosActionPerformed

    private void btnVolverGestionLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverGestionLotesActionPerformed
        MenuAgentesFrame ventana = new MenuAgentesFrame();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverGestionLotesActionPerformed

    private void txtAreaConstruccionGestionCasas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaConstruccionGestionCasas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaConstruccionGestionCasas1ActionPerformed

    private void txtNumFincaGestionCasas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFincaGestionCasas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumFincaGestionCasas1ActionPerformed

    private void txtValorFiscalGestionCasas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorFiscalGestionCasas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorFiscalGestionCasas1ActionPerformed

    private void txtParqueoApartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParqueoApartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParqueoApartaActionPerformed

    private void btnVerCentrosComercialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCentrosComercialesActionPerformed
        Animacion.mover_izquierda(800, 0, 5, 10, GestionCentrosComerciales);
        Animacion.mover_izquierda(0, -800, 5, 10, GestionApartamentos);
    }//GEN-LAST:event_btnVerCentrosComercialesActionPerformed

    private void btnSeleccionarGestionApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarGestionApartamentosActionPerformed
        int fila = tablaApartamentos.getSelectedRow();

        if (fila >= 0) {
            txtNumFincaGestionCasas1.setText(tablaApartamentos.getValueAt(fila, 0).toString());
            txtAreaTerrenoGestionCasas1.setText(tablaApartamentos.getValueAt(fila, 1).toString());
            txtAreaConstruccionGestionCasas1.setText(tablaApartamentos.getValueAt(fila, 2).toString());
            txtValorMetro2GestionCasas1.setText(tablaApartamentos.getValueAt(fila, 3).toString());
            txtValorFiscalGestionCasas1.setText(tablaApartamentos.getValueAt(fila, 4).toString());
            txtParqueoAparta.setText(tablaApartamentos.getValueAt(fila, 6).toString());

        } else {
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
        txtNumFincaGestionCasas1.setEditable(false);
    }//GEN-LAST:event_btnSeleccionarGestionApartamentosActionPerformed

    private void btnModificarGestionApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGestionApartamentosActionPerformed
        Statement st;

        numFinca = Integer.parseInt(txtNumFincaGestionCasas1.getText().trim());
        areaT = Integer.parseInt(txtAreaTerrenoGestionCasas1.getText().trim());
        valorMetro = Integer.parseInt(txtValorMetro2GestionCasas1.getText().trim());
        valorFiscal = Integer.parseInt(txtValorFiscalGestionCasas1.getText().trim());
        modalidad = cbxModalidadApartamentos.getSelectedIndex() + 1;
        areaC = Integer.parseInt(txtAreaConstruccionGestionCasas1.getText().trim());
        piscina = cbxPiscina.getSelectedItem().toString();
        estiloC = cbxEstiloApartamentos.getSelectedItem().toString();
        areaParqueo = Integer.parseInt(txtParqueoAparta.getText().trim());
        try {
            st = Conexion.getConexion().createStatement();
            String sql = "UPDATE Propiedad SET areaTerreno= '" + areaT + "', valorMetro= '" + valorMetro + "', valorFiscal = '" + valorFiscal + "', idModalidad = '" + modalidad + "' WHERE numFinca = '" + numFinca + "'";
            String sql1 = "UPDATE apartamentos SET piscina= '" + piscina + "', areaConstruccion= '" + areaC + "', estiloConstruccion = '" + estiloC + "', areaParqueo = '" + areaParqueo + "' WHERE numFinca = '" + numFinca + "'";
            st.executeUpdate(sql);
            st.executeUpdate(sql1);
            JOptionPane.showMessageDialog(null, "Exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_btnModificarGestionApartamentosActionPerformed

    private void btnEliminarGestionApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGestionApartamentosActionPerformed
        Statement st;
        numFinca = Integer.parseInt(txtNumFincaGestionCasas1.getText());
        try {
            st = Conexion.getConexion().createStatement();
            String sql = "DELETE FROM Propiedad WHERE numFinca = '" + numFinca + "'";

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_btnEliminarGestionApartamentosActionPerformed

    private void txtAreaConstruccionGestionCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaConstruccionGestionCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaConstruccionGestionCCActionPerformed

    private void txtCantidadTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadTiendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadTiendasActionPerformed

    private void txtNumFincaGestionCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumFincaGestionCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumFincaGestionCCActionPerformed

    private void txtValorFiscalGestionCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorFiscalGestionCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorFiscalGestionCCActionPerformed

    private void txtEspaciosGestionCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspaciosGestionCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspaciosGestionCCActionPerformed

    private void txtCantidadSalasCinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadSalasCinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadSalasCinesActionPerformed

    private void txtCadenaCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadenaCineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadenaCineActionPerformed

    private void txtCantidadEscalerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadEscalerasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadEscalerasActionPerformed

    private void txtCantidadHotspotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadHotspotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadHotspotActionPerformed

    private void btnRegresarGestionCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarGestionCCActionPerformed
        MenuAgentesFrame ventana = new MenuAgentesFrame();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarGestionCCActionPerformed

    private void btnSeleccionarGestionCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarGestionCCActionPerformed
        int fila = tablaCentrosComerciales.getSelectedRow();

        if (fila >= 0) {
            txtNumFincaGestionCC.setText(tablaCentrosComerciales.getValueAt(fila, 0).toString());
            txtAreaTerrenoGestionCC.setText(tablaCentrosComerciales.getValueAt(fila, 1).toString());
            txtAreaConstruccionGestionCC.setText(tablaCentrosComerciales.getValueAt(fila, 2).toString());
            txtValorMetro2GestionCC.setText(tablaCentrosComerciales.getValueAt(fila, 3).toString());
            txtValorFiscalGestionCC.setText(tablaCentrosComerciales.getValueAt(fila, 4).toString());
            txtCadenaCine.setText(tablaCentrosComerciales.getValueAt(fila, 5).toString());
            txtCantidadSalasCines.setText(tablaCentrosComerciales.getValueAt(fila, 6).toString());
            txtCantidadTiendas.setText(tablaCentrosComerciales.getValueAt(fila, 7).toString());
            txtCantidadHotspot.setText(tablaCentrosComerciales.getValueAt(fila, 8).toString());
            txtCantidadEscaleras.setText(tablaCentrosComerciales.getValueAt(fila, 9).toString());
            txtEspaciosGestionCC.setText(tablaCentrosComerciales.getValueAt(fila, 10).toString());

        } else {
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
        txtNumFincaGestionCC.setEditable(false);
    }//GEN-LAST:event_btnSeleccionarGestionCCActionPerformed

    private void btnModificarGestionCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGestionCCActionPerformed
        Statement st;

        numFinca = Integer.parseInt(txtNumFincaGestionCC.getText().trim());
        areaT = Integer.parseInt(txtAreaTerrenoGestionCC.getText().trim());
        valorMetro = Integer.parseInt(txtValorMetro2GestionCC.getText().trim());
        valorFiscal = Integer.parseInt(txtValorFiscalGestionCC.getText().trim());
        modalidad = cbxModalidadCentroC.getSelectedIndex() + 1;
        areaC = Integer.parseInt(txtAreaConstruccionGestionCC.getText().trim());
        cadenaCines = txtCadenaCine.getText().trim();
        estiloC = cbxEstiloCentroC.getSelectedItem().toString();
        cantSalasCine = Integer.parseInt(txtCantidadSalasCines.getText().trim());
        cantHotspot = Integer.parseInt(txtCantidadHotspot.getText().trim());
        cantEscaleras = Integer.parseInt(txtCantidadEscaleras.getText().trim());
        cantTiendas = Integer.parseInt(txtCantidadTiendas.getText().trim());
        cantEspaciosE = Integer.parseInt(txtEspaciosGestionCC.getText().trim());

        try {
            st = Conexion.getConexion().createStatement();
            String sql = "UPDATE Propiedad SET areaTerreno= '" + areaT + "', valorMetro= '" + valorMetro + "', valorFiscal = '" + valorFiscal + "', idModalidad = '" + modalidad + "' WHERE numFinca = '" + numFinca + "'";
            String sql1 = "UPDATE centroComercial SET cadenaCine= '" + cadenaCines + "', areaConstruccion= '" + areaC + "', estiloConstruccion = '" + estiloC + "', cantidadTiendas = '" + cantTiendas + "', cantidadSalasCine = '" + cantSalasCine + "', cantidadHotspot = '" + cantHotspot + "' , cantidadEscaleras = '" + cantEscaleras + "' , cantEspaciosEspecial = '" + cantEspaciosE + "'WHERE numFinca = '" + numFinca + "'";
            st.executeUpdate(sql);
            st.executeUpdate(sql1);
            JOptionPane.showMessageDialog(null, "Exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_btnModificarGestionCCActionPerformed

    private void btnEliminarGestionCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGestionCCActionPerformed
        Statement st;
        numFinca = Integer.parseInt(txtNumFincaGestionCC.getText());
        try {
            st = Conexion.getConexion().createStatement();
            String sql = "DELETE FROM Propiedad WHERE numFinca = '" + numFinca + "'";

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_btnEliminarGestionCCActionPerformed

    private void btnSeleccionarGestionLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarGestionLotesActionPerformed
        int fila = tablaLotes.getSelectedRow();

        if (fila >= 0) {
            txtNumFincaGestionLotes.setText(tablaLotes.getValueAt(fila, 0).toString());
            txtAreaTerrenoGestionLotes.setText(tablaLotes.getValueAt(fila, 1).toString());
            txtValorMetro2GestionLotes.setText(tablaLotes.getValueAt(fila, 2).toString());
            txtValorFiscalGestionLotes.setText(tablaLotes.getValueAt(fila, 3).toString());

        } else {
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
        txtNumFincaGestionLotes.setEditable(false);
    }//GEN-LAST:event_btnSeleccionarGestionLotesActionPerformed

    private void btnMostrarGestionLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarGestionLotesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarGestionLotesActionPerformed

    private void btnModificarGestionLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGestionLotesActionPerformed
        Statement st;

        numFinca = Integer.parseInt(txtNumFincaGestionLotes.getText().trim());
        areaT = Integer.parseInt(txtAreaTerrenoGestionLotes.getText().trim());
        valorMetro = Integer.parseInt(txtValorMetro2GestionLotes.getText().trim());
        valorFiscal = Integer.parseInt(txtValorFiscalGestionLotes.getText().trim());
        modalidad = cbxModalidadGestionLotes.getSelectedIndex() + 1;

        try {
            st = Conexion.getConexion().createStatement();
            String sql = "UPDATE Propiedad SET areaTerreno= '" + areaT + "', valorMetro= '" + valorMetro + "', valorFiscal = '" + valorFiscal + "', idModalidad = '" + modalidad + "' WHERE numFinca = '" + numFinca + "'";

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Exito");
            //return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
            //return false;
        }
    }//GEN-LAST:event_btnModificarGestionLotesActionPerformed

    private void btnEliminarGestionLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGestionLotesActionPerformed
        Statement st;
        numFinca = Integer.parseInt(txtNumFincaGestionLotes.getText());
        try {
            st = Conexion.getConexion().createStatement();
            String sql = "DELETE FROM Propiedad WHERE numFinca = '" + numFinca + "'";

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_btnEliminarGestionLotesActionPerformed

    private void btnMostrarGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarGestionCasasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarGestionCasasActionPerformed

    private void btnSeleccionarGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarGestionCasasActionPerformed
        int fila = tablaCasas.getSelectedRow();

        if (fila >= 0) {
            txtNumFincaGestionCasas.setText(tablaCasas.getValueAt(fila, 0).toString());
            txtAreaTerrenoGestionCasas.setText(tablaCasas.getValueAt(fila, 1).toString());
            txtAreaConstruccionGestionCasas.setText(tablaCasas.getValueAt(fila, 2).toString());
            txtValorMetro2GestionCasas.setText(tablaCasas.getValueAt(fila, 3).toString());
            txtValorFiscalGestionCasas.setText(tablaCasas.getValueAt(fila, 4).toString());
            txtCantidadNivelesGestionCasas.setText(tablaCasas.getValueAt(fila, 5).toString());
            txtColorGestionCasas.setText(tablaCasas.getValueAt(fila, 6).toString());

        } else {
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
        txtNumFincaGestionCasas.setEditable(false);
    }//GEN-LAST:event_btnSeleccionarGestionCasasActionPerformed

    private void btnModificarGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGestionCasasActionPerformed
        Statement st;

        numFinca = Integer.parseInt(txtNumFincaGestionCasas.getText().trim());
        areaT = Integer.parseInt(txtAreaTerrenoGestionCasas.getText().trim());
        valorMetro = Integer.parseInt(txtValorMetro2GestionCasas.getText().trim());
        valorFiscal = Integer.parseInt(txtValorFiscalGestionCasas.getText().trim());
        modalidad = cbxModalidadGestionCasas.getSelectedIndex() + 1;
        areaC = Integer.parseInt(txtAreaConstruccionGestionCasas.getText().trim());
        cantNiveles = Integer.parseInt(txtCantidadNivelesGestionCasas.getText().trim());
        estiloC = cbxEstiloCasas.getSelectedItem().toString();
        color = txtColorGestionCasas.getText();
        try {
            st = Conexion.getConexion().createStatement();
            String sql = "UPDATE Propiedad SET areaTerreno= '" + areaT + "', valorMetro= '" + valorMetro + "', valorFiscal = '" + valorFiscal + "', idModalidad = '" + modalidad + "' WHERE numFinca = '" + numFinca + "'";
            String sql1 = "UPDATE casas SET areaConstruccion= '" + areaC + "', cantidadNiveles= '" + cantNiveles + "', estiloConstruccion = '" + estiloC + "', color = '" + color + "' WHERE numFinca = '" + numFinca + "'";
            st.executeUpdate(sql);
            st.executeUpdate(sql1);
            JOptionPane.showMessageDialog(null, "Exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_btnModificarGestionCasasActionPerformed

    private void btnEliminarGestionCasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGestionCasasActionPerformed
        Statement st;
        numFinca = Integer.parseInt(txtNumFincaGestionCasas.getText());
        try {
            st = Conexion.getConexion().createStatement();
            String sql = "DELETE FROM Propiedad WHERE numFinca = '" + numFinca + "'";

            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Exito");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_btnEliminarGestionCasasActionPerformed

    private void btnMostrarApartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarApartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarApartamentosActionPerformed

    private void btnMostrarCentrosCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCentrosCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarCentrosCActionPerformed

    /**
     *
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
            java.util.logging.Logger.getLogger(GestionCatalogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCatalogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCatalogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCatalogoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCatalogoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GestionApartamentos;
    private javax.swing.JPanel GestionCasas;
    private javax.swing.JPanel GestionCentrosComerciales;
    private javax.swing.JPanel GestionLotes;
    public javax.swing.JToggleButton btnEliminarGestionApartamentos;
    public javax.swing.JToggleButton btnEliminarGestionCC;
    public javax.swing.JToggleButton btnEliminarGestionCasas;
    public javax.swing.JButton btnEliminarGestionLotes;
    public javax.swing.JToggleButton btnModificarGestionApartamentos;
    public javax.swing.JToggleButton btnModificarGestionCC;
    public javax.swing.JToggleButton btnModificarGestionCasas;
    public javax.swing.JButton btnModificarGestionLotes;
    public javax.swing.JToggleButton btnMostrarApartamentos;
    public javax.swing.JToggleButton btnMostrarCentrosC;
    public javax.swing.JButton btnMostrarGestionCasas;
    public javax.swing.JButton btnMostrarGestionLotes;
    public javax.swing.JToggleButton btnRegresarGestionCC;
    public javax.swing.JToggleButton btnSeleccionarGestionApartamentos;
    public javax.swing.JToggleButton btnSeleccionarGestionCC;
    public javax.swing.JToggleButton btnSeleccionarGestionCasas;
    public javax.swing.JButton btnSeleccionarGestionLotes;
    public javax.swing.JToggleButton btnVerApartamentos;
    public javax.swing.JButton btnVerCasas;
    public javax.swing.JToggleButton btnVerCentrosComerciales;
    public javax.swing.JToggleButton btnVolverGestionApartamentos;
    public javax.swing.JToggleButton btnVolverGestionCasas;
    public javax.swing.JToggleButton btnVolverGestionCentrosComerciales;
    public javax.swing.JButton btnVolverGestionLotes;
    public javax.swing.JComboBox cbxEstiloApartamentos;
    public javax.swing.JComboBox cbxEstiloCasas;
    public javax.swing.JComboBox cbxEstiloCentroC;
    public javax.swing.JComboBox cbxModalidadApartamentos;
    public javax.swing.JComboBox cbxModalidadCentroC;
    public javax.swing.JComboBox cbxModalidadGestionCasas;
    public javax.swing.JComboBox cbxModalidadGestionLotes;
    public javax.swing.JComboBox cbxPiscina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAreaConstruccion;
    private javax.swing.JLabel lblAreaConstruccion1;
    private javax.swing.JLabel lblAreaConstruccion2;
    private javax.swing.JLabel lblAreaTerreno;
    private javax.swing.JLabel lblAreaTerreno1;
    private javax.swing.JLabel lblAreaTerreno2;
    private javax.swing.JLabel lblAreaTerreno3;
    private javax.swing.JLabel lblAñoConstruccion1;
    private javax.swing.JLabel lblCantEscaleras;
    private javax.swing.JLabel lblCantHotspot;
    private javax.swing.JLabel lblCantNiveles;
    private javax.swing.JLabel lblCantTiendas;
    private javax.swing.JLabel lblCantTiendas1;
    private javax.swing.JLabel lblCantTiendas2;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEspacios;
    private javax.swing.JLabel lblEstilo;
    private javax.swing.JLabel lblEstilo1;
    private javax.swing.JLabel lblEstilo2;
    private javax.swing.JLabel lblEstilo3;
    private javax.swing.JLabel lblModalidad;
    private javax.swing.JLabel lblModalidad1;
    private javax.swing.JLabel lblModalidad2;
    private javax.swing.JLabel lblModalidad3;
    private javax.swing.JLabel lblNumFinca;
    private javax.swing.JLabel lblNumFinca1;
    private javax.swing.JLabel lblNumFinca2;
    private javax.swing.JLabel lblNumFincaGestionCC;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTituloCentrosC;
    private javax.swing.JLabel lblValorFiscal;
    private javax.swing.JLabel lblValorFiscal1;
    private javax.swing.JLabel lblValorFiscal2;
    private javax.swing.JLabel lblValorFiscal3;
    private javax.swing.JLabel lblValorMetro2;
    public javax.swing.JLabel lblValorMetro3;
    public javax.swing.JLabel lblValorMetro4;
    private javax.swing.JLabel lblValorMetro6;
    private javax.swing.JPanel panelprincipal;
    public javax.swing.JTable tablaApartamentos;
    public javax.swing.JTable tablaCasas;
    public javax.swing.JTable tablaCentrosComerciales;
    public javax.swing.JTable tablaLotes;
    public javax.swing.JTextField txtAreaConstruccionGestionCC;
    public javax.swing.JTextField txtAreaConstruccionGestionCasas;
    public javax.swing.JTextField txtAreaConstruccionGestionCasas1;
    public javax.swing.JTextField txtAreaTerrenoGestionCC;
    public javax.swing.JTextField txtAreaTerrenoGestionCasas;
    public javax.swing.JTextField txtAreaTerrenoGestionCasas1;
    public javax.swing.JTextField txtAreaTerrenoGestionLotes;
    public javax.swing.JTextField txtCadenaCine;
    public javax.swing.JTextField txtCantidadEscaleras;
    public javax.swing.JTextField txtCantidadHotspot;
    public javax.swing.JTextField txtCantidadNivelesGestionCasas;
    public javax.swing.JTextField txtCantidadSalasCines;
    public javax.swing.JTextField txtCantidadTiendas;
    public javax.swing.JTextField txtColorGestionCasas;
    public javax.swing.JTextField txtEspaciosGestionCC;
    public javax.swing.JTextField txtNumFincaGestionCC;
    public javax.swing.JTextField txtNumFincaGestionCasas;
    public javax.swing.JTextField txtNumFincaGestionCasas1;
    public javax.swing.JTextField txtNumFincaGestionLotes;
    public javax.swing.JTextField txtParqueoAparta;
    public javax.swing.JTextField txtValorFiscalGestionCC;
    public javax.swing.JTextField txtValorFiscalGestionCasas;
    public javax.swing.JTextField txtValorFiscalGestionCasas1;
    public javax.swing.JTextField txtValorFiscalGestionLotes;
    public javax.swing.JTextField txtValorMetro2GestionCC;
    public javax.swing.JTextField txtValorMetro2GestionCasas;
    public javax.swing.JTextField txtValorMetro2GestionCasas1;
    public javax.swing.JTextField txtValorMetro2GestionLotes;
    // End of variables declaration//GEN-END:variables
}
