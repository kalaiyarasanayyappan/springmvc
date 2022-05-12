package Opps;

public class Car {

	
	 String name;
	int model;
	int price;
	String manufacturer;
	public Car(String name ,int model,int price,String manufacturer ) {
		this.name=name;
		this.model=model;
		this.price=price;
		this.manufacturer=manufacturer;
		
	}

   void print() {
		System.out.println(name+" "+model+" "+price+" "+manufacturer);
	}
	void display() {
		System.out.println( "price before car rs"+price);
	}
	void changeprice(int price) {
		this.price=price;
		System.out.println("price after car rs"+price);
	}
	void price(int price) {
	
		this.price=price;
		System.out.println("price after car rs"+price);
	}
	void changedprice(int price) {
		this.price=price;
		System.out.println("price after car is rs"+price);
	}
	void toyataprice(int price) {
		this.price=price;
		System.out.println("price after car is rs"+price);
	}
	boolean equals(Car o)
	{
		boolean flag=false;
		Car call1=(Car)o;
		if(this.price==call1.price);
		{
		flag=true;
		//System.out.println("true");
		}
		return flag;
		
	}

	public static void main (String args[]) {
		Car call=new Car("hyndai",2019,1500000,"hyndai company");
		Car call1=new Car("indica",2012,1000000,"indica company");
		Car call2=new Car("tata",2009,1200000,"tata company");
		Car call3=new Car("toyata",2008,1300000,"toyata company");
		call.print();
		call1.print();
		call2.print();
		call3.print();
		call.display();
		call.changeprice(1200000);
		call1.display();
		call1.price(1800000);
		call.print();
		call2.changedprice(100000);
		call2.print();
		call3.toyataprice(1800000);
		call3.print();
		
		
		
	
		}
	}
