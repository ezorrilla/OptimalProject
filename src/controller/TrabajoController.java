
package controller;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Obra;
import model.Requerimiento;
import view.frmTrabajo;

public class TrabajoController {
    private static frmTrabajo form = new frmTrabajo();
    private static String[] encabezados; 
    
    private static void formInit(){
        form.getLblMaterial().setText("Cantidad de " + ProcesamientoController.proyecto.getRecursoMaterial().getDescripcion().toUpperCase());
        form.getLblRHumano().setText("Cantidad de " + ProcesamientoController.proyecto.getRecursoHumano().getUnidad().toUpperCase());
        
        encabezados = new String[]{"TRABAJO",
                                    ProcesamientoController.proyecto.getRecursoMaterial().getDescripcion().toUpperCase(),
                                    ProcesamientoController.proyecto.getRecursoHumano().getUnidad().toUpperCase(),
                                    "COSTO"};
        String[][] filas = new String[][]{{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
        
        DefaultTableModel tbl = new DefaultTableModel(filas,encabezados);
        form.getTblRequerimiento().setModel(tbl);    
    }
    
    public static void mostrar () { 
        formInit();
        form.setLocationRelativeTo(null); 
        form.setVisible(true);
    }
    public static void ocultar () { form.setVisible(false);}
    
    public static void btnAgregar(){
        Requerimiento requerimiento = new Requerimiento(Integer.parseInt(form.getTxtMaterial().getText()), 
                                                        Integer.parseInt(form.getTxtRHumano().getText()));
        
        Obra obra = new Obra(form.getTxtObra().getText(), requerimiento, Float.parseFloat(form.getTxtCostoObra().getText()));
        ProcesamientoController.proyecto.getObras().add(obra);
        
        listarObras();
    }
    
    private static void listarObras(){
        form.getTblRequerimiento().removeRowSelectionInterval(0, ProcesamientoController.proyecto.getObras().size()-1);
        DefaultTableModel model = (DefaultTableModel) form.getTblRequerimiento().getModel();
        
        for (int i = 0; i < ProcesamientoController.proyecto.getObras().size()-1; i++) {
            Obra objObra = ProcesamientoController.proyecto.getObras().get(i);
            
            String[] data = new String[]{objObra.getNombre(),
                String.valueOf(objObra.getRequerimiento().getCantidadRMaterial()),
                String.valueOf(objObra.getRequerimiento().getCantidadRHumano()),
                String.valueOf(objObra.getCosto())};
            
            model.addRow(new Object[]{data});
        }
        
        //filas = filas.length > 0 ? filas : new String[][] {{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
        
        
    }
}
