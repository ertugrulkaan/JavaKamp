package assignment3;

public class Instructor extends User{
	private String instructorNumber= "INS" + this.getId();

	public String getInstructorNumber() {
		return instructorNumber;
	}
	
}
