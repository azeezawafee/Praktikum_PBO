/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

//Menghitung deret bilangan prima dan bukan dari 0-20 dengan hasilnya
public class Looping1 {
    public static void main(String[]args){
        System.out.println("a. Menghitung deret bilangan prima dan bukan dari 0-20 dengan hasilnya");
        for(int n = 0; n <= 20; n++){
            boolean prima = true;
            
            if(n <= 1){
                prima = false;
            }else{
                for(int i = 2; i < n; i++){
                    if(n % i == 0){
                        prima = false;
                        break;
                    }
                }
            }
            if(prima){
                System.out.println(n + " = Prima");
            }else{
                System.out.println(n + " = Bukan Prima");
            }
        }
    }
}
