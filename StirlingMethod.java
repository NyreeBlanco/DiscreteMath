
package projectab;

import java.util.Scanner;
import java.math.BigInteger;
import java.util.InputMismatchException;



public class StirlingMethod extends PermuCombi1 {
    
    public static void Stirling(){
        try{Scanner s = new Scanner(System.in);
        System.out.println("\tSTIRLING NUMBER OF SECOND CASE");
        System.out.print("Enter your n: ");
        int N = s.nextInt();
        System.out.print("Enter your j: ");
        int J = s.nextInt();
        
        if((N>500)||(J>500)){
                System.out.println("Your input must not over exceed to 500. Please try again. ");
                Stirling();
            }
        else if((N<0)||(J<0)){
                System.out.println("Your input must be an Integer. Please try again. ");
                Stirling();
            }
        else{
        System.out.print("Answer: ");

        BigInteger s1 = BigInteger.valueOf(-1);
        BigInteger s2 = BigInteger.valueOf(-1);
        
        BigInteger snj = BigInteger.ZERO;
        BigInteger snj1 = BigInteger.ZERO;
        BigInteger fin = BigInteger.ZERO;
            for(int i = 0; i < J; i++){
            s1 = (s1).multiply(s2);
            BigInteger combi = factorial(J).divide(factorial(i).multiply(factorial(J-i)));
            snj = BigInteger.valueOf(J).subtract(BigInteger.valueOf(i));
            snj1 = BigInteger.valueOf(J).subtract(BigInteger.valueOf(i));
                for(int a = 1; a < N; a++){
                snj = snj.multiply(snj1);
                }
                fin = fin.add((s1).multiply(combi).multiply(snj));
            }
        System.out.println(fin.divide(factorial(J)));
        
        
        System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
        System.out.print("Enter your choice: ");
            int ans;
            ans = s.nextInt();
            if(ans==1){
                Stirling();
             }
            else if(ans==0){
                ProjectAB.askask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again."+"\n");
                Stirling();
            }
        }
    }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number. Please try again.");
            Stirling();
        }
    }
    
    static BigInteger factorial(int N){
        BigInteger factor = new BigInteger("1");
        for(int b = 2; b < N; b++){
            factor = factor.multiply(BigInteger.valueOf(b));
        }
        return factor;
    }
}