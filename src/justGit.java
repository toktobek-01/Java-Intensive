import java.util.Scanner;

public class justGit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String t = sc.nextLine();
        String reversed = "";
        String cleaned = t.replaceAll("[^a - zA -Z]", " ").toLowerCase();

        for (int i = t.length() - 1; i >= 0; --i) {
            reversed += cleaned.charAt(i);
        }

        if (t.equals(reversed)) {
            System.out.println("This is a polindrome!");
        } else {
            System.out.println("This is not a polindrome");}
        }
    }
