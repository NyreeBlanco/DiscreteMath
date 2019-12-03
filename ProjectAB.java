
package projectab;
import java.util.*;

public class ProjectAB {

    public static void main(String[] args) {
        
        askask();
        
    }
    
    
    static void askask(){
        try{PermuCombi PermuCombi = new PermuCombi();
        PermuCombi1 PermuCombi1 = new PermuCombi1();
        StirlingMethod StirlingMethod = new StirlingMethod();
        PascalTri PascalTri = new PascalTri();
        
        Scanner a = new Scanner(System.in);
        System.out.println("\t DISCRETE MATHEMATICS II\n");
        System.out.println("1. Permutation and Combination without Repetition");
        System.out.println("2. Permutation and Combination with Repetition");
        System.out.println("3. Stirling Number of Second Case");
        System.out.println("4. Pascal Triangle Row Generator");
        System.out.println("5. Exit");
        System.out.print("\nEnter the number of your choice: ");
        int n = a.nextInt();
        
        
        if(n==1){
            PermuCombi.Dmath();
        }
        
        else if (n==2){
            PermuCombi1.ask();
          
        }
        
        else if (n==3){
            StirlingMethod.Stirling();
        }
        
        else if(n==4){
            PascalTri.PasTri();
        }
        
        else if(n==5){
            Exit.Exit();
        }
        
        else{
            System.out.println("Invalid Input!!!!");
        }
    } 

        catch(InputMismatchException e){
            System.out.println("That wasn't a number. Please try again.\n");
            askask();
        } 
    }
}

    