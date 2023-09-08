public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 39, 40, 50, 60};
        int target = 30;
        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("The element is found at index " + index);
        } else {
            System.out.println("The element is not found in the array.");
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Return -1 if the target element is not found in the array.
    }
}
