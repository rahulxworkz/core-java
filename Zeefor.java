class Zeefor{
    static String kannadaMovies[] = {"Hebbuli" , "Garuda Gamana Vrishabha Vahana" , "Bhajarangi 2" , "Kalidasa Kannada Meshtru" , "Mufti" , "Shivaji Surathkal" , "Arjun Gowda" , "Vedha" , "Veeramae Vaagai Soodum" , "Rider" , "Udgharsha" , "Idolle Ramayana" , "U-Turn" , "8 mm" , "Rajaratha" , "Kurukshetra" , "Nodi Swamy Ivanu Irode Heege" , "Mangalavara Rajaadina" ,
	                                 "Kannadadda Kiran Bedi" , "Bhinna" , "Puksatte Lifu" , "Elleidde illi Tanaka" , "Raambo 2" , "Premier Padmini" , "Ramarjuna" };

    static String hindiSeries[] = {"Rangbaaz" , "Aha Naa Pellanta" , "Abhay" , "Auto Shankar" , "Anantham" , "Sunflower" , "Mukhbir - The Story of a Spy" , "Puli Meka" ,
	                                "Bicchoo Ka Khel" , "Fingertip" , "Mahabharat" , "Code M" , "Duranga" , "ATM" , "Jeet Ki Zid" , "PubGoa" , "Dhoop Ki Deewar" , "Anaganaga" , "Parchhayee: Ghost Stories" ,"TVF Pitchers" , "Shootout at Alair" };
     
	static String teluguMovies[] = {"47 Days" , "Brahmotsavam" , "Karthikeya 2" , "Nenu Local" , "Veeramae Vaagai Soodum" , "Valimai" , "Achari America Yatra" , "Republic" , "Rang De" ,
	                                 "Bhajarangi 2" , "Bairavaa" , "Macherla Niyojakavargam" , "Bangarraju" , "Sethupathi" , "Varudu Kaavalenu" , "Dial 100" , "Raja Raja Chora" ,
									 "Vedha","Mirugaa","Khaali Peeli","Net","Anandham Vilayadum Veedu","Dial 100","Alanti Sitralu","ABCD: Any Body Can Dance","Diya","Blood Money",
                                     "Sita on the Road" ,"Saakshyam","Malli Modalaindi","Comali","Geetha Govindam","RRR","Writer Padmabhushan"};
	
    static String malyalamMovies[] = {"Chathur Mukham" , "Naa Peru Surya, Naa Illu India" , "Karthikeya 2" , "Paappan" , "Aaha" , "Valimai" , "Diya" , "Jai Lava Kusa" ,
	                                  "Drishya 2" , "Kalki" , "Neeli" , "2 States" , "Meendum Oru Kadhal Kadhai" , "Tadka" , "Suvarna Purushan" , "Onnam Loka Mahayudham" ,
	                        "Vilakkumaram",  "Ayaal Sassi", " Minnaminungu","Wolf" ,"Kadamkadha","Innu Muthal","Pakalum Paathiravum","Ira","Avarude Raavukal","Daivame Kaithozham K. Kumarakanam","Valiyaperunnal","Mei Hoom Moosa","Mariyam Vannu Vilakkoothi"};
	
	
	static String englishMovies[] = {"Resident Evil: Death Island" , "Fast X" , "65" , "The Adventures of Tintin" , "The Pope's Exorcist" , "Resident Evil: The Final Chapter" , "Kin" , "The Divergent Series: Insurgent" , "Resident Evil " , "Vivarium" , "Passengers " , " Allegiant" , "Never Back Down" , "The Man from Toronto" ,
	                                  "  The Hurt Locker" , "Lawless" , "Death of Me" , "Cocaine Bear" , "Hotel Mumbai" , "Love Again" , "Crank: High Voltage" , "Snatch" , "Missing" , "Anaconda 3: Offspring" };
									  
									  
									  
public static void main(String zee[]){
		 System.out.println("Main Started");
		 
		 for(int kanMov = kannadaMovies.length-1 ; kanMov>=0; kanMov--){
			 System.out.println("The List Of Kannada Movies :  "+kannadaMovies[kanMov] );
		 }
		 	 System.out.println(" ");							  
		 for(int hinSer = hindiSeries.length-1 ; hinSer>=0 ; hinSer--){
			 System.out.println("The List Of Hindi Series : "+hindiSeries[hinSer]);
		 }
		     System.out.println(" ");
		 
		 for(int telMov = teluguMovies.length-1 ; telMov>=0; telMov--){
			 System.out.println("The List Of Telugu Movies : "+teluguMovies[telMov]);
		 }
		 System.out.println(" ");
		 
		 for(int malMov = malyalamMovies.length-1 ; malMov>=0;malMov--){
			 System.out.println("The List Of Malyalam Movies : "+malyalamMovies[malMov]);
		 }
		 System.out.println(" ");
		 
		 for(int engMovies = englishMovies.length-1;engMovies>=0 ; engMovies--){
			 System.out.println("The List Of English Movies : "+englishMovies[engMovies]);
		 }
		 System.out.println(" ");
		 
		 System.out.println("Main Ended");
		 
		 
    }
}