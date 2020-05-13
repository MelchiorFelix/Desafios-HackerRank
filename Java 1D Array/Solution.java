import java.util.*;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //aqui vou pegar a entrada do primeiro int e dizer que o tamanho do array
        int[] a = new int[n];
        //blz,aqui vou fazer um for,que enquanto o i for menor que o tamanho do array,continua aumento em i
        //e para cada posição do array informada por vou pegar o proximo numero que for inserido pelo scan
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextInt();
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
