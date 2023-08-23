class Telivision{
     
	 static boolean isConnected ;
	 static int minvol ;
	 static int maxvol = 10;
	 static int currentvol ;
	 
     public static boolean onOrOff(){
	    System.out.println("Inside the Telivision");
        if(isConnected == false){
		isConnected = true;
		System.out.println("Telivision is turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("Telivision is turned off");
		}
		System.out.println("End of  the Telivision");
	
	return isConnected;
	 }
	 
	 public static void increaseVolume(){
		 if(isConnected == true){
			 if(currentvol < maxvol){
				 currentvol = currentvol+ 1;
				 System.out.println("The  current volume of Telivision is "+currentvol);
			 }else{
				 System.out.println("The maximum volume is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the Telivision");
			 }
		 
	 }
	 
	 public static void decreaseVolume(){
		if(isConnected == true){
			if(currentvol > minvol){
				currentvol =currentvol - 1;
				System.out.println("The current volume of Telivision is "+currentvol);
			}else{
				System.out.println("Minimum Volume reached");
			}
		}else{
			System.out.println("Turn on the Telivision");
		}
		System.out.println("End of  the Telivision");
	 	 
	 
	 
	 
	 
	 }
}