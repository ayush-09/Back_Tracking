package BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LetterCombi {
    static String[] mapping = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    static int count;
    static ArrayList<String> ans= new ArrayList<>();
    public static void sol(String inp,String out, ArrayList<String> ans){
        if (inp.length()==0){
            ans.add(out);
            //System.out.print(out+" "); //without using array list simple uncmnt it remove ans from fn
            count++;
            return;
        }

        char currDigit = inp.charAt(0); // '2'
        int currInt = currDigit - '0';
        String mappedString = mapping[currInt]; //"abc"
        for (int i = 0; i < mappedString.length(); i++) {
            sol(inp.substring(1),out+mappedString.charAt(i),ans);
        }

    }
    public static void main(String[] args) {
        count=0;
        Scanner n = new Scanner(System.in);
        String s = n.next();
        sol(s,"",ans);
        // For Arraylist only
        Collections.sort(ans);
        for (String i:ans) {
            System.out.print(i + " ");

        }

        System.out.println("\n" + count);

    }
}
