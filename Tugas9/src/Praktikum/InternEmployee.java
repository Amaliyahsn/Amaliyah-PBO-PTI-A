package Praktikum;

public class InternEmployee extends Employee implements Contract {
    private int internshipDuration;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, int internshipDuration) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.internshipDuration = internshipDuration;
    }

    public int getInternshipDuration() {
        return internshipDuration;
    }

    public void extendInternship(int months) {
        internshipDuration += months;
    }

    public void kerjakanProyek() {
        System.out.println(getName() + " sedang mengerjakan proyek magang.");
    }

    public void mintaMasukan() {
        System.out.println(getName() + " meminta masukan dari mentor.");
    }

    @Override
    public void work() {
        System.out.println(getName() + " bekerja sebagai karyawan magang.");
    }

    @Override
    public void attendTrainingSession() {
        System.out.println(getName() + " sedang menghadiri sesi pelatihan.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Durasi magang " + getName() + " adalah " + internshipDuration + " bulan.");
    }

}
