package week3.day1;

public class Students {
	
	public void getStudentInfo() {
		System.out.println("Student Info");
	}
	public void getStudentInfo(String name) {
		System.out.println(name);
	}
	
	public int getStudentInfo(int id) {
		System.out.println(id);
		return id;
	}
	public void getStudentInfo(String email, long ph) {
		System.out.println(email);
		System.out.println(ph);
	}


	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo();
		std.getStudentInfo(78898);
		std.getStudentInfo("Dev Kan");
		std.getStudentInfo("a@a.com", 9563214736L);
		std.getStudentInfo(1452);

	}

}
