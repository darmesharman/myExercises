package PairForSum;

public class PairForSumByTwoPointer implements IPairForSum {
    public int[] getPairForSum(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int sum;

        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum == k) {
                return new int[] { arr[left], arr[right] };
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }
}
