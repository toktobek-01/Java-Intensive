public class fibnacci {
    // F(n) = (n - 1) + (n - 2)
    // F(1) = 1, F(2) = 1
    //  1 1 2 3 5 8 13
    public static int f(int a) {
        if(a == 1) {
            return 1;
        }
        if (a == 2) {
            return 3;
        }
            return f(a - 1) + (a - 2);
        }

    public static void main(String[] args) {
        System.out.println(f(5));
    }
    }

