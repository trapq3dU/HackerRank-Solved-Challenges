import java.util.*;

public class Diagonal_Difference 
{    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[][] = new int[n][n];
        int leftSum = 0, rigthSum = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = in.nextInt();
                if (i == j)
                    leftSum+= arr[i][j];

                if (i+j == n-1)
                    rigthSum+= arr[i][j];
            }
        }
        in.close();
        System.out.println(Math.abs(leftSum - rigthSum));
    }
}
