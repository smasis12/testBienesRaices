/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.io.*;
import static java.lang.Boolean.FALSE;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;

import javax.mail.Authenticator;
import javax.mail.Flags;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.search.FlagTerm;

public class EmailReader {
    
     private boolean textIsHtml = false;
    
    /*Obtiene los mensajes recibidos en la bandeja de entrada: Asunto y correo electronico
    */
    public void recibirMail(String correo, String password) {
        String subject;
       Properties prop = new Properties();
        prop.setProperty("mail.pop3.starttls.enable", "false");
        prop.setProperty(
            "mail.pop3.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        prop.setProperty("mail.pop3.socketFactory.fallback", "false");
        prop.setProperty("mail.pop3.port", "995");
        prop.setProperty("mail.pop3.socketFactory.port", "995");
        Session sesion = Session.getInstance(prop);
        // sesion.setDebug(true);

        try{
          // Se obtiene el Store y el Folder, para poder leer el
          // correo.
            Store store = sesion.getStore("pop3");
            store.connect(
                "pop.gmail.com", "isamasis09@gmail.com", "2017170050");
            Folder folder = store.getFolder("INBOX");
            folder.open(Folder.READ_ONLY);

            // Se obtienen los mensajes.
            Message[] mensajes = folder.getMessages();

            // Se escribe from y subject de cada mensaje
            for (int i = 0; i < mensajes.length; i++)
            {   
                String contenido;
                
                System.out.println(
                    "From:" + mensajes[i].getFrom()[0].toString());
                System.out.println("Subject:" + mensajes[i].getSubject());
                                              
                // Se visualiza el contenido de cada mensaje
                getText(mensajes[i]);
                
                
             
            }

            folder.close(false);
            store.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }       
                           
    }
    
     /**
     * Obtiene el cuerpo del mensaje
     */
    public static void getText(Part unaParte) throws MessagingException, IOException {
         try
        {
          // Si es multipart, se analiza cada una de sus partes recursivamente.
            if (unaParte.isMimeType("multipart/*"))
            {
                Multipart multi;
                multi = (Multipart) unaParte.getContent();

                for (int j = 0; j < multi.getCount(); j++)
                {
                    getText(multi.getBodyPart(j));
                }
            }
            else
            {
              // Si es texto, se escribe el texto.
                if (unaParte.isMimeType("text/*"))
                {
                    System.out.println("Texto " + unaParte.getContentType());
                    System.out.println(unaParte.getContent());
                    System.out.println("---------------------------------");
                }
                else
                {
                  // Si es imagen, se guarda en fichero y se visualiza en JFrame
                    if (unaParte.isMimeType("image/*"))
                    {
                        System.out.println(
                            "Imagen " + unaParte.getContentType());
                        System.out.println("Fichero=" + unaParte.getFileName());
                        System.out.println("---------------------------------");

                        //salvaImagenEnFichero(unaParte);
                        //visualizaImagenEnJFrame(unaParte);
                    }
                    else
                    {
                      // Si no es ninguna de las anteriores, se escribe en pantalla
                      // el tipo.
                        System.out.println(
                            "Recibido " + unaParte.getContentType());
                        System.out.println("---------------------------------");
                    }
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
     public String getPass(){
        String pass;
        pass= GenerarContraseña.getPassword();
        System.out.println(pass);
        return pass;
    }
     
     public void enviarMailNuevaPassword(String destinatario){
        
         String passw= getPass();
         
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "isamasis09@gmail.com";
        String password = "2017170050";
 
        // outgoing message information
        String mailTo = destinatario;
        String subject = "CONTRASEÑA DE REGISTRO AL SISTEMA BIENES RAÍCES";
 
        // message contains HTML markups
        String message = "<i>BIENVENIDO </i><br>";
        message += "<b>Gracias por registrarse al sistema bienes raices!!</b><br>";
        message += "<font color=red>su contraseña de acceso es:</font>";
        message+= "<b><br>";
        message+= passw;
 
        EmailReader mailer = new EmailReader();
 
        try {
            mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                    subject, message);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Failed to sent email.");
            ex.printStackTrace();
        }
     
     }
        
    
    
    public void enviarMail(String destinatario){
        
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "isamasis09@gmail.com";
        String password = "2017170050";
 
        // outgoing message information
        String mailTo = destinatario;
        String subject = "CONTRASEÑA DE REGISTRO AL SISTEMA BIENES RAÍCES";
 
        // message contains HTML markups
        String message = "<i>Greetings!</i><br>";
        message += "<b>Wish you a nice day!</b><br>";
        message += "<font color=red>Duke</font>";
 
        EmailReader mailer = new EmailReader();
 
        try {
            mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                    subject, message);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Failed to sent email.");
            ex.printStackTrace();
        }
        
        
        
        
    }
        
        
        
    
    
    
    
    
    //Envia correo en formato html
    
    
    public void sendHtmlEmail(String host, String port,final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException, MessagingException {
 
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
 
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
 
        Session session = Session.getInstance(properties, auth);
 
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
 
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        // set plain text message
        msg.setContent(message, "text/html");
 
        // sends the e-mail
        Transport.send(msg);
 
    }
    
    
    public void CrearUsuarioCliente() {
        
        String correo, nombre, contrasena ;
        int tel;
        
        
        
        //validar datos 
        //realizar insert a la tabla usuario cliente 
        
        
        
    
}

   
    
    
    
    
}
