package ar.planificador.login;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.context.RequestContext;

import ar.planificador.util.MyUtil;

public class LoginBean implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String password;
    private boolean confirmPassword  = false;


    public String getName ()
    {
        return name;
    }


    public void setName (String name)
    {
        this.name = name;
    }


    public String getPassword ()
    {
        return password;
    }


    public void setPassword (String password)
    {
        this.password = password;
    }
    
    public String login() {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg = null;
        String ruta="";
        String estado="";
        
        if (name != null && name.equals("admin") && password != null  && password.equals("admin")) {
        	confirmPassword = true;
          msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenid@", name);
          ruta = MyUtil.basepathlogin();
          estado = "success";
        } else {
        	confirmPassword = false;
          msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Credenciales no v�lidas");
          estado = "false";
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
        context.addCallbackParam("estaLogeado", confirmPassword);
        if (confirmPassword) {
          context.addCallbackParam("ruta", ruta);
        }
        return estado;
    }
    
    public void login(ActionEvent actionEvent) {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg = null;
        String ruta="";
        
        if (name != null && name.equals("admin") && password != null  && password.equals("admin")) {
        	confirmPassword = true;
          msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenid@", name);
          ruta = MyUtil.basepathlogin();
        } else {
        	confirmPassword = false;
          msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Credenciales no v�lidas");
        }
        FacesContext.getCurrentInstance().addMessage(null, msg);
        context.addCallbackParam("estaLogeado", confirmPassword);
        if (confirmPassword) {
          context.addCallbackParam("ruta", ruta);
        }
    }
    

}
