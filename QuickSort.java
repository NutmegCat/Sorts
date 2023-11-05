import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        quicksort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter:");
        printArray(numbers);        
    }

    private static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }
}