package Stack;

import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] nums={1,5,6,2,3};
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int[] nse = new int[n];
        for (int i = 1; i < n; i++) {
            while(!s.isEmpty() && nums[s.peek()]>nums[i]){
                nse[s.pop()]=nums[i];
//                System.out.println(s.pop()+"-->"+nums[i]);
            }
            s.push(i);

        }
        while(!s.isEmpty()){
            nse[s.pop()]=-1;
//            System.out.println(s.pop()+"-->"+-1);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]+" "+ nse[i]);
        }
    }
}
