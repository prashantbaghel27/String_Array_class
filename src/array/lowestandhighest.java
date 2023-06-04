package array;

import java.util.Arrays;

public class lowestandhighest {
	
	public static void main(String [] args)
	{
		int [] ar6=new int [4];
		
		ar6[0]=30;
		ar6[1]=20;
		ar6[2]=40;
		ar6[3]=10;
		
		Arrays.sort(ar6);
		
		System.out.println(ar6[0]);
	    System.out.println(ar6[ar6.length-1]);
				
	}

}
