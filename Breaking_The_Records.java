import java.io.*;
import java.util.*;

public class Breaking_The_Records {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int min=scores[0];
        int max=scores[0];
        int minbr=0;
        int maxbr=0;
        int []result=new int[2];
        for(int i= 1; i<scores.length; i++)
        {
            if(scores[i]>max)
            {
                maxbr+=1;
                max=scores[i];
            }
            if(scores[i]<min)
            {
                minbr+=1;
                min=scores[i];
            }
        }
        result[0]=maxbr;
        result[1]=minbr;
        return result;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
