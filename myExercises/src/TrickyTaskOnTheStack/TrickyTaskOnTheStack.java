package TrickyTaskOnTheStack;

/**
 * https://www.youtube.com/watch?v=-59FbGWsCgI
 */

import java.util.Stack;

public class TrickyTaskOnTheStack {
    public static void main(String[] args) {
        int[] arr = { 13, 12, 15, 11, 9, 12, 16 };
        int[] answer = numberOfDaysToWarm(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + "\t");
        }
        System.out.println();
    }

    public static int[] numberOfDaysToWarm(int[] temperatures) {
        Stack<Pair> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek().value <= temperatures[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek().index - i;
            }

            stack.push(new Pair(temperatures[i], i));
        }

        return result;
    }
}
