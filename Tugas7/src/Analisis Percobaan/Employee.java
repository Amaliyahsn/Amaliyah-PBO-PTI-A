import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate tanggalLahir;

    public Employee(String name, String noKTP, LocalDate tanggalLahir) {
        this.name = name;
        this.noKTP = noKTP;
        this.tanggalLahir = tanggalLahir;
    }
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }
    
    // nomer 4
    public boolean isBirthdayMonth() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == tanggalLahir.getMonth();
    }

    public String toString() {
        return String.format(" " + getName() + "\nNo. KTP :" + getNoKTP() + "\nTanggal Lahir: " + getTanggalLahir());
    }

    public abstract double earnings();// pendapatan
    
        
}