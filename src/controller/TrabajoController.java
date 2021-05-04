
package controller;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import model.Obra;
import model.Proyecto;
import model.Requerimiento;
import view.frmTrabajo;

public class TrabajoController {
    private static final frmTrabajo form = new frmTrabajo();
    private static String[] encabezados; 
    private static final Proyecto proyecto  = ProcesamientoController.proyecto;
    
    private static void formInit(){
        form.getLblMaterial().setText("Cantidad de " + proyecto.getRecursoMaterial().getDescripcion().toUpperCase());
        form.getLblRHumano().setText("Cantidad de " + proyecto.getRecursoHumano().getUnidad().toUpperCase());
        
        encabezados = new String[]{"TRABAJO",
                                    proyecto.getRecursoMaterial().getDescripcion().toUpperCase(),
                                    proyecto.getRecursoHumano().getUnidad().toUpperCase(),
                                    "COSTO"};
    }
    
    public static void mostrar () { 
        formInit();
        listarObras();
        form.setLocationRelativeTo(null); 
        form.setVisible(true);
    }
    
    public static void ocultar () { form.setVisible(false);}
    
    public static void btnAgregar(){
        Requerimiento requerimiento = new Requerimiento(Integer.parseInt(form.getTxtMaterial().getText()), 
                                                        Integer.parseInt(form.getTxtRHumano().getText()));
        
        Obra obra = new Obra(form.getTxtObra().getText(), requerimiento, Float.parseFloat(form.getTxtCostoObra().getText()));
        proyecto.getObras().add(obra);
        
        listarObras();
    }
    
    private static void listarObras(){        
        String[][] filas = new String[proyecto.getObras().size()][encabezados.length];

        for (int i = 0; i < proyecto.getObras().size(); i++) {
            Obra obra = proyecto.getObras().get(i);
            
            String[] data = new String[]{obra.getNombre(),
                String.valueOf(obra.getRequerimiento().getCantidadRMaterial()),
                String.valueOf(obra.getRequerimiento().getCantidadRHumano()),
                String.valueOf(obra.getCosto())};
            
            filas[i] = data;
        }
        if (filas.length == 0){ filas = new String[][] {{"","","",""},{"","","",""},{"","","",""},{"","","",""}}; }       
        
        DefaultTableModel tbl = new DefaultTableModel(filas, encabezados);
        form.getTblRequerimiento().setModel(tbl);   
    }
}
