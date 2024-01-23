
    import java.util.Arrays;
import java.util.Scanner;

public class UsingArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Order selection
        System.out.print("Select order (ascending/descending): ");
        String order = scanner.next();

        // Sorting
        if ("ascending".equalsIgnoreCase(order)) {
            Arrays.sort(numbers);
        } else if ("descending".equalsIgnoreCase(order)) {
            Arrays.sort(numbers);
            reverseArray(numbers);
        }

        // Displaying ordered numbers
        System.out.println("\nOrdered Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}

    

