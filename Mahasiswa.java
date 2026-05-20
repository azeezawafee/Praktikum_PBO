public class Mahasiswa {
    private String nim, nama, alamat, makul;
    double nilaiAkhir;
    
    public Mahasiswa(String nim, String nama, String alamat, String makul, double nilaiAkhir){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.makul = makul;
        this.nilaiAkhir = nilaiAkhir;
    }
    
    public String getnim(){
        return nim;
    }
    
    public String getnama(){
        return nama;
    }
    
    public String getalamat(){
        return alamat;
    }
    
    public String getmakul(){
        return makul;
    }
    
    public double getnilaiAkhir(){
        return nilaiAkhir;
    }
}
