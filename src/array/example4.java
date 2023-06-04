package array;

public class example4 {
	
	

	public static void main(String []  args)
	{
	
	int [] [] ar5= {{10,20,30},{40,50,60}};
	
System.out.println(ar5.length);
System.out.println(ar5 [1] [0]);

for (int i=0;i<=1;i++)
{
	for (int j=0;j<=2;j++)
	{
		System.out.println(ar5 [i][j] + " ");
	}
	System.out.println();
}
	}
}
