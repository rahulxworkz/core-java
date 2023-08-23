class Speaker{
     
	 static boolean isConnected ;
	 static int minvol ;
	 static int maxvol = 6;
	 static int currentvol ;
	 
     public static boolean onOrOff(){
	    System.out.println("Inside the speaker");
        if(isConnected == false){
		isConnected = true;
		System.out.println("Speaker is turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("Speaker is turned off");
		}
		System.out.println("End of  the speaker");
	
	return isConnected;
	 }
	 
	 public static void increaseVolume(){
		 if(isConnected == true){
			 if(currentvol < maxvol){
				 currentvol = currentvol+ 1;
				 System.out.println("The  current volume of speaker is "+currentvol);
			 }else{
				 System.out.println("The maximum volume is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the speaker");
			 }
		 
	 }
	 
	 public static void decreaseVolume(){
		if(isConnected == true){
			if(currentvol > minvol){
				currentvol =currentvol - 1;
				System.out.println("The current volume of speaker is "+currentvol);
			}else{
				System.out.println("Minimum Volume reached");
			}
		}else{
			System.out.println("Turn on the speaker");
		}
		System.out.println("End of  the speaker");
	 	 
	 
	 
	 
	 
	 }
}
