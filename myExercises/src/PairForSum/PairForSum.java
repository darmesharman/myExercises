package PairForSum;

import java.lang.reflect.InvocationTargetException;

/**
 * https://www.youtube.com/watch?v=JtMuXmmDl9s
 */

public class PairForSum {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int[] arr1 = { -1, 2, 5, 8 };
        int k1 = 7;
        print(arr1, k1, new PairForSumWithStack());


        int[] arr2 = { -3, -1, 0, 2, 6 };
        int k2 = 6;
        print(arr2, k2, new PairForSumWithBinarySearch());

        int[] arr3 = { 2, 4, 5 };
        int k3 = 8;
        print(arr3, k3, new PairForSumByTwoPointer());

//        int[] arr4 = { -2, -1, 1, 2 };
//        int k4 = 0;
    }

    public static void print(int[] arr, int k, IPairForSum iPairForSum) throws InvocationTargetException, IllegalAccessException {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("[ " + k + " ] ");

        int[] result = (int[]) iPairForSum.getPairForSum(arr, k);
        if (result.length == 0) {
            System.out.println("Не найдена пара");
        } else {
            System.out.println(result[0] + " " + result[1]);
        }
        System.out.println();
    }
}
