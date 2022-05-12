package kalai;

public class Arrayb {
	public static void main(String args[])
	{
		int a[]= {2,5,1,78,8};  //expected output{2,78,8}
		int[] b=new int[a.length];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)//to print even  numbers
			{
				b[count]=a[i];
				count++;
			}
		}
		for(int i=0;i<b[i];i++)
		{
			System.out.println(b[i]);
		}
	}

}
