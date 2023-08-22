class SwiggyTester{
	
	
	public static void main(String swiggytester[]){
		
	 double foodName;
	 double price = 1.0;
	 double pricewithQuantity = 1.0;
	    foodName = Swiggy.search("Kabab");
        System.out.println("the searched food price is" +foodName);
		
/*		foodName = Swiggy.search("Egg masala");
        System.out.println("the searched food price is" +foodName);
		
		foodName = Swiggy.search("Egg omelete");
        System.out.println("the searched food price is" +foodName);
		
		
		foodName = Swiggy.search("Salad");
        System.out.println("the searched food price is" +foodName);
		

	 
    	 foodName = Swiggy.search("Paneer masala");
         System.out.println("the searched food price is" +foodName);
	 
	    foodName = Swiggy.search("Chicken rice");
        System.out.println("the searched food price is" +foodName);
	 
		foodName = Swiggy.search("Salad");
		System.out.println("the searched food price is" +foodName);
	 
		foodName = Swiggy.search("Chicken rice");
		System.out.println("the searched food price is" +foodName);
	 
		foodName = Swiggy.search("Chicken sambar");
		System.out.println("the searched food price is" +foodName);
	 
	 foodName = Swiggy.search("Fruit salad");
     System.out.println("the searched food price is" +foodName); */
	 
	 
	 foodName = Swiggy.search("Burrito" );
	 pricewithQuantity	 = Swiggy.search("Burrito" , 4 );
     System.out.println("the searched food price is" +foodName);
	 System.out.println("the searched food price with quantity is " +pricewithQuantity);
	 
	 foodName = Swiggy.search("Cheeseburger");
	 pricewithQuantity	 = Swiggy.search("Cheeseburger" , 3);
     System.out.println("the searched food price is" +foodName);
     System.out.println("the searched food price with quantity is " +pricewithQuantity);
	 
	 foodName = Swiggy.search("PadThai" );
	 price	 = Swiggy.search("PadThai" , 2 );
     System.out.println("the searched food price is" +foodName);
     System.out.println("the searched food price with quantity is " +pricewithQuantity);
	 
	 foodName = Swiggy.search("Chicken quesadilla" );
	 price = Swiggy.search("Chicken quesadilla" , 5 );
     System.out.println("the searched food price is" +foodName);
     System.out.println("the searched food price with quantity is " +pricewithQuantity);	 
	 
	 foodName = Swiggy.search("Paneer tikka masala" );
	 price = Swiggy.search("Paneer tikka masala" , 6 );
     System.out.println("the searched food price is" +foodName);
	 System.out.println("the searched food price with quantity is " +pricewithQuantity);
	 
	 foodName = Swiggy.search("Fried Chicken" );
	 price = Swiggy.search("Fried chicken" , 2 );
     System.out.println("the searched food price is" +foodName);
	 System.out.println("the searched food price with quantity is " +pricewithQuantity);
	 
	 foodName = Swiggy.search("Caesar salad" );
	 price = Swiggy.search("Caesar salad" , 3 );
     System.out.println("the searched food price is" +foodName);
	 System.out.println("the searched food price with quantity is " +pricewithQuantity);
	 
	 foodName = Swiggy.search("masala vada" );
	 price = Swiggy.search("masala vada" , 4 );
     System.out.println("the searched food price is" +foodName);
	 System.out.println("the searched food price with quantity is " +pricewithQuantity);
	 
	 foodName = Swiggy.search("Paneer masala");
	 pricewithQuantity	 = Swiggy.search("Paneer masala" , 3);
     System.out.println("the searched food price is" +foodName);
     System.out.println("the searched food price with quantity is " +pricewithQuantity);
	 
	foodName = Swiggy.search("Chiken rice");
	 price	 = Swiggy.search("Chiken rice" , 3);
     System.out.println("the searched food price is" +foodName);
     System.out.println("the searched food price with quantity is " +pricewithQuantity);
	 
	}
}