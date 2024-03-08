import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukkan kecepatan mobil m1: ");
        m1.setKecepatan(input.nextInt());
        input.nextLine(); // Membersihkan newline character dari buffer
        System.out.print("Waktu Yang ditempuh : ");
        m1.setWaktu(input.nextDouble());
        input.nextLine();
        System.out.print("Masukkan manufaktur mobil m1: ");
        m1.setManufaktur(input.nextLine());
        System.out.print("Masukkan nomor plat mobil m1: ");
        m1.setNoPlat(input.nextLine());
        System.out.print("Masukkan warna mobil m1: ");
        m1.setWarna(input.nextLine()); 
        m1.displayMessage();
        System.out.println("================");

        //instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.print("Masukkan kecepatan mobil m2: ");
        m2.setKecepatan(input.nextInt());
        input.nextLine(); // Membersihkan newline character dari buffer
        System.out.print("Waktu Yang ditempuh : ");
        m2.setWaktu(input.nextDouble());
        input.nextLine();
        System.out.print("Masukkan manufaktur mobil m2: ");
        m2.setManufaktur(input.nextLine());
        System.out.print("Masukkan nomor plat mobil m2: ");
        m2.setNoPlat(input.nextLine());
        System.out.print("Masukkan warna mobil m2: ");
        m2.setWarna(input.nextLine());
        m2.displayMessage();
        System.out.println("================");

        //merubah warna dari objek m1
        System.out.println("Mobil pada objek m1 dirubah menjadi warna hijau");
              m1.setWarna("Hijau"); // Mengubah warna menjadi "Hijau"
        //menampilkan hasil perubahan
            m1.displayMessage(); // Display mobil pertama dengan warna yang diperbarui
    }
}