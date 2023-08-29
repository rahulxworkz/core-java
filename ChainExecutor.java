class ChainExecutor{
 
     public static void main (String args[]){
		 Chain chain = new Chain();
		 chain.chtype = "Gold" ;
	     chain.quality = "916";
	     chain.grams = 25; 
	     chain.size = 10;
	     chain.cost = 960000;
		 
		System.out.println("The Type of the chain is : "+chain.chtype);
		System.out.println("The quality of the chain is : "+chain.quality);
		System.out.println("The quantity of the chain is : "+chain.grams+"grams");
		System.out.println("The size of the chain is : "+chain.size);
		System.out.println("The cost price of the chain is : "+chain.cost);
		System.out.println("-------------------------------------------------\n");
		
		Chain chain1 = new Chain();
		 chain1.chtype = "Silver" ;
	     chain1.quality = "KDM";
	     chain1.grams = 85; 
	     chain1.size = 10;
	     chain1.cost = 500000;
		 
		System.out.println("The Type of the chain is : "+chain1.chtype);
		System.out.println("The quality of the chain is : "+chain1.quality);
		System.out.println("The quantity of the chain is : "+chain1.grams+"grams");
		System.out.println("The size of the chain is : "+chain1.size);
		System.out.println("The cost price of the chain is : "+chain1.cost);
		System.out.println("-------------------------------------------------\n");
		
		Chain chain2 = new Chain();
		 chain2.chtype = "Diamond" ;
	     chain2.quality = "24 Caret";
	     chain2.grams = 15; 
	     chain2.size = 5;
	     chain2.cost = 700000;
		 
		System.out.println("The Type of the chain is : "+chain2.chtype);
		System.out.println("The quality of the chain is : "+chain2.quality);
		System.out.println("The quantity of the chain is : "+chain2.grams+"grams");
		System.out.println("The size of the chain is : "+chain2.size);
		System.out.println("The cost price of the chain is : "+chain2.cost);
		System.out.println("-------------------------------------------------\n");
		
		 Chain chain3 = new Chain();
		 chain3.chtype = "Platinum" ;
	     chain3.quality = "24 Caret";
	     chain3.grams = 45; 
	     chain3.size = 14;
	     chain3.cost = 950000;
		 
		System.out.println("The Type of the chain is : "+chain3.chtype);
		System.out.println("The quality of the chain is : "+chain3.quality);
		System.out.println("The quantity of the chain is : "+chain3.grams+"grams");
		System.out.println("The size of the chain is : "+chain3.size);
		System.out.println("The cost price of the chain is : "+chain3.cost);
		System.out.println("-------------------------------------------------\n");
		
		
		Chain chain4 = new Chain();
		 chain4.chtype = "Diamond" ;
	     chain4.quality = "24 Caret";
	     chain4.grams = 45; 
	     chain4.size = 14;
	     chain4.cost = 800000;
		 
		System.out.println("The Type of the chain is : "+chain4.chtype);
		System.out.println("The quality of the chain is : "+chain4.quality);
		System.out.println("The quantity of the chain is : "+chain4.grams+"grams");
		System.out.println("The size of the chain is : "+chain4.size);
		System.out.println("The cost price of the chain is : "+chain4.cost);
		System.out.println("-------------------------------------------------\n");
	 }
}