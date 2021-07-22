import java.util.Scanner;

public class PalindromePartition {

    public static void partition(String inp, String out) {
        if(inp.length()==0){
            System.out.println(out);
            return;
        }
        for (int i = 1; i <= inp.length(); i++) {
            if (Palindrome(inp.substring(0,i)))
            partition(inp.substring(i),out+ inp.substring(0, i)+ '|');
        }
    }
    public static boolean Palindrome(String partition) {
        int l=0,r = partition.length()-1;
        while (l<r){
            if(partition.charAt(l)!= partition.charAt(r)){
                return false;
            }
            l++;
            r--;

        }
        return true;
    }
    public static void main(String[] args) {
        partition("nitin","");
    }
}
