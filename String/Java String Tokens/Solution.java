import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();

        if(s.isEmpty()){    
            System.out.println("0");
            return;
        }

        String[] b = s.split("[ |!|,|\\?|\\.|_|'|@|]+");
        System.out.println(b.length);

        for(String c : b){
            System.out.println(c);
        }


        scan.close();
    }
}

