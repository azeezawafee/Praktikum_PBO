/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

/**
 *
 * @author HELLO
 */
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

/*/Menghitung deret bilangan ganjil dan genap dari 0-20 dengan hasilnya
class Looping2 {
    public static void main(String[]args){
        System.out.println("\nb. Menghitung deret bilangan ganjil dan genap dari 0-20 dengan hasilnya");
        for(int i = 0; i <= 20; i++){
            if(i % 2 == 0){
                System.out.println(i + " = Genap");
            }else{
                System.out.println(i + " = Ganjil");
            }
        }
    }
}

//Huruf Z-A
class Looping3 {
    public static void main(String[]args){
        System.out.println("\nc. Huruf Z-A");
        for(char c = 'Z'; c >= 'A'; c--) {
            System.out.println(c + " ");
        }
    }
}

//Lagu "Anak Ayam Turun N"
class Looping4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nd. Lagu 'Anak Ayam Turun N'");
        System.out.println("\nMasukkan jumlah ayam: ");
        int n = input.nextInt();
        
        System.out.println("\nLagu Anak Ayam: ");
        
        for(int i = n; i >= 1; i--) {
            System.out.println("Anak ayam turun " + i + 
                               ", mati satu tinggal " + (i - 1));
        }
    }
}*/