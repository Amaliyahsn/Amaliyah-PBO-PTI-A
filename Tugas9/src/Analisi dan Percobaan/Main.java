import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MakhlukHidup orang = new Hewan();
        Identitas saya = new Manusia("Ni'mah",19 ); // nmer 6
        Manusia temenku = new Manusia("Elvira", 19); // nmer 8

        // nmer 7
        System.out.print("Nama saya: ");
        String nama = scan.nextLine();
        System.out.print("Umur saya: ");
        String umur = scan.nextLine();
 
        saya.tampilkanNama();
        saya.tampilkanUmur();
        // check nmer 1
        orang.bersuara();

        //nmer 8
        temenku.tidur();
    }
}

