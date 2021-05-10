
package model;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Objetivo {
    private double Z;
    private final String Max = "Max";
    private final String Min = "Min";
    private int coefX;
    private double X;
    private int coefY;
    private double Y;
    
    
    public void calcularObjetivo(ArrayList<Point2D.Double> verticesRegion, String tipoOptimizacion){
        double valZ = 0;
        
        for (Point2D.Double v : verticesRegion) {
            double z = coefX * v.x + coefY * v.y;
            
            if (tipoOptimizacion.equalsIgnoreCase(Max)){
                valZ = z > valZ ? z : valZ;
                
            }else if(tipoOptimizacion.equalsIgnoreCase(Min)){
                valZ = z < valZ ? z : valZ;
            }          
        }
        Z = valZ;
    }
}
