package controlador;

import Modelo.Apartamento;
import Modelo.Casa;
import Modelo.CentroComercial;
import Modelo.ConsultaBienesRaices;
import Modelo.Lote;
import Modelo.Nivel;
import Vista.GestionCatalogoFrame;
import Vista.RegistrarNuevaCasaFrame;
import Vista.RegistrarNuevoApartamento;
import Vista.RegistrarNuevoCentroComercial;
import Vista.RegistrarNuevoLoteFrame;
import Vista.RegistrarNuevoNivelApartamento;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorPropiedad implements ActionListener {

    Lote lote = new Lote();
    Casa casa = new Casa();
    Apartamento aparta = new Apartamento();
    public static Apartamento apartamento = new Apartamento();
    Nivel nivel = new Nivel();
    CentroComercial CentroC = new CentroComercial();
    ConsultaBienesRaices controladorP = new ConsultaBienesRaices();

    RegistrarNuevoLoteFrame frmRegistrarLote = new RegistrarNuevoLoteFrame();
    RegistrarNuevaCasaFrame frmRegistrarCasa = new RegistrarNuevaCasaFrame();
    RegistrarNuevoApartamento frmRegistrarAparta = new RegistrarNuevoApartamento();
    RegistrarNuevoCentroComercial frmRegistrarCentroC = new RegistrarNuevoCentroComercial();
    RegistrarNuevoNivelApartamento frmRegistrarNivelApartamento = new RegistrarNuevoNivelApartamento();

    public ControladorPropiedad() {
    }

    public ControladorPropiedad(Lote pLote, Casa pCasa, Apartamento pAparta, CentroComercial pCentroC,
            RegistrarNuevoLoteFrame pNuevoLote, RegistrarNuevaCasaFrame pNuevaCasa, RegistrarNuevoApartamento pNuevoAparta,
            RegistrarNuevoCentroComercial pNuevoCentroC, RegistrarNuevoNivelApartamento pNuevoNivelApartamento, Nivel pNivel) {

        this.lote = pLote;
        this.casa = pCasa;
        this.apartamento = pAparta;
        this.nivel = pNivel;
        this.CentroC = pCentroC;

        this.frmRegistrarLote = pNuevoLote;
        this.frmRegistrarCasa = pNuevaCasa;
        this.frmRegistrarAparta = pNuevoAparta;
        this.frmRegistrarCentroC = pNuevoCentroC;

        this.frmRegistrarLote.btnRegistrar.addActionListener(this);
        this.frmRegistrarCasa.btnRegistrar.addActionListener(this);
        this.frmRegistrarAparta.btnRegistrar.addActionListener(this);
        this.frmRegistrarAparta.btnAgregarNivel.addActionListener(this);
        this.frmRegistrarCentroC.btnRegistrar.addActionListener(this);

    }

    public void IniciarLote() {

        frmRegistrarLote.setTitle("Lote");
        frmRegistrarLote.setLocationRelativeTo(null);
    }

    public void IniciarCasa() {

        frmRegistrarCasa.setTitle("Casa");
        frmRegistrarCasa.setLocationRelativeTo(null);
    }

    public void IniciarApartameto() {

        frmRegistrarAparta.setTitle("Apartamento");
        frmRegistrarAparta.setLocationRelativeTo(null);
    }

    public void IniciarCentroC() {

        frmRegistrarCentroC.setTitle("Centro Comercial");
        frmRegistrarCentroC.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmRegistrarLote.btnRegistrar) {
            lote.setNumFinca(Integer.parseInt(frmRegistrarLote.txtNumFinca.getText()));
            lote.setAreaTerreno(Integer.parseInt(frmRegistrarLote.txtAreaTerreno.getText()));
            lote.setValorMetro2(Integer.parseInt(frmRegistrarLote.txtValorMetro2.getText()));
            lote.setValorFiscal(Integer.parseInt(frmRegistrarLote.txtValorFiscal.getText()));
            lote.setIdProvincia(frmRegistrarLote.cbxProvincias.getSelectedIndex() + 1);
            lote.setIdCanton(Integer.parseInt(frmRegistrarLote.txtCanton.getText()));
            lote.setIdDistrito(Integer.parseInt(frmRegistrarLote.txtDistrito.getText()));
            lote.setDireccion(frmRegistrarLote.txtUbicacionExacta.getText());
            lote.setIdAgente(ControladorLogin.ag.getId());
            lote.setIdPropiedad(1);
            lote.setModalidad(frmRegistrarLote.cbxModalidad.getSelectedIndex() + 1);
            lote.setUbicacion(frmRegistrarLote.txtUbicacion.getText());

            if (controladorP.registrarLote(lote)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Presione volver para regresar al menu anterior");
            }
        }
        if (e.getSource() == frmRegistrarCasa.btnRegistrar) {
            casa.setNumFinca(Integer.parseInt(frmRegistrarCasa.txtNumFinca.getText()));
            casa.setAreaTerreno(Integer.parseInt(frmRegistrarCasa.txtAreaTerreno.getText()));
            casa.setValorMetro2(Integer.parseInt(frmRegistrarCasa.txtValorMetro2.getText()));
            casa.setValorFiscal(Integer.parseInt(frmRegistrarCasa.txtValorFiscal.getText()));
            casa.setIdProvincia(frmRegistrarCasa.cbxProvincias.getSelectedIndex() + 1);
            casa.setIdCanton(Integer.parseInt(frmRegistrarCasa.txtCanton.getText()));
            casa.setIdDistrito(Integer.parseInt(frmRegistrarCasa.txtDistrito.getText()));
            casa.setDireccion(frmRegistrarCasa.txtUbicacionExacta.getText());
            casa.setIdAgente(ControladorLogin.ag.getId());
            casa.setIdPropiedad(2);
            casa.setModalidad(frmRegistrarCasa.cbxModalidad.getSelectedIndex() + 1);
            casa.setAreaConstruccion(Integer.parseInt(frmRegistrarCasa.txtAreaConstruccion.getText()));
            casa.setUbicacion(frmRegistrarCasa.txtUbicacion.getText());
            casa.setCantidadNiveles(Integer.parseInt(frmRegistrarCasa.txtCantidadNiveles.getText()));
            casa.setEstiloConstruccion(String.valueOf(frmRegistrarCasa.cbxEstilo.getSelectedItem()));
            casa.setColor(frmRegistrarCasa.txtColor.getText());
            casa.setAnioConstruccion(Integer.parseInt(frmRegistrarCasa.txtAnioConstruccion.getText()));

            if (controladorP.registrarCasa(casa)) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido insertar, intente de nuevo");
            }

        }
        if (e.getSource() == frmRegistrarCentroC.btnRegistrar) {
            CentroC.setNumFinca(Integer.parseInt(frmRegistrarCentroC.txtNumFinca.getText()));
            CentroC.setAreaTerreno(Integer.parseInt(frmRegistrarCentroC.txtAreaTerreno.getText()));
            CentroC.setValorMetro2(Integer.parseInt(frmRegistrarCentroC.txtValorMetro2.getText()));
            CentroC.setValorFiscal(Integer.parseInt(frmRegistrarCentroC.txtValorFiscal.getText()));
            CentroC.setIdProvincia(frmRegistrarCentroC.cbxProvincias.getSelectedIndex() + 1);
            CentroC.setIdCanton(Integer.parseInt(frmRegistrarCentroC.txtCanton.getText()));
            CentroC.setIdDistrito(Integer.parseInt(frmRegistrarCentroC.txtDistrito.getText()));
            CentroC.setDireccion(frmRegistrarCentroC.txtUbicacionExacta.getText());
            CentroC.setIdAgente(ControladorLogin.ag.getId());
            CentroC.setIdPropiedad(4);
            CentroC.setModalidad(frmRegistrarCentroC.cbxModalidad.getSelectedIndex() + 1);
            CentroC.setUbicacion(frmRegistrarCentroC.txtUbicacionmapas.getText());
            CentroC.setCadenaCine(frmRegistrarCentroC.txtCadenaCines.getText());
            CentroC.setEstiloConstruccion(String.valueOf(frmRegistrarCentroC.cbxEstilo.getSelectedItem()));
            CentroC.setAreaConstruccion(Integer.parseInt(frmRegistrarCentroC.txtAreaConstruccion.getText()));
            CentroC.setCantidadTiendas(Integer.parseInt(frmRegistrarCentroC.txtCantidadTiendas.getText()));
            CentroC.setCantidadSalasCine(Integer.parseInt(frmRegistrarCentroC.txtCantidadSalas.getText()));
            CentroC.setCantidadHotspot(Integer.parseInt(frmRegistrarCentroC.txtCantidadHotspot.getText()));
            CentroC.setCantidadEscaleras(Integer.parseInt(frmRegistrarCentroC.txtCantidadEscaleras.getText()));
            CentroC.setCantEspaciosEspecial(Integer.parseInt(frmRegistrarCentroC.txtlZonasPersonasReducidas.getText()));

            if (controladorP.registrarCentroC(CentroC)) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido insertar, intente de nuevo");
            }
        }
        if (e.getSource() == frmRegistrarAparta.btnRegistrar) {

            apartamento.setNumFinca(Integer.parseInt(frmRegistrarAparta.txtNumFinca.getText()));
            apartamento.setAreaTerreno(Integer.parseInt(frmRegistrarAparta.txtAreaTerreno.getText()));
            apartamento.setValorMetro2(Integer.parseInt(frmRegistrarAparta.txtValorMetro2.getText()));
            apartamento.setValorFiscal(Integer.parseInt(frmRegistrarAparta.txtValorFiscal.getText()));
            apartamento.setIdProvincia(frmRegistrarAparta.cbxProvincias.getSelectedIndex() + 1);
            apartamento.setIdCanton(Integer.parseInt(frmRegistrarAparta.txtCanton.getText()));
            apartamento.setIdDistrito(Integer.parseInt(frmRegistrarAparta.txtDistrito.getText()));
            apartamento.setDireccion(frmRegistrarAparta.txtDireccion.getText());
            apartamento.setIdAgente(ControladorLogin.ag.getId());
            apartamento.setIdPropiedad(3);
            apartamento.setModalidad(frmRegistrarAparta.cbxModalidad.getSelectedIndex() + 1);
            apartamento.setUbicacion(frmRegistrarAparta.txtUbicacionMapas.getText());
            apartamento.setAreaConstruccion(Integer.parseInt(frmRegistrarAparta.txtAreaConstruccion.getText()));
            apartamento.setEstiloConstruccion(String.valueOf(frmRegistrarAparta.cbxEstilo.getSelectedItem()));
            apartamento.setAltura(Integer.parseInt(frmRegistrarAparta.txtAltura.getText()));
            apartamento.setEspaciosParqueo(Integer.parseInt(frmRegistrarAparta.txtParqueo.getText()));
            apartamento.setPiscina(String.valueOf(frmRegistrarAparta.cbxPiscina.getSelectedItem()));

            if (controladorP.registrarApartamento(apartamento)) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido insertar, intente de nuevo");
            }

        }
        if (e.getSource() == frmRegistrarAparta.btnAgregarNivel) {
            nivel.setNumFinca(Integer.parseInt(frmRegistrarAparta.txtNumFinca.getText()));
            nivel.setCantidadResidencias(Integer.parseInt(frmRegistrarAparta.txtCantidadResidencias.getText()));
            nivel.setTipoNivel(String.valueOf(frmRegistrarAparta.cbxTipoNivel.getSelectedItem()));
            nivel.setAreaZonasComunes(Integer.parseInt(frmRegistrarAparta.txtEspaciosZonasC.getText()));
            if (controladorP.registrarNivelApartamento(nivel)) {
                JOptionPane.showMessageDialog(null, "Nivel agregado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido insertar, intente de nuevo");
            }
        }

    }

}
