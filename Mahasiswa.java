/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas11;

/**
 *
 * @author HELLO
 */
public class Mahasiswa {
    private String nim, nama, alamat, makul;
    double nilaiAkhir;
    
    public Mahasiswa(String nim, String nama, String alamat, String makul, double nilaiAkhir){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.makul = makul;
        this.nilaiAkhir = nilaiAkhir;
    }

    /*Mahasiswa(String nim, String nama, String alamat, String makul, double nilaiAkhir) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
    public String getnim(){
        return nim;
    }
    
    public String getnama(){
        return nama;
    }
    
    public String getalamat(){
        return alamat;
    }
    
    public String getmakul(){
        return makul;
    }
    
    public double getnilaiAkhir(){
        return nilaiAkhir;
    }
}