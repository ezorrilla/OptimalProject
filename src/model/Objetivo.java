
package model;

import java.awt.geom.Point2D;
import java.util.List;

public class Objetivo {
    private double Z;
    public final String Max = "Max";
    public final String Min = "Min";
    private int coefX;
    private double X;
    private int coefY;
    private double Y;
    private String variableX;
    private String variableY;
    
    public Objetivo(){}
    
    public Objetivo(double Z, int coefX, double X, int coefY, double Y, String variableX, String variableY) {
        this.Z = Z;
        this.coefX = coefX;
        this.X = X;
        this.coefY = coefY;
        this.Y = Y;
        this.variableX = variableX;
        this.variableY = variableY;
    }
    
    public double getZ() {
        return Z;
    }

    public void setZ(double Z) {
        this.Z = Z;
    }

    public int getCoefX() {
        return coefX;
    }

    public void setCoefX(int coefX) {
        this.coefX = coefX;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public int getCoefY() {
        return coefY;
    }

    public void setCoefY(int coefY) {
        this.coefY = coefY;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public String getVariableX() {
        return variableX;
    }

    public void setVariableX(String variableX) {
        this.variableX = variableX;
    }

    public String getVariableY() {
        return variableY;
    }

    public void setVariableY(String variableY) {
        this.variableY = variableY;
    }

    @Override
    public String toString() {
        return "Objetivo{" + "Z=" + Z + ", coefX=" + coefX + ", X=" + X + ", coefY=" + coefY + ", Y=" + Y + ", variableX=" + variableX + ", variableY=" + variableY + '}';
    }
    
    //Métodos    
    public void calcularObjetivo(List<Point2D.Double> verticesRegion, String tipoOptimizacion){
        double valZ = 0;
        
        for (Point2D.Double v : verticesRegion) {
            double z = coefX * v.x + coefY * v.y;
            
            if (tipoOptimizacion.equalsIgnoreCase(Max)){
                if(z >= valZ){
                    X = v.x;
                    Y = v.y;
                    valZ = z;
                }
                
            }else if(tipoOptimizacion.equalsIgnoreCase(Min)){
                if(z <= valZ){
                    X = v.x;
                    Y = v.y;
                    valZ = z ;                
                }
            }          
        }
        Z = valZ;
    }
}
