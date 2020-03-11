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
public class Garis {
   private Titik titikAwal;
   private Titik titikAkhir;
   private int jarak;

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

   
   public int getJarak(){
        int jarakX = (int) Math.pow((titikAkhir.getX()-titikAwal.getX()),2);
	int jarakY = (int) Math.pow((titikAkhir.getY()-titikAwal.getY()),2);
	jarak = (int) Math.pow((jarakX+jarakY),0.5);
	return jarak;	
   }

    @Override
    public String toString() {
        return "Garis{" + "Garis dari=" + titikAwal + ", sampai=" + titikAkhir + '}';
    }

   
   
}
