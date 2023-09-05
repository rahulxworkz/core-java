class AirlinesExecutor{

     public static void main (String args[]){
	 
	       Airlines air = new Airlines(1 , 120 , "Indigo" , 140 , 20);
		   air.getDetails();
		   System.out.println("---------------------------------------------");
	       Airlines air1 = new Airlines(2 , 100 , "Vikram" , 150 , 40);
		   air1.getDetails();
		   System.out.println("---------------------------------------------");
	       Airlines air2 = new Airlines(3 , 110 , "Rafhel" , 160 , 30);
		   air2.getDetails();
		   System.out.println("---------------------------------------------");
	       Airlines air3 = new Airlines(4 , 130 , "KingFisher" , 170 , 35);
		   air3.getDetails();
		   System.out.println("---------------------------------------------");
	       Airlines air4 = new Airlines(5 , 140 , "TATA" , 1000 , 40);
		   air4.getDetails();
		   System.out.println("---------------------------------------------");
	 
	 }
}