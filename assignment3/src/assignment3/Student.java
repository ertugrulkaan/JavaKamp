package assignment3;

public class Student extends User{
	private String studentNumber = "ST" + this.getId();

	public String getStudentNumber() {
		return studentNumber;
	}
	
}
