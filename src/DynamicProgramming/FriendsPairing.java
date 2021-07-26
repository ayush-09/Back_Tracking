package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsPairing {
    public static long sol(int n,long[]dp) {
        if(n==1 || n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        long s= sol(n-1,dp);
        long p= (n-1)*sol(n-2,dp);
        return dp[n]=s+p;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            long[] dp = new long[n+1];
            Arrays.fill(dp,-1);
            System.out.println(sol(n,dp));
        }

    }
}
