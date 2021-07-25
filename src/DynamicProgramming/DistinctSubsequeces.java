package DynamicProgramming;

import java.util.Arrays;

public class DistinctSubsequeces {
    public static int sol(String s,String t,int cs,int ct,int[][] dp) {
        int inc=0,exc=0;
        if (ct>=t.length()){
            return 1;
        }
        if (cs>=s.length()){
            return 0;
        }

        if (dp[cs][ct]!=-1){
            return dp[cs][ct];
        }
        if (s.charAt(cs)==t.charAt(ct)){
            inc = sol(s,t,cs+1,ct+1,dp);

        }
        exc = sol(s,t,cs+1,ct,dp);
        return dp[cs][ct]= inc+exc;


    }
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int[] r:dp) {
            Arrays.fill(r,-1);
        }
        System.out.println(sol(s,t,0,0,dp));

    }
}
