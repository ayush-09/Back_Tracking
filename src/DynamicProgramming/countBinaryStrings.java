package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class countBinaryStrings {
    public static long sol(int n,long[] dp) {
        if (n==1 || n==2){
            return n+1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        long c1 = sol(n-1,dp);
        long c2 = sol(n-2,dp);
        return dp[n] = c1+c2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) {
            int n = s.nextInt();
            long[] dp = new long[n+1];
            Arrays.fill(dp,-1);
            System.out.println(sol(n,dp));

        }


    }
}
