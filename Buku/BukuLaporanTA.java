package LatihanBuku;


import LatihanBuku.Buku;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class BukuLaporanTA extends Buku {
    
    public BukuLaporanTA(String judul, String namaPenulis, int jumlahHalaman, String namaPemilik, String namaInstansi, String namaPembimbing){
        super(judul, namaPenulis, jumlahHalaman, namaPemilik, namaInstansi, namaPembimbing);
    }

      @Override
    public String toString() {
        return "BukuLaporanTA{" + "judul=" + getJudul() + ", namaPenulis=" + getNamaPemilik() + 
                ", jumlahHalaman=" + getJumlahHalaman() + ", namaPemilik=" + getNamaPemilik() + 
                ", namaInstansi=" + getNamaInstansi() + ", namaPembimbing=" + getNamaPembimbing() + '}';
    }
    
}
