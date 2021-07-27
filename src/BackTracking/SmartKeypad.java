package BackTracking;

import java.util.Scanner;

public class SmartKeypad {
    static String[] table = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    public static void sol(String inp,String out) {
        if(inp.length()==0){
            System.out.println(out);
            return;
        }
        char currDigit = inp.charAt(0);
        int currInt = currDigit - '0';
        String mappedString = table[currInt]; //.+@$
        for (int i = 0; i < mappedString.length(); i++) {
            sol(inp.substring(1),out+mappedString.charAt(i));
        }


    }
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String s = n.next();
        sol(s,"");
    }
}
