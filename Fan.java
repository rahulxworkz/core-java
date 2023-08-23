class Fan{
    static boolean isConnected;
	static int minSpeed ;
	 static int maxSpeed = 29;
	 static int currentSpeed ;
	
	public static void  onOrOff(){
	System.out.println("Inside the Fan");
        if(isConnected == false){
		isConnected = true;
		System.out.println("Fan is turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("Fan is turned off");
		}
	}

	
	public static void increaseSpeed(){
		 if(isConnected == true){
			 if(currentSpeed < maxSpeed){
				 currentSpeed = currentSpeed+ 1;
				 System.out.println("The  current Speed of Fan is "+currentSpeed);
			 }else{
				 System.out.println("The maximum Speed is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the Fan");
			 }
		 
	 }
	 
	 public static void decreaseSpeed(){
		if(isConnected == true){
			if(currentSpeed > minSpeed){
				currentSpeed =currentSpeed - 1;
				System.out.println("The current Speed of Fan is "+currentSpeed);
			}else{
				System.out.println("Minimum Speed reacheded");
			}
		}else{
			System.out.println("Turn on the Fan");
		}
		System.out.println("End of  the Fan");
	 	 
	 
	 
	 
	 
	 }
}