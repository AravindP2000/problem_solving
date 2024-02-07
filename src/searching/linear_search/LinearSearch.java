package linear_search;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {8, 9, 12}};
        int target = 3;
        System.out.println(Arrays.toString(searchInMatrix(arr, target)));
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
}
