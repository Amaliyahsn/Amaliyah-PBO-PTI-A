// class Mobil {
//     + jenisMobil: String
//     + nomorPlat: String
//     + kecepatan: double
//     + warna: String
//     + jenisBahanBakar:String
    
//     + nyalakanMesin(): void
//     + matikanMesin(): void
//     + tambahKecepatan(kecepatan: double): void
//     + kurangiKecepatan(kecepatan: double): void
//     + isiBensin(jumlah: double): void
// }
import java.util.Scanner;
public class KenMobil {
    private String jenisMobil; 
    private String nomorPlat; 
    private double kecepatan; 
    private String warna; 
    private String jenisBahanBakar; 
    private boolean mesinNyala; // Atribut untuk menunjukkan status mesin mobil (nyala atau tidak)

    // meth0d untuk membuat objek KenMobil dengan parameter jenis mobil, nomor plat, warna, dan jenis bahan bakar
    public KenMobil(String jenisMobil, String nomorPlat, String warna, String jenisBahanBakar) {
        this.jenisMobil = jenisMobil;
        this.nomorPlat = nomorPlat;
        this.warna = warna;
        this.jenisBahanBakar = jenisBahanBakar;
        this.kecepatan = 0; // Awalnya kecepatan mobil adalah 0
        this.mesinNyala = false; // Awalnya mesin mobil dimatikan
    }

    // Metode untuk menyalakan mesin mobil
    public void nyalakanMesin() {
        if (!mesinNyala) {
            System.out.println("Mesin dinyalakan.");
            mesinNyala = true;
        } else {
            System.out.println("Mesin sudah dinyalakan sebelumnya.");
        }
    }

    // Metode untuk mematikan mesin mobil
    public void matikanMesin() {
        if (mesinNyala) {
            System.out.println("Mesin dimatikan.");
            mesinNyala = false;
            kecepatan = 0; // Ketika mesin dimatikan, kecepatan direset menjadi 0
        } else {
            System.out.println("Mesin sudah dimatikan sebelumnya.");
        }
    }

    // Metode untuk menambah kecepatan mobil
    public void tambahKecepatan(double kecepatanTambah) {
        if (mesinNyala) {
            kecepatan += kecepatanTambah;
            System.out.println("Kecepatan bertambah menjadi " + kecepatan + " km/jam.");
        } else {
            System.out.println("Nyalakan mesin terlebih dahulu.");
        }
    }

    // Metode untuk mengurangi kecepatan mobil
    public void kurangiKecepatan(double kecepatanKurang) {
        if (mesinNyala) {
            if (kecepatanKurang <= kecepatan) {
                kecepatan -= kecepatanKurang;
                System.out.println("Kecepatan berkurang menjadi " + kecepatan + " km/jam.");
            } else {
                System.out.println("Kecepatan tidak dapat dikurangi melebihi kecepatan saat ini.");
            }
        } else {
            System.out.println("Nyalakan mesin terlebih dahulu.");
        }
    }

    // Metode untuk mengisi bensin ke mobil
    public void isiBensin(double jumlah) {
        System.out.println("Anda telah mengisi " + jumlah + " liter bahan bakar " + jenisBahanBakar + ".");
    }

    // Metode utama untuk menjalankan program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Meminta pengguna untuk memasukkan informasi mobil
        System.out.print("Masukkan jenis mobil: ");
        String jenisMobil = scanner.nextLine();

        System.out.print("Masukkan nomor plat: ");
        String nomorPlat = scanner.nextLine();

        System.out.print("Masukkan warna mobil: ");
        String warna = scanner.nextLine();

        System.out.print("Masukkan jenis bahan bakar: ");
        String jenisBahanBakar = scanner.nextLine();

        // Membuat objek KenMobil berdasarkan informasi yang dimasukkan pengguna
        KenMobil mobil = new KenMobil(jenisMobil, nomorPlat, warna, jenisBahanBakar);

        boolean run = true;
        while (run) {
            // Menampilkan menu aksi kepada pengguna
            System.out.println("\nPilih aksi:");
            System.out.println("1. Nyalakan Mesin");
            System.out.println("2. Matikan Mesin");
            System.out.println("3. Tambah Kecepatan");
            System.out.println("4. Kurangi Kecepatan");
            System.out.println("5. Isi Bensin");
            System.out.println("0. Keluar");

            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt(); // Membaca pilihan pengguna

            // Memproses pilihan pengguna menggunakan switch case
            switch (choice) {
                case 1:
                    mobil.nyalakanMesin();
                    break;
                case 2:
                    mobil.matikanMesin();
                    break;
                case 3:
                    System.out.print("Masukkan kecepatan yang ditambahkan: ");
                    double tambah = scanner.nextDouble();
                    mobil.tambahKecepatan(tambah);
                    break;
                case 4:
                    System.out.print("Masukkan kecepatan yang dikurangi: ");
                    double kurang = scanner.nextDouble();
                    mobil.kurangiKecepatan(kurang);
                    break;
                case 5:
                    System.out.print("Masukkan jumlah bensin yang diisi (dalam liter): ");
                    double isi = scanner.nextDouble();
                    mobil.isiBensin(isi);
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        System.out.println("Program selesai.");
        scanner.close(); // Menutup objek Scanner setelah digunakan
    }
}