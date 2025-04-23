import java.util.Scanner;

public class apr21fibonacci {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;

            System.out.print("Enter the position (n) of the Fibonacci number: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
            }

            n = sc.nextInt();

            if (n < 0) {
                System.out.println("Please enter a non-negative number.");
            } else {
                int result = fibonacci(n);
                System.out.println("The " + n + getOrdinalSuffix(n) + " Fibonacci number is " + result);
            }

            sc.close();
        }

        public static int fibonacci(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        // Just for fun: This method adds "st", "nd", "rd", "th"
        public static String getOrdinalSuffix(int n) {
            if (n % 100 >= 11 && n % 100 <= 13) return "th";
            switch (n % 10) {
                case 1:
                    return "st";
                case 2:
                    return "nd";
                case 3:
                    return "rd";
                default:
                    return "th";
            }
        }
    }




