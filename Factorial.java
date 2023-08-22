import java.util.Scanner;

class withScan{
	public static void getFact(int factnumber){
		int dummy =  1;
			for(int num = 1 ; num<=factnumber;num++){
				 dummy = dummy * num;
				
			} 
		System.out.println("The Factorial of " + factnumber + " is " +dummy);	
		 }
}
	class Factorial{
     public static void main (String args[]){
		 withScan obj = new withScan();
         obj.getFact(5);
		 obj.getFact(8);
		 obj.getFact(9);
		 
           


/*		 System.out.println("Enter the number");
	       Scanner sc = new Scanner(System.in);
		   int n = sc.nextInt();
		   int dummy = 1;
		   for(int i = 1 ; i<=n ;i++){
			   dummy = dummy * i ;
		   }
	     System.out.println("The factorial of " +n+ "is : " +dummy);     */
	 }
	 

}