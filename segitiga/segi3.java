/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author praktikan
 */
public class segi3 {
    protected double a, t, luas, keliling;
    
    public segi3(){
        this.a = 0;
        this.t = 0;
    }

    public segi3(double a, double t) {
        this.a = a;
        this.t = t;
    }
    
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    public double getLuas(){
        luas = a*t*0.5;
        return luas;
    }
}
