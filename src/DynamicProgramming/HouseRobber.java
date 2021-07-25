package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {
    public static int sol(int[] houses, int curr, int n, int[] dp) {

        if (curr >= n) {
            return 0;
        }
        if (dp[curr] != -1) {
            return dp[curr];
        }
        int rob = houses[curr] + sol(houses, curr + 2, n, dp);
        int dontRob = sol(houses, curr + 1, n, dp);

        return dp[curr] = Math.max(rob, dontRob);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        s.nextLine();
        for (int i = 0; i < T; i++) {
            int n = s.nextInt();
            int[] houses = new int[n];
            for (int j = 0; j < n; j++) {
                houses[j] = s.nextInt();
            }
            int[] dp = new int[n + 1];
            Arrays.fill(dp, -1);
            System.out.println(sol(houses, 0, n, dp));

        }
    }
}