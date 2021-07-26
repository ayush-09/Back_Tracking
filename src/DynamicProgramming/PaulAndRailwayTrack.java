package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class PaulAndRailwayTrack {
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
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m= in.nextInt();
        int[] s = new int[n];
        int[] t = new int[m];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            t[i] = in.nextInt();
        }
        int[][] dp = new int[n+1][m+1];
        for (int[] r:dp) {
            Arrays.fill(r,-1);
        }
        System.out.println(sol(s,t,n,m,dp));

    }
}
