
package projectab;
import java.util.*;
import java.math.BigInteger;

public class PermuCombi1 extends PermuCombi{
    static void ask(){
        try{Scanner ask = new Scanner(System.in);
        System.out.println("\nPlease choose below: \n\t 1.PERMUTATION WITH REPETITION  \n\t 2.COMBINATION WITH REPETITION \n\t 3.Back");
        System.out.print("Enter your choice: ");        
        int choice;
        choice = ask.nextInt();
        
        if(choice==1){
            PermuRep();
            System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans;
            ans = ask.nextInt();
            
            if(ans==0){
                ProjectAB.askask();
            }
            else if(ans==1){
                ask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again.");
                ask();
            }
        }     
        
        else if(choice==2){
            CombiRep();
        }
        
        else if(choice==3){
            ProjectAB.askask();
        }
    }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number/Your input was not on the choices. Please try again.");
            ask();
        }
    }
    public static void PermuRep(){
        Scanner pcr = new Scanner(System.in);
        System.out.println("\tFOR PERMUTATION WITH REPETITION");
        System.out.print("Enter your n : ");
        BigInteger N = pcr.nextBigInteger();
        int range = 500;
        System.out.print("Enter your r : ");
        int R = pcr.nextInt();
        
        if ((BigInteger.valueOf(range).compareTo(N)<0)||(R > 500)){
                System.out.println("Your input shouldn't over exceed to 500. Please try again. ");
                PermuRep();
            }
        
        else{
        BigInteger result = N.pow(R);
        System.out.println("Answer: "+result);
        }
    }
    
    public static void CombiRep(){
        Scanner pcr1 = new Scanner(System.in);
        System.out.println("\tFOR COMBINATION WITH REPETITION");
        System.out.print("Enter your n: ");
        int N1 = pcr1.nextInt();
        System.out.print("Enter your r: ");
        int R1 = pcr1.nextInt();
        
        if ((N1 > 500)||(R1 > 500)){
                System.out.println("Your input shouldn't over exceed to 500. Please try again. ");
                CombiRep();
            }
        else{
        if(R1 <= N1){
            int N2 = N1 + (R1 - 1);
            int M = N2 - R1;
            
            System.out.println("Answer: "+PermuCombiFactorial(N2,R1,M));
            
            System.out.println("Do you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans = pcr1.nextInt();
            
            if(ans==0){
                ProjectAB.askask();
            }
            
            else if(ans==1){
                ask();
            }
            
            else {
                System.out.println("Your input was not on the choices. Please try again.");
                ask();
            }
        }
        
        else{
            System.out.println("Your r must not be less than your n.");
             System.out.println("Do you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans = pcr1.nextInt();
            
            if(ans==0){
                ProjectAB.askask();
            }
            
            else if(ans==1){
                ask();
            }
            
            else {
                System.out.println("Your input was not on the choices. Please try again.");
                ask();
            }
            
        }
    }   
    }    
    static BigInteger PermuCombiFactorial(int N, int R, int M){
        BigInteger var = new BigInteger("1");
        BigInteger var1 = new BigInteger("1");
        BigInteger M1 = new BigInteger("1");
        BigInteger ans;
        
        for (int i = 2; i <=N; i++) {
            var = var.multiply(BigInteger.valueOf(i));
            
        }
        for (int y = 2; y <=R; y++) {
            var1 = var1.multiply(BigInteger.valueOf(y));
            
        }
        for (int x = 2; x <=M; x++) {
            M1 = M1.multiply(BigInteger.valueOf(x));
            
        }
       
        ans = var.divide((var1.multiply(M1)));

        return ans;
    }
} 