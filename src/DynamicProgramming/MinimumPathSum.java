package DynamicProgramming;

import java.util.Scanner;

public class MinimumPathSum {
    public static int sol(int[][] grid, int cr,int cc, int er, int ec) {
        if (cr>er || cc>ec){
            return Integer.MAX_VALUE;
        }
        if (cr==er && cc==ec){
            return grid[cr][cc];
        }
        int r = sol(grid,cr,cc+1,er,ec);
        int d = sol(grid,cr+1,cc,er,ec);
        int ans = Math.min(r,d)+grid[cr][cc];
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                grid[i][j]= s.nextInt();
            }

        }
        System.out.println(sol(grid,0,0,m-1,n-1));
    }
}
