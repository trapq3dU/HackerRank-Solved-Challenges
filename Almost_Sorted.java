public class Almost_Sorted 
{
	public static void main(String[] args) 
	{
		int[] arr = {100,200,300};
        int count=0;
        if(arr.length==2)
        {
        	if(arr[0]<arr[1])
        	{
        		System.out.println("Swap");
        		System.out.println("1 2");
        	}
        }
        else      
        {
        	for(int i=0; i<arr.length-1; i++)
        	{
        		int min=arr[i];
        		if(min<arr[i+1])
        		{
        			min=arr[i];
        			count+=1;
        		}            
        		if(count==arr.length-1)
        			System.out.println("yes");
        	}
        }
        
    }
}