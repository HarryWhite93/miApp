package miApp.controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Harrison
 */
@Named(value = "homeController")
@SessionScoped
public class HomeController implements Serializable {

    /**
     * Creates a new instance of HomeController
     */
    public HomeController() {
    }
    
    public String index(){
    return "/index";
    }
    
    public String acercaDe(){
    return "/home/acerca_de";
    }
    public String infoDelPie(){
        String nombre = null;
        String tipo = null;
        String usuario = "";
        if (nombre != null && tipo != null) {
            
            usuario = nombre + "("+tipo+")";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy h:mm a");
        Date d = new Date();
        String fechaStr = sdf.format(d);
        
        return usuario + " - " + fechaStr + " - Desarrollado por Java EE 7 - ";
    }
    
}
