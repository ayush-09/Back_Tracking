package Stack;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {31,14,20,21,50};
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        pse[0]=-1;
        for (int i = 1; i < n; i++) {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if (!st.isEmpty()){
                pse[i]=st.peek();
            }else{
                pse[i]=-1;
            }
            st.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" "+ pse[i]);
        }

    }
}
