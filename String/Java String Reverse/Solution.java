import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        //StringBuilder para reverse a String A
         String B = new StringBuilder(A).reverse().toString();

        
        //Vejo se a A e igual à B
        if(A.equals(B)){
            System.out.println("Yes");
        } else { //senão imprime 'No'
            System.out.println("No");
        }
        
    }
}


