import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00, LocalDate.of(1990, 5, 15));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, LocalDate.of(1985, 10, 25));
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06, LocalDate.of(1992, 3, 8));
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300, LocalDate.of(1988, 7, 20));
        ProductionEmployee productionEmployee = new ProductionEmployee("Fulan", "456", 5.00, 100, LocalDate.of(1995, 12, 10)); // no.05
        
        // nomer 03
        // Employee employ = new Employee("nime", "2004") {
        //         }
            
        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned ",basePlusCommissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", productionEmployee, "pendapatan: ", productionEmployee.earnings());

        Employee[] employees = new Employee[5]; // [4] aslinya ganti 5 untuk perintah nomer 5 di rubah nyesuain kebutuhan
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = productionEmployee; // nomer 5
        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n",employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
