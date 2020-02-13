import java.util.Scanner;

public class StairCase {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int i=1; i<=n; i++)
        {
        	
            for(int j=n-i; j>0; j--)
            {
                System.out.print("*");
            }
            for(int k=0; k<i; k++)
            {
                System.out.print("#");
            }
            
            System.out.println();
            
        }
        


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Ready to accept Input");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}