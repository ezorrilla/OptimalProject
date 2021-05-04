package model;

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
    
    public static int variable(int cx1,int cx2, int X, int limitante){
        
               int x = (cx1*0) + (8*X);
        return x;
    }
    
    public static int definirObjetivo(Enum restriccion,int X1, int X2){
        if (restriccion.equals("")){
            
        }
     return 1;
    }
}
