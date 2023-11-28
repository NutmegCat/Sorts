import java.util.Arrays;
import java.util.Random;

class ShellSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        
        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));

        ShellSort ob = new ShellSort();
        ob.sort(arr);

        System.out.println("After Sort");
        System.out.println(Arrays.toString(arr));
        
    }
    
    int sort(int[] arr) {
        int n = arr.length;
        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j>= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        return 0;
    }
}