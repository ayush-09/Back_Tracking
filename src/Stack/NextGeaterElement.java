package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGeaterElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int k = 0; k < T; k++) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j]= in.nextInt();
            }
            Stack<Integer> s = new Stack<>();
            s.push(0);
            int[] nge = new int[n];
            for (int i = 1; i < n; i++) {
                while(!s.isEmpty() && nums[s.peek()]<nums[i]){
                    nge[s.pop()]=nums[i];
//                System.out.println(s.pop()+"-->"+nums[i]);
                }
                s.push(i);

            }
            while(!s.isEmpty()){
                nge[s.pop()]=-1;
//            System.out.println(s.pop()+"-->"+-1);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(nums[i]+","+ nge[i]);
            }
        }

    }
}
