/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Inicio;
import Modelo.EmailReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

public class Principal {
    
    public static void main(String[] args ) throws MessagingException{
        
            Inicio vent = new Inicio();
            vent.setVisible(true);
            EmailReader EmailReader = new EmailReader();
            
            //Llamado al método que lee NUEVOS mensajes al correo electronico de bienes raices
            EmailReader.MonitorearNuevoCliente();
            //e.enviarMail("isamasis09@gmail.com"); 
            
            // EmailReader.enviarMailNuevaPassword("masissara12@gmail.com");
            //EmailReader.enviarMailFicha("masissara12@gmail.com", "sara");
            
    
    }
    
}
