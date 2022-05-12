package Twodarray;

public class Additionof2darray {
	public static void  main(String args[]) {
		int a[][]= {{2,4,6},{7,9,3},{2,1,8}};
		int b[][]= {{2,4,6},{9,1,8},{5,9,9}};
		int c[][]= new int[3][3];
		int d,e = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
