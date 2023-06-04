package array;

import java.util.Arrays;

public class Example {
	
	public static void main(String args[])
	{
		//Step1 array declaration
		String [] ar = new String[5];
		
		//Step 2 Array initialization
		ar[0] = "rahul";
		ar[1] ="ganesh";
		ar[2] = "suresh";
		ar[3] = "ramesh";
		ar[4] = "mahesh";
		System.out.println(ar.length);
				
		//System.out.println(ar [3]);
		
	//	for (int i=0; i<=4; i++)
	//	{
		//	System.out.println(ar[i]);
	//	}
		Arrays.sort(ar);
		for(int i=0; i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}

}
