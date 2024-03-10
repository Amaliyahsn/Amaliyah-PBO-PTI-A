// class Pesawat {
//     + jenisPesawat: String
//     + kapasitasPenumpang: Int
//     + lebar: double
//     + panjang : double
//     + kapasitasBagasi : int
    
//     + tambahPenumpang(jumlah: int): void
//     + tambahMuatan(berat: double): void
//     + terbang(tujuan: String, ketinggian: int)void: void
//     + mendarat(): void
//     + lepasLnadas(): void
// }
import java.util.Scanner;
class Pesawat {
    private String jenisPesawat;
    private int kapasitasPenumpang;
    private double lebar;
    private double panjang;
    private int kapasitasBagasi;
    private int jumlahPenumpang;
    private double beratMuatan;
    private boolean sedangBeradaDiUdara;
    
 // Konstruktor untuk membuat objek Pesawat dengan beberapa parameter
 public Pesawat(String jenisPesawat, int kapasitasPenumpang, double lebar, double panjang, int kapasitasBagasi) {
    this.jenisPesawat = jenisPesawat;
    this.kapasitasPenumpang = kapasitasPenumpang;
    this.lebar = lebar;
    this.panjang = panjang;
    this.kapasitasBagasi = kapasitasBagasi;
    this.jumlahPenumpang = 0; // Awalnya jumlah penumpang adalah 0
    this.beratMuatan = 0; // Awalnya berat muatan adalah 0
    this.sedangBeradaDiUdara = false; // Awalnya pesawat tidak sedang berada di udara
}

// Metode untuk menambah jumlah penumpang
public void tambahPenumpang(int jumlah) {
    if (jumlahPenumpang + jumlah <= kapasitasPenumpang) {
        jumlahPenumpang += jumlah;
        System.out.println(jumlah + " penumpang berhasil ditambahkan.");
    } else {
        System.out.println("Kapasitas penumpang tidak mencukupi.");
    }
}

// Metode untuk menambah berat muatan
public void tambahMuatan(double berat) {
    if (beratMuatan + berat <= kapasitasBagasi) {
        beratMuatan += berat;
        System.out.println("Muatan seberat " + berat + " kg berhasil ditambahkan.");
    } else {
        System.out.println("Kapasitas bagasi tidak mencukupi.");
    }
}

// Metode untuk membuat pesawat terbang ke suatu tujuan dengan ketinggian tertentu
public void terbang(String tujuan, int ketinggian) {
    if (jumlahPenumpang > 0) {
        System.out.println("Pesawat terbang menuju " + tujuan + " pada ketinggian " + ketinggian + " kaki.");
        sedangBeradaDiUdara = true;
    } else {
        System.out.println("Tidak dapat terbang, tidak ada penumpang di pesawat.");
    }
}

// Metode untuk membuat pesawat mendarat
public void mendarat() {
    System.out.println("Pesawat mendarat.");
    sedangBeradaDiUdara = false;
}

// Metode untuk membuat pesawat lepas landas
public void lepasLandas() {
    if (jumlahPenumpang > 0 && beratMuatan > 0) {
        System.out.println("Pesawat lepas landas.");
        sedangBeradaDiUdara = true;
    } else {
        System.out.println("Tidak dapat lepas landas, penumpang atau muatan tidak mencukupi.");
    }
}

// Metode untuk menampilkan informasi pesawat
public void displayInfo() {
    System.out.println("Jenis Pesawat: " + jenisPesawat);
    System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    System.out.println("Lebar: " + lebar);
    System.out.println("Panjang: " + panjang);
    System.out.println("Kapasitas Bagasi: " + kapasitasBagasi);
    System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
    System.out.println("Berat Muatan: " + beratMuatan);
    System.out.println("Sedang Berada di Udara: " + sedangBeradaDiUdara);
}
}

// Kelas MainPesawat untuk menjalankan program
public class MainPesawat {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input

    // Membuat objek pesawat dengan menggunakan konstruktor yang sudah dibuat
    Pesawat pesawat1 = new Pesawat("Boeing 737", 200, 28.3, 30.2, 5000);

    // Menampilkan informasi awal pesawat
    System.out.println("Informasi awal pesawat:");
    pesawat1.displayInfo();

    // Menambah penumpang
    System.out.print("Masukkan jumlah penumpang yang akan ditambahkan: ");
    int tambahPenumpang = scanner.nextInt();
    pesawat1.tambahPenumpang(tambahPenumpang);

    // Menambah muatan
    System.out.print("Masukkan berat muatan yang akan ditambahkan (kg): ");
    double tambahMuatan = scanner.nextDouble();
    pesawat1.tambahMuatan(tambahMuatan);

    // Menjalankan pesawat
    pesawat1.lepasLandas();

    // Menampilkan informasi setelah perubahan
    System.out.println("\nInformasi setelah perubahan:");
    pesawat1.displayInfo();

    scanner.close(); // Menutup objek Scanner setelah digunakan
}
}