package model;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Modelo {
    private Objetivo funcionObjetivo;
    private ArrayList<Restriccion> restricciones;
    private ArrayList<Point2D.Double> vertices;
    
    public void intersectarRectas(){
            
        for (Restriccion R1: restricciones) {
            
            for (Restriccion R2 : restricciones) {
            //R1.tabularRecta();        
                
                if(R1 != R2){
                    if( R1.isDiagonal() ){
                        if(R2.isDiagonal()){
                            this.verticeDiagonales(R1, R2);
                        }
                        
                        if (R2.isHorizontal()) {
                            this.verticeDiagonalHorizontal(R1, R2);                            
                        }
                        
                        if (R2.isVertical()) {
                            this.verticeDiagonalVertical(R1, R2);                               
                        }
                        
                    }
                                    
                    if( R1.isHorizontal() ){
                        if(R2.isDiagonal()){
                            this.verticeDiagonalHorizontal(R2, R1);
                        }
                                                
                        if (R2.isVertical()) {
                            this.verticePerpendicular(R1, R2);                               
                        }
                    }                    
                    
                    if( R1.isVertical() ){
                        if(R2.isDiagonal()){
                            this.verticeDiagonalVertical(R2, R1);
                        }
                                                
                        if (R2.isHorizontal()) {
                            this.verticePerpendicular(R2, R1);                               
                        }
                    }
                    
                }
                
            }            
            
        }    
    }
    
    private boolean existeVector(int[][] lista, int[] par){
        
        return true;
    }
    
    private boolean verticeDiagonales(Restriccion R1, Restriccion R2){
    
        int cX1 = R1.getCoefX();
        int cY1 = R1.getCoefY();
        int cX2 = R2.getCoefX();
        int cY2 = R2.getCoefY();
        int limitR1 = R1.getR();
        int limitR2 = R2.getR();

        //Sistema de ecuaciones: Metodo de Reduccion
        double X; double Y;
        int mtY1 = cY1; int mtY2 = cY2;
        
        cX1 *=  mtY2;     limitR1 *=  mtY2;
        cX2 *= -mtY1;     limitR2 *= -mtY1;        

        int cX = cX1 + cX2;
        int R = limitR1 + limitR2;

        X = R / cX;
        
        
        cX1 = R1.getCoefX();
        cY1 = R1.getCoefY();
        cX2 = R2.getCoefX();
        cY2 = R2.getCoefY();
        limitR1 = R1.getR();
        limitR2 = R2.getR();
        
        int mtX1 = cX1; int mtX2 = cX2;
        
        cY1 *=  mtX2;      limitR1 *=  mtX2;
        cY2 *= -mtX1;      limitR2 *= -mtX1;    
        
        
        int cY = cY1 + cY2;
        R = limitR1 + limitR2;

        Y = R / cY;
        
        //restricción de No Negatividad
        if ( X > 0 && Y > 0){
            this.vertices.add(new Point2D.Double(X,Y));
            return true;
        }else{
            return false;
        }        
    }
    
    
    private boolean verticeDiagonalHorizontal(Restriccion R1, Restriccion R2){    
        int limitR1 = R1.getR();

        double X; double Y;

        //Sistema de ecuaciones: Reemplazo horizontal Y
        X = ( limitR1 - (R1.getCoefY() * R2.getEjeY()) ) / R1.getCoefX();
        
        //Remplazando X
        Y = ( limitR1 - (R1.getCoefX() * X) ) / R1.getCoefY();
        
        //restricción de No Negatividad
        if ( X > 0 && Y > 0){
            this.vertices.add(new Point2D.Double(X,Y));
            return true;
        }else{
            return false;
        } 
    }
    
    
    private boolean verticeDiagonalVertical(Restriccion R1, Restriccion R2){    
        int limitR1 = R1.getR();

        double X; double Y;

        //Sistema de ecuaciones: Reemplazo vertical X
        Y = ( limitR1 - (R1.getCoefX() * R2.getEjeX()) ) / R1.getCoefY();
        
        //Remplazando Y
        X = ( limitR1 - (R1.getCoefY() * Y) ) / R1.getCoefX();
        
        //restricción de No Negatividad
        if ( X > 0 && Y > 0){
            this.vertices.add(new Point2D.Double(X,Y));
            return true;
        }else{
            return false;
        } 
    }
    
    private boolean verticePerpendicular(Restriccion R1Horizontal, Restriccion R2Vertical){
        double X; double Y;

        Y = R1Horizontal.getEjeY();        
        X = R2Vertical.getEjeX();
        
        //restricción de No Negatividad
        if ( X > 0 && Y > 0){
            this.vertices.add(new Point2D.Double(X,Y));
            return true;
        }else{
            return false;
        } 
    }
}
