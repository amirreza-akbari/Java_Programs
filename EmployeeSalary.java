import java.text.DecimalFormat;
import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salaries = new double[10]; // array for storing salaries
        DecimalFormat formatter = new DecimalFormat("#, ###"); // formatting numbers

        // getting salaries from user
        for (int i = 0; i < 10; i++) {
            while (true) { // loop for ensuring valid input
                try {
                    System.out.print("Enter salary of employee " + (i + 1) + ":  ");
                    salaries[i] = Double.parseDouble(scanner.nextLine());
                    if (salaries[i] < 0) { // checking for negative number
                        System.out.println("Salary cannot be negative. Please enter again.");
                    } else {
                        break; // if valid input, loop breaks
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }
            }
        }

        System.out.println("\nEmployees who earn more than 5, 700, 000: ");

        // checking and calculating taxes, child allowances and net salaries
        boolean found = false; // variable for checking existence of salaries above certain amount
        for (int i = 0; i < 10; i++) {
            if (salaries[i] >= 5700000) {
                found = true;
                double tax = salaries[i] * 0.05; // 5% tax
                double childAllowance = salaries[i] * 0.07; // 7% child allowance
                double netSalary = salaries[i] - tax + childAllowance;

                // formatting numbers for display
                String formattedInitialSalary = formatter.format(salaries[i]);
                String formattedTax = formatter.format(tax);
                String formattedChildAllowance = formatter.format(childAllowance);
                String formattedNetSalary = formatter.format(netSalary);

                // displaying information of each employee
                System.out.printf("Employee %d: %n",  i + 1);
                System.out.printf("  Initial salary:  %s%n",  formattedInitialSalary);
                System.out.printf("  Tax:  %s%n",  formattedTax);
                System.out.printf("  Child allowance:  %s%n",  formattedChildAllowance);
                System.out.printf("  Net salary:  %s%n%n",  formattedNetSalary);
            }
        }

        if (!found) {
            System.out.println("No employee earns more than 5, 700, 000.");
        }

        scanner.close();
    }
}
