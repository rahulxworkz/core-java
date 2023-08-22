class SportsMania{

    static String topTenCricketBatsmen[] ={"Babar Azam" , "Rassie van der Dussen" , "Fakhar Zaman" , "Imam-ul-Haq" , "Harry Tector" , "David Warner	" , "Shubman Gill" ,
                                           "Quinton de Kock" , " Virat Kohli" , "Steve Smith" };
										   
	static String topTenCricketTeams[] = {"India" , "Australia " , "England "  , " South Africa " , " New Zealand " , "Netherlands" , "Zimbave" , "Ireland" , "Scotland" , "Pakistan"};
	
	static String topTenHockeyTeams[] = {"Australia" , "Belgium" , "Netherlands" , "Germany" , "India" , "England" , "Argentina" , "Spain" , "New Zealand" , "Malaysia" };
	
	static String topTenTennisPlayers[] = {"Novak Djokovic" , "Carlos Alcaraz" , "Daniil Medvedev","Casper Ruud","Rafael Nadal","Stefanos Tsitsipas","Jannik Sinner",
	                                        "Felix Auger Aliassime" , "Andrey Rublev" ,"Ferror"};
											
	static String topTenCricketBowlers[] = {"Dale Steyn","Shoaib Akhtar","Mitchell Starc","Mitchell Johnson","Shane Bond","Shaun Tait","Muttiah Muralitharan",
	                                       "Glenn McGrath","Wasim Akram","Richard Hadlee","Brett Lee"};

										   
      public static void main (String sport[]){
	        System.out.println("Main Started");
			
			for(int cricBat = topTenCricketBatsmen.length-1;cricBat>=0 ; cricBat--){
			    System.out.println("The top Ten Cricket Batsmen are : " +topTenCricketBatsmen[cricBat]);  
			}
			System.out.println(" ");
			
			for(int cricTeam = topTenCricketTeams.length-1; cricTeam>=0 ; cricTeam--){
			    System.out.println("The top Ten Cricket Teams are : " +topTenCricketTeams[cricTeam]);  
			}
			System.out.println(" ");
			
			for(int hocTeam = topTenHockeyTeams.length-1; hocTeam>=0 ; hocTeam--){
			    System.out.println("The top Ten Hockey Teams  are : " +topTenHockeyTeams[hocTeam]);  
			}
			System.out.println(" ");
			
			for(int tenPlay = topTenTennisPlayers.length-1; tenPlay>=0 ; tenPlay--){
			    System.out.println("The top Ten Tennis Players are : " +topTenTennisPlayers[tenPlay]);  
			}
			System.out.println(" ");
			
			for(int cricBowl = topTenCricketBowlers.length-1 ;cricBowl>=0 ; cricBowl--){
			    System.out.println("The top Ten Cricket Bowlers are : " +topTenCricketBowlers[cricBowl]);  
			}
			System.out.println(" ");
			
            System.out.println("Main Ended");	  
	  
	  }
}	  