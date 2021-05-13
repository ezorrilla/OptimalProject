package model;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Proyecto extends Modelo {
    //atributos
    private String empresa;
    private String actividad;
    private Interpretacion interpretacion;
    public Proyecto(){}    
    public Proyecto(String empresa, String actividad, Interpretacion interpretacion, Objetivo funcionObjetivo, ArrayList<Restriccion> restricciones, ArrayList<Point2D.Double> vertices) {
        super(funcionObjetivo, restricciones, vertices);
        this.empresa = empresa;
        this.actividad = actividad;
        this.interpretacion = interpretacion;
    }

    
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
 
    public Interpretacion getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(Interpretacion interpretacion) {
        this.interpretacion = interpretacion;
    }
   
    //funciones
}
