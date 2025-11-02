public class Main {

    /**
     * Sorts an array of integers using merge sort algorithm
     * @param arr Array to be sorted
     */
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    /**
     * Recursive helper method for merge sort
     * @param arr Array to be sorted
     * @param left Starting index
     * @param right Ending index
     */
    private static void mergeSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first half
            mergeSortHelper(arr, left, mid);

            // Sort second half
            mergeSortHelper(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    /**
     * Merges two sorted subarrays
     * @param arr Main array containing both subarrays
     * @param left Starting index of first subarray
     * @param mid Ending index of first subarray
     * @param right Ending index of second subarray
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        // Calculate sizes of two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into arr
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    /**
     * Prints the array to stdout
     * @param arr Array to be printed
     */
    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Accepts a list of numbers and prints the sorted list
     * @param numbers Array of integers to sort and print
     */
    public static void sortAndPrint(int[] numbers) {
        mergeSort(numbers);
        printArray(numbers);
    }

    public static void main(String[] args) {
        System.out.println("Merge Sort Implementation");
        System.out.println("========================\n");

        // Test 1: Small mixed
        System.out.println("Test 1: Small mixed");
        System.out.print("Input:    ");
        int[] test1 = {3, 0, -2, 7, 4, -5, 0};
        printArray(test1);
        System.out.print("Expected: [-5, -2, 0, 0, 3, 4, 7]\n");
        System.out.print("Output:   ");
        sortAndPrint(test1);
        System.out.println();

        // Test 2: Contains duplicates
        System.out.println("Test 2: Contains duplicates");
        System.out.print("Input:    ");
        int[] test2 = {5, 1, 3, 3, 2, 5, 1};
        printArray(test2);
        System.out.print("Expected: [1, 1, 2, 3, 3, 5, 5]\n");
        System.out.print("Output:   ");
        sortAndPrint(test2);
        System.out.println();

        // Test 3: Already sorted
        System.out.println("Test 3: Already sorted");
        System.out.print("Input:    ");
        int[] test3 = {1, 2, 3, 4, 5};
        printArray(test3);
        System.out.print("Expected: [1, 2, 3, 4, 5]\n");
        System.out.print("Output:   ");
        sortAndPrint(test3);
        System.out.println();

        // Test 4: Reverse sorted
        System.out.println("Test 4: Reverse sorted");
        System.out.print("Input:    ");
        int[] test4 = {5, 4, 3, 2, 1};
        printArray(test4);
        System.out.print("Expected: [1, 2, 3, 4, 5]\n");
        System.out.print("Output:   ");
        sortAndPrint(test4);
        System.out.println();

        // Test 5: Empty array
        System.out.println("Test 5: Empty array");
        System.out.print("Input:    ");
        int[] test5 = {};
        printArray(test5);
        System.out.print("Expected: []\n");
        System.out.print("Output:   ");
        sortAndPrint(test5);
        System.out.println();

        // Test 6: Single element
        System.out.println("Test 6: Single element");
        System.out.print("Input:    ");
        int[] test6 = {42};
        printArray(test6);
        System.out.print("Expected: [42]\n");
        System.out.print("Output:   ");
        sortAndPrint(test6);
        System.out.println();

        // Test 7: All same values
        System.out.println("Test 7: All same values");
        System.out.print("Input:    ");
        int[] test7 = {5, 5, 5, 5, 5};
        printArray(test7);
        System.out.print("Expected: [5, 5, 5, 5, 5]\n");
        System.out.print("Output:   ");
        sortAndPrint(test7);
        System.out.println();

        // Test 8: Large range with negatives
        System.out.println("Test 8: Large range with negatives");
        System.out.print("Input:    ");
        int[] test8 = {100, -100, 0, 50, -50, 25, -25};
        printArray(test8);
        System.out.print("Expected: [-100, -50, -25, 0, 25, 50, 100]\n");
        System.out.print("Output:   ");
        sortAndPrint(test8);
    }
}
