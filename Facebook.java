class  Facebook{
     public static void login(String email , String passward){
	     System.out.println("Logged in");
	 }
     
	 public static void login(long phoneNumb , String passward){   // having same number of parametrs but different types is also a overloading 
	     System.out.println("phone");
	 }
     
	 public static void main (String args[]){
	      login("rahul@gmail.com " , "654651fhf");
		  login(46465465151L , "jhdbdfbkf");
	 }
}