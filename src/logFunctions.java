public class logFunctions {
        public static void main(String[] args) {
            double number = 1000.0;

            // Natural logarithm (base e)
            double naturalLog = Math.log(number);
            System.out.println("Natural Log (ln) of " + number + " = " + naturalLog);

            // Base 10 logarithm
            double logBase10 = Math.log10(number);
            System.out.println("Log base 10 of " + number + " = " + logBase10);

            // Log base 2 (not directly available, but we can calculate it)
            double logBase2 = Math.log(number) / Math.log(2);
            System.out.println("Log base 2 of " + number + " = " + logBase2);
        }
}
