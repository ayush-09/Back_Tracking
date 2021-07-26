package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class kOrderLCS {
    public static long sol(int[] a1,int[] a2,int n,int m, int k,long[][][] dp) {
        if(n==0||m==0){
            return 0;
        }
        if (dp[n][m][k+1]!=-1){
            return dp[n][m][k+1];
        }
        if(a1[n-1]==a2[m-1]){
            return 1+sol(a1,a2,n-1,m-1,k,dp);

        }else{
            long ka=0;
            if(k>0){
                ka=  1+sol(a1,a2,n-1,m-1,k-1,dp);
            }
            long c1 = sol(a1,a2,n,m-1,k,dp);
            long c2 = sol(a1,a2,n-1,m,k,dp);
            return dp[n][m][k+1] = Math.max(c1,Math.max(c2,ka));

        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m= in.nextInt();
        int k = in.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[m];
        for (int i = 0; i < n; i++) {
            a1[i] = in.nextInt();
        }
        for (int i = 0; i <m ; i++) {
            a2[i] = in.nextInt();
        }
        long[][][] dp = new long[n+1][m+1][k+1];
        for (long[][] r:dp) {
            for (long[] d:r) {
                Arrays.fill(d,-1);
            }

        }
        System.out.println(sol(a1,a2,n,m,k,dp));

    }
}
