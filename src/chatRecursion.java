import java.util.Scanner;

public class chatRecursion {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num;

    while (true) {
        System.out.println("Please enter a non-negative integer: ");

    if(!sc.hasNextInt()) {
        System.out.println("That is not a valid number. Try again.");
        sc.next();
        continue;
    }

    num = sc.nextInt();

        if (num < 0) {
        System.out.println("Your integer is negative. Try again!");
        } else {
            int result = factorial(num);
        System.out.println("Factorial of " + num + " is " + result);
        break;
        }
    }
    sc.close();
    }
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static void string (String[] args){
        System.out.println("Do you want another integer: Yes/No");
    }
}