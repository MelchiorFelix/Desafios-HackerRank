import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        //tira os espaços no começo e fim do texto
        s = s.trim();
        
        //checa se não inseriu nada devolvendo 0;
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }

        //retirar oq não tiver na expressão que quero
        String[] str = s.split("[^a-zA-Z]+");
        
        System.out.println(str.length);
        for (String st : str) {
            System.out.println(st);
        }
    }
}

