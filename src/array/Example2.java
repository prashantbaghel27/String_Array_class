package array;

import java.util.Arrays;

public class Example2 {

	public static void main(String args[])
	{
		
	int [] ar1=new int[4];
	
	ar1 [0]=30;
	ar1 [1]=20;
	ar1 [2]=40;
	ar1 [3]=80;

	//System.out.println(ar1.length);
	
	//for (int i=0;i<=3; i++)
	//{
		//System.out.println(ar1[i]);
	//}
	
	//for (int i=0;i<=ar1.length-1; i++)
	//{
		//System.out.println(ar1[i]);
	//}
	
	Arrays.sort(ar1);
	
	// ascending order
	
	for (int i=0;i<=ar1.length-1; i++)
		{
			System.out.println(ar1[i]);
		}
	
	//descending order
	for (int i=ar1.length-1;i>=0; i--)
	{
		System.out.println(ar1[i]);
	}
}

	
		
	}
