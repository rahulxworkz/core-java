class CustomerExecutor{

     public static void main (String args[]){
	 
	       Customer customer = new Customer();
		   customer.setCustomerId(1);
		   
		   customer.setCustomerName("Maxyy");
		   customer.setAddress("Rajajinagar");
		   customer.setPhNo(9485416321l);
		   customer.setEmail("Maxxy@gmail.com");
		   customer.setDob("02/09/1973");
		   customer.setGender("Male");
		   String names [] = {"Rocky" , "Bhai" , "Vittu"};
		   customer.setNames(names);
		   
		   
		   System.out.println("The Customer ID is : "+customer.getCustomerId());
		   System.out.println("The Customer Name is : "+customer.getCustomerName());
		   System.out.println("The Customer Address is : "+customer.getAddress());
		   System.out.println("The Customer PhoneNo is : "+customer.getPhNo());
		   System.out.println("The Customer Email Id is : "+customer.getEmail());
		   System.out.println("The Customer Date of birth on : "+customer.getDob());
		   System.out.println("The Customer Gender is : "+customer.getGender());
		   customer.getNames();
		   
		   
	 }
}

//patient -- patirnt id , name ,attendance,age,diseasename,ardno,admittedDate,hospitalName,patientAdress,gender,consultantDoctor
//bank -- id ,name,branch,mifc,ifsc,manager,noOfEmployees
//railwaystation
//postoffice
//bustand
