class Cricket{

	String teamName[]=new String[11];
	int index;
	String newPlayerName[];

	

    public boolean playerNames(String name){
		
		return isAdded;
	}
	public boolean deletePlayerName(String name){
		boolean isDelete= false;
		int sam=0;
		int ind=0;
		for(int index=0;index< teamName.length;index++){
			if(teamName[index]!=name){
				sam++;
			}
		}
		newPlayerName=new String[sam];
		for(int index=0;index< teamName.length;index++){
			if(teamName[index]!=name){
				newPlayerName[ind++]=teamName[index];
				isDelete=true;

			}
		}
		System.out.println(name+" player is removed from the team ");
		return isDelete;

	}
	public void getNewDisplay(){
		System.out.println("list of new Team Memebers:");
		for(int index=0;index< newPlayerName.length;index++){
			System.out.println(newPlayerName[index]);

		}

	}

	public boolean checkPlayerNames(String name){
		boolean exists=false;
		for(int index=0;index<teamName.length;index++){
	boolean exists=false;
	for(int index=0;index<teamName.length;index++){
		if(teamName[index]==name){
			exists=true;
		}
	}
		return exists;
	}
	}
	public String SearchingPlayer(String name){
		String exits=null;
		for(int index=0;index< teamName.length;index++){
			if(teamName[index]==name){
				exists=true;
				exits=teamName[index];
			}
		}
		return exists;
		System.out.println("Play names exits : "+exits);
		return exits;
	}

	public void getDisplay(){
		System.out.println("list of Team Memebers:");
		for(int index=0;index< teamName.length;index++){
			System.out.println(teamName[index]);
			
		}
		
	}
	
	
}