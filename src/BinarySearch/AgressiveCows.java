package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class AgressiveCows {
    public static boolean canplaced(int[] stalls,int nCows,int minDist) {
        int posPlaced = stalls[0];
        int numPlaced = 1;
        for (int i = 0; i < stalls.length; i++) {
            if(numPlaced==nCows){
                return true;
            }

            if (stalls[i]-posPlaced>=minDist){
                numPlaced++;
                posPlaced = stalls[i];
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cows = s.nextInt();
        int[] stalls = new int[n];
        for (int i = 0; i <n ; i++) {
            stalls[i] = s.nextInt();
        }
        Arrays.sort(stalls);
        int l=0;
        int r = stalls[n-1]-stalls[0];
        while(r>l+1){
            int mid = (l+r)/2;
            if(canplaced(stalls,3,mid)){
                l = mid;
            }else{
                r= mid;
            }
        }
        System.out.println(l);

    }
}
