package DynamicProgramming;

import java.util.Scanner;

public class EditDistance {
    public static int sol(String s,String t,int n,int m) {
        if(n==0 && m==0){
            return 0;
        }

        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }

        if (s.charAt(n-1)==t.charAt(m-1)){
            return sol(s,t,n-1,m-1);
        }else{
            int in = sol(s,t,n,m-1);
            int re = sol(s,t,n-1,m-1);
            int de = sol(s,t,n-1,m);
            int ans = Math.min(in,Math.min(re,de))+1;
            return ans;
        }


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        System.out.println(sol(s,t,s.length(),t.length()));

    }
}
