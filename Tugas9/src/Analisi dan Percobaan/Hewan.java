public class Hewan implements MakhlukHidup, Identitas {
    @Override
    public void makan() {
        System.out.println("Makan pakai tangan dan mulut");
    }

    @Override
    public void berjalan() {
        System.out.println("Jalan pakai 4 kaki");
    }

    @Override
    public void bersuara() {
        System.out.println("Suaranya nggak jelas");
    }

    public void tidur(){
        System.out.println("sedang tidur jangan ganggu");
    }
    public void tampilkanNama() {
    }

    public void tampilkanUmur() {
    }
}