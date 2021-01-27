/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Inicio;
import controlador.EmailReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

public class Principal {
    
    public static void main(String[] args ) throws MessagingException{
        Inicio vent = new Inicio();
        vent.setVisible(true);
        EmailReader e = new EmailReader();
        e.recibirMail("isamasis09@gmail.com", "2017170050");
        
    }
    
}
