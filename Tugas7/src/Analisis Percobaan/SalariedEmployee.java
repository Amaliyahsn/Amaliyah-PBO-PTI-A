import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary; // gaji/minggu

    public SalariedEmployee(String name, String noKTP, double salary, LocalDate tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double earnings() {
        double totalEarnings = getWeeklySalary();
        if (isBirthdayMonth()) {
            totalEarnings += 100000; // Tambahkan bonus jika ulang tahun
        }
        return totalEarnings;
    }

    public String toString() {
        return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary());
    }
}
