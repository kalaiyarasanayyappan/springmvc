package Opps;

public class Encapsulations{
	
	//private int balance=2000;
	//public int getbalance() {
		//return balance;
	//}
	//public void setbalance(int balance) {
		//this.balance=balance;
	//}
		
	
	public static void main(String args[]){
		
		Encapsulation b=new Encapsulation();
		int newbalance=b.getbalance();
		System.out.println( newbalance+"before setting");
		b.setbalance(500);
		System.out.println(b.getbalance()+"after setting new balance");
	
	

}
}

