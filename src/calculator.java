import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter first number: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number:");
                sc.next();
            }
            double num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Enter a number:");
                sc.next();
            }
            double num2 = sc.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
                    break;
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            choice = sc.next().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("Goodbye!");
        sc.close();
    }
}
