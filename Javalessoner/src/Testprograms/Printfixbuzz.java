package Testprograms;
/*
 * @ author chainsys kalai
 * created on:30-03-2022
 * sub:FIRST TEST
 */

public class Printfixbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=1;
		while(index<=100)
		{
			if(index%3==0)
			{
				System.out.println(index+"Fix");
			}
			if(index%5==0)
			{
				System.out.println(index+"Buzz");
			}
			if((index%3==0)&&(index%5==0))
			{
				System.out.println(index+"FixBuzz");
			}
			index++;
		}
		

	}

}
