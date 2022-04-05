package week3.day1;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name ");
	}
	public void studentDept() {
		System.out.println("Student Dept");
	}
	public void studentId() {
		System.out.println("Student Id");
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		std.studentName();
		std.studentId();
		std.studentDept();
		std.deptName();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
	}
}
