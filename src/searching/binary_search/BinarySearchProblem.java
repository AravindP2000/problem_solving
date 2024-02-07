package binary_search;

import java.util.Arrays;

public class BinarySearchProblem {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 12};
        int target = 3;
        System.out.println(ceiling(arr, target));
        System.out.println(floor(arr, target));
        //System.out.println(Arrays.toString(searchInMatrix(arr, target)));
    }


    //7-2-24
    //Linear Search in 2D array

    static int[] searchInMatrix(int[][] arr, int target) {
        int[] result = {-1, -1};

        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col] == target) {
                    result[0] = row;
                    result[1] = col;
                }
            }
        }
        return result;
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[start];
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
