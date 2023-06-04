package array;

public class multidimensional {
	
	public static void main(String [] args)
	{
		int [] [] ar4=new int[2][3];
		
		ar4 [0][0] =10;
		ar4 [0][1]=20;
		ar4 [0][2]=30;
		ar4 [1][0]=40;
		ar4 [1][1]=50;
		ar4 [1][2]=60;
		
		System.out.println(ar4.length);
		System.out.println(ar4 [1][2]);
		
		for(int i=0; i<=1; i++)
		{
			for (int j=0; j<=2;j++)
			{
				System.out.println(ar4[i][j]);
			}
			System.out.println();
		}
	}

}
