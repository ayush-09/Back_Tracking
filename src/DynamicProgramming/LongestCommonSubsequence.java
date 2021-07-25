package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubsequence {
    public static int sol(String s,String t, int n, int m,int[][] dp) {
        if(n==0 || m==0){
            return 0;
        }
        if (dp[n][m]!=-1){
            return dp[n][m];
        }
        if (s.charAt(n-1)==t.charAt(m-1)){
            return 1+ sol(s,t,n-1,m-1,dp);
        }else{
            int c1 = sol(s,t,n,m-1,dp);
            int c2 = sol(s,t,n-1,m,dp);
            return dp[n][m] = Math.max(c1,c2);
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String t= in.next();
        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int[] r:dp) {
            Arrays.fill(r,-1);
        }
        System.out.println(sol(s,t,s.length(),t.length(),dp));

    }
}
