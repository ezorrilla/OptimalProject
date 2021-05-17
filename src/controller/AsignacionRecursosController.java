
package controller;
import model.Proyecto;
import model.Restriccion;
import view.frmAsignacionRecursos;


public class AsignacionRecursosController {
    
    public static frmAsignacionRecursos form = new frmAsignacionRecursos();
    private static final Proyecto proyecto = ProcesamientoController.proyecto;
    
    public static void mostrar () { 
        form.setLocationRelativeTo(null); form.setVisible(true);
        form.getLblVariable1X().setText(proyecto.getFuncionObjetivo().getVariableX().toUpperCase());
        form.getLblVariable1Y().setText(proyecto.getFuncionObjetivo().getVariableY().toUpperCase());
        form.getLblVariable2X().setText(proyecto.getFuncionObjetivo().getVariableX().toUpperCase());
        form.getLblVariable2Y().setText(proyecto.getFuncionObjetivo().getVariableY().toUpperCase());
    }
    public static void reiniciado () { form = new frmAsignacionRecursos(); }
    public static void ocultar () { form.setVisible(false);}     
    
    
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
