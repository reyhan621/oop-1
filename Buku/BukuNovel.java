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
public class BukuNovel extends Buku{
    
    
    public BukuNovel( String judul, int jumlahHalaman, String namaPenulis, String namaPenerbit ) {
        super(judul, jumlahHalaman, namaPenulis, namaPenerbit);
    }


    public String toString() {
        return "BukuNovel{" + "judul=" + judul + ", jumlahHalaman=" + jumlahHalaman+ ", namaPenulis=" + namaPenulis + ", namaPenerbit=" + namaPenerbit + '}';
    }
}
