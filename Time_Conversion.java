import java.util.*;

public class Time_Conversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	int len = s.length();
        String s1 = null;
        int f=0;
        

        if(s.charAt(len-2)=='P')
        {
            if(s.charAt(0)=='0' && s.charAt(1)=='1')
                f=1;
            if(s.charAt(0)=='0' && s.charAt(1)=='2')
                f=2;
            if(s.charAt(0)=='0' && s.charAt(1)=='3')
                f=3;
            if(s.charAt(0)=='0' && s.charAt(1)=='4')
                f=4;
            if(s.charAt(0)=='0' && s.charAt(1)=='5')
                f=5;
            if(s.charAt(0)=='0' && s.charAt(1)=='6')
                f=6;
            if(s.charAt(0)=='0' && s.charAt(1)=='7')
                f=7;
            if(s.charAt(0)=='0' && s.charAt(1)=='8')
                f=8;
            if(s.charAt(0)=='0' && s.charAt(1)=='9')
                f=9;
            if(s.charAt(0)=='1' && s.charAt(1)=='0')
                f=10;
            if(s.charAt(0)=='1' && s.charAt(1)=='1')
                f=11;
            if(s.charAt(0)=='1' && s.charAt(1)=='2')
                f=0;
            s1=Integer.toString(f+12);
        }

        if(s.charAt(len-2)=='A')
        {
            if(s.charAt(0)=='0' && s.charAt(1)=='1')
                f=1;
            if(s.charAt(0)=='0' && s.charAt(1)=='2')
                f=2;
            if(s.charAt(0)=='0' && s.charAt(1)=='3')
                f=3;
            if(s.charAt(0)=='0' && s.charAt(1)=='4')
                f=4;
            if(s.charAt(0)=='0' && s.charAt(1)=='5')
                f=5;
            if(s.charAt(0)=='0' && s.charAt(1)=='6')
                f=6;
            if(s.charAt(0)=='0' && s.charAt(1)=='7')
                f=7;
            if(s.charAt(0)=='0' && s.charAt(1)=='8')
                f=8;
            if(s.charAt(0)=='0' && s.charAt(1)=='9')
                f=9;
            if(s.charAt(0)=='1' && s.charAt(1)=='0')
                f=10;
            if(s.charAt(0)=='1' && s.charAt(1)=='1')
                f=11;
            if(s.charAt(0)=='1' && s.charAt(1)=='2')
                f=0;
            s1=Integer.toString(f+0);
        }
        String s2 = s.substring(2,len-2);
        String s3=s1+s2;
        return s3;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        

        String s = scan.nextLine();

        String result = timeConversion(s);

        System.out.println(result);
        
    }
}
//	12:40:22AM	06:40:03AM	12:05:39AM	04:59:59AM	12:00:00AM
//	00:40:22	06:40:03	00:05:39	04:59:59	00:00:00