package Charstreams;

import java.util.Objects;

public class Twostring {
	    int roll;
		String name;
		String college;
		String city;
		Twostring ( int roll,String name,String college,String city)
		{
			this.roll=roll;
			this.name=name;
		this.college=college;
			this.city=city;
		}
		@Override
		public int hashCode() {
			return Objects.hash(city, college, name, roll);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Twostring other = (Twostring) obj;
			return Objects.equals(city, other.city) && Objects.equals(college, other.college)
					&& Objects.equals(name, other.name) && roll == other.roll;
		}
		
		public static void main(String args[])
		{
			Twostring j1=new Twostring(10,"vijay","mmm","chennai");
			Twostring j2=new Twostring(15,"ajith","nnnn","vellore");
	
			{
				if(j1.equals(j2))
				System.out.println("both objects are equal");
				else
					System.out.println("both object are not equal");
			}
		
		}
}
			
		
