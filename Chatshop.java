class Chatshop{

     String chatnames[] = new String [10];
	 int index;
	 
	 public boolean addChats(String chatname){
	        boolean isAdded = false;
			if( chatname != null){
			   chatnames[index] = chatname;
			   index++;
			   
			}
			return isAdded;
	    
	 }
	 
	 public void getDetails(){
	 System.out.println("The Chats available are : ");
	     for(index = 0; index < chatnames.length ; index++){
		 System.out.println(chatnames[index]+ " Added successfully to list");
		 
	 }
	 
	 }
}