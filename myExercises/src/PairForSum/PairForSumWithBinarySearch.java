package PairForSum;

public class PairForSumWithBinarySearch implements IPairForSum {
    public int[] getPairForSum(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (binarySearch(arr, k - arr[i], i)) {
                return new int[] { k - arr[i], arr[i] };
            }
        }

        return new int[0];
    }

    private static boolean binarySearch(int[] arr, int x, int index) {
        int left = 0;
        int right = arr.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;

            if (arr[middle] == x && middle != index) {
                return true;
            } else if (arr[middle] < x) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }
}
