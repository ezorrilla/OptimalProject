
package controller;
import model.Proyecto;
import model.Restriccion;
import view.frmRecursos;

public class RecursosController {
    
    public static frmRecursos form = new frmRecursos();
    
    public static void mostrar () { form.setLocationRelativeTo(null); form.setVisible(true);}
    public static void ocultar () { form.setVisible(false);}     
    private static final Proyecto proyecto = ProcesamientoController.proyecto;
    
    public static void btnSiguiente(){
        /*RecursoMaterial rmaterial = new RecursoMaterial(form.getTxtDescripcionMaterial().getText(), Integer.parseInt(form.getTxtStockMaterial().getText()) );
        RecursoHumano rrhh = new RecursoHumano(form.getCboUnidadRRHH().getSelectedItem().toString(), Integer.parseInt(form.getTxtDisponibilidadRRHH().getText()) );
        
        ProcesamientoController.proyecto.setRecursoHumano(rrhh);
        ProcesamientoController.proyecto.setRecursoMaterial(rmaterial);*/
        proyecto.getRestricciones().clear();
        Restriccion restriccion1 = new Restriccion();
        restriccion1.setR(Integer.parseInt(form.getTxtStockMaterial().getValue().toString()));
        restriccion1.setDescripcion("Material " + form.getTxtDescripcionMaterial().getText());
        proyecto.getRestricciones().add(restriccion1);        
        
        Restriccion restriccion2 = new Restriccion();
        restriccion2.setR(Integer.parseInt(form.getTxtDisponibilidadRRHH().getValue().toString()));
        restriccion2.setDescripcion("RRHH en " + form.getCboUnidadRRHH().getSelectedItem().toString());       
        proyecto.getRestricciones().add(restriccion2);
    }
}
