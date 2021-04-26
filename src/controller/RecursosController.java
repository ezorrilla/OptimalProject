
package controller;
import view.frmRecursos;

public class RecursosController {
    
    public static frmRecursos form = new frmRecursos();
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void ocultar () { form.setVisible(false);} 
}
