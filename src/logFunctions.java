public class logFunctions {
            public static void main(String[] args) {
                int arraySize = 1024;

                // Binary search has time complexity of O(log2(n))
                double steps = Math.log(arraySize) / Math.log(2);

                System.out.println("Estimated max steps in binary search on array of size " + arraySize + " is: " + steps);
            }
}
