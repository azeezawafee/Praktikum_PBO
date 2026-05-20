/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas11;

/**
 *
 * @author HELLO
 */
import java.util.ArrayList;

public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
    
    public InputDataMahasiswa(){
        listMahasiswa = new ArrayList();
    }
    
    public void insertData(String nim, String nama, String alamat, String makul, double nilaiAkhir){
        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, makul, nilaiAkhir);
        listMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa>getALL(){
        return listMahasiswa;
    }
    
    public void deleteData(int index){
        listMahasiswa.remove(index);
    }
}
