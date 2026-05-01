/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7;

/**
 *
 * @author HELLO
 */
import java.util.Scanner;

public class ProgramArray {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("TOKO SERBA ADA\n***************");
        System.out.print("Masukkan Item Barang : ");
        int n = input.nextInt();
        
        String[] kodeBarang = new String[n];
        String[] namaBarang = new String[n];
        int[] hargaBarang = new int[n];
        int[] jumlahBeli = new int[n];
        int[] total = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode        : ");
            kodeBarang[i] = input.next();
            System.out.print("Masukkan jumlah beli : ");
            jumlahBeli[i] = input.nextInt();
            
            switch(kodeBarang[i]) {
                case "a001":
                    namaBarang[i] = "Buku";
                    hargaBarang[i] = 3000;
                    break;
                case "a002":
                    namaBarang[i] = "Pensil";
                    hargaBarang[i] = 4000;
                    break;
                case "a003":
                    namaBarang[i] = "Pulpen";
                    hargaBarang[i] = 5000;
                    break;
                default:
                    namaBarang[i] = "Tidak Diketahui";
                    hargaBarang[i] = 0;
                    break;
            }
            total[i] = hargaBarang[i] * jumlahBeli[i];
        }
        
        System.out.println("\nTOKO SERBA ADA\n*********************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("============================================================================");
        
        int totalBayar = 0;
        
        for(int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + kodeBarang[i] + 
                    "\t\t" + namaBarang[i] + "\t\t" + hargaBarang[i] + 
                    "\t" + jumlahBeli[i] + "\t\t" + total[i]);
            totalBayar += total[i];
        }
        
        System.out.println("============================================================================");
        System.out.println("Total Bayar: " + totalBayar);
        System.out.println("============================================================================");
    }
}
