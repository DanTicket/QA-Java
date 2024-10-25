import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // part 1
        String firstName;
        String lastName;

        firstName = "Bob";
        lastName = "Ban";

        System.out.println(firstName + lastName);

        // part 2
        int num1;
        int num2;

        num1 = 10;
        num2 = 12;

        int result;
        int num3 = 8;

        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);


        // Part 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstNameUser = scanner.nextLine();
        System.out.print("Enter your last name: ");
        String lastNameUser = scanner.nextLine();

        System.out.println("Hello, " + firstNameUser + " " + lastNameUser + "!");

        System.out.print("Enter the first number: ");
        int num1user = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2user = scanner.nextInt();

        int sum = num1user + num2user;
        System.out.println("The sum of " + num1user + " and " + num2user + " is " + sum + ".");

        scanner.close(); // Close the scanner to prevent resource leaks


    }
}