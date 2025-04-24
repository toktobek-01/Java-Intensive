import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);

    }
    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return factorial(num - 1) * num;
        }
    }
}
