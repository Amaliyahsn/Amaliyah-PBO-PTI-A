import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Siswa :");
        int jmlhSiswa = input.nextInt();

        System.out.println("============================");
        Student [] siswa = new Student[jmlhSiswa];
        for (int i = 0; i < jmlhSiswa; i++){
            siswa[i] = new Student();

            System.out.print("Masukan Nama Siswa :");
            siswa[i].setName(input.next());
            System.out.print("Masukan Kota Siswa :");
            siswa[i].setAddress(input.next());
            System.out.print("Masukan Umur Siswa :");
            siswa[i].setAge(input.nextInt());
            System.out.print("Masukan Niai Matematika Siswa :");
            siswa[i].setMath(input.nextInt());
            System.out.print("Masukan Niai Bahasa inggris Siswa  :");
            siswa[i].setEnglish(input.nextInt());
            System.out.print("Masukan Niai IPA Siswa  :");
            siswa[i].setScience(input.nextInt());
        }
        System.out.println("\nInformasi Siswa:");
        for (int i = 0; i < jmlhSiswa; i++) {
            System.out.println("\nData Siswa ke-" + (i + 1));
        siswa[i].displayMessage();
   
    }
    // Menampilkan jumlah objek yang dibuat dari kelas Student
    System.out.println("\nJumlah objek Student yang dibuat: " + Student.getJumlahObjek());
    input.close();
 }
}