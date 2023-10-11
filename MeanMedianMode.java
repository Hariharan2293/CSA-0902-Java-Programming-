import java.util.*;

public class MeanMedianMode {
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        
        // Calculate Mean
        double mean = calculateMean(arr);
        System.out.println("Mean = " + mean);

        // Calculate Median
        double median = calculateMedian(arr);
        System.out.println("Median = " + median);

        // Calculate Mode
        int mode = calculateMode(arr);
        System.out.println("Mode = " + mode);
    }

    public static double calculateMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        int middle = arr.length / 2;
        if (arr.length % 2 == 0) {
            double median1 = arr[middle - 1];
            double median2 = arr[middle];
            return (median1 + median2) / 2.0;
        } else {
            return arr[middle];
        }
    }

    public static int calculateMode(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            int frequency = frequencyMap.get(num);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }

        return mode;
    }
}