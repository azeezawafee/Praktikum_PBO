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
