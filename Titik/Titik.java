/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Titik;

/**
 *
 * @author praktikan
 */
  
public class Titik {  
   
    private double x; 
    private double y;
    
   
    public Titik() {
    }
    

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    

    public void setY(double y) {
        this.y = y;
    }

    

    void naik() {
        y++ ;
    }

    void turun (){
        y-- ;
    }

    void kanan(){
        x++ ;
    }

    void kiri() {
        x--;
    }

    @Override
    public String toString() {
        return "Titik{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}