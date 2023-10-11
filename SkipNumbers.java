public class SkipNumbers {
    public static void main(String[] args) {
        // Test cases
        System.out.println("Test Case 1:");
        printNumbersWithSkip(50, 100, 7);

        System.out.println("Test Case 2:");
        printNumbersWithSkip(15, 5, 2);

        System.out.println("Test Case 3:");
        printNumbersWithSkip(25, 50, 4);

        System.out.println("Test Case 4:");
        printNumbersWithSkip(15, 100, -2);

        System.out.println("Test Case 5:");
        printNumbersWithSkip(0, 0, 2);

        System.out.println("Test Case 6:");
        printNumbersWithSkip(200, 200, 50);
    }

    public static void printNumbersWithSkip(int M, int N, int K) {
        if (K <= 0) {
            System.out.println("K must be a positive number.");
            return;
        }

        if (M > N) {
            System.out.println("M should be less than or equal to N.");
            return;
        }

        int currentNum = M;

        while (currentNum <= N) {
            System.out.print(currentNum + ", ");
            currentNum += K;
        }

        System.out.println();
    }
}
}