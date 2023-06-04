package array;

import java.util.Arrays;

public class singlestepinitialization {
	
	public static void main(String [] args)
	{
		int [] ar3 = {30,40,20,10};
		
		System.out.println(ar3.length);
		
		Arrays.sort(ar3);
		for(int i=0;i<=ar3.length-1;i++)
		{
			System.out.println(ar3[i]);
		}
		
		
	}

}
