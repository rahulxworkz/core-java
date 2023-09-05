class Classroom{
    int clsid ;
	int noOfStudents;
	String classname;
	int teachers;
	String subjects [];
	
	Classroom( int clsid ,	int noOfStudents , 	String classname , 	int teachers , 	String subjects []){
		
		
	         this.clsid  = clsid;
	         this.noOfStudents = noOfStudents;
	         this.classname = classname;
	         this.teachers = teachers;
	         this.subjects  = subjects;
	}
	
	public void getDetails(){
	     System.out.println("The id of class is: "+clsid);
	     System.out.println("The no of students are: "+noOfStudents);
	     System.out.println("The name of the class is: "+classname);
	     System.out.println("The no of teachers are: "+teachers);

	}
	
	public void getSubjects(){
		for(int i = 0 ; i<subjects.length ; i++){
			System.out.print(subjects[i]+"  ");
		}System.out.println(" ");
		
	}
	
}