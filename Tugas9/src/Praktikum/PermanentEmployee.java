package Praktikum;

public class PermanentEmployee extends Employee {
    private String department;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String department) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void kelolaProyek() {
        System.out.println(getName() + " dari departemen " + department + " sedang mengelola proyek besar.");
    }

    public void evaluasiKinerja() {
        System.out.println(getName() + " dari departemen " + department + " sedang mengevaluasi kinerja tim.");
    }

    @Override
    public void work() {
        System.out.println(getName() + " bekerja sebagai karyawan tetap di departemen " + department + ".");
    }


}
