public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu; //no 4
    private double waktuSekon; //no 5
    private double rubahKeMs; //no 6
   
    
    public void setNoPlat(String s){
        noPlat = s;
    }
    
    public void setWarna(String s){
        warna = s;
    }
    
    public void setManufaktur(String s){
        manufaktur = s;
    }
    
    public void setKecepatan(int i){
        kecepatan = i;
        rubahKecepatan(i); 
    }
    
    public void setWaktu(double w) { 
        waktu = w;
        rubahKeSekon(w); 
    }
    
    private void rubahKeSekon(double w) { 
        waktuSekon = w * 3600;
    }
    
    private void rubahKecepatan(double i) { 
        rubahKeMs = kecepatan * 1000/3600; 
    }
    
    public double hitungJarak() { 
        return (rubahKeMs * waktuSekon) / 1000; 
    }
    
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memiliki warna "+warna);
        System.out.println("dan mampu menempuh kecepatan "+ rubahKeMs + " m/s");
        System.out.println("Jarak yang dapat di tempuh adalah " + hitungJarak() + " km" ); 
        //hitungJarak() dipanggil langsung di sout 
    }
}
