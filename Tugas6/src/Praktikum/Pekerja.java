package Praktikum;
import java.time.LocalDate;

public  class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    // Constructor
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    // Getter and Setter
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Methods
    public double getBonus() {
        int tahun = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahun >= 0 && tahun <= 5) {
            return gaji * 0.05;
        } else if (tahun > 5 && tahun <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }


    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + (jumlahAnak * 20);
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk: " + tahunMasuk + "\nJumlah Anak: " + jumlahAnak + "\nGaji: $" + gaji;
    }
}
