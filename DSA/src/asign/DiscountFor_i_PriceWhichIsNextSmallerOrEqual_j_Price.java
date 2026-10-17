package asign;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DiscountFor_i_PriceWhichIsNextSmallerOrEqual_j_Price {
    static void main() {
        int[] prices={8,4,6,2,3};
        int [] ans=new int[prices.length];

        Deque<Integer> stack=new ArrayDeque<>();

        for( int i=0;i<prices.length; i++){

            while (!stack.isEmpty() && prices[stack.peek()]>= prices[i]){
                int index=stack.pop();
                ans[index]=prices[index]-prices[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            int index=stack.pop();
            ans[index]=prices[index];
        }
        IO.println(Arrays.toString(ans));
    }
}
