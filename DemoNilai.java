/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author Wafiq Azizah
 */
public class DemoNilai {
    public static void main(String[] args) {
        Nilai mhs = new Nilai(
            "xxxxxxx",
            "xxxxxxx",
            0000000,
            0000000,
            0000000,
            0000000,
            0000000);
            
        mhs.CetakNilai();
    }
}

class Nilai {
        String nim;
        String nama;
        double absen;
        double tugas;
        double uts;
        double uas;
        double nilaiAkhir;
    
    public Nilai(String nim, String nama, int absen, double tugas, double uts, double uas, double nilaiAkhir) {
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        
        nilaiAkhir = (absen * 0.10) + (tugas * 0.20) + (uts * 0.30) + (uas * 0.40);
    }
    
    public void CetakNilai() {
        System.out.println("NIM                     : "+ nim);
        System.out.println("Nama                    : " + nama);
        System.out.println("Nilai Absen [10%]       : " + absen);
        System.out.println("Nilai Tugas [20%]       : " + tugas);
        System.out.println("Nilai UTS [30%]         : " + uts);
        System.out.println("Nilai UAS [40%]         : " + uas);
        System.out.println("Nilai Akhir             : " + nilaiAkhir);
    }
}
