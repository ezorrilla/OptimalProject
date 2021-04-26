
package controller;
import view.frmTrabajo;

public class TrabajoController {
    public static frmTrabajo form = new frmTrabajo();
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void ocultar () { form.setVisible(false);}
    
}
