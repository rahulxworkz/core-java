class HotelsExe{

	public static void main(String[] ottp){

	Hotels	hotel=new Hotels();
//	TajHotel	hotel=new TajHotel();
	hotel.foodName("Bisi Bele Bath");
	hotel.foodName("Neer Dosa");
	hotel.foodName("Ragi Mudde");
  
	hotel.foodName("Jolada Roti");
	hotel.foodName("Butter Chicken");
	hotel.foodName("Biryani");
	//hotel.foodName("Chicken Biryani");
	//hotel.foodName("Chicken");
	hotel.foodName("Bisi Bele Bath");
	//hotel.foodName("Chai");

	//hotel.foodName("Bisi Bele Bath");
	hotel.foodName("Chai");	
	hotel.getDisplay();

	hotel.searchFoodName("Chai");

	hotel.deleteNamesFood("Chai");

	}
}