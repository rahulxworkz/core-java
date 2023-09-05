class Udyanavana{
     int noOfGates;
	 String name;
	 String timings;
	 int noOfJoggers;
     String trees[] ;
    
    Udyanavana(int noOfGates , 	 String name , 	 String timings , 	 int noOfJoggers ,      String trees[]){
	          this.noOfGates = noOfGates;
	 this.name = name;
	 this.timings = timings;
	 this.noOfJoggers = noOfJoggers;
     this.trees = trees;
	 
	}

    public void getDetails(){
	     System.out.println("The no of gates : "+this.noOfGates);	
	     System.out.println("The name is : "+this.name);	
	     System.out.println("The timing : "+this.timings);	
	     System.out.println("The no of joggers are : "+this.noOfJoggers);	
}

    public void getTrees(){
		for(int i = 0 ; i<trees.length ; i++){
			System.out.print(trees[i]+"  ");
		}System.out.println(" ");
		
	}
}