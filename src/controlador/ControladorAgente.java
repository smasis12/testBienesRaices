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

/**
 *
 * @author Sara
 */
public class ControladorAgente {
    
    
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
