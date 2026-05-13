/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class HitungHari extends PenentuJumlahHari{
    public int hitung(int tahun, String bulan){
        int jumlahHari = 0;
        
        switch(bulan){
            case "Januari", "Maret", "Mei", "Juli", "Agustus", "Oktober", "Desember" 
                    -> jumlahHari = 31;
            case "April", "Juni", "September", "November" 
                    -> jumlahHari = 30;
            case "Februari" -> {
                if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
                    jumlahHari = 29;
                }else{
                    jumlahHari = 28;
                }
            }
        }
        return jumlahHari;
    }
}
