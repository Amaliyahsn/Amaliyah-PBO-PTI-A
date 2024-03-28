package Praktikum;

public class Pelanggan {
    private final String nomorPelanggan;
    private final String nama;
    private double saldo;
    private final int pin;
    private int percobaanAutentikasi;

    public Pelanggan(String nomorPelanggan, String nama, double saldo, int pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.percobaanAutentikasi = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean autentikasi(int pinDimasukkan) {
        if (pin == pinDimasukkan) {
            percobaanAutentikasi = 0;
            return true;
        } else {
            percobaanAutentikasi++;
            if (percobaanAutentikasi >= 3) {
                System.out.println("Akun diblokir");
                return false;
        
            } else {
                System.out.println("PIN salah. Silakan coba lagi.");
                return false;
            }
        }
    }

    public void beli(double jumlah) {
        double cashback = 0.0;
    
        // Mengambil 2 digit pertama dari nomorPelanggan
        String jenisRekening = nomorPelanggan.substring(0, 2);
    
        // Menghitung cashback berdasarkan jenis rekening
        if (jumlah > 1000000) {
            if (jenisRekening.equals("38")) {
                cashback = jumlah * 0.05;
            } else if (jenisRekening.equals("56")) {
                cashback = jumlah * 0.07;
            } else if (jenisRekening.equals("74")) {
                cashback = jumlah * 0.10;
            }
        }
    
        // Menambahkan cashback ke saldo jika ada
        saldo += cashback;
    
        double totalPembelian = jumlah - cashback;
    
        if (saldo - totalPembelian >= 10000) {
            saldo -= totalPembelian;
            System.out.println("Pembelian berhasil. Saldo tersisa: " + saldo);
        } else {
            System.out.println("Saldo tidak mencukupi untuk transaksi ini.");
        }
    }
    public void topUp(double jumlah) {
        saldo += jumlah;
        System.out.println("Top-up berhasil. Saldo baru: " + saldo);
    }
}