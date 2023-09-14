class Hotel{

     static String menus[] = new String [10];
	 static int index;
	 
	 public static boolean addChats(String menu){
	        boolean isAdded = false;
			if( menu != null){
			   menus[index] = menu;
			   index++;
			   
			}
			return isAdded;
	    
	 }
	 
	 public static void getDetails(){
	 System.out.println("The foods available in  Menu are : ");
	     for(index = 0; index < menus.length ; index++){
		 System.out.println(menus[index]+ " Added successfully to list");
		 
	 }
	 
	 }
}