
    import java.util.Scanner;

    public class complexCalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String choice;

            do {
                System.out.println("\nChoose operation: +, -, *, /, ^ (power), sqrt (square root)");
                String operation = sc.next().toLowerCase();

                double num1 = 0, num2 = 0;
                boolean valid = true;

                // Read inputs based on operation
                if (operation.equals("sqrt")) {
                    System.out.print("Enter a number: ");
                    num1 = sc.nextDouble();
                    if (num1 < 0) {
                        System.out.println("Error: Cannot find square root of a negative number.");
                        valid = false;
                    }
                } else {
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                }

                if (valid) {
                    double result;

                    switch (operation) {
                        case "+":
                            result = num1 + num2;
                            System.out.println("Result: " + result);
                            break;
                        case "-":
                            result = num1 - num2;
                            System.out.println("Result: " + result);
                            break;
                        case "*":
                            result = num1 * num2;
                            System.out.println("Result: " + result);
                            break;
                        case "/":
                            if (num2 == 0) {
                                System.out.println("Error: Cannot divide by zero.");
                            } else {
                                result = num1 / num2;
                                System.out.println("Result: " + result);
                            }
                            break;
                        case "^":
                            result = Math.pow(num1, num2);
                            System.out.println("Result: " + result);
                            break;
                        case "sqrt":
                            result = Math.sqrt(num1);
                            System.out.println("Square root of " + num1 + " is " + result);
                            break;
                        default:
                            System.out.println("Invalid operation.");
                    }
                }

                System.out.print("\nDo you want to perform another calculation? (yes/no): ");
                choice = sc.next().toLowerCase();

            } while (choice.equals("yes"));

            System.out.println("Goodbye!");
            sc.close();
        }
    }


