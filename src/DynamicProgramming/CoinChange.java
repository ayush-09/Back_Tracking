package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static int sol(int[] coins,int ammount, int curr,int n,int[][] dp) {
        if (ammount==0){
            return 1;
        }
        if (coins.length==0 || curr==n){
            return 0;
        }
        if (dp[curr][ammount]!=-1){
            return dp[curr][ammount];
        }
        int inc=0, exc=0;
        if (coins[curr]<=ammount){
            inc = sol(coins,ammount-coins[curr],curr,n,dp);
        }
        exc = sol(coins,ammount,curr+1,n,dp);
        return dp[curr][ammount] = inc+exc;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] coins= new int[m];
        for (int i = 0; i < m; i++) {
            coins[i] = s.nextInt();
        }
        int[][] dp = new int[m+1][n+1];
        for (int[] row:dp) {
            Arrays.fill(row,-1);

        }
        System.out.println(sol(coins,n,0,m,dp));


    }
}
