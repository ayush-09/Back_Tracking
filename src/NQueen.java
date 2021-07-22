public class NQueen {
    static int count;
    public static boolean canPlace(int[][] board,int cr, int cc,int n){
        for (int i = 0; i <=cr-1 ; i++) {
            if (board[i][cc]==1){
                return false;
            }
        }
        int  row=cr;
        int col = cc;
        // right diagonal
        while(row>=0 && col<n){
            if (board[row][col]==1){
                return false;
            }
            row--;
            col++;
        }
        row=cr;
        col = cc;
        // left diagonal
        while(row>=0 && col>=0){
            if (board[row][col]==1){
                return false;
            }
            row--;
            col--;
        }
        return true;
    }

    public static void sol(int[][] board,int n, int cr){
        if (cr==n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j]==1){
                        System.out.print('Q');
                    }
                    else{
                        System.out.print('_');
                    }
                }
                System.out.println();
            }
            System.out.println("_________________");
            count++;
            return;
        }
        for (int cc = 0; cc < n; cc++) {
            if (canPlace(board,cr,cc,n)){
                board[cr][cc]=1;
                sol(board,n,cr+1);
                board[cr][cc]=0;

            }
        }
        return;

    }
    public static void main(String[] args) {
        int n=4;
        int[][] board = new int[n][n];
        count=0;
        sol(board,n,0);
        System.out.println(count);

    }
}
