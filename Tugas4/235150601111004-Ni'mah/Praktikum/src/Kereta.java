public class Kereta {
    private static String nomorKereta;
    private static String jenisKereta;
    private static int jumlahGerbong;
    private static int jumlahPenumpang;
    private static double kecepatan;
    private static String status;
    private int jumlah;

    // Constructor overloads
    public Kereta(String nomorKereta, String jenisKereta) {
        this.nomorKereta = nomorKereta;
        this.jenisKereta = jenisKereta;
    }

    public Kereta(String nomorKereta, String jenisKereta, int jumlahGerbong) {
        this.nomorKereta = nomorKereta;
        this.jenisKereta = jenisKereta;
        this.jumlahGerbong = jumlahGerbong;
    }

    public Kereta(String nomorKereta, String jenisKereta, int jumlahGerbong, int jumlahPenumpang, double kecepatan, String status) {
        this(nomorKereta, jenisKereta, jumlahGerbong);
        this.jumlahPenumpang = jumlahPenumpang;
        this.kecepatan = kecepatan;
        this.status = status;
    
    }
    public static void printInfo() {
        System.out.println("=====Informasi Kereta=====");
        System.out.println("Nomor Kereta: " + nomorKereta);
        System.out.println("Jenis Kereta: " + jenisKereta);
        System.out.println("Jumlah Gerbong: " + jumlahGerbong);
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Status: " + status);
    }

    // Method overloads
    public void tambahPenumpang(int jumlah) {
        this.jumlahPenumpang += jumlah;
    }

    public void tambahPenumpang(int jumlah, boolean prioritas) {
        if (prioritas) {
            this.jumlahPenumpang += jumlah * 2;
        } else {
            this.jumlahPenumpang += jumlah;
        }
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Method yang mengembalikan tipe data class itu sendiri
    public Kereta instance() {
        return this;
    }
}
