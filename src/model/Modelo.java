package model;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Modelo {
    private Objetivo funcionObjetivo;
    private ArrayList<Restriccion> restricciones;
    private ArrayList<Point2D.Double> vertices;
    
    public Modelo(){
        this.funcionObjetivo = new Objetivo();
        this.restricciones = new ArrayList<Restriccion>();
        this.vertices = new ArrayList<Point2D.Double>();
    }
    
    public Modelo(Objetivo funcionObjetivo, ArrayList<Restriccion> restricciones, ArrayList<Point2D.Double> vertices) {
        this.funcionObjetivo = funcionObjetivo;
        this.restricciones = restricciones;
        this.vertices = vertices;
    }
    
    public Objetivo getFuncionObjetivo() {
        return funcionObjetivo;
    }

    @Override
    public String toString() {
        return "Modelo{" + "restricciones=" + restricciones + ", vertices=" + vertices + '}';
    }

    public void setFuncionObjetivo(Objetivo funcionObjetivo) {
        this.funcionObjetivo = funcionObjetivo;
    }

    public ArrayList<Restriccion> getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(ArrayList<Restriccion> restricciones) {
        this.restricciones = restricciones;
    }

    public ArrayList<Point2D.Double> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Point2D.Double> vertices) {
        this.vertices = vertices;
    }
    
    //Métodos
    public void intersectarRectas(){
        verticesEjes();
        
        for (int i = 0; i < restricciones.size(); i++) {
            Restriccion R1 = restricciones.get(i);
            
            for (int j = i+1; j < restricciones.size(); j++) {
                Restriccion R2 = restricciones.get(j);
                
                if( R1.isDiagonal() ){

                    if(R2.isDiagonal()){                            
                        this.verticeDiagonales(R1, R2);                            

                    }else if (R2.isHorizontal()) {
                        this.verticeDiagonalHorizontal(R1, R2);

                    }else if (R2.isVertical()) {
                        this.verticeDiagonalVertical(R1, R2);                               
                    }                        
                }

                if( R1.isHorizontal() ){

                    if(R2.isDiagonal()){
                        this.verticeDiagonalHorizontal(R2, R1);

                    }else if (R2.isVertical()) {
                        this.verticePerpendicular(R1, R2);                               
                    }
                }

                if( R1.isVertical() ){
                    if(R2.isDiagonal()){
                        this.verticeDiagonalVertical(R2, R1);

                    }else if (R2.isHorizontal()) {
                        this.verticePerpendicular(R2, R1);                               
                    }
                }
            }
        }
        System.out.println("vertices final="+vertices);
    }
    
    private void verticesEjes(){
        this.vertices.clear();
        this.vertices.add(new Point2D.Double(0,0));
        
        restricciones.forEach(r -> {
            if(r.isVertical() || r.isDiagonal())
                if(enRegionFactible(r.getEjeX(), 0))
                    this.vertices.add(new Point2D.Double(r.getEjeX(), 0));            
            
            if(r.isHorizontal() || r.isDiagonal())
                if(enRegionFactible(0, r.getEjeY()))
                    this.vertices.add(new Point2D.Double(0, r.getEjeY()));
            
        });
    }
    
    
    private boolean enRegionFactible(double x, double y){
        if (!( x >= 0 && y >= 0 )) return false;
        
        for (Restriccion r : restricciones) {
            switch (r.getLimite()){
                case "<=" -> {
                    if(!( r.getCoefX() * x + r.getCoefY() * y <= r.getR() )) return false;
                }
                case ">=" -> { 
                    if(!( r.getCoefX() * x + r.getCoefY() * y <= r.getR() )) return false;
                }
            }
        }
        
        return true;
    }
    
    private void verticeDiagonales(Restriccion R1, Restriccion R2){
    
        int cX1 = R1.getCoefX();
        int cY1 = R1.getCoefY();
        int cX2 = R2.getCoefX();
        int cY2 = R2.getCoefY();
        int limitR1 = R1.getR();
        int limitR2 = R2.getR();

        //Sistema de ecuaciones: Método de Reducción
        double X; double Y;
        int mtY1 = cY1; int mtY2 = cY2;
        
        cX1 *=  mtY2;     limitR1 *=  mtY2;
        cX2 *= -mtY1;     limitR2 *= -mtY1;        

        int cX = cX1 + cX2;
        int R = limitR1 + limitR2;

        X = (double)R / cX;
        
        
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

        Y = (double)R / cY;
        
        //Validar si forma parte de la región factible
        if (enRegionFactible(X,Y))
            this.vertices.add(new Point2D.Double(X,Y));
           
    }
    
    
    private void verticeDiagonalHorizontal(Restriccion R1, Restriccion R2){    
        int limitR1 = R1.getR();

        double X; double Y;

        //Sistema de ecuaciones: Reemplazando Y de horizontal en la Diagonal
        X = (double)(  ( limitR1 - (R1.getCoefY() * R2.getEjeY()) ) / R1.getCoefX()  );
        
        //Remplazando X
        Y = (double)(  ( limitR1 - (R1.getCoefX() * X) ) / R1.getCoefY()  );
                
        //Validar si forma parte de la región factible
        if (enRegionFactible(X,Y))
            this.vertices.add(new Point2D.Double(X,Y));
    }
    
    
    private void verticeDiagonalVertical(Restriccion R1, Restriccion R2){    
        int limitR1 = R1.getR();

        double X; double Y;

        //Sistema de ecuaciones: Reemplazo vertical X
        Y = (double)(  ( limitR1 - (R1.getCoefX() * R2.getEjeX()) ) / R1.getCoefY()  );
        
        //Remplazando Y
        X = (double)(  ( limitR1 - (R1.getCoefY() * Y) ) / R1.getCoefX()  );
        
        //Validar si forma parte de la región factible
        if (enRegionFactible(X,Y))
            this.vertices.add(new Point2D.Double(X,Y));
    }
    
    private void verticePerpendicular(Restriccion R1Horizontal, Restriccion R2Vertical){
        double X; double Y;

        Y = R1Horizontal.getEjeY();        
        X = R2Vertical.getEjeX();
        
        //Validar si forma parte de la región factible
        if (enRegionFactible(X,Y))
            this.vertices.add(new Point2D.Double(X,Y));
    }
  
}