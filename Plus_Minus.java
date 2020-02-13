import java.util.*;

public class Plus_Minus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float pos = 0,neg = 0,zeros = 0;
        float len = arr.length;
        for(int i=0;i<len; i++)
        {
            if(arr[i]>0)
                pos+=1;
            
            else if(arr[i]<0)
                neg+=1;
            else
                zeros+=1;
        }
        
        float p = pos/len;
        float n = neg/len;
        float z = zeros/len;
        System.out.println(p);
        System.out.println(n);
        System.out.println(z);


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
