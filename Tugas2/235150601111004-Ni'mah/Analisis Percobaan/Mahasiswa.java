public class Mahasiswa {
    public static void main(String[] args) {
        Menulis mahasiswa = new Menulis();
        mahasiswa.isiLembarBuku = 50; //50 lembar = 100 halaman
        mahasiswa.nulisKataPerHari = 100; // 100 kata 1/2 halaman perhari
        mahasiswa.banyakHari();
    }
} 
    class Menulis {
        public int isiLembarBuku;
        public int nulisKataPerHari;
        public int banyakHari;
        
        public void banyakHari() {
        banyakHari = isiLembarBuku * 4; 
        // dikali 4 karena perharinya dia bisa menulis 1/2 halaman dan 
        //1 kertas itu 2 halaman maka dari itu di bagi 4
            System.out.println("Banyak hari yang dibutuhkan untuk menulis 1 buku adalah "+banyakHari+" hari");
    }
}
