package Praktikum;

public abstract class Pegawai {
    private String nama;
    private String noKTP;
    
    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNoKTP() {
        return noKTP;
    }
    
    @Override
    public String toString() {
        return "Nama\t\t: " + nama + "\n No. KTP\t: " + noKTP;
    }
    
    // Abstract method untuk menghitung gaji
    public abstract double gaji();
}

