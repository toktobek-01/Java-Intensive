import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palindrome = scan.next();
        String reversed = "";
        for (int i = palindrome.length() - 1; i >= 0; --i) {
            reversed += palindrome.charAt(i);
        }
        if (palindrome.equals(reversed)) {
            System.out.println("This Palindrome");
        } else {
            System.out.println("This is NOT a Palindrome");
        }
    }
}
