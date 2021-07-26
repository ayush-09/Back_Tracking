package DynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class LCS3Strings {
    public static int sol(String s,String t,String u, int n, int m,int o,int[][][] dp) {
        if(n==0 || m==0 || o==0){
            return 0;
        }
        if (dp[n][m][o]!=-1){
            return dp[n][m][o];
        }
        if (s.charAt(n-1)==t.charAt(m-1) && s.charAt(n-1)==u.charAt(o-1) && t.charAt(m-1)==u.charAt(o-1)){
            return 1+ sol(s,t,u,n-1,m-1,o-1,dp);
        }else{
            int c1 = sol(s,t,u,n-1,m,o,dp);
            int c2 = sol(s,t,u,n,m-1,o,dp);
            int c3 = sol(s,t,u,n,m,o-1,dp);
            return dp[n][m][o] = Math.max(Math.max(c1,c2),c3);
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String t= in.next();
        String u = in.next();
        int[][][] dp = new int[s.length()+1][t.length()+1][u.length()+1];
        for (int[][] r:dp) {
            for (int[] d:r) {
                Arrays.fill(d,-1);
            }

        }
        System.out.println(sol(s,t,u,s.length(),t.length(),u.length(),dp));

    }
}
