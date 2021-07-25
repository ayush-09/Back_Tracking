package DynamicProgramming;

import java.util.Arrays;

public class UncrossedLines {
    public static int sol(int[] s,int[] t, int n, int m,int[][] dp) {
        if(n==0 || m==0){
            return 0;
        }
        if (dp[n][m]!=-1){
            return dp[n][m];
        }
        if (s[n-1]==t[m-1]){
            return 1+ sol(s,t,n-1,m-1,dp);
        }else{
            int c1 = sol(s,t,n,m-1,dp);
            int c2 = sol(s,t,n-1,m,dp);
            return dp[n][m] = Math.max(c1,c2);
        }

    }
    public static void main(String[] args) {
        int[] s = {1,4,2};
        int[] t= {1,2,4};
        int[][] dp = new int[s.length+1][t.length+1];
        for (int[] r:dp) {
            Arrays.fill(r,-1);
        }
        System.out.println(sol(s,t,s.length,t.length,dp));

    }
}
