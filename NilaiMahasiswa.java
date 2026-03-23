/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author Wafiq Azizah
 */
import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        //Tampilan input
        System.out.println("NPM             : ");
        String npm = masukan.nextLine();
        System.out.println("Nama Mahasiswa  : ");
        String nama = masukan.nextLine();
        System.out.println("Nilai Kehadiran : ");
        double absen = masukan.nextDouble();
        System.out.println("Nilai Tugas     : ");
        double tugas = masukan.nextDouble();
        System.out.println("Nilai UTS       : ");
        double uts = masukan.nextDouble();
        System.out.println("Nilai UAS       : ");
        double uas = masukan.nextDouble();
        
        //Proses menghitung nilai akhir
        double nilaiAkhir = (0.1*absen)+(0.2*tugas)+(0.3*uts)+(0.4*uas);
        
        //Menentukan grade dan keterangan
        char grade; String keterangan;
        if(nilaiAkhir >= 76){
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if(nilaiAkhir >= 66){
            grade = 'B';
            keterangan = "BAIK";
        } else if(nilaiAkhir >= 56){
            grade = 'C';
            keterangan = "CUKUP";
        } else if(nilaiAkhir >= 46){
            grade = 'D';
            keterangan = "KURANG";
        } else {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }
        
        //Tampilan output
        System.out.println("\nNPM Mahasiswa   : "+ npm);
        System.out.println("Nama Mahasiswa  : "+ nama);
        System.out.println("Nilai Rata-rata : "+ nilaiAkhir);
        System.out.println("Grade           : "+ grade);
        System.out.println("Keterangan      : "+ keterangan);
    }
}
