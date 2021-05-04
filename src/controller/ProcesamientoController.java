
package controller;
import model.Proyecto;
import view.frmProcesamiento;

public class ProcesamientoController {
    
    public static frmProcesamiento form = new frmProcesamiento();
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void ocultar () { form.setVisible(false);} 
    public static Proyecto proyecto = new Proyecto();
    
}
