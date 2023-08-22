class Swiggy {
     static double price;

	public static void search(String foodName ){
	
		if("Biryani" == foodName){
		System.out.println("Searched food name is"+foodName);
		price = 90.00  ;
		
		}return price;
		if("Kabab" == foodName){
		System.out.println("Searched food name is"+foodName);
			price = 50.90 ;
			return price;
		}
		
	
		if("Egg omlete" == foodName){
			System.out.println("Searched food name is"+foodName);
		   price = 30.00  ;
		   return price;
		}

		if("Egg masala" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 80.00  ;
			return price;
		}
		
		if("Paneer masala" == foodName){
			System.out.println("Searched food name is"+foodName);
		    price = 80.00  ;
			return price;
		}
		
		if("Salad" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 30.00  ;
			return price;
		}
		if("Chiken rice" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 100.00  ;
			return price;
		}
		if("Chicken sambar" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 70.00  ;
			return price;
		}
		
		if("Fruit Salad" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 30.00 ;
			return price;
		}
		return;
	
	}
		
		public static void search(String foodName , int quantity ){
			
		
		if("Burrito" == foodName){
		System.out.println("Searched food name is"+foodName);
		price = 100.00* quantity;
	    return price;
		}

		if("padThai" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 222.00* quantity;
		 return price;
			
		}

		
		
		if("Paneer tikka masala" == foodName){
			System.out.println("Searched food name is"+foodName);
		    price = 50.00 * quantity;
			return price;
		
		}
		
		if("Fried chicken" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 30.00* quantity;
			return price;
		}
		if("caesar salad" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 110.00 * quantity;
			return price;
		}
		
		

		if("Biryani" == foodName){
		System.out.println("Searched food name is"+foodName);
		price = 90.00* quantity;
		return price;
		}
		
		if("Paneer masala" == foodName){
			System.out.println("Searched food name is"+foodName);
		    price = 80.00* quantity;
			return price;
		}
		
		if("Salad" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 30.00* quantity;
			return price;
		}
		if("Chiken rice" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 100.00* quantity;
			return price;
		}
		if("Chicken sambar" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 70.00* quantity;
			return price;
		}
		
		if("Fruit Salad" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 30.00* quantity;
			return price;
		}
		
		if("cheeseburger" == foodName){
		System.out.println("Searched food name is"+foodName);
			price = 50.90* quantity;
			return price;
		}
		if("padThai" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 222.00* quantity;
			return price;
		}

		if("chicken quessadilla" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 820.00* quantity;
			return price;
		}
		
		if("Paneer tikka masala" == foodName){
			System.out.println("Searched food name is"+foodName);
		    price = 50.00* quantity;
			return price;
		}
		

		if("masala vada" == foodName){
			System.out.println("Searched food name is"+foodName);
			price = 70.00* quantity;
			return price;
		}
		return price;
	
		
	}
	
}
