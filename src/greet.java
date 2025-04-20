import java.util.Scanner;

public class greet {
    public static void sayHi(String name){
        System.out.println("Hello, " + name + "!");
    }
    public static void text(String sayHi) {
        System.out.println(sayHi + "It is great your are here!");
    }
    public static void main(String[] args) {
        sayHi("Tima");
        sayHi("Emmy");
        text("Hi, ");
    }
}
