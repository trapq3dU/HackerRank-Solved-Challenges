

import java.util.*;

public class Minimum_Loss {

    // Complete the minimumLoss function below.
    static int minimumLoss(long[] price) {
    	Map<Long,Long> pmap = new HashMap<Long, Long>();
        int len=price.length;
        for (int i=0; i<len; i++)
        {
            pmap.put(price[i], (long)i);
        }
        
        long minLoss=Long.MAX_VALUE;
        Arrays.sort(price);
        
        for(int i=1; i<len; i++)
        {
            if(pmap.get(price[i])<pmap.get(price[i-1]))
            {
                if(price[i]-price[i-1]<minLoss&&price[i]-price[i-1]>0)
                
                    minLoss=price[i]-price[i-1];
            }
            
        }
        return (int)minLoss;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] price = new long[n];

        String[] priceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long priceItem = Long.parseLong(priceItems[i]);
            price[i] = priceItem;
        }

        int result = minimumLoss(price);

        System.out.println(result);

        scanner.close();
    }
}
