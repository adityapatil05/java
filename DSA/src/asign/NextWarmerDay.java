package asign;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextWarmerDay {
    static void main() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        Deque<Integer> stack = new ArrayDeque<>();
        int[] answer = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                answer[index] = i-index;

            }
            stack.push(i);
        }
        IO.println(Arrays.toString(answer));
    }
}