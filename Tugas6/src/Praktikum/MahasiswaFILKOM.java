package Praktikum;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    // Constructor
    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    // Getter and Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Methods
    public String getStatus() {
        int prodi = Character.getNumericValue(nim.charAt(6));//mengambil karakter pada indeks ke-6 dari string nim
        int angkatan = Integer.parseInt(nim.substring(0, 2));//mengambil dua karakter pertama dari string nim
        String namaProdi;
        switch (prodi) {
            case 2://1651502XXXXXXX
                namaProdi = "Teknik Informatika";
                break;
            case 3://1651503XXXXXXX
                namaProdi = "Teknik Komputer";
                break;
            case 4://1651504XXXXXXX
                namaProdi = "Sistem Informasi";
                break;
            case 6://1651506XXXXXXX
                namaProdi = "Pendidikan Teknologi Informasi";
                break;
            case 7://1651507XXXXXXX
                namaProdi = "Teknologi Informasi";
                break;
            default:
                namaProdi = "Prodi tidak valid";
        }
        return namaProdi + ", " + (2000 + angkatan);
    }

    public double getBeasiswa() {
        if (ipk < 3) {
            return 0;
        } else if (ipk >= 3 && ipk <= 3.5) {
            return 50;
        } else {
            return 75;
        }
    }

    public double getPendapatan() {
        return getBeasiswa();
    }

    public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nIPK: " + ipk + "\nStatus: " + getStatus();
    }
}

