public class compoundInterest {
        public static void main(String[] args) {
            double principal = 1000.0; // Initial amount
            double rate = 6.5 / 100;   // 6.5% as decimal
            int time = 30;             // 30 years
            int compoundPerYear = 1;   // Compounded annually

            // Compound interest formula
            double amount = principal * Math.pow(1 + rate / compoundPerYear, compoundPerYear * time);

            // Round to 2 decimal places
            System.out.printf("Final amount after %d years = $%.2f%n", time, amount);
        }
    }

