
import java.util.*;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	int total=0;
    	int min=arr[0];
    	for(int i=1; i<arr.length; i++)
    	{
    		if(min>=arr[i])
    		{
    			min=arr[i];
    		}
    	}
    	int max=arr[0];
    	for(int i=1; i<arr.length; i++)
    	{
    		if(max<=arr[i])
    		{
    			max=arr[i];
    		}
    	}
    	for(int i=0; i<arr.length; i++)
    	{
    		total+=arr[i];
    	}
    	int minSum=total-max;
    	int maxSum= total-min;
    	System.out.print(minSum+" "+ maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
