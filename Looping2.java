/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

//Menghitung deret bilangan ganjil dan genap dari 0-20 dengan hasilnya
public class Looping2 {
    public static void main(String[]args){
        System.out.println("b. Menghitung deret bilangan ganjil dan genap dari 0-20 dengan hasilnya");
        for(int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i + " = Genap");
            }else{
                System.out.println(i + " = Ganjil");
            }
        }
    }
}
