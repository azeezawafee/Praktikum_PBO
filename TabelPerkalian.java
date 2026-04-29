/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("TABEL PERKALIAN");
        System.out.print("\nMasukkan nilai n (<=10): ");
        int n = input.nextInt();
        
        System.out.println();
        System.out.print("\t");
        for(int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        
        for(int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
            for(int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
