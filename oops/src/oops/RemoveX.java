package oops;
import java.util.*;

public class RemoveX {
    public static String withoutX(String str) {
        int len = str.length();

        if (len == 0) {
            return str; 
        }

        if (str.charAt(0) == 'x') {
            str = str.substring(1); 
            len--;
        }

        if (len > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1); 
        }

        return str;
    }

    public static void main(String[] args) {
        
        String input1 = "xHix";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + withoutX(input1)); 

        
        String input2 = "America";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + withoutX(input2)); 

        
        String input4 = "x";
        System.out.println("Input: " + input4);
        System.out.println("Output: " + withoutX(input4));
    }
}
        		

