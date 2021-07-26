package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static int sol(int[] arr,int prev,int curr,int n,int[][] dp) {
        if(curr==n){
            return 0;
        }
        if(dp[prev+1][curr]!=-1){
            return dp[prev+1][curr];
        }
        int inc=0,exc=0;
        if(prev==-1 || arr[prev]<arr[curr]){
            inc = 1 + sol(arr,curr,curr+1,n,dp);
        }
        exc = sol(arr,prev,curr+1,n,dp);
        return dp[prev+1][curr]= Math.max(inc,exc);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        int[][] dp = new int[n+1][n+1];
        for (int r[]:dp) {
            Arrays.fill(r,-1);

        }
        int l = arr.length;
        System.out.println(sol(arr,-1,0,l,dp));

    }
}
