/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanBuku;

/**
 *
 * @author praktikan
 */
public class BukuTulis extends Buku{
   
    public BukuTulis(int jumlahHalaman, String Merk) {
         super(jumlahHalaman, Merk);
    } 
    

    @Override
    public String toString() {
        String getJumlahHalaman = null;
        String getMerk = null;
        
        return "BukuTulis{" + " jumlahHalaman=" + getJumlahHalaman + ", Merk=" + getMerk +  '}';
    }
    
}
    
    
    
    
}
