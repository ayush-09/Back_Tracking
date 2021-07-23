package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public static int sol(int[] houses,int curr, int n,int[] dp) {

        if (curr>=n){
            return 0;
        }
        if(dp[curr]!=-1){
            return dp[curr];
        }
        int rob = houses[curr] + sol(houses,curr+2,n,dp);
        int dontRob =sol(houses,curr+1,n,dp);

        return dp[curr]= Math.max(rob,dontRob);
    }
    public static void main(String[] args) {
        int[] houses = {1,2,3,9};
        int n= 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(sol(houses,0,n,dp));

    }
}
