class Jindal{

     String brands [] ;
	 int roomno;
	 int floorno;
	 

     public Jindal(String bnds [] , int rno , int flno){
	 
	        brands = bnds;
			roomno = rno;
			floorno = flno;
			System.out.println("Object is created");
	 
	 }
	 
	 public void details(){
           System.out.println("The details are : ");
		   System.out.println("The room no is  : "+roomno);
		   System.out.println("The floor no is  : "+floorno);
	 }
		   
	 public void allBrands(){
		 for(int i = 0;i<brands.length;i++){
			 System.out.print(brands[i]+"  ");
		 }
	 }	   
		   
	 

}