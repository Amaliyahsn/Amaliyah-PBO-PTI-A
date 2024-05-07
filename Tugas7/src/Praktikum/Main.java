package Praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Kue[] kueArray = new Kue[20];

        //mengisi 20 objek kue dengan jenis kue(kuespesanan atau kuejadi)
        kueArray[0] = new KuePesanan("Kue Nastar", 35000, 1.00);
        kueArray[1] = new KuePesanan("Kue Sagu", 25000, 0.45);
        kueArray[2] = new KuePesanan("Kue Putri Salju", 20000, 0.50);
        kueArray[3] = new KuePesanan("Kue Kastangel", 26000, 0.30);
        kueArray[4] = new KuePesanan("Kue Kacang", 15000, 0.50);
        kueArray[5] = new KuePesanan("Kue Seprit", 18000, 0.35);
        kueArray[6] = new KuePesanan("Lidah Kucing", 20000, 0.25);
        kueArray[7] = new KuePesanan("Butter Cookies", 14000, 0.15);
        kueArray[8] = new KuePesanan("Donat",10000, 0.15);
        kueArray[9] = new KuePesanan("Kue Lapis", 12000, 0.25);
        kueArray[10]= new KueJadi("Kucur", 10000, 4);
        kueArray[11]= new KueJadi("Putu ayu", 8000, 5);
        kueArray[12]= new KueJadi("Getuk", 15000, 6);
        kueArray[13]= new KueJadi("Apem", 10000, 4);
        kueArray[14]= new KueJadi("Serabi", 5000, 2);
        kueArray[15]= new KueJadi("Dadar gulung", 10000, 3);
        kueArray[16]= new KueJadi("Bakpia", 20000, 8);
        kueArray[17]= new KueJadi("Rangin", 12000, 4);
        kueArray[18]= new KueBasi("Onde-Onde", 8000, 4);
        kueArray[19]= new KueBasi("Kue Pukis", 10000, 5);
    
        int pilih;
        do {
            System.out.println("\nDaftar Tampilan:");
            System.out.println("1. Tampilkan semua kue dan jenisnya");
            System.out.println("2. Hitung total harga semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan total lama hari dari KueBasi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    // Tampilkan semua kue dan jenisnya
                    for (Kue kue : kueArray) {
                        System.out.println(kue);
                    }
                    break;
                case 2:
                    // Hitung total harga semua jenis kue
                    double totalHarga = 0;
                    for (Kue kue : kueArray) {
                        totalHarga += kue.hitungHarga();
                    }
                    System.out.println("Total harga semua jenis kue: " + totalHarga);
                    break;
                case 3:
                    // Hitung total harga dan total berat dari KuePesanan
                    double totalHargaPesanan = 0;
                    double totalBerat = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KuePesanan) {
                            totalHargaPesanan += kue.hitungHarga();
                            totalBerat += ((KuePesanan) kue).getBerat();
                        }
                    }
                    System.out.println("Total harga KuePesanan: " + totalHargaPesanan);
                    System.out.println("Total berat KuePesanan: " + totalBerat);
                    break;
                case 4:
                    // Hitung total harga dan total jumlah dari KueJadi
                    double totalHargaJadi = 0;
                    double totalJumlah = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueJadi) {
                            totalHargaJadi += kue.hitungHarga();
                            totalJumlah += ((KueJadi) kue).getJumlah();
                        }
                    }
                    System.out.println("Total harga KueJadi: " + totalHargaJadi);
                    System.out.println("Total jumlah KueJadi: " + totalJumlah);
                    break;
                case 5:
                    // Tampilkan informasi kue dengan harga terbesar
                    Kue kueTerbesar = kueArray[0];
                    for (int i = 1; i < kueArray.length; i++) {
                        if (kueArray[i].getHarga() > kueTerbesar.getHarga()) {
                            kueTerbesar = kueArray[i];
                        }
                    }
                    System.out.println("Kue dengan harga terbesar: " + kueTerbesar);
                    break;
                case 6:
                    // Hitung total harga dan total lama hari dari KueBasi
                    double totalHargaBasi = 0;
                    int totalLamaHari = 0;
                    for (Kue kue : kueArray) {
                        if (kue instanceof KueBasi) {
                            totalHargaBasi += kue.hitungHarga();
                            totalLamaHari += ((KueBasi) kue).getLamaHari();
                        }
                    }
                    System.out.println("Total harga KueBasi: " + totalHargaBasi);
                    System.out.println("Total lama hari KueBasi: " + totalLamaHari);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 0);

    }
}
