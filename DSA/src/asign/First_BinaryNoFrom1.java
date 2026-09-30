package asign;

import java.util.LinkedList;
import java.util.Queue;

public class First_BinaryNoFrom1 {

     public static void printFirstNBinary(int n) {
            if (n <= 0) {
                System.out.println("Please provide a number greater than 0.");
                return;
            }

            // Create a queue to store binary numbers as strings
            Queue<String> queue = new LinkedList<>();

            // Every binary series starting from 1 begins with "1"
            queue.add("1");

            // Loop n times to generate and print n binary numbers
            for (int i = 0; i < n; i++) {
                // Remove the front element from queue
                String current = queue.poll();
                System.out.print(current + " ");

                // Generate the next two child binary numbers
                queue.add(current + "0");
                queue.add(current + "1");
            }
            System.out.println(); // Newline at the end
        }

        public static void main(String[] args) {
            int n = 4;
            System.out.print("First " + n + " binary numbers: ");
            printFirstNBinary(n);
            // Output: 1 10 11 100 101 110 111
        }
    }


