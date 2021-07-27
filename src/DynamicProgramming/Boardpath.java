package DynamicProgramming;
import java.util.Scanner;

public class Boardpath {

    static int c=0;
    public static void sol(int n,int m,String out) {
        if (n==0){
            c++;
            System.out.print(out+ " ");
            return;
        }
        for (int i = 0; i <m ; i++) {
            if(i+1<=n) {
                sol(n - (i + 1), m, out + Integer.toString(i + 1));
            }
        }

    }
    public static void main(String[] args) {
        c=0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        sol(m,n,"");
        System.out.println();
        System.out.println(c);

    }
}
