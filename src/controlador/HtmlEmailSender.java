package controlador;

import java.util.Date;
import java.util.Properties;
 
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
 
public class HtmlEmailSender {
 
    public void sendHtmlEmail(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException,
            MessagingException {
 
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
 
    /**
     * Test the send html e-mail method
     *
     */
    public static void main(String[] args) {
        // SMTP server information
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "isamasis09@gmail.com";
        String password = "2017170050";
 
        // outgoing message information
        String mailTo = "isamasis09@gmail.com";
        String subject = "Hello my friend";
 
        // message contains HTML markups
        String message = "<i>Greetings!</i><br>";
        message += "<b>Wish you a nice day!</b><br>";
        message += "<font color=red>Duke</font>";
 
        HtmlEmailSender mailer = new HtmlEmailSender();
 
        try {
            mailer.sendHtmlEmail(host, port, mailFrom, password, mailTo,
                    subject, message);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Failed to sent email.");
            ex.printStackTrace();
        }
    }
}


/*
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class Mail {
   
    
    public static void sendMail(String recepient) throws Exception{
        
       System.out.println("preparing to send email");
      
      Properties properties = new Properties();
      
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.starttls.enable","true");
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.port","587");
      
      final String myAccountEmail = "isamasis09gmail.com";
      final String password= "2017170050";
      
      Session session= Session.getInstance(properties, new Authenticator() {
          
          @Override
          protected PasswordAuthentication getPasswordAuthentication(){
              return new PasswordAuthentication(myAccountEmail, password);
              
          }
      });
      
      
      Message message = prepareMessage(session, myAccountEmail, recepient);   
      Transport.send(message);
        System.out.println("Message sent successfully");
      
    }
    
    private static Message prepareMessage(Session session, String myAccountEmail, String recepient) throws AddressException{
        try{
            
            Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myAccountEmail));
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
        message.setSubject("testing emailing w java");
        String htmlCode= "<h1> we love java</h1><br/> <h2><b> Next line </b></h2>";
        message.setContent(htmlCode,"text/html");
        return message;
            
        }catch(MessagingException ex){
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE , null, ex);
        }
        return null;
    }          
}
*/