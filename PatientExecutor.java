class PatientExecutor{


    public static void main(String args[]){
		
		Patient pt = new Patient();
		pt.setPatientId(1);
		pt.setName("Shreegandh");
		pt.setAge(22);
		pt.setDisease("Malaria");
		pt.setAdmittedDate("09/09/2023");
		pt.setHospitalName("Apollo");
		
		
		
		System.out.println("The patient Id is : "+pt.getPatientId());
		System.out.println("The patient Id is : "+pt.getName());
		System.out.println("The patient Id is : "+pt.getAge());
		System.out.println("The patient Id is : "+pt.getDisease());
		System.out.println("The patient Id is : "+pt.getAdmittedDate());
		System.out.println("The patient Id is : "+pt.getHospitalName());
	}
}