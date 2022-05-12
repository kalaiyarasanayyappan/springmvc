package Opps;

public class Overloading {

		void add( int a)
		{
			System.out.println(a);
		}
		void add(double a,double b)
		{
			System.out.println(a+b);
		}
		void add(int a,int b)
		{
			System.out.println(a+b);
		}
		void add(int a,int b,int c)
		{
		System.out.println(a+b);	
		}
		void add(double a)
		{
			System.out.println(a);
		}
		public static void main(String args[])
		{
			Overloading f=new Overloading();
			f.add(2.00+3.00);
			
		}
	}


