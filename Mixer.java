class Mixer{
    static boolean isConnected;
	static int minSpeed ;
	 static int maxSpeed = 5;
	 static int currentSpeed ;
	
	public static void  onOrOff(){
	System.out.println("Inside the Mixer");
        if(isConnected == false){
		isConnected = true;
		System.out.println("Mixer is turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("Mixer is turned off");
		}
	}

	
	public static void increaseSpeed(){
		 if(isConnected == true){
			 if(currentSpeed < maxSpeed){
				 currentSpeed = currentSpeed+ 1;
				 System.out.println("The  current Speed of Mixer is "+currentSpeed);
			 }else{
				 System.out.println("The maximum Speed is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the Mixer");
			 }
		 
	 }
	 
	 public static void decreaseSpeed(){
		if(isConnected == true){
			if(currentSpeed > minSpeed){
				currentSpeed =currentSpeed - 1;
				System.out.println("The current Speed of Mixer is "+currentSpeed);
			}else{
				System.out.println("Minimum Speed reacheded");
			}
		}else{
			System.out.println("Turn on the Mixer");
		}
		System.out.println("End of  the Mixer");
	 	 
	 
	 
	 
	 
	 }
}