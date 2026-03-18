/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphysm;

/**
 *
 * @author Wafiq Azizah
 */
class BangunRuang {
    double volume(){
        return 0;
    }
    double luasPermukaan(){
        return 0;
    }
}

class Balok extends BangunRuang {
    double p, l, t;
    
    Balok(double p, double l, double t){
        this.p = p;
        this.l = l;
        this.t = t;
    }
    
    double volume(){
        return p * l * t;
    }
    
    double luasPermukaan(){
        return 2 * (p*l + p*t + l*t);
    }
}

class Kubus extends BangunRuang {
    double s;
    
    Kubus(double s){
        this. s = s;
    }
    
    double volume(){
        return s * s * s;
    }
    
    double luasPermukaan(){
        return 6 * s * s;
    }
}

public class PolyOverride {
    public static void main(String[] args){
        BangunRuang b1 = new Balok(4, 3, 2);
        BangunRuang b2 = new Kubus(5);
        
        System.out.println("Balok:");
        System.out.println("Volume = " + b1.volume());
        System.out.println("Luas Permukaan = " + b1.luasPermukaan());
        
        System.out.println("\nKubus:");
        System.out.println("Volume = " + b2.volume());
        System.out.println("Luas Permukaan = " + b2.luasPermukaan());
    }
}
