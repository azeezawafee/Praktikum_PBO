/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author Wafiq Azizah
 */
import java.util.Scanner;
public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        //Input
        System.out.println("Total pembelian: Rp ");
        double total = masukan.nextDouble();
        
        //Menentukan diskon
        double diskon, bayar;
        if(total < 50000){
            diskon = 0.05 * total;
        } else {
            diskon = 0.2 * total;
        }
        
        //Rumus menghitung jumlah yang harus dibayar
        bayar = total - diskon;
        
        //Output
        System.out.println("Besarnya potongan: Rp "+ diskon);
        System.out.println("Jumlah yang harus dibayarkan: Rp "+ bayar);
    }
}
