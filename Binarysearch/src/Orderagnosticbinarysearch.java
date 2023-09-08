import java.util.Scanner;

public class Orderagnosticbinarysearch {
    public static void main(String[] args) {
        int[] arr = new int[50];

        System.out.println("Enter The Target");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println(" Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result = orderbinary(arr, target);
        if (result == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }

    static int orderbinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whether it is sorted in ascending or descending
        boolean isiasc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // If the array is sorted in ascending order
            if (isiasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                // If the array is sorted in descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
