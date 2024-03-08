public class Perpustakaan {
    private String buku1;
    private String penulis1;
    private String buku2;
    private String penulis2;
    private String buku3;
    private String penulis3;
    private String buku4;
    private String penulis4;
    private String buku5;
    private String penulis5;

    public void judulBuku1(String b, String p){
        buku1 = b;
        penulis1 = p;
    }
    public void judulBuku2(String b, String p){
        buku2 = b;
        penulis2 = p;
    }
    public void judulBuku3(String b, String p){
        buku3 = b;
        penulis3 = p;
    }
    public void judulBuku4(String b, String p){
        buku4 = b;
        penulis4 = p;
    }  
    public void judulBuku5(String b, String p){
        buku5 = b;
        penulis5 = p;
    }
    public void tampilan() {
        System.out.println("Buku 1 berjudul " + buku1 + " yang ditulis oleh " + penulis1);
        System.out.println("Buku 2 berjudul " + buku2 + " yang ditulis oleh " + penulis2);
        System.out.println("Buku 3 berjudul " + buku3 + " yang ditulis oleh " + penulis3);
        System.out.println("Buku 4 berjudul " + buku4 + " yang ditulis oleh " + penulis4);
        System.out.println("Buku 5 berjudul " + buku5 + " yang ditulis oleh " + penulis5);
    }

}
