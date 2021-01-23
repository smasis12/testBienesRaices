/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import Modelo.Agente;
import Modelo.ConsultaBienesRaices;
import Vista.RegistrarAgenteFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorAgente implements ActionListener{
    private Agente agente;
    private ConsultaBienesRaices consultas;
    private RegistrarAgenteFrame frmRegistrar;
    public ControladorAgente(){
    
    }

    public ControladorAgente(Agente agente, ConsultaBienesRaices consultas, RegistrarAgenteFrame frmRegistrar) {
        this.agente = agente;
        this.consultas = consultas;
        this.frmRegistrar = frmRegistrar;
        this.frmRegistrar.btnRegistrar.addActionListener(this);   
    }
    
    public void Iniciar(){
     
        frmRegistrar.setTitle("Agente");
        frmRegistrar.setLocationRelativeTo(null);
    }
  
    @Override
    public void actionPerformed(ActionEvent e){
     if (e.getSource()== frmRegistrar.btnRegistrar)
        {
            agente.setCorreo(frmRegistrar.txtCorreo.getText());
            agente.setApellido(frmRegistrar.txtApellido.getText());
            agente.setNombre(frmRegistrar.txtNombre.getText());
            agente.setTelefono(Integer.parseInt((frmRegistrar.txtNumTelefono.getText())));
            agente.setId(Integer.parseInt((frmRegistrar.txtId.getText())));
            
            if(consultas.registrarAgente(agente)){
                JOptionPane.showMessageDialog(null, "Registro Guardado");
            }
            else{
                JOptionPane.showMessageDialog(null,"Registro Fallido");
            }
    }}
    
    public void generarQr(String infoQR){
        
        
        try{
            ByteArrayOutputStream out = QRCode.from(infoQR).to(ImageType.PNG).stream();
            String f_name= infoQR;
            String Path_name = "C:\\QR\\";
            
            FileOutputStream fout = new FileOutputStream(new File(Path_name +(f_name+".PNG")));
            fout.write(out.toByteArray());
            fout.flush();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

 
  


    
    
}

