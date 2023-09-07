class Patient{
     private int patientId;
	 private String name;
	 private int age;
	 private String disease;
	 private String admittedDate;
	 private String hospitalName;
	 
	 public void setPatientId(int patientId){
		 this.patientId=patientId;
	 }
	 public int getPatientId(){
		 return patientId;
	 }
	 
	  public void setName(String name){
		 this.name=name;
	 }
	 public String getName(){
		 return name;
	 }
	 
	  public void setAge(int age){
		 this.age=age;
	 }
	 public int getAge(){
		 return age;
	 }
	 
	  public void setDisease(String disease){
		 this.disease=disease;
	 }
	 public String getDisease(){
		 return disease;
	 }
	 
	 
	 public void setAdmittedDate(String admittedDate){
		 this.admittedDate=admittedDate;
	 }
	 public String getAdmittedDate(){
		 return admittedDate;
	}
	
	public void setHospitalName(String hospitalName){
		 this.hospitalName=hospitalName;
	 }
	 public String getHospitalName(){
		 return hospitalName;
	}
	 
}