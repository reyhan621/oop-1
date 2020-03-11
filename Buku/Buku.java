package LatihanBuku;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class Buku {
    String judul;
    int jumlahHalaman;
    int harga;
    String Merk;
    String namaPemilik;
    String namaPenerbit;
    String namaPenulis;
    String namaInstansi;
    String namaPembimbing;
  
    public Buku(String judul, int jumlahHalaman, String namaPenulis, String namaPenerbit){
        this.jumlahHalaman = jumlahHalaman;
        this.judul = judul;
        this.namaPenerbit = namaPenerbit;
        this.namaPenulis = namaPenulis;
        this.namaPemilik = "bejo";
        
        
    }
    
    public Buku(int jumlahHalaman, String Merk){
        this.jumlahHalaman = jumlahHalaman;
        this.Merk = Merk;
    }
    
    public Buku(String judul, String namaPenulis, int jumlahHalaman, String namaPemilik, String namaInstansi, String namaPembimbing){
        this.judul = judul;
        this.namaPenulis = namaPenulis;
        this.jumlahHalaman = jumlahHalaman;
        this.namaPemilik = namaPemilik;
        this.namaInstansi = namaInstansi;
        this.namaPembimbing = namaPembimbing;
    }
    
    public Buku(String judul, int jumlahHalaman, String namaPemilik, String namaInstansi, String namaPembimbing){
        this.judul = judul;
        this.jumlahHalaman = jumlahHalaman;
        this.namaPemilik = namaPemilik;
        this.namaInstansi = namaInstansi;
        this.namaPembimbing = namaPembimbing ;
    }
    
    public Buku (int jumlahHalaman, String namaPemilik, String Merk, int harga){
        this.jumlahHalaman = jumlahHalaman;
        this.namaPemilik = namaPemilik;
        this.Merk = Merk;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNamaPenerbit() {
        return namaPenerbit;
    }

    public void setNamaPenerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public String getNamaInstansi() {
        return namaInstansi;
    }

    public void setNamaInstansi(String namaInstansi) {
        this.namaInstansi = namaInstansi;
    }

    public String getNamaPembimbing() {
        return namaPembimbing;
    }

    public void setNamaPembimbing(String namaPembimbing) {
        this.namaPembimbing = namaPembimbing;
    }
    
    
    
}
