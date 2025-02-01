public class StatisticsCalculator {
    public static void main(String[] args) {
        // Sample data
        double[] weights1 = {4.1,     2,     0.7,     3.1,     1.9,     3.4,     3.8,     4.1};
        double[] weights2 = {1.4,     3.7,     1.6,     2.1,     0.9,     1.2,     2.9,     2.9,     3.4};

        // Calculate mean
        double sum = 0;
        for (double weight : weights1) {
            sum += weight;
        }
        double mean = sum / weights1.length;

        // Calculate standard deviation
        double varianceSum = 0;
        int count = 0;
        for (double weight : weights1) {
            varianceSum += Math.pow(weight - mean, 2);
            count++;
        }
        double standardDeviation = Math.sqrt(varianceSum / (weights1.length - 1));

        double sum2 = 0;
        for (double weight : weights2) {
            sum2 += weight;
        }
        double mean2 = sum2 / weights2.length;

        // Calculate standard deviation
        double varianceSum2 = 0;
        int count2 = 0;
        for (double weight : weights2) {
            varianceSum2 += Math.pow(weight - mean2, 2);
            count2++;
        }
        double standardDeviation2 = Math.sqrt(varianceSum2 / (weights2.length - 1));

        // Output the results
        System.out.println(count);
        System.out.printf("Mean: %.4f%n", mean);
        System.out.printf("Standard Deviation: %.6f%n", standardDeviation);

        System.out.println(count2);
        System.out.printf("Mean: %.4f%n", mean2);
        System.out.printf("Standard Deviation: %.6f%n", standardDeviation2);
    }
}
