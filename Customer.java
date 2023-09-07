class Customer{

     //encapsulation
	 private int customerId;
	 private String customerName;
	 private String address;
	 private long phNo;
	 private String email;
	 private String dob;
	 private String gender;
	 private String names [];
	 
	 //1
	 public void setCustomerId(int customerId){
		 this.customerId = customerId;
		 
	 }
	 public int getCustomerId(){
		 return customerId;
	 }
	   
	 //2  
	 public void setCustomerName(String customerName){
         this.customerName = customerName;		 
	 }
	 public String getCustomerName(){
		 return customerName;
	 }
	 
	 //3
	 public void setAddress(String address){
		 this.address = address;
	 }
	 public String getAddress(){
		 return address;
	 }
	 
	 //4
	 public void setPhNo(long phNo){
		 this.phNo = phNo;
	 }
	 public long getPhNo(){
		 return phNo;
	 }
	 //5
	 public void setEmail(String email){
		 this.email = email;
	 }
	 public String getEmail(){
		 return email;
	 }
	 //6
	 public void setDob(String dob){
		 this.dob = dob;
	 }
	 public String getDob(){
		 return dob;
	 }
	 //7
	 public void setGender(String gender){
		 this.gender = gender;
	 }
	 public String getGender(){
		 return gender;
	 }
	 
	 public void setNames(String names[]){
		 this.names=names;
	 }
	 public void getNames(){
		
		 for(int i = 0 ; i < names.length ; i++){
			System.out.println( names[i]); 
		 }
		
	 }
	 

}