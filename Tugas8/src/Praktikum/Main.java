package Praktikum;

public class Main {
    public static void main(String[] args) {
            PegawaiTetap pegawaitetap = new PegawaiTetap("Bayu", "35072849032742409342", 2000000);
            PegawaiHarian pegawaiharian = new PegawaiHarian("Edo", "35072849032742409343", 8500, 40);
            Sales sales = new Sales("Tika", "35072849032742409344", 50, 50000);
    
            // Upcasting
            Pegawai pegawai1 = (Pegawai) pegawaitetap;
            System.out.println(pegawai1.toString()); 
            Pegawai pegawai2 = (Pegawai)pegawaiharian;
            System.out.println(pegawai2.toString()); 
            Pegawai pegawai3 = (Pegawai)sales;
            System.out.println(pegawai3.toString()); 
    
            // Downcasting
            PegawaiTetap ptDwon = (PegawaiTetap) pegawai1;
            System.out.println(ptDwon.toString()); 
            PegawaiHarian phDown = (PegawaiHarian) pegawai2;
            System.out.println(phDown.toString());
            Sales sDown = (Sales) pegawai3; 
            System.out.println(sDown.toString());
        }
    }
    
