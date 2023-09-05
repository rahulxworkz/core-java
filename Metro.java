class Metro{

      int metroid;
	  int noOfComp;
	  String source;
	  String dest;
	  
	  
	 public Metro(){
		 System.out.println("Default or zero parameter constructor invoked");
	 }
	 
	 
	 public  Metro(int metroid	, int noOfComp , String source , String  dest){
		 this();
	      this.metroid = metroid;
		  this.noOfComp = noOfComp;
		  this.source = source;
		  this.dest = dest;
		  System.out.println("The 4 parameter constructor invoked");
	 
	 }
	 

	 
	 public  void displayDetails(){
	        System.out.println("The Metro id is :"+this.metroid);
	        System.out.println("The no of compartments are : "+this.noOfComp);
	        System.out.println("The Source station is : "+this.source);
	        System.out.println("The Destination station is : "+this.dest);
	 }
 
}

   // classroom
  // airlines
  // udyanavana id , name ,location , timings , no of gates 
  // playstations  id , no of games,joystick,array of game names
  //GYM
  //tourist places
// library
// amuzement park 
// museum
// zoo  