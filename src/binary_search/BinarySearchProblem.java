public class BinarySearchProblem {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 12, 15, 17};
        int target = 14;
        //System.out.println(ceiling(arr, target));
        System.out.println(elementPos(arr, target));
    }

    static int[] elementPos(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] pos = {-1, -1};

//        while(start <= end) {
//
//        }
        return pos;
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
