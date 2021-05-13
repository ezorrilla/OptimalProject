
package controller;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Proyecto;
import model.Restriccion;
import view.dlgRestriccionesAd;

public class RestriccionesAdController {
    private static dlgRestriccionesAd form = new dlgRestriccionesAd(new JFrame(), true);
    private static String[] encabezados; 
    private static boolean filasInit;
    private static final Proyecto proyecto  = ProcesamientoController.proyecto;
    
    private static void formInit(){
        form.getLblVariableX().setText(proyecto.getFuncionObjetivo().getVariableX());
        form.getLblVariableY().setText(proyecto.getFuncionObjetivo().getVariableY());
        
        encabezados = new String[]{"Insumo",
                                    "Limitante",
                                    "Límite",
                                    proyecto.getFuncionObjetivo().getVariableX(),
                                    proyecto.getFuncionObjetivo().getVariableY()};
    }
        
    public static void mostrarDialogo (JFrame padre) { 
        form = new dlgRestriccionesAd(padre,true);
        formInit();
        listarRestricciones();
        form.setLocationRelativeTo(null); 
        form.setVisible(true);
    }
    
    
    public static void ocultar () { form.setVisible(false);}
    
    public static void btnAgregar(){
        String limite = form.getRbMaximo().isSelected() ? form.getRbMaximo().getText() : form.getRbMinimo().getText();
        
        if(proyecto.getRestricciones().size() <= 2 && !filasInit){
            String[][] filas = new String[][] {};     

            DefaultTableModel tbl = new DefaultTableModel(filas, encabezados);
            form.getTblRestricciones().setModel(tbl);
        }
        
        DefaultTableModel model = (DefaultTableModel) form.getTblRestricciones().getModel();
        model.addRow(new Object[]{form.getTxtInsumo().getText(), 
                                  form.getSpnLimitante().getValue(), 
                                  limite, 
                                  form.getSpnAsignacionX().getValue(),
                                  form.getSpnAsignacionY().getValue()});
        filasInit = true;
    }
    
    public static void btnEliminar(){        
        DefaultTableModel modelo = (DefaultTableModel) form.getTblRestricciones().getModel();
        modelo.removeRow(form.getTblRestricciones().getSelectedRow());
    }
    
    private static void listarRestricciones(){        
        int size = proyecto.getRestricciones().size() <= 2 ? 0 : proyecto.getRestricciones().size()-2;
        String[][] filas = new String[size][encabezados.length];

        for (int i = 2; i < proyecto.getRestricciones().size(); i++) {
            Restriccion restriccion = proyecto.getRestricciones().get(i);
            
            String[] data = new String[]{restriccion.getDescripcion(),
                String.valueOf(restriccion.getR()),
                restriccion.getLimite().equalsIgnoreCase("<=")? "Máximo":"Mínimo",
                String.valueOf(restriccion.getCoefX()),
                String.valueOf(restriccion.getCoefY())};
            
            filas[i-2] = data;
        }
        if (filas.length == 0){ filas = new String[][] {{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""}}; filasInit = false; }       
        
        DefaultTableModel tbl = new DefaultTableModel(filas, encabezados);
        form.getTblRestricciones().setModel(tbl);   
    }
    
    public static void btnGuardar(){
        Restriccion r1 = proyecto.getRestricciones().get(0);
        Restriccion r2 = proyecto.getRestricciones().get(1);
        proyecto.getRestricciones().clear();
        proyecto.getRestricciones().add(r1);
        proyecto.getRestricciones().add(r2);
                
        DefaultTableModel model = (DefaultTableModel) form.getTblRestricciones().getModel();
        
        for (int i = 0; i < model.getRowCount(); i++) {
            Restriccion restriccion = new Restriccion();
            restriccion.setDescripcion( model.getValueAt(i,0).toString() );                   
            restriccion.setCoefX( Integer.parseInt(model.getValueAt(i,3).toString()) );
            restriccion.setCoefY(Integer.parseInt(model.getValueAt(i,4).toString()));
            restriccion.setLimite( model.getValueAt(i,2).toString().equalsIgnoreCase("Máximo") ? "<=" : ">=" );  
            restriccion.setR( Integer.parseInt(model.getValueAt(i,1).toString()) );    
            restriccion.tabularRecta();
            proyecto.getRestricciones().add(restriccion);
        }
    }      
    
}
