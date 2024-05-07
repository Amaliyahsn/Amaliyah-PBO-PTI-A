import java.time.LocalDate;
public class BasePlusCommissionEmployee extends CommissionEmployee {
   private double baseSalary;// gaji pokok tiap minggu

   public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary, LocalDate tanggalLahir) {
      super(name, noKTP, sales, rate, tanggalLahir);
      setBaseSalary(salary);
   }

   public void setBaseSalary(double salary) {
      baseSalary = salary;
   }

   public double getBaseSalary() {
      return baseSalary;
   }

   public double earnings() {
      double earnings = super.earnings() + getBaseSalary();
        if (isBirthdayMonth()) {
            earnings += 100000; // Tambah bonus jika bulan ulang tahun
        }
        return earnings;
   }

   public String toString() {
      return String.format("Base-Salaried " + super.toString() + "\nbase salary " + getBaseSalary());
   }
}
