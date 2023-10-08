import java.util.*;
public class Reverse{
    public static void reverseStr(String str){

        // method 1
        // if(str.length()==0)
        // return;
        // System.out.print(str.charAt(str.length()-1));
        // reverseStr(str.substring(0, str.length()-1));
        
        // // method 2
        // if(str.length()==0)
        // return;
        // reverseStr(str.substring(1, str.length()));
        // System.out.print(str.charAt(str.length()-1));

        // method 3:
        // if(str1.length()==0)
        // return;
        // reverseStr(str1.substring(1,str1.length()-1));
        // System.out.print(str1.charAt(0));
    }
    public static void main(String[] args) {
        String str="hello world";
        reverseStr(str);

    }
}