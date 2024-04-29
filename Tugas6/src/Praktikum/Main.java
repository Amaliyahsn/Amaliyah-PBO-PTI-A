package Praktikum;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        // Test case
        System.out.println("Test case Manusia:");
        // Laki" Menikah
        Manusia lakiMenikah = new Manusia("Ali", true, "3576011703910003", true);
        // Perempuan Menikah
        Manusia perempuanMenikah = new Manusia("Nanda", false, "3576015203910005", true);
        //Belum menikah
        Manusia belumMenikah = new Manusia("Fidha", true, "3576015003910002", false);
        System.out.println("\na.laki Menikah" + lakiMenikah);
        System.out.println("\nb.perempuan Menikah " + perempuanMenikah);
        System.out.println("\nc.belum Menikah " + belumMenikah);

        System.out.println("\nTest case MahasiswaFilkom:");
        // IPK di bawah 3
        MahasiswaFILKOM mahasiswaA = new MahasiswaFILKOM("Ulek", true, "1234567891011120", false, "235150601111012", 2.8);
        // IPK di bawah 3 dan 3.5
        MahasiswaFILKOM mahasiswaB = new MahasiswaFILKOM("Napak", false, "1234567891314150", false, "235150607111005", 3.2);
        // IPK antara 3.5 dan 4
        MahasiswaFILKOM mahasiswaC = new MahasiswaFILKOM("Nime", true, "1234567891617180", false, "235150601111004", 3.7);
        System.out.println("\na.IPK di bawah 3 " + mahasiswaA);
        
        System.out.println("\nb.IPK antara 3 dan 3.5 " + mahasiswaB);
        System.out.println("\nc.IPK antara 3.5 dan 4 " + mahasiswaC);

        System.out.println("\nTest case Pekerja:");
        // Lama bekerja 2 tahun, anak 2
        Pekerja pekerjaA = new Pekerja("Eko", true, "3576010010810012", true, 4000, LocalDate.of(2022, 1, 1), 2);
        // Lama bekerja 9 tahun
        Pekerja pekerjaB = new Pekerja("Yuan", false, "3576012303950001", true, 5000, LocalDate.of(2015, 1, 1), 0);
        // Lama bekerja 20 tahun, anak 10
        Pekerja pekerjaC = new Pekerja("Adit", true, "3576021006910008", true, 6000, LocalDate.of(2004, 1, 1), 10);
        System.out.println("\na.Lama bekerja 2 tahun, anak 2 " + pekerjaA);
        System.out.println("\nb.Lama bekerja 9 tahun" + pekerjaB);
        System.out.println("\nc.Lama bekerja 20 tahun, anak 10 " + pekerjaC);

        System.out.println("\nTest case Manager:");
        // Lama bekerja 15 tahun dengan gaji $7500
        Manager manager = new Manager("El", false, "3576045004560007", true, 7500, LocalDate.of(2009, 1, 1), 0, "Keuangan");
        System.out.println(manager.toString());
    }
}
