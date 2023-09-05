class ClassroomExecutor{
     public static void main (String args[]){
		   String subjects [] = {"JAVA" , "C" , "C++" , "HTML"};
	       Classroom cls = new Classroom(101 , 150 , "Chalukya",12 , subjects );
		   cls.getDetails();
		   cls.getSubjects();
		   System.out.println("---------------------------------------------------");
		   Classroom cls1 = new Classroom(102 , 120 , "Rastrakuta",13 , subjects );
		   cls1.getDetails();
		   cls.getSubjects();
		   System.out.println("---------------------------------------------------");
		   Classroom cls2 = new Classroom(103 , 100 , "Hoysala",15 , subjects );
		   cls2.getDetails();
		   cls.getSubjects();
		   System.out.println("---------------------------------------------------");
		   Classroom cls3 = new Classroom(104 , 110 , "Badami",20 , subjects );
		   cls3.getDetails();
		   cls.getSubjects();
		   System.out.println("---------------------------------------------------");
		   Classroom cls4 = new Classroom(105 , 115 , "Aihole",18 , subjects );
		   cls4.getDetails();
		   cls.getSubjects();
	 
	 }
}