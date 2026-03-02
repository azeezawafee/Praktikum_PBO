/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Wafiq Azizah
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.membaca();
        mhs.nyontek();
        mhs.modifikasi();
    }
}

class Mahasiswa {
    
    public void membaca() {
        System.out.println("Mahasiswa sedang membaca buku.");
    }
    
    public void nyontek() {
        System.out.println("Mahasiswa sedang menyontek saat ujian.");
    }
    
    public void modifikasi() {
        System.out.println("Mahasiswa sedang memodifikasi tugas.");
    }
}