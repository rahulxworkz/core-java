class BankExecutor{

     public static void main (String args[]){
	       Bank bank = new Bank();
		   bank.setBankId(1);
		   bank.setName("Union Bank");
		   bank.setCifNo("6623456789");
		   bank.setAddress("10 cross , RRNagar");
		   bank.setIfscCode("A9C165");
		   bank.setBranchName("NRCircle Branch");
		   bank.setCustomerName("Salman");
		   bank.setCustomerPhoneNo(9874516262L);
		   
		   System.out.println("The Bank ID is : "+bank.getBankId());
		   System.out.println("The Bank Name is : "+bank.getName());
		   System.out.println("CIF Number: " + bank.getCifNo());
		   System.out.println("Address: " + bank.getAddress());
		   System.out.println("IFSC Code: " + bank.getIfscCode()); 
		   System.out.println("Branch Name: " + bank.getBranchName());
		   System.out.println("Customer Name: " + bank.getCustomerName());
		   System.out.println("Customer Phone Number: " + bank.getCustomerPhoneNo());
    }
}