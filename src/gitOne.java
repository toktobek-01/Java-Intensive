public class gitOne {
        public static void main(String[] args) {
            double principal = 1000.0;      // Starting amount in the bank
            double rate = 6.5 / 100;        // Annual interest rate (converted to decimal)
            int time = 30;                  // Time in years
            int compoundingPerYear = 1;     // Compounded once a year

            // Compound Interest Formula: A = P(1 + r/n)^(nt)
            double amount = principal * Math.pow(1 + rate / compoundingPerYear, compoundingPerYear * time);

            // Print the result rounded to 2 decimal places
            System.out.printf("After %d years, your balance will be: $%.2f%n", time, amount);
        }
    }
