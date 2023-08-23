class AC{
    static boolean isConnected;
	static int minTemp ;
	 static int maxTemp = 6;
	 static int currentTemp ;
	
	public static void  onOrOff(){
	System.out.println("Inside the AC");
        if(isConnected == false){
		isConnected = true;
		System.out.println("AC is turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("AC is turned off");
		}
	}

	
	public static void increaseTemp(){
		 if(isConnected == true){
			 if(currentTemp < maxTemp){
				 currentTemp = currentTemp+ 1;
				 System.out.println("The  current Temperature of AC is "+currentTemp);
			 }else{
				 System.out.println("The maximum Temperature is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the AC");
			 }
		 
	 }
	 
	 public static void decreaseTemp(){
		if(isConnected == true){
			if(currentTemp > minTemp){
				currentTemp =currentTemp - 1;
				System.out.println("The current Temperature of AC is "+currentTemp);
			}else{
				System.out.println("Minimum Temperature reached");
			}
		}else{
			System.out.println("Turn on the AC");
		}
		System.out.println("End of  the AC");
	 	 
	 
	 
	 
	 
	 }
}

