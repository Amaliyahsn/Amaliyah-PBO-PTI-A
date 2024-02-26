import java.util.Scanner;

public class Login {

    // Array untuk menyimpan daftar username
    private static final String[] usernames = {"amliyhsn", "nisaaull", "nafasyahhh"};
    // Array untuk menyimpan daftar password yang sesuai dengan username
    private static final String[] passwords = {"password123", "password456", "password789"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<< SELAMAT DATANG >>");

        int percobaanGagal = 0; // Menyimpan jumlah percobaan login yang gagal

        // Menjalankan loop login dengan batasan tiga kali percobaan
        while (percobaanGagal < 3) {
            // Mendapatkan username dan password dari user
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // memanggil method isvalidlogin
            boolean loginBerhasil = isValidLogin(username, password);

            // Menampilkan pesan sesuai hasil validasi
            if (loginBerhasil) {
                System.out.println("Login berhasil!");
                break; // Keluar dari loop jika login berhasil
            } else {
                percobaanGagal++;
                System.out.println("Login gagal! Username atau password salah.");
            }
        }

        // Cek apakah percobaan gagal sudah mencapai tiga kali
        if (percobaanGagal == 3) {
        
        }
    }

    // Metode untuk memeriksa kecocokan username dan password
    private static boolean isValidLogin(String username, String password) {
        // Melakukan loop untuk mencari username dan password yang cocok di array
        for (int i = 0; i < usernames.length; i++) {
            if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                return true; // Jika cocok, mengembalikan true
            }
        }
        return false; // Jika tidak cocok, mengembalikan false
    }
}
