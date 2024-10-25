import java.util.Scanner;

class ProgressiveTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        double taxAmount = calculateTax(salary);
        double taxRate = calculateTaxRate(salary);

        System.out.printf("Salary: $%.2f%n", salary);
        System.out.printf("Effective Tax Rate: %.2f%%%n", taxRate);
        System.out.printf("Total Tax Amount: $%.2f%n", taxAmount);

        scanner.close();
    }

    public static double calculateTax(double salary) {
        double tax = 0.0;

        if (salary <= 14999) {
            tax = 0.0; // 0% tax
        } else if (salary <= 19999) {
            tax = (salary - 15000) * 0.10; // 10% on the amount over 15,000
        } else if (salary <= 29999) {
            tax = (4999 * 0.10) + (salary - 20000) * 0.15; // 10% on the first 5,000, then 15%
        } else if (salary <= 44999) {
            tax = (4999 * 0.10) + (9999 * 0.15) + (salary - 30000) * 0.20; // 20% on the amount over 30,000
        } else {
            tax = (4999 * 0.10) + (9999 * 0.15) + (14999 * 0.20) + (salary - 45000) * 0.25; // 25% on the amount over 45,000
        }

        return tax;
    }

    public static double calculateTaxRate(double salary) {
        double taxAmount = calculateTax(salary);
        return (taxAmount / salary) * 100;
    }
}
