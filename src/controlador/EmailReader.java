/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;
import java.io.*;
import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

public class EmailReader {
    
    /*Obtiene los mensajes recibidos en la bandeja de entrada: Asunto y correo electronico
    */
    public static void recibirMail( String correo, String password) throws MessagingException{
        
        try{
            Properties properties = new Properties();
            properties.setProperty("mail.store.protocol", "imaps");
            Session emailSession = Session.getDefaultInstance(properties);
            Store emailStore= emailSession.getStore("imaps");
            emailStore.connect("imap.gmail.com" , correo, password);
            
            //Obteniendo los mensajes de la bandeja de entrada
            Folder emailFolder= emailStore.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);
            Message messages[] = emailFolder.getMessages();
            
            for(int i= messages.length-3; i< messages.length; i++){
                Message message = messages[i];
                System.out.println("Email number: " + i+1 );
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: "+ message.getFrom()[0]);
                System.out.println("Sent date: "+ message.getSentDate());
                
            }//cerrando el folder del inbox
            
            emailFolder.close(false);
            emailStore.close();
            
            
        }catch(NoSuchProviderException nspe){
            nspe.printStackTrace();
            
        }catch(MessagingException me){
            me.printStackTrace();
        }
        
    }

   
    
    
    
    
}
