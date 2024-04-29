package Praktikum;
import java.time.LocalDate;

public  class Manager extends Pekerja {
    private String departemen;

    // Constructor
    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    // Getter and Setter
    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    // Methods
    public double getPendapatan() {
        return super.getPendapatan() + (super.getGaji() * 0.1);
    }

    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen;
    }
}

