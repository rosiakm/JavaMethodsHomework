import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide an integer from 1 to 10: ");
        int size = scanner.nextInt();

        double[] array = new double[size];

        for (int i = 0; i < size; i++){
            System.out.println("Please provide an integer to store in array under index: " + i);
            double value = scanner.nextDouble();
            array[i] = value;
        }

        double sum = 0;
        for (double i:array) {
            sum += i;
        }
        double avgValue = sum/array.length;
        double maxValue = Arrays.stream(array).max().getAsDouble();

        System.out.println("And average value is: " + avgValue);
        System.out.println("The maximum value is: " + maxValue);
    }
}
