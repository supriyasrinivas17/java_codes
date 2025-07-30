Expand Compressed String with Counts


import java.io.*;
import java.util.*;

public class Solution {
public static String exp(String s){
    StringBuilder res= new StringBuilder();
    int i =0;
    while(i<s.length()){
        char ch = s.charAt(i++);
        StringBuilder d = new StringBuilder();
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            d.append(s.charAt(i++));
        }
        int count = (d.length()>0)? Integer.parseInt(d.toString()):1;
        for(int j =0;j<count;j++){
            res.append(ch);
        }
    }
    return res.toString();
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = exp(s);
        System.out.println(result);
    }
}