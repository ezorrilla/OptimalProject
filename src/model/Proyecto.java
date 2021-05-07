package model;

import java.awt.Point;
import java.beans.Expression;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Vector;

public class Proyecto {
    //atributos
    private String empresa;
    private String actividad;
    private ArrayList<Obra> obras;
    private RecursoMaterial recursoMaterial;
    private RecursoHumano recursoHumano;
    
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public ArrayList<Obra> getObras() {
        if (obras == null) { obras = new ArrayList<>();}
        return obras;
    }

    public void setObras(ArrayList<Obra> obras) {
        this.obras = obras;
    }

    public RecursoMaterial getRecursoMaterial() {
        return recursoMaterial;
    }

    public void setRecursoMaterial(RecursoMaterial recursoMaterial) {
        this.recursoMaterial = recursoMaterial;
    }

    public RecursoHumano getRecursoHumano() {
        return recursoHumano;
    }

    public void setRecursoHumano(RecursoHumano recursoHumano) {
        this.recursoHumano = recursoHumano;
    }
    
    
    //funciones
        
    public Point[] tabularRecta(int cantidadRecurso){
        Point[] recta = new Point[getObras().size()];
        
        int x1; int x2;
        x1 = 0; //Para x1 = 0:
        x2 = cantidadRecurso / getObras().get(1).getRequerimiento().getCantidadRMaterial();

        recta[0] =  new Point(x1, x2);

        x2 = 0; //Para x2 = 0;
        x1 = cantidadRecurso / getObras().get(0).getRequerimiento().getCantidadRMaterial();

        recta[1] =  new Point(x1, x2); 
        
        return recta;
    }
    
    private static Point[] rectaRHumano;
    public void tabularRHumano(ArrayList<Obra> variablesObra, RecursoHumano rrhh){
        rectaRHumano = new Point[variablesObra.size()];
        
        int x1; int x2;
        x1 = 0; //Para x1 = 0:
        x2 = rrhh.getDisponibilidad() / getObras().get(1).getRequerimiento().getCantidadRHumano();

        rectaRHumano[0] =  new Point(x1, x2);

        x2 = 0; //Para x2 = 0;
        x1 = rrhh.getDisponibilidad() / getObras().get(0).getRequerimiento().getCantidadRHumano();

        rectaRHumano[1] =  new Point(x1, x2);
    }
    
    public static void intersectarRectas(Point[] recta1, Point[] recta2){
        
    }
    
    public Point calcularVerticeOptimo(){
        //X*15 + Y*10 <=280
	//X*20 + Y*14 <=800
        int cX1 = getObras().get(0).getRequerimiento().getCantidadRMaterial();
        int cY1 = getObras().get(0).getRequerimiento().getCantidadRHumano();
        int cX2 = getObras().get(1).getRequerimiento().getCantidadRMaterial();
        int cY2 = getObras().get(1).getRequerimiento().getCantidadRHumano();
        int limitR1 = getRecursoMaterial().getStock();
        int limitR2 = getRecursoHumano().getDisponibilidad();

        //Metodo de Reduccion
        int X; int Y;
        cX2 *= cY1;        cY2 *= cY1;      limitR2 *= cY1;
        
        int cX = cX1 + cX2;
        int R = limitR1 + limitR2;
        
        X = R / cX;        
        Y = (limitR1 - cX1 * X) / cY1;
        
        return new Point(X,Y);
    }
    
    public static int definirObjetivo(Enum restriccion,int X1, int X2){
        if (restriccion.equals("")){
            
        }
     return 1;
    }
}
