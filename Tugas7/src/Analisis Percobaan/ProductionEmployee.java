import java.time.LocalDate;

public class ProductionEmployee extends Employee {
    private double upahPerBarang;
    private int jumlahBarang;

    public ProductionEmployee(String name, String noKTP, double upahPerBarang, int jumlahBarang, LocalDate tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        this.upahPerBarang = upahPerBarang;
        this.jumlahBarang = jumlahBarang;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    public void setUpahPerBarang(double upahPerBarang) {
        this.upahPerBarang = upahPerBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    @Override
    public double earnings() {
        return upahPerBarang * jumlahBarang;
    }

    @Override
    public String toString() {
        return String.format("Production employee:%s\nUpah per barang: $%.2f\nJumlah barang: %d", super.toString(), upahPerBarang, jumlahBarang);
    }
}