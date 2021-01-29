/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.io.*;
import static java.lang.Boolean.FALSE;
import java.util.ArrayList;
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
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.search.FlagTerm;

public class EmailReader {
        
     private boolean textIsHtml = false;
     //Cliente cliente = new Cliente();
    // private static ArrayList<Cliente> ClientesNuevos = new ArrayList();
    
    /*Obtiene los mensajes recibidos en la bandeja de entrada: Asunto y correo electronico
    */
    public void recibirMail(String correo, String password) {       
       // Se obtiene la Session
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
                String from= mensajes[i].getFrom()[0].toString() ;
                
                //System.out.println("From:" + mensajes[i].getFrom()[0].toString());
                
                String subject= mensajes[i].getSubject();
                //System.out.println("Subject:" + mensajes[i].getSubject());
                
                // Se visualiza el contenido de cada mensaje
                EmailReader content = new EmailReader();
                String cuerpomsg=content.analizaParteDeMensaje(mensajes[i]) ;
                //System.out.println("el contenido del mensaje, explicitamente es: "+ content.analizaParteDeMensaje(mensajes[i]));   
                
               
                validarAsunto(from, subject, cuerpomsg );            
                
            }folder.close(false);
            store.close();
        }catch (Exception e){
            e.printStackTrace();
        }                                  
    }
    
    
     /**
     * Obtiene el cuerpo del mensaje
     */
    private String analizaParteDeMensaje(Part unaParte) {
        String result="";
        try{
          // Si es multipart, se analiza cada una de sus partes recursivamente.
            if (unaParte.isMimeType("multipart/*"))
            {
                MimeMultipart multi= (MimeMultipart) unaParte.getContent();
                result= getTextFromMimeMultipart(multi);

                for (int j = 0; j < multi.getCount(); j++) {
                    analizaParteDeMensaje(multi.getBodyPart(j));                                     
                }
            }else {
              // Si es texto, se escribe el texto.
                if (unaParte.isMimeType("text/*")) {
                    result= unaParte.getContent().toString();
                    //System.out.println("Texto " + unaParte.getContentType());
                    //System.out.println(unaParte.getContent());
                    //System.out.println("---------------------------------");
                }
          }
        }
        catch (Exception e){
            e.printStackTrace();            
        } return result;
    }
    //metodo requerido por el metodo "analizar parte del mensaje, convierte el contenido a string"
    private String getTextFromMimeMultipart(MimeMultipart mimeMultipart) throws MessagingException, IOException{
        String result="";
        int count = mimeMultipart.getCount();        
        for(int i=0; i< count; i ++){
            BodyPart bodyPart = mimeMultipart.getBodyPart(i);
            if(bodyPart.isMimeType("text/plain")){
                result= result + "\n"+ bodyPart.getContent();
                break;
            }else if(bodyPart.getContent() instanceof MimeMultipart){
                result= result+ getTextFromMimeMultipart((MimeMultipart) bodyPart.getContent());
            } }
        return result;
    }
    
    //Invoca a la clase Generar contrasenna con metodo encargado de generar una contrasenna para enviarla al correo del nuevo usuario
     public String getPass(){
        String pass;
        pass= GenerarContraseña.getPassword();
        System.out.println(pass);
        return pass;
    }
     //Metodo que envia la contrasenna que utilizara el nuevo usuario
     public String enviarMailNuevaPassword(String destinatario){        
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
            mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo, subject, message);
            System.out.println("Se envio la contraseña "+ passw +"al correo "+ mailTo);
        } catch (Exception ex) {
            System.out.println("Failed to sent email.");
            ex.printStackTrace();
        }
        return passw;
     }
        
    
    //metodo que envia el correo con la informacion de la propiedad que haya solicitado el cliente (no terminado)
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
        
             
        
        
    //metodo utilizado por el metodo enviarMail, este Envia correo en formato html    
    
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
    
    //Esta funcion se llama desde el main y permanece monitoreando los correos recibidos cada 9 segundos
    public void MonitorearNuevoCliente() { 
        
        String correo, nombre, contrasena ;
        int tel;
        
        Runnable runnable = new Runnable() {
			@Override
			public void run() {
				// Esto se ejecuta en segundo plano una única vez
				while (true) {
					// hacemos un ciclo infinito
					try {
						// En él, hacemos que el hilo duerma
						Thread.sleep(9000);
						// Y después realizamos las operaciones
						System.out.println("9 segundos pasaron, leyendo el correo nuevamente");
                                                recibirMail("isamasis09@gmail.com","2017170050");
						// Así, se da la impresión de que se ejecuta cada cierto tiempo
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		// Creamos un hilo y le pasamos el runnable
		Thread hilo = new Thread(runnable);
		hilo.start();

		// Y aquí podemos hacer cualquier cosa, en el hilo principal del programa
		//System.out.println("Yo imprimo en el hilo principal");      
        
        
        //validar datos 
        //realizar insert a la tabla usuario cliente  
        
        
    
}
    //metodo invocado por el metodo recibirMail principalmente para separar el contenido del correo con los datos del usuario
    public void validarAsunto(String from, String asunto, String cuerpomsg){
        String partesmsg[]= cuerpomsg.split(",");    // divide la informacion del cuerpo del correo en cada ,
        String nombre= partesmsg[0];
        String apellido= partesmsg[1];
        
        //convirtiendo el telefono a int        
        String tel = partesmsg[2];
        //int itel= Integer.parseInt(tel);
        
        String Sid= partesmsg[3];
       // int id= Integer.parseInt(Sid);
        
        String correoUsuario= parseandoCorreo(from);
        String asuntoMail = asunto;   
        String clave = enviarMailNuevaPassword(correoUsuario);
        
      /**  Cliente cliente = new Cliente();
        
        //aqui se debe validar el asunto (nuevo usuario) y hacer el insert a la base de datos y al xml
        cliente.setId(Sid);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCorreo(correoUsuario);
        cliente.setTelefono(tel);
        cliente.setClave(clave); **/
        
        System.out.println("REGISTRANDO USUARIO.\nCorreo  "+ correoUsuario+"\nASUNTO: "+asuntoMail+
                    "\nNombre:" + nombre+ "\nApellido  " + apellido+ "\ntelefono:  "+ tel);  
        
        //Registrando cliente en la base de datos
       // ConsultaBienesRaices c = new ConsultaBienesRaices();
       // c.registrarCliente(cliente);
        
        //creando el usuario en 
        new XML(correoUsuario,clave);
        
        
            
                        
    }
    //metodo que limpia etiquetas que no sean parte del correo electronico del usuario solicitante
    public String parseandoCorreo(String correoContenido){
        String correo= correoContenido;
        String getCorreo="";
        System.out.println("el primer corchete esta en el index: "+ correo.indexOf("<"));
        int indexBracket= correo.indexOf("<");
        System.out.println("el correo es: " + correo.substring(indexBracket+1, correo.length()-1));
        getCorreo= correo.substring(indexBracket+1, correo.length()-1);
        
        return getCorreo;
    }   
    
}
