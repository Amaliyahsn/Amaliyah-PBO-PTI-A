public class Main {
    public static void main(String[] args) {
        // Membuat objek menggunakan constructor overloading
        Kereta kereta1 = new Kereta("KA123", "Ekspres");
        Kereta kereta2 = new Kereta("KA456", "Komuter", 8);
        Kereta kereta3 = new Kereta("KA789", "Penggerak", 10, 50, 100.0, "Berhenti");

        // Memanggil method overloading dari satu objek
        kereta3.tambahPenumpang(10);
        kereta3.tambahPenumpang(5, true);
        kereta3.setKecepatan(50.0);
        Kereta.printInfo();

    }
}
