
package projectab;
import java.util.*;
import java.math.BigInteger;

public class PascalTri extends StirlingMethod {
    
    public static void PasTri(){ 
        try{Scanner ny= new Scanner(System.in);
        System.out.println("\n\tPASCAL TRIANGLE ROW GENERATOR");
        System.out.print("Enter row value: ");
        int ree= ny.nextInt();
        
        
        if(ree>=501){
            System.out.println("Your input must not over exceed to 500. Please try again.");
            PasTri();
        }
        
        else if(ree<0){
            System.out.println("Your input must be an Integer. Please try again.");
            PasTri();
        }
        
        else{
        System.out.print("Answer: ");
        BigInteger[] result = PascalComputation(ree);
        for(BigInteger r: result){
            System.out.print(r + " ");
        }
        
        System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
        System.out.print("Enter your choice: ");
            int ans;
            ans = ny.nextInt();
            if(ans==1){
                PasTri();
             }
            else if(ans==0){
               ProjectAB.askask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again."+"\n");
                PasTri();
            }
        }
    }
        catch(InputMismatchException e){
            System.out.println("That wasn't a number. Please try again.");
            PasTri();
        }
    }

    private static BigInteger[] PascalComputation(int ree) {
       BigInteger var = new BigInteger("1");
       BigInteger var1 = new BigInteger("1");
        
        BigInteger[] previous = {var,var1};
        for (int r= 0; r <= ree; r++){
            BigInteger[] next = new BigInteger[r+1];
            next[0] = var;
            for (int i = 1; i < r; i++){
                next [i] = previous [ i -1 ].add(previous[i]);
            }
            next[r] = var;
            previous = next;
        }
        return previous;
    } 
}