package Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class FormMin {
    public static void test(String o) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= o.length(); i++) {
            st.push(i + 1);
            if (i == o.length() || o.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    System.out.print(st.pop());

                }
            }

        }
    }
    public static void main(String[] args) {
//        this input is for amazon question

//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//        String o = "";
//        for (int i = 0; i < str.length(); i++) {
//            int a = str.charAt(i)-'0';
//            if (a%2==0){
//                o = o+"I";
//            }else{
//                o = o +"D";
//            }
//        }
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.next();
        }
        for (int j = 0; j < arr.length; j++) {
            String o = arr[j];
            test(o);
            System.out.print("\n");

            }
        }

    }
