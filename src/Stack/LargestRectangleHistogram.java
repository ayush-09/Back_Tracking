package Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] nums = new int[n];
        for (int k = 0; k < n; k++) {
            nums[k]=in.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        st.push(0);
        int[] nse = new int[n];
        for (int i = 1; i < n; i++) {
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                nse[st.pop()]=i;
//                System.out.println(s.pop()+"-->"+nums[i]);
            }
            st.push(i);

        }
        while(!st.isEmpty()){
            nse[st.pop()]=n;
//            System.out.println(s.pop()+"-->"+-1);
        }

        int[] pse = new int[n];
        st.push(0);
        pse[0]=-1;
        for (int i = 1; i < n; i++) {
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]){
                st.pop();
            }
            if (!st.isEmpty()){
                pse[i]=st.peek();
            }else{
                pse[i]=-1;
            }
            st.push(i);
        }

        long maxArea = 0;
        for (int i = 0; i < n; i++) {
            long width = nse[i]-pse[i]-1;
            long area = width* nums[i];
            maxArea = Math.max(maxArea,area);

        }
        System.out.println(maxArea);

    }

    }
