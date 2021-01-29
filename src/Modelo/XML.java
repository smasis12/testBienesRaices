
package Modelo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class XML {
    
    public void XMLwrite(String pcorreo, String pclave){
         
        try {
            DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
            DocumentBuilder builder= factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            
            Document document = implementation.createDocument(null, "usuarios", null);
            document.setXmlVersion("1.0");
            
            Element clientes = document.createElement("clientes"); 
            Element cliente = document.createElement("cliente");
            
            Element correo= document.createElement("correo");
            Text txtCorreo= document.createTextNode(pcorreo);
            correo.appendChild(txtCorreo);
            cliente.appendChild(correo);
            
            
            //Element telefono= document.createElement("telefono");
            //Text txtTel = document.createTextNode(pcliente.getTelefono());
            //telefono.appendChild(txtTel);
            //cliente.appendChild(telefono);
            
                        
            Element clave = document.createElement("clave");
            Text txtClave = document.createTextNode(pclave);
            clave.appendChild(txtClave);
            cliente.appendChild(clave);
            
            clientes.appendChild(cliente);
            document.getDocumentElement().appendChild(clientes);
            
            //creando el fichero
            Source source = new DOMSource(document);
            Result result= new StreamResult(new File("usuarios.xml"));
            
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            
        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }

    XML() {
        
    }
    
    public void xmlRead(){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            
            
            Document documento = builder.parse(new File("usuarios.xml"));
            
            NodeList listaUsuarios = documento.getElementsByTagName("cliente");
            
            for(int i =0; i< listaUsuarios.getLength(); i++){
                Node nodo= listaUsuarios.item(i);
                if(nodo.getNodeType()== Node.ELEMENT_NODE){
                    Element e = (Element) nodo;
                    NodeList hijos = e.getChildNodes();
                    
                    for(int j= 0; j<hijos.getLength(); j++){
                        Node hijo= hijos.item(j);
                        if(hijo.getNodeType()==Node.ELEMENT_NODE){
                            Element eHijo= (Element) hijo;
                            System.out.println("Propiedad: "+ hijo.getNodeName()+" Valor: "+ hijo.getTextContent());
                        }
                    }
                }System.out.println("");
            }
            
            
            
        } catch (SAXException | IOException | ParserConfigurationException ex) {
            System.out.println(ex.getMessage());
        }       
        
    }
    
}
