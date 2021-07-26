package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class countWays {
    public static long sol(int n,int curr,long[] dp) {
        if (curr==n){
            return 1;
        }
        if (curr>n){
            return 0;
        }
        if(dp[curr]!=-1){
            return dp[curr];
        }
        long c1= sol(n,curr+1,dp);
        long c2= sol(n,curr+3,dp);
        long c3 = sol(n,curr+4,dp);
        return dp[curr] = c1+c2+c3;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(sol(n,0,dp));
    }
}
