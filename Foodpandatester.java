class Foodpandatester{
	
	
	public static void main(String foodDelivery[]){
		
	
	double foodPrice = Foodpanda.search("Fajitas");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Foodpanda.search("Bread toast");
     System.out.println("the searched food price is" +foodPrice);
	foodPrice = Foodpanda.search("Cake");
     System.out.println("the searched food price is" +foodPrice);
	foodPrice = Foodpanda.search("Puffs");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Foodpanda.search("Popcorn");
     System.out.println("the searched food price is" +foodPrice);
	foodPrice = Foodpanda.search("Chips");
     System.out.println("the searched food price is" +foodPrice);
	foodPrice = Foodpanda.search("Chicken fry");
     System.out.println("the searched food price is" +foodPrice);
	foodPrice = Foodpanda.search("Butter masala");
     System.out.println("the searched food price is" +foodPrice);
	foodPrice = Foodpanda.search("Chiles en nogada");
     System.out.println("the searched food price is" +foodPrice);
	 foodPrice = Foodpanda.search("Mexican rice");
     System.out.println("the searched food price is" +foodPrice);
	
	double priceWithGivenQuantity = Foodpanda.search("Fajitas",4);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Foodpanda.search("Bread toast",3);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Foodpanda.search("Puffs",2);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Foodpanda.search("Popcorn",5);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Foodpanda.search("Chips",1);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Foodpanda.search("Chicken fry",2);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Foodpanda.search("Butter masala",3);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Foodpanda.search("Cake",4);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Foodpanda.search("Chiles en nogada",1);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
	priceWithGivenQuantity = Foodpanda.search("Mexican rice",3);
    System.out.println("the searched food price with given quantity is" +priceWithGivenQuantity);
		
	
	
	}
	
}