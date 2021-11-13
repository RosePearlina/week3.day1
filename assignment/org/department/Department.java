package  week3.day1.assignment.org.department;
import  week3.day1.assignment.org.college.College;

public class Department extends College {
	public void deptName() {
		System.out.println("Department");
	}
	public static void main(String[] args) {
		Department dep=new Department();
		dep.deptName();
	}

}
