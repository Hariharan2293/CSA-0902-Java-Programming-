public class CompositeNumbers {
    public static void main(String[] args) {
        // Test cases
        System.out.println("Test Case 1:");
        printCompositeNumbers(12, 19);

        System.out.println("Test Case 2:");
        printCompositeNumbers(11, 11);

        System.out.println("Test Case 3:");
        printCompositeNumbers(20, 10);

        System.out.println("Test Case 4:");
        printCompositeNumbers(0, 0);

        System.out.println("Test Case 5:");
        printCompositeNumbers(-5, 5);
    }

    public static void printCompositeNumbers(int A, int B) {
        if (A > B) {
            System.out.println("A should be less than or equal to B.");
            return;
        }

        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();
    }

    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true;
            }
        }

        return false;
    }
}