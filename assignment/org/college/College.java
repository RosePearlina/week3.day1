package week3.day1.assignment.org.college;

public class College {
	public void collegeName() {
		System.out.println("The name of the college");
	}
	public void collegeCode() {
		System.out.println("The code of the college");
		
	}
	public void collegeRank() {

		System.out.println("The College rank");
	}
	

	public static void main(String[] args) {
		College col=new College();
		col.collegeCode();
		col.collegeName();
		col.collegeRank();
	}

}

//
//Package   :org.college
//Class     :College
//Methods   :collegeName(),collegeCode(),collegeRank()
//
//Package   :org.department
//Class        :Department
//Methods   :deptName()
//
//Package   :org.student
//Class        :Student
//Methods   :studentName(),studentDept(),studentId()
//
//Description:
//create above 3 class and call all your class methods into the Student using multilevel inheritance.