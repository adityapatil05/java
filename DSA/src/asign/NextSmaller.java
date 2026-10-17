package asign;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextSmaller {
    static void main() {
        int[] input = {4, 2, 1, 5, 3};
        IO.println(Arrays.toString(nextSmaller(input)));
    }
        public static int[] nextSmaller(int[]input){
            int[] ans = new int[input.length];

            Deque<Integer> stack = new ArrayDeque<>();
            Arrays.fill(ans,-1);
            for (int i = 0; i < input.length; i++) {
                while (!stack.isEmpty() && input[stack.peek()] > input[i]) {
                    int index = stack.pop();
                    ans[index] = input[i];
                }
                stack.push(i);
            }
            return ans;
        }
    }

