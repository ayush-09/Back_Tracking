package BackTracking;

import java.util.Scanner;

public class RatChases {
    static boolean pE = false;
    private static void mazePrint(char[][] maze, int cr, int cc, int er, int ec, int[][] vis) {

        if(cr < 0 || cc < 0 || cr > er || cc > ec || vis[cr][cc] == 1 || maze[cr][cc] == 'X') {
            return;
        }

        if(cr == er && cc == ec) {
            vis[cr][cc] = 1;
            pE = true;
            for (int i1 = 0; i1 < er+1; i1++) {
                for (int i2 = 0; i2 < ec+1; i2++) {
                    System.out.print(vis[i1][i2] + " ");
                }
                System.out.println();
            }
            return;
        }

        vis[cr][cc] = 1;
        mazePrint(maze, cr, cc + 1, er, ec, vis);
        mazePrint(maze, cr, cc - 1, er, ec, vis);
        mazePrint(maze, cr + 1, cc, er, ec, vis);
        mazePrint(maze, cr - 1, cc, er, ec, vis);

        vis[cr][cc] = 0; //backtracking step
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        char [][] maze = new char[n][m];
        for (int i=0; i<n;i++){
            String temp=in.next();
            for (int i1=0;i1<temp.length();i1++){
                maze[i][i1] = temp.charAt(i1);
            }
        }
        mazePrint(maze, 0, 0, n-1, m-1, new int[n][m]);
        if(!pE){
            System.out.println("NO PATH FOUND");
        }

    }
}
