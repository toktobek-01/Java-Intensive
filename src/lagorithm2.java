import java.util.Scanner;
public class lagorithm2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            double naturalLog = Math.log(number);     // log base e
            double logBase10 = Math.log10(number);    // log base 10

            System.out.println("Natural logarithm (ln) of " + number + " is: " + naturalLog);
            System.out.println("Logarithm base 10 of " + number + " is: " + logBase10);

            sc.close();
        }
    }


