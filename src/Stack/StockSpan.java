package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums= new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int[] span = new int[n];
        span[0]=1;
        Stack<Integer> s = new Stack<>();
        s.add(0);
        for (int i = 1; i <n ; i++) {
            while(!s.isEmpty()&& nums[s.peek()]<nums[i]){
                s.pop();
            }
            span[i] =s.isEmpty() ? i+1: i-s.peek();
            s.push(i);
        }
        for (int e:span) {
            System.out.print(e+" ");
        }
        System.out.print("END");
    }
}
