
package projectab;
import java.util.*;
import java.math.BigInteger;

public class PermuCombi extends ProjectAB{
    static void Dmath(){
        try{Scanner pc = new Scanner(System.in);
        System.out.println("Please choose below: \n\t1. PERMUTATION \n\t2. COMBINATION \n\t3. Back");
        System.out.print("Enter your choice: ");
        int choice = pc.nextInt();
 
        if(choice==1){
            System.out.println("\tPERMUTATION");
            System.out.print("Enter your n : ");
            int N = pc.nextInt();
            System.out.print("Enter your r : ");
            int R = pc.nextInt();
            
            if((N>500)||(R>500)){
                System.out.println("Your input must not over exceed to 500. Please try again. ");
                Dmath();
            }
            
            else if((N<0)||(R<0)){
                System.out.println("Your input must be an Integer. Please try again. ");
                Dmath();
            }
            
            else{
            int M = N-R;
            if(N>=R){
            System.out.println("Answer: "+ PermuFactorial (N,R,M));
            System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans;
            ans = pc.nextInt();
            if(ans==1){
                Dmath();
             }
            else if(ans==0){
                 ProjectAB.askask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again."+"\n");
                Dmath();
            }
        }
            else if(N<R){
            System.out.println("Your n shouldn't be greater than you r.");
            System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans;
            ans = pc.nextInt();
            if(ans==1){
                Dmath();
             }
            else if(ans==0){
                 ProjectAB.askask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again."+"\n");
                Dmath();
            }
        }
            else{
            System.out.println("Invalid input.");
            System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans;
            ans = pc.nextInt();
            if(ans==1){
                Dmath();
            }
            else if(ans==0){
                 ProjectAB.askask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again."+"\n");
                Dmath();
            }
        }
    }
}
        
        else if(choice==2){
        System.out.println("\tCOMBINATION");
        System.out.print("Enter your n : ");
        int N = pc.nextInt();
        System.out.print("Enter your r : ");
        int R = pc.nextInt();
        
        if((N>500)||(R>500)){
                System.out.println("Your input must not over exceed to 500. Please try again. ");
                Dmath();
            }
        
        else if((N<0)||(R<0)){
                System.out.println("Your input must be an Integer. Please try again. ");
                Dmath();
            }
        
        else{
        int M = N-R;
        if(N>=R){
            System.out.println("Answer: "+ CombiFactorial (N,R,M));
            System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans;
            ans = pc.nextInt();
            if(ans==1){
                Dmath();
            }
            else if(ans==0){
                ProjectAB.askask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again."+"\n");
                Dmath();
            }
        }
        else if(N<R){
            System.out.println("Your r shouldn't be greater than you n.");
            System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans;
            ans = pc.nextInt();
            if(ans==1){
                Dmath();
            }
            else if(ans==0){
                ProjectAB.askask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again."+"\n");
                Dmath();
            }
        }
        else{
            System.out.println("Invalid input.");
            System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans;
            ans = pc.nextInt();
            if(ans==1){
                Dmath();
            }
            else if(ans==0){
                ProjectAB.askask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again."+"\n");
                Dmath();
            }
        }  
    }
    }
        else if(choice==3){
            ProjectAB.askask();
        }
        else{
            System.out.println("Your input is out of the choices. Please try again.");
            System.out.println("\nDo you want to try it again? 0 -No 1 -Yes");
            System.out.print("Enter your choice: ");
            int ans;
            ans = pc.nextInt();
            if(ans==1){
                Dmath();
            }
            else if(ans==0){
                ProjectAB.askask();
            }
            else{
                System.out.println("Your input was not on the choices. Please try again."+"\n");
                Dmath();
            }
        }
    }   
        catch(InputMismatchException e){
            System.out.println("That wasn't a number. Please try again.");
            Dmath();
        }
    }
    
    static BigInteger PermuFactorial(int N, int R, int M){
        BigInteger var = new BigInteger("1");
        BigInteger M1 = new BigInteger("1");
        BigInteger ans;
        
        for (int i = 2; i <=N; i++) {
            var = var.multiply(BigInteger.valueOf(i));
        }
        for (int x = 2; x <=M; x++) {
            M1 = M1.multiply(BigInteger.valueOf(x));    
        }
        ans = var.divide(M1);

        return ans;
    }    
    static BigInteger CombiFactorial(int N, int R, int M){
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
