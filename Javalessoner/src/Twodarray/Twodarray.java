package Twodarray;

public class Twodarray {
	public static void main(String args[]) {
		int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int b[][]= {{4,2,5},{3,6},{4,7,0,2},{8,3,7,0,1},{4}};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				
			System.out.print(array[i][j]+"  ");	
	}
			System.out.println();

}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+"   ");
			}
			System.out.println();
		}
	}
}


