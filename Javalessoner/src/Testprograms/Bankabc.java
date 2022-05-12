package Testprograms;

public class Bankabc {
		// TODO Auto-generated method stub
		  private final String customername;
		   private long accountnumber;
		private  String address;
		private  long phonenumber;
		 private String email;
		  public Bankabc(String name)
		  {
			this.customername=name;  
		  }
		  public long getaccountnumber()
		  {
			 return accountnumber; 
		  }
		  public void setaccountnumber(long accountnumber)
		  {
			  this.accountnumber=accountnumber;
		  }
		public String getCustomername() {
			return customername;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(long phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
         
	}

