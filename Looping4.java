/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author HELLO
 */
//Lagu "Anak Ayam Turun N"
import java.util.Scanner;

public class Looping4 {
    public static void main(String[]args){
        System.out.println("d. Lagu 'Anak Ayam Turun N'");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nMasukkan jumlah ayam: ");
        int n = input.nextInt();
        
        System.out.println("\nLagu Anak Ayam: ");
        
        for(int i = n; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i + 
                               ", mati satu tinggal " + (i - 1));
        }
    }
}
