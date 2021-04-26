
package controller;
import view.frmPanelInicio;

public class PanelInicioController {
    public static frmPanelInicio form = new frmPanelInicio();
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void ocultar () { form.setVisible(false);}
}
