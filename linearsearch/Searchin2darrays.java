public class Searchin2darrays {
    public static void main(String[] args) {
        int[][] arr = {{23, 4, 1}, {18, 12, 3, 9}, {78, 99, 34, 36}, {18, 12}};
        int target = 4;
        int[] indices = linearSearch2darray(arr, target);

        if (indices[0] != -1 && indices[1] != -1) {
            System.out.println("The element is found at row and column [" + indices[0] + "," + indices[1] + "]");
        } else {
            System.out.println("The element is not found in the array.");
        }
    }

    static int[] linearSearch2darray(int[][] arr, int target) {
        int[] indices = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    indices[0] = i + 1; // Row index
                    indices[1] = j + 1; // Column index
                    return indices;
                }
            }
        }

        return indices; // Return [-1, -1] if the target element is not found in the array.
    }
}
