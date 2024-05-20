package Praktikum;

public class Main {
    public static void main(String[] args) {
        Invoice[] invoices = {
            new Invoice("Barang1", 1, 1500000),
            new Invoice("Barang2", 2, 250000)
        };

        PermanentEmployee permanentEmployee = new PermanentEmployee(1, "Zaeni", 10000000, invoices, "IT");
        InternEmployee internEmployee = new InternEmployee(2, "Nuris", 3000000, invoices, 6);

        // Tampilkan detail PermanentEmployee
        System.out.println("Detail Karyawan Tetap:");
        permanentEmployee.displayEmployeeDetails();
        permanentEmployee.displayAnnualBonus();
        permanentEmployee.kelolaProyek();
        permanentEmployee.evaluasiKinerja();
        permanentEmployee.work();
        System.out.println();

        // Tampilkan detail InternEmployee
        System.out.println("Detail Karyawan Magang:");
        internEmployee.displayEmployeeDetails();
        internEmployee.kerjakanProyek();
        internEmployee.mintaMasukan();
        internEmployee.work();
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
        System.out.println();

        // Tampilkan detail setiap invoice
        System.out.println("Detail Invoices:");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
        System.out.println();
    }
}