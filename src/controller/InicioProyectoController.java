
package controller;
import model.Proyecto;
import view.frmInicioProyecto;

public class InicioProyectoController {
   
    public static frmInicioProyecto form = new frmInicioProyecto();
    private static final Proyecto proyecto = ProcesamientoController.proyecto;
    
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void reiniciado () { form = new frmInicioProyecto(); }
    public static void ocultar () { form.setVisible(false);} 
    
    public static void btnSiguiente(){
        proyecto.setEmpresa(form.getTxtEmpresa().getText());
        proyecto.setActividad(form.getTxtActividad().getText());
        proyecto.getFuncionObjetivo().setVariableX(form.getTxtVariableX().getText());
        proyecto.getFuncionObjetivo().setVariableY(form.getTxtVariableY().getText());
    }
    
}
