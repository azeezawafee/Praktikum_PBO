/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author Wafiq Azizah
 */
import java.util.Scanner;
public class IMT {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        //Input
        System.out.println("Masukkan berat badan (kg): ");
        double berat = masukan.nextDouble();
        System.out.println("Masukkan tinggi badan (m): ");
        double tinggi = masukan.nextDouble();
        
        //Proses menghitung Indeks Massa Tubuh(IMT)
        double imt = berat / (tinggi * tinggi);
        
        //Menentukan berat badan
        String kriteria;
        if(imt < 18.5){
            kriteria = "Berat Badan Kurang";
        } else if(imt <= 24.9){
            kriteria = "Berat Badan Ideal";
        } else if(imt <= 29.9){
            kriteria = "Berat Badan Lebih";
        } else if(imt <= 39.9){
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }
        
        //Output
        System.out.println("\nNilai IMT   : "+ imt);
        System.out.println("Kriteria    : "+ kriteria);
    }
}
