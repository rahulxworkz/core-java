class Microwaveoven{
    static boolean isConnected;
	static int minTemp ;
	 static int maxTemp = 39;
	 static int currentTemp ;
	
	public static void  onOrOff(){
	System.out.println("Inside the Microwaveoven");
        if(isConnected == false){
		isConnected = true;
		System.out.println("Microwaveoven is turned on");
		}else if(isConnected == true){
		isConnected = false;
		System.out.println("Microwaveoven is turned off");
		}
	}

	
	public static void increaseTemp(){
		 if(isConnected == true){
			 if(currentTemp < maxTemp){
				 currentTemp = currentTemp+ 1;
				 System.out.println("The  current Temperature of Microwaveoven is "+currentTemp);
			 }else{
				 System.out.println("The maximum Temperature is reached");				 
			 }
		 }else{
				  System.out.println("Please turn on the Microwaveoven");
			 }
		 
	 }
	 
	 public static void decreaseTemp(){
		if(isConnected == true){
			if(currentTemp > minTemp){
				currentTemp =currentTemp - 1;
				System.out.println("The current Temperature of Microwaveoven is "+currentTemp);
			}else{
				System.out.println("Minimum Temperature is reached");
			}
		}else{
			System.out.println("Turn on the Microwaveoven");
		}
		System.out.println("End of  the Microwaveoven");
	 	 
	 
	 
	 
	 
	 }
}