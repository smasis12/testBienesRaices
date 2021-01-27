/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import controlador.Conexion;
import static controlador.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ConsultaBienesRaices {

    public boolean registrarAgente(Agente ag) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Usuario(correo,telefono,clave) values(?,?,?) ; INSERT INTO UsuarioAgente(id,nombre,apellido,correo) values(?,?,?,?)";

        //aa
        try {

            ps = con.prepareStatement(sql);
            ps.setString(1, ag.getCorreo());
            ps.setInt(2, ag.getTelefono());
            ps.setString(3, "fasdfa");
            ps.setInt(4, ag.getId());
            ps.setString(5, ag.getNombre());
            ps.setString(6, ag.getApellido());
            ps.setString(7, ag.getCorreo());
            ps.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public List listarAgente() {
        Conexion conect = new Conexion();
        List<Agente> listaAgentes = new ArrayList<>();
        String sql = "SELECT * FROM UsuarioAgente";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conect.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Agente agente = new Agente();
                agente.setNombre(rs.getString("nombre"));
                agente.setApellido(rs.getString("apellido"));
                agente.setId(rs.getInt("id"));
                agente.setCorreo(rs.getString("correo"));
                listaAgentes.add(agente);
                System.out.println("hecho");
            }

        } catch (Exception e) {
            System.out.println("error");

        }
        return listaAgentes;

    }

    public boolean registrarLote(Lote lote) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Propiedad(numFinca, areaTerreno, valorMetro, valorFiscal, ubicacion,"
                + "idProvincia, idCanton, idDistrito, senas, idAgente, idPropiedad, idModalidad) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?) ; "
                + "INSERT INTO lote(numFinca) values(?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, lote.getNumFinca());
            ps.setInt(2, lote.getAreaTerreno());
            ps.setInt(3, lote.getValorMetro2());
            ps.setInt(4, lote.getValorFiscal());
            ps.setString(5, lote.getUbicacion());
            ps.setInt(6, lote.getIdProvincia());
            ps.setInt(7, lote.getIdCanton());
            ps.setInt(8, lote.getIdDistrito());
            ps.setString(9, lote.getDireccion());
            ps.setInt(10, lote.getIdAgente());
            ps.setInt(11, lote.getIdPropiedad());
            ps.setInt(12, lote.getModalidad());
            ps.setInt(13, lote.getNumFinca());

            ps.execute();

            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public boolean registrarCasa(Casa casa) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Propiedad(numFinca, areaTerreno, valorMetro, valorFiscal, ubicacion,"
                + "idProvincia, idCanton, idDistrito, senas, idAgente, idPropiedad, idModalidad) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?) ; "
                + "INSERT INTO casas(numFinca, cantidadNiveles, estiloConstruccion, color, anioConstruccion) values(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, casa.getNumFinca());
            ps.setInt(2, casa.getAreaTerreno());
            ps.setInt(3, casa.getValorMetro2());
            ps.setInt(4, casa.getValorFiscal());
            ps.setString(5, casa.getUbicacion());
            ps.setInt(6, casa.getIdProvincia());
            ps.setInt(7, casa.getIdCanton());
            ps.setInt(8, casa.getIdDistrito());
            ps.setString(9, casa.getDireccion());
            ps.setInt(10, casa.getIdAgente());
            ps.setInt(11, casa.getIdPropiedad());
            ps.setInt(12, casa.getModalidad());
            ps.setInt(13, casa.getNumFinca());
            ps.setInt(14, casa.getCantidadNiveles());
            ps.setString(15, casa.getEstiloConstruccion());
            ps.setString(16, casa.getColor());
            ps.setInt(17, casa.getAnioConstruccion());

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public boolean registrarApartamento(Apartamento apartamento) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Propiedad(numFinca, areaTerreno, valorMetro, valorFiscal, ubicacion,"
                + "idProvincia, idCanton, idDistrito, senas, idAgente, idPropiedad, idModalidad) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?) ; "
                + "INSERT INTO apartamentos(numFinca, piscina, areaConstruccion, estiloConstruccion, areaParqueo) values(?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, apartamento.getNumFinca());
            ps.setInt(2, apartamento.getAreaTerreno());
            ps.setInt(3, apartamento.getValorMetro2());
            ps.setInt(4, apartamento.getValorFiscal());
            ps.setString(5, apartamento.getUbicacion());
            ps.setInt(6, apartamento.getIdProvincia());
            ps.setInt(7, apartamento.getIdCanton());
            ps.setInt(8, apartamento.getIdDistrito());
            ps.setString(9, apartamento.getDireccion());
            ps.setInt(10, apartamento.getIdAgente());
            ps.setInt(11, apartamento.getIdPropiedad());
            ps.setInt(12, apartamento.getModalidad());
            ps.setInt(13, apartamento.getNumFinca());
            ps.setString(14, apartamento.getPiscina());
            ps.setInt(15, apartamento.getAreaConstruccion());
            ps.setString(16, apartamento.getEstiloConstruccion());
            ps.setInt(17, apartamento.getEspaciosParqueo());

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public boolean registrarNivelApartamento(Nivel nivel) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO niveles (numFinca, cantidadResidencias, tipoNivel, areaZonasComunes) values(?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, nivel.getNumFinca());
            ps.setInt(2, nivel.getCantidadResidencias());
            ps.setString(3, nivel.getTipoNivel());
            ps.setInt(4, nivel.getAreaZonasComunes());
 
            
            ps.execute();

            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public boolean registrarCentroC(CentroComercial centroC) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Propiedad(numFinca, areaTerreno, valorMetro, valorFiscal, ubicacion,"
                + "idProvincia, idCanton, idDistrito, senas, idAgente, idPropiedad, idModalidad) "
                + "values(?,?,?,?,?,?,?,?,?,?,?,?) ; "
                + "INSERT INTO centroComercial(numFinca, cadenaCine, areaConstruccion, estiloConstruccion, cantidadTiendas, "
                + "cantidadSalasCine, cantidadHotspot ,cantidadEscaleras, cantEspaciosEspecial) values(?,?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, centroC.getNumFinca());
            ps.setInt(2, centroC.getAreaTerreno());
            ps.setInt(3, centroC.getValorMetro2());
            ps.setInt(4, centroC.getValorFiscal());
            ps.setString(5, centroC.getUbicacion());
            ps.setInt(6, centroC.getIdProvincia());
            ps.setInt(7, centroC.getIdCanton());
            ps.setInt(8, centroC.getIdDistrito());
            ps.setString(9, centroC.getDireccion());
            ps.setInt(10, centroC.getIdAgente());
            ps.setInt(11, centroC.getIdPropiedad());
            ps.setInt(12, centroC.getModalidad());
            ps.setInt(13, centroC.getNumFinca());
            ps.setString(14, centroC.getCadenaCine());
            ps.setInt(15, centroC.getAreaConstruccion());
            ps.setString(16, centroC.getEstiloConstruccion());
            ps.setInt(17, centroC.getCantidadTiendas());
            ps.setInt(18, centroC.getCantidadSalasCine());
            ps.setInt(19, centroC.getCantidadHotspot());
            ps.setInt(20, centroC.getCantidadEscaleras());
            ps.setInt(21, centroC.getCantEspaciosEspecial());

            ps.execute();

            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
}
