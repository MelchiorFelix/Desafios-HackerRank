import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        /*enquanto i for menor que o numero de testCases que coloquei,
         continua repetindo essa bagaça*/
		for(int i = 0; i < testCases; i++){
			String pattern = in.nextLine();
          	try{
                /*Nesse problema, um regex é válido apenas se você puder compilá-lo                         usando o método Pattern.compile.*/
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(Exception e){
                /*Se Pattern.compile não resolver vai cai na exception,então 
                    capturo ela e imprimo o invalid e pronto*/
                System.out.println("Invalid");
            }

		}
        
	}
}
