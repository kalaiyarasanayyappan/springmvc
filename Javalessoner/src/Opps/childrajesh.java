package Opps;

public class childrajesh {
	void work()
	{
		System.out.println("parent ravi is an teacher");
	}
	void foodhabit()
	{
		System.out.println("parent ravi is vegetarian");
	}

}
 class parentravi extends childrajesh
{
	

void work()
{
	System.out.println("child is docter");
}
void foodhabit()
{
	System.out.println("child is non vegetarian");
}
public static void main(String args[])
{
	childrajesh cr=new childrajesh();
	cr.work();
	
}
}
