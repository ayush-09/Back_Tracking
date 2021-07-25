package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteAndEarn {
    public static int deleteAndEarn(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int e:nums ) {
            max= Math.max(e,max);
        }
        int[] freq = new int[max+1];
        for (int e:nums) {
            freq[e] += e;

        }
        int[] dp = new int[freq.length+1];
        Arrays.fill(dp,-1);
        System.out.println(sol(freq,0,freq.length,dp));
        return 0;

    }
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
        int[] arr = {3,4,2};
        deleteAndEarn(arr);

    }
}

