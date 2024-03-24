// class Kereta {
//     + nomorKereta: String
//     + jenisKereta: String
//     + jumlahGerbong: int
//     + jumlahPenumpang: int
//     + kecepatan: double
//     + status: String
  
//     + setKecepatan(kecepatan : double): void
//     + tambahPenumpang(jumlah: int): void
//     + kurangiPenumpang(jumlah: int): void
//     + berangkat(): void
//     + berhenti(): void
// }
import java.util.Scanner;
class Kereta {
    // Atribut-atribut kereta
    private String nomorKereta; 
    private String jenisKereta; 
    private int jumlahGerbong; 
    private int jumlahPenumpang; 
    private double kecepatan; 
    private String status; 

    //Konstruktor untuk membuat objek Kereta dengan parameter-parameter yang diberikan
    public Kereta(String nomorKereta, String jenisKereta, int jumlahGerbong, int jumlahPenumpang, double kecepatan, String status) {
        this.nomorKereta = nomorKereta;
        this.jenisKereta = jenisKereta;
        this.jumlahGerbong = jumlahGerbong;
        this.jumlahPenumpang = jumlahPenumpang;
        this.kecepatan = kecepatan;
        this.status = status;
    }

    public Kereta(String string, String string2, int i) {
        //TODO Auto-generated constructor stub
    }

    public Kereta(String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    // Metode untuk mengatur kecepatan kereta
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
        // Jika kecepatan berubah menjadi lebih dari 0, maka status kereta berubah menjadi "Berangkat"
        if (kecepatan > 0) {
            this.status = "Berangkat";
        }
    }

    // Metode untuk menambah jumlah penumpang pada kereta
    public void tambahPenumpang(int jumlah) {
        this.jumlahPenumpang += jumlah;
    }

    // Metode untuk mengurangi jumlah penumpang pada kereta
    public void kurangiPenumpang(int jumlah) {
        if (this.jumlahPenumpang - jumlah >= 0) {
            this.jumlahPenumpang -= jumlah;
        } else {
            System.out.println("Jumlah penumpang tidak mencukupi.");
        }
    }

    // Metode untuk menandai kereta berangkat
    public void berangkat() {
        this.status = "Berangkat";
    }

    // Metode untuk menandai kereta berhenti
    public void berhenti() {
        this.status = "Berhenti";
    }

    // Metode untuk menampilkan informasi kereta
    public void displayInfo() {
        System.out.println("Nomor Kereta: " + nomorKereta);
        System.out.println("Jenis Kereta: " + jenisKereta);
        System.out.println("Jumlah Gerbong: " + jumlahGerbong);
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Status: " + status);
    }

    public String getNomorKereta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNomorKereta'");
    }

    public void tambahPenumpang(int i, boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tambahPenumpang'");
    }

    public static void printInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printInfo'");
    }
}

// Kelas utama yang berisi method main
public class MainKereta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Membuat objek kereta dengan parameter yang diberikan
        Kereta kereta1 = new Kereta("K001", "Eksekutif", 10, 50, 0, "Berhenti");

        // Menampilkan informasi awal kereta
        System.out.println("Informasi awal kereta:");
        kereta1.displayInfo();

        // Mengubah kecepatan kereta
        System.out.print("Masukkan kecepatan baru: ");
        double newSpeed = scanner.nextDouble();
        kereta1.setKecepatan(newSpeed);

        // Menambah penumpang
        System.out.print("Masukkan jumlah penumpang yang akan ditambahkan: ");
        int tambahPenumpang = scanner.nextInt();
        kereta1.tambahPenumpang(tambahPenumpang);

        // Menampilkan informasi setelah perubahan
        System.out.println("\nInformasi telah diubah:");
        kereta1.displayInfo();

        // Menampilkan pesan tambahan
        System.out.println("\nHati-hati di jalan.");

        scanner.close(); // Menutup objek Scanner setelah digunakan
    }
}