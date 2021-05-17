package model;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Proyecto extends Modelo {
    //atributos
    private String empresa;
    private String actividad;
    public Proyecto(){}    
    public Proyecto(String empresa, String actividad, Objetivo funcionObjetivo, ArrayList<Restriccion> restricciones, ArrayList<Point2D.Double> vertices) {
        super(funcionObjetivo, restricciones, vertices);
        this.empresa = empresa;
        this.actividad = actividad;
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
    
    //funciones    
    public String getInterpretacionObjetivo() {
        Objetivo obj = this.getFuncionObjetivo();
        var optimizar  = obj.getOptimizacion().equalsIgnoreCase("Max") ? "máximo" : "mínimo";
        return String.format( "<html><body>En la empresa %s deben producirse <span style='color: blue;'>%s</span> %s y <span style='color: blue;'>%s</span>  %s para obtener un valor %s de <span style='color: blue;'>%s</span>  de %s.</body></html>", 
                                            this.empresa ,obj.getX(), obj.getVariableX(), obj.getY(), obj.getVariableY(), optimizar, obj.getZ(), obj.getDescripcionZ() );
    }
    
    public String getInterpretacionRestricciones(){ 
        var interpretacion = "<html><body>";
        for (int i = 0; i < this.getRestricciones().size(); i++) {
            Restriccion R = this.getRestricciones().get(i);
            Objetivo obj = this.getFuncionObjetivo();
            interpretacion += String.format( "- Se necesitan una cantidad de <span style='color: blue;'>%s</span> %s para %s %s y <span style='color: blue;'>%s</span> %s para %s a %s para que satisfaga la restricción.<br><br>", 
                                            R.getCoefX() * obj.getX(), R.getDescripcion() , this.actividad, obj.getVariableX() , R.getCoefY() * obj.getY(), R.getDescripcion(),  this.actividad, obj.getVariableY() ); 
        }
        interpretacion += "</body></html>";
        return interpretacion;
    }
    
}
