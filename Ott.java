class Ott{
String movieNames[] = new String[7];
int index;
public boolean addMovieName(String movieName){
System.out.println("invoked addMovieName()");
boolean isAdded = false;
if(index < movieNames.length){

if(movieName != null){
	boolean exist = checkIfMovieNameExist(movieName);
	if(exist == false){
System.out.println("validation is proper.. proceed to add movie name");
movieNames[index]= movieName;
index++;
isAdded  = true;

System.out.println(movieName+" is got added successfully!!");
}
else{
	System.out.println(movieName+" Movie name already exist .. please add other");
}
}
}
else{
	System.out.println("moviNames size is full.. you con't proceed to add");
}
return isAdded;
}
public void  getMovieNames(){

}

public boolean checkIfMovieNameExist(String movieName){
	System.out.println("Invoked checkIfMovieNameExist");
	boolean exist = false;
	for(int index = 0;index < movieNames.length; index++){
if(movieNames[index] ==  movieName){
	exist = true;
}
}
return exist;
}

    /* public String searchMovieName(String name){
	for(String value : movieNames){
		System.out.println("The movie exists"+value);
		
	}
	return searchMovieName;
}*/

public boolean delete(String name){
	boolean isDeleted = false;
	String movieNamesAfterDelete [] = new String[movieNames.length-1];
	int ind = 0 ;
	
	for(int index = 0 ; index<movieNames.length ; index++){
		if(movieNames[index] != name){
			movieNamesAfterDelete[ind++] = movieNames[index];
			isDeleted = true;
		}
	}
	System.out.println(movieNamesAfterDelete);
	
	return isDeleted;
}
}