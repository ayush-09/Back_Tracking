package DynamicProgramming;

import java.util.Arrays;

public class FibonacciSeries {
    public static int fibo(int n,int[] dp) {
        if(n==0 || n==1){
            return n;
        }
        if (dp[n]!=-1){
            return dp[n];
        }
        // first time
        int c1 = fibo(n-1,dp);
        int c2 = fibo(n-2,dp);
        return dp[n]=c1+c2;
    }
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n,dp));

    }
}
