package week3.day1.assignments;

public class Students {
	
public void getStudentInfo(int ID) {
	System.out.println("The student ID is "+ID);
		

	}
public void getStudentInfo(int ID,String Name) {
	System.out.println("The ID is "+ID+" The Name is "+Name);

}
public void getStudentInfo(String Email,double Phoneno) {
	System.out.println("The email ID is "+Email+" The Phone number is "+Phoneno);
	

}

	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentInfo(20);
		st.getStudentInfo(20,"Pearl");
		st.getStudentInfo("pearl1312@gmail.com",987655455);

	}

}

//
//Class: Students
//Methods: getStudentInfo()
//
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber