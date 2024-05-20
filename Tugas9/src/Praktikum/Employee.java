package Praktikum;

public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalInvoices = 0;
        for (Invoice invoice : invoices) {
            totalInvoices += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoices;
    }

    public void displayEmployeeDetails() {
        System.out.println("Nama Karyawan: " + name);
        System.out.println("Nomor Registrasi: " + registrationNumber);
        System.out.println("Gaji per Bulan: " + salaryPerMonth);
        System.out.println("Invoices:");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);  // Panggil toString dari Invoice
        }
        System.out.println("Total Gaji Setelah Potongan: " + getPayableAmount());
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public int calculateTotalExpenses() {
        int totalExpenses = 0;
        for (Invoice invoice : invoices) {
            totalExpenses += invoice.getQuantity() * invoice.getPricePerItem();
        }
        return totalExpenses;
    }

    // mthd static
    public static int calculateAnnualBonus(int monthlySalary) {
        return monthlySalary * 12 / 10; // 10% bonus dari gaji tahunan
    }

    public void displayAnnualBonus() {
        int annualBonus = calculateAnnualBonus(this.salaryPerMonth);
        System.out.println("Bonus Tahunan: " + annualBonus);
    }

    // Metode instans tambahan 1
    public void addInvoice(Invoice invoice) {
        Invoice[] newInvoices = new Invoice[invoices.length + 1];
        System.arraycopy(invoices, 0, newInvoices, 0, invoices.length);
        newInvoices[invoices.length] = invoice;
        this.invoices = newInvoices;
    }

    // Metode instans tambahan 2
    public int getTotalInvoicesAmount() {
        int total = 0;
        for (Invoice invoice : invoices) {
            total += invoice.getPayableAmount();
        }
        return total;
    }

    // Metode abstrak tambahan
    public abstract void work();
}
