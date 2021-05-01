package assignment3;

public class Student extends User{
	private String studentNumber = "ST" + this.getId();

	private String firstName;
	private String lastName;
	public String getStudentNumber() {
		return studentNumber;
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
