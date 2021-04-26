
package controller;
import model.Proyecto;
import view.frmInicioProyecto;

public class InicioProyectoController {
   
    public static frmInicioProyecto form = new frmInicioProyecto();
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void ocultar () { form.setVisible(false);} 
    
    public static void btnSiguiente(){
        Proyecto proyecto = new Proyecto();
        proyecto.setEmpresa(form.getTxtEmpresa().getText());
        proyecto.setActividad(form.getTxtActividad().getText());
    }
}
