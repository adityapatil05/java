package asign;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Reverse_QueueUpto_K_Index {
    public static void reverseFirstK(Queue<Integer> queue, int k) {
        // Base cases or invalid inputs
        if (queue.isEmpty() || k > queue.size() || k <= 0) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Dequeue first k elements and push them onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Step 2: Pop elements from the stack and enqueue them back
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3: Move the remaining (n - k) elements to the back
        int remainingElements = queue.size() - k;
        for (int i = 0; i < remainingElements; i++) {
            queue.add(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Populate queue: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
        for (int i = 10; i <= 100; i += 10) {
            queue.add(i);
        }

        int k = 5;
        System.out.println("Original Queue: " + queue);

        reverseFirstK(queue, k);

        System.out.println("Modified Queue: " + queue);
        // Output: [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
    }
}


