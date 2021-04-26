
package controller;
import model.Proyecto;
import model.RecursoHumano;
import model.RecursoMaterial;
import view.frmRecursos;

public class RecursosController {
    
    public static frmRecursos form = new frmRecursos();
    
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void ocultar () { form.setVisible(false);} 
    
    public static void btnSiguiente(){
        RecursoMaterial rmaterial = new RecursoMaterial(form.getTxtDescripcionMaterial().getText(), Integer.parseInt(form.getTxtStockMaterial().getText()) );
        RecursoHumano rrhh = new RecursoHumano(form.getCboUnidadRRHH().getSelectedItem().toString(), Integer.parseInt(form.getTxtDisponibilidadRRHH().getText()) );
        
        ProcesamientoController.proyecto.setRecursoHumano(rrhh);
        ProcesamientoController.proyecto.setRecursoMaterial(rmaterial);
    }
}
