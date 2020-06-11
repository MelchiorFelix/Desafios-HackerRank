import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        char[] a1 = a.toLowerCase().toCharArray(); 
        char[] b1 = b.toLowerCase().toCharArray();

        if (a1.length != b1.length){
            return false;
        }

        int[] count = new int[26]; 
        for (int i = 0; i < a1.length; i++){
            count[a1[i]-97]++;  
            count[b1[i]-97]--;   
        }
        for (int i = 0; i<26; i++){
            if (count[i] != 0){
                return false;
            }
               
        }
            
        
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

