package Praktikum;
import java.util.Scanner;
public class Transaksi {
  
    public static void main(String[] args) {
        // Menyimpan daftar pelanggan sebagai array
        Pelanggan[] daftarPelanggan = new Pelanggan[3]; 
        // Inisialisasi daftar pelanggan
        daftarPelanggan[0] = new Pelanggan("3834567800", "Amaliyah", 500000, 1234);
        daftarPelanggan[1] = new Pelanggan("5676388821", "Syahidatun", 10000, 2345);
        daftarPelanggan[2] = new Pelanggan("7456332004", "Ni'mah", 1500000, 4567);

        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di Swalayan Tiny!");
            System.out.print("Masukkan nomor pelanggan Anda: ");
            String nomorPelanggan = scanner.nextLine();
            // Memeriksa apakah nomor pelanggan yang dimasukkan valid
            Pelanggan pelanggan = cariPelanggan(daftarPelanggan, nomorPelanggan);
            if (pelanggan == null) {
                System.out.println("Nomor pelanggan tidak valid. Silakan coba lagi.");
                continue;
            }

            System.out.print("Masukkan PIN Anda: ");
            int pinDimasukkan = scanner.nextInt();
            scanner.nextLine();

            if (pelanggan.autentikasi(pinDimasukkan)) {
                // Jika autentikasi berhasil, memberikan layanan transaksi kepada pelanggan
                System.out.println("Autentikasi berhasil. Selamat datang, " + pelanggan.getNama() + "!");
                layananPelanggan(scanner, pelanggan);
            } else {
                // Jika autentikasi gagal, menampilkan pesan kesalahan
                System.out.println("Autentikasi gagal. Silakan coba lagi.");
            }
            
            // Memeriksa apakah pelanggan ingin melanjutkan transaksi atau keluar dari program
            System.out.print("Apakah Anda ingin melakukan transaksi lagi? (ya/tidak): ");
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("ya")) {
                break;
            }
        }

        // Menutup scanner setelah selesai digunakan
        scanner.close();
    }

    // Method untuk mencari pelanggan berdasarkan nomor pelanggan
    public static Pelanggan cariPelanggan(Pelanggan[] daftarPelanggan, String nomorPelanggan) {
        for (Pelanggan pelanggan : daftarPelanggan) {
            if (pelanggan.getNomorPelanggan().equals(nomorPelanggan)) {
                return pelanggan;
            }
        }
        return null;
    }

    // Method untuk memberikan layanan transaksi kepada pelanggan
    public static void layananPelanggan(Scanner scanner, Pelanggan pelanggan) {
        while (true) {
            // Menampilkan opsi layanan kepada pengguna
            System.out.println("1. Beli");
            System.out.println("2. Top-up");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();
            if (opsi == 1) {
                // Jika pengguna memilih opsi beli, meminta input jumlah pembelian dan memanggil method beli pada objek pelanggan
                System.out.print("Masukkan jumlah pembelian: ");
                double jumlahPembelian = scanner.nextDouble();
                scanner.nextLine();
                pelanggan.beli(jumlahPembelian);
            } else if (opsi == 2) {
                // Jika pengguna memilih opsi top-up, meminta input jumlah top-up dan memanggil method topUp pada objek pelanggan
                System.out.print("Masukkan jumlah top-up: ");
                double jumlahTopUp = scanner.nextDouble();
                scanner.nextLine();
                pelanggan.topUp(jumlahTopUp);
            } else if (opsi == 3) {
                // Jika pengguna memilih opsi keluar, keluar dari loop dan program berakhir
                System.out.println("Terima kasih ya sudah datang di Swalayan. Selamat datang kembali!");
                break;
            } else {
                // Jika pengguna memasukkan opsi yang tidak valid, tampilkan pesan kesalahan
                System.out.println("Opsi tidak valid. Silakan coba lagi.");
            }
        }
    }
}
