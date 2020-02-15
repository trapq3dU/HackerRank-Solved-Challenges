
import java.util.*;

public class Divisible_Sum_Pairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count=0;
        for(int i=0;i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if((ar[i]+ar[j])%k==0)          
                {
                    count+=1;
                }
            }
        }
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);

        scanner.close();
    }
}
