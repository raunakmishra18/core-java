// package practices;

import java.util.Arrays;

public class Main {

    // Function to reverse part of the array
    public static void reversePart(int i, int j, int[] arr) {
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 8, 8, 9, 10, 15};
        int n = arr.length;
        
        // Display original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        int k = 7; // Number of rotations
        k = k % n; // Ensure k is within array bounds

        // Rotate the array using reverse algorithm
        reversePart(0, n - k - 1, arr); // Reverse the first part
        reversePart(n - k, n - 1, arr); // Reverse the second part
        reversePart(0, n - 1, arr); // Reverse the entire array

        // Output the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}