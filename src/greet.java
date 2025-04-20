import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name: ");
        String t = sc.next();
        System.out.println("Type your surname: ");
        String d = sc.next();
        System.out.println("Your full name is :\n" + t + " " + d);

    }
}
