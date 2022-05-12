package Testprograms;
/*
 * @ author chainsys kalai
 * created on:30-03-2022
 * sub:FIRST TEST
 */

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int countA=0;
			for(countA=1;countA<=9;countA++)
				{
				for(int countB=9;countB>=countA;countB--)
				{
					System.out.print(".");
				}
				for(int countC=countA;countC>=1;countC--)
				{
				System.out.print(countC);
			}
				for(int countC=2;countC<=countA;countC++)
				{
					System.out.print(countC);
				}
				System.out.println();
				}
			}
		}
	


