package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class GoldmineProb {
    public static int sol(int[][] grid, int cr,int cc, int er, int ec,int[][]dp) {
        if (cr>er || cc>ec || cr<0 || cc<0){
            return 0;
        }
        if (cr==er && cc==ec){
            return grid[cr][cc];
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        int r = sol(grid,cr,cc+1,er,ec,dp);
        int ru = sol(grid,cr-1,cc+1,er,ec,dp);
        int rd = sol(grid,cr+1,cc+1,er,ec,dp);
        int ans = grid[cr][cc]+ Math.max(r,Math.max(ru,rd));
        return dp[cr][cc]=ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int i = 0; i < T; i++) {
            int m = s.nextInt();
            int n = s.nextInt();
            int[][] grid = new int[m][n];
            for (int j = 0; j <m; j++) {
                for (int k = 0; k <n ; k++) {
                    grid[j][k]= s.nextInt();
                }
            }
            int ans[]=new int[m];
            int dp[][]=new int[m+1][n+1];
            for(int[] r:dp){
                Arrays.fill(r,-1);
            }
            for(int j=0;j<m;j++){
                ans[j]= sol(grid,j,0,m-1,n-1,dp); // check answer for every row possible
            }
            Arrays.sort(ans);
            System.out.println(ans[m-1]);

        }
    }
}
