class Airlines{
    int id ;
	int noOfPassengers;
	String name;
	int seats;
	int staffs;
	
	Airlines(int id ,	int noOfPassengers,	String name , 	int seats , 	int staffs){
		
		
	       this.id = id;
		   this.noOfPassengers = noOfPassengers;
		   this.name = name;
		   this.seats = seats;
		   this.staffs = staffs;
	}
	
	public void getDetails(){
	     System.out.println("The id of airlines are: "+id);
	     System.out.println("The no of passengers are: "+noOfPassengers);
	     System.out.println("The name of the airlines: "+name);
	     System.out.println("The no of seats: "+seats);
	     System.out.println("the no of staffs present are: "+staffs);
	
	
	}
	
}