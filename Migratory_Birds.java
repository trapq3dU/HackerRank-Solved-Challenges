
import java.util.*;

public class Migratory_Birds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int[] arr) {
    	int []type=new int[5];
        int n= arr.length;
      for(int i=1;i<=5;i++)
      {
          int c=0;
          for(int j=0;j<n;j++)
          {
              if(arr[j]==i)
              {
                  c++;
              }
              type[i-1]=c;
          }
      }
      int max=type[0],lowCount=0;
      for(int i=1; i<5; i++)
      {
          if(type[i]>max)
          {
              max=type[i];
              lowCount=i;
          }
          
      }
      return (lowCount+1);

    }

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();

        int result = migratoryBirds(arr);
        System.out.println(result);
        s.close();


    }
}
