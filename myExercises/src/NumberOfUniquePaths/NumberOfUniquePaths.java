package NumberOfUniquePaths;

/**
 * https://www.youtube.com/watch?v=GhiRlhPlJ9Q
 */

public class NumberOfUniquePaths {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;

        int numOfUniquePaths = paths(n, m);

        System.out.println(numOfUniquePaths);
    }

    public static int paths(int n, int m) {
        return helper(n, m, new int[n + 1][m + 1]);
    }

    public static int helper(int n, int m, int[][] arr) {
        if (n <= 0 || m <= 0) {
            return 0;
        }

        if (n == 1 && m == 1) {
            return 1;
        }

        if (arr[n][m] == 0) {
            arr[n][m] = helper(n - 1, m, arr) + helper(n, m - 1, arr);
        }

        return arr[n][m];
    }
}
