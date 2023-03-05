package PairForSum;

import java.util.HashSet;

public class PairForSumWithStack implements IPairForSum {

    public int[] getPairForSum(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            if (!set.isEmpty() && set.contains(arr[i])) {
                return new int[]{k - arr[i], arr[i]};
            }

            set.add(k - arr[i]);
        }

        return new int[0];
    }
}
