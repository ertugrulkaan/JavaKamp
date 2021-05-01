package assignment3;

public class Instructor extends User{
	private String instructorNumber= "INS" + this.getId();

	private String firstName;
	private String lastName;
	public String getInstructorNumber() {
		return instructorNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
