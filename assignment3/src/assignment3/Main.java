package assignment3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Ertugrul");
		student.setLastName("Ozdemir");
		student.setEmail("Ertugrul");
		student.setPassword(1234);
		StudentManager studentManager = new StudentManager();
		studentManager.register(student);
		studentManager.logIn(student);
		studentManager.registerToCourse(student);
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Ertugrul");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logIn(instructor);
		instructorManager.addCourse(instructor);
		
	}

}
