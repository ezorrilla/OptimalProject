
package controller;
import static controller.RecursosController.form;
import model.Proyecto;
import model.Restriccion;
import view.frmAsignacionRecursos;


public class AsignacionRecursosController {
    
    public static frmAsignacionRecursos form = new frmAsignacionRecursos();
    
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void ocultar () { form.setVisible(false);}     
    private static final Proyecto proyecto = ProcesamientoController.proyecto;
    
    
    public static void btnSiguiente(){
        
        Restriccion restriccionMaterial = proyecto.getRestricciones().get(0);
        restriccionMaterial.setCoefX(Integer.parseInt(form.getSpnMaterialV1().getValue().toString()));
        restriccionMaterial.setLimite("<=");
        restriccionMaterial.setCoefY(Integer.parseInt(form.getSpnMaterialV2().getValue().toString()));
        restriccionMaterial.tabularRecta();
        
        Restriccion restriccionRRHH = proyecto.getRestricciones().get(1);
        restriccionRRHH.setCoefX(Integer.parseInt(form.getSpnRRHHV1().getValue().toString()));
        restriccionRRHH.setCoefY(Integer.parseInt(form.getSpnRRHHV2().getValue().toString()));
        restriccionRRHH.setLimite("<=");
        restriccionRRHH.tabularRecta();
    }
}
